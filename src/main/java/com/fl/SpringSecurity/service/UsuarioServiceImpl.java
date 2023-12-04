package com.fl.SpringSecurity.service;

import java.util.Arrays;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fl.SpringSecurity.DTO.UsuarioRegistroDTO;
import com.fl.SpringSecurity.modelo.Rol;
import com.fl.SpringSecurity.modelo.Usuario;
import com.fl.SpringSecurity.repository.IUsuarioRepository;

@Service
public class UsuarioServiceImpl implements IUsuarioService{
	
	private IUsuarioRepository usuarioRepository;

	
	public UsuarioServiceImpl(IUsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}


	@Override
	public Usuario save(UsuarioRegistroDTO usuarioDTO) {
		Usuario usuario = new Usuario(
				usuarioDTO.getNombre(),
				usuarioDTO.getApellido(),
				usuarioDTO.getEmail(),
				usuarioDTO.getPassword(),
				Arrays.asList(new Rol("ROLE_USER")));
		
		return usuarioRepository.save(usuario);
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}


	

}
