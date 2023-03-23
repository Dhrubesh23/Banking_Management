package com.dm.bank.CustomerMicro;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class UserId {
	
	public String idgenerator() {
		Random random = new Random();
		String a = "";
		
		for(int i= 0; i<=4; i++) {
			char ch = (char) (random.nextInt(25)+66);
			a = a + ch;
		}
		
		int b = 1000*(1+random.nextInt(9))+100*(1+random.nextInt(9))+10*(1+random.nextInt(9))+(1+random.nextInt(9));
		char c =(char) (random.nextInt(25)+66);
		
		return (a+b+c);
	}
	
	public String ifscCode() {
		return "STL000132";
	}
	
	public String accountNumber() {
		Random random = new Random();
		String a ="";
		
		for (int i=0;i<8;i++) {
			a = a +random.nextInt(10);
		}
		
		String ac = ifscCode().substring(2)+a;
		return ac;
	}

}
