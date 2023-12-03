package com.fl.SpringSecurity.service;

import com.fl.SpringSecurity.DTO.UsuarioRegistroDTO;
import com.fl.SpringSecurity.modelo.Usuario;

public interface IUsuarioService {

	public Usuario save(UsuarioRegistroDTO usuarioDTO);
}
