package com.fl.SpringSecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import com.fl.SpringSecurity.service.UsuarioService;

@Configuration
public class SecurityConfiguration {

//La interfaz "UserDetailService", spring la considera un Administrador de credenciales de usuario
	@Bean
	public UserDetailsService uds() {

		UserDetails user = User.withUsername("root").password("1234").roles("read").build();

		return new InMemoryUserDetailsManager(user);
	}
	
//Manejo de las contraseñas con PasswordEncoder. Solo fines de prueba(No recomendable para producción)
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	

}
