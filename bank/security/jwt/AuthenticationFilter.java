package com.dm.bank.security.jwt;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class AuthenticationFilter extends OncePerRequestFilter {
	
	@Autowired
	JwtUtil util;
	
	@Autowired
	ServiceDetails service;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String header = request.getHeader("Authorization");
		String token = null;
		String user = null;
		
		if(header!= null && header.startsWith("Bearer ")) {
			token = header.substring(7);
			user = util.getUsernameFromToken(token);
		}
		
		if(user!= null && SecurityContextHolder.getContext().getAuthentication() == null) {
			CustomerDetails currentuser = (CustomerDetails) service.loadUserByUsername(user);
			
			
			UsernamePasswordAuthenticationToken userToken = new UsernamePasswordAuthenticationToken(currentuser,
					null, currentuser.getAuthorities());
			userToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
			
			SecurityContextHolder.getContext().setAuthentication(userToken);
		}
		
		filterChain.doFilter(request, response);
		
	}
	
	

}
