package com.penglecode.xmodule.security.oauth2.examples.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.penglecode.xmodule.BasePackage;

@SpringBootApplication(scanBasePackageClasses=BasePackage.class)
public class OAuth2ResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuth2ResourceServerApplication.class, args);
	}
	
}