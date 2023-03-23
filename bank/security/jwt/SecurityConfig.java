package com.dm.bank.security.jwt;

import java.security.AuthProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.dm.bank.service.CustomerDetailsService;

public class SecurityConfig {

		@Autowired
		CustomerDetailsService customerDetailsService;
		
		@Autowired
		AuthenticationFilter filter;
		
		@Bean
		 AuthenticationProvider authenticationProvider() {
			
			DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
			AuthProvider.setUserDetailsService(service);
			authProvider.setPasswordEncoder(new BCryptPasswordEncoder());
			return authProvider;
			
}
		@Bean
		SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
			
			http.csrf().disable().cors().disable().authorizeHttpRequests()
			.requestMatchers("/api/register","/api/login",
								"/customer/approved{id}", "/customer/all")
			.permitAll()
			.requestMatchers(HttpMethod.OPTIONS,"/**").permitAll()
			.anyRequest()
			.authenticated()
			.and().sessionManagement()
			.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
			.and()
			.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
			
		return http.build();
			
		}
		
		@Bean
		AuthenticationManager authenticationManager(AuthenticationConfiguration configure) throws Exception {
			return configure.getAuthenticationManager();
		}
}	
