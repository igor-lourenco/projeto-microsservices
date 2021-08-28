package com.devsuperior.hrapigatewayzuul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
public class AppConfig {
	
	@Bean
	public JwtAccessTokenConverter accessTokenConverter() { //transforma a senha com criptografia
		JwtAccessTokenConverter tokenConverter = new JwtAccessTokenConverter();
		tokenConverter.setSigningKey("MY-SECRET-KEY");
		return tokenConverter;
	}
	
	@Bean
	public JwtTokenStore tokenStore() { //lê as informações do token
		return new  JwtTokenStore(accessTokenConverter());
	}
}
