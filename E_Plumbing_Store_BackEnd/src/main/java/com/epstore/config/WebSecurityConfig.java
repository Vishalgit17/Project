package com.epstore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebSecurityConfig 
{	
	  @Bean 
	  public PasswordEncoder passwordEncoder() 
	  { 
		  PasswordEncoder encoder = new BCryptPasswordEncoder();
		  return encoder; 
	  }
}
