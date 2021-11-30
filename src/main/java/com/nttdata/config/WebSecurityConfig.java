package com.nttdata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
 	protected void configure(HttpSecurity http) throws Exception {
 		http.authorizeRequests()
 		.antMatchers("/registro","/usuario/registrarjsp","/","/usuario/registrar")// /css/**, js/**,
 		.permitAll()
 		.anyRequest().authenticated()
 		//.hasRole("USER")
 		.and()
 		.formLogin()
 			.loginPage("/login")
 			.permitAll()
 		.and()
 		.logout()
 			.permitAll()
 		;
 	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
}
