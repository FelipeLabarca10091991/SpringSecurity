package com.fl.SpringSecurity.service;

import java.util.Arrays;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fl.SpringSecurity.DTO.UsuarioRegistroDTO;
import com.fl.SpringSecurity.modelo.Authority;
import com.fl.SpringSecurity.modelo.Usuario;
import com.fl.SpringSecurity.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	private UsuarioRepository usuarioRepository;

	
	public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}


	@Override
	public Usuario save(UsuarioRegistroDTO usuarioDTO) {
		Usuario usuario = new Usuario(
				usuarioDTO.getNombre(),
				usuarioDTO.getEmail(),
				usuarioDTO.getPassword(),
				Arrays.asList(new Authority()));
		
		return usuarioRepository.save(usuario);
	}


//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		return null;
//	}


	

}
