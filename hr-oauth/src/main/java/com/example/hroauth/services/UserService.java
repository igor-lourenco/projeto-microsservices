package com.example.hroauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.hroauth.entities.User;
import com.example.hroauth.feignclients.UserFeignClient;

@Service
public class UserService implements UserDetailsService {

	private static Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserFeignClient userFeignClient;

	public User findByEmail(String email) {
		User user = userFeignClient.findByEmail(email).getBody(); // chama a interface UserFeignClient pra se comunicar
																	// com o microserviço hr-user
		if (user == null) {
			logger.error("E-mail não encontrado: " + email);
			throw new IllegalArgumentException("E-mail não existe");
		}
		logger.info("E-mail encontrado: " + email);
		return user;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userFeignClient.findByEmail(username).getBody(); // chama a interface UserFeignClient pra se comunicar
		// com o microserviço hr-user
		if (user == null) {
			logger.error("E-mail não encontrado: " + username);
			throw new UsernameNotFoundException("E-mail não existe");
		}
		logger.info("E-mail encontrado: " + username);
		return user;
	}
}
