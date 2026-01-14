package com.juanr.SP_Practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpPracticeApplication.class, args);
		String text1="David";
		String text2="DaViD";
		if(text1.equealsIgnoreCase(text2)){


		}
	}


}
