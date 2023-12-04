package com.fl.SpringSecurity.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.fl.SpringSecurity.DTO.UsuarioRegistroDTO;
import com.fl.SpringSecurity.modelo.Usuario;

public interface IUsuarioService extends UserDetailsService{

	public Usuario save(UsuarioRegistroDTO usuarioDTO);
}
