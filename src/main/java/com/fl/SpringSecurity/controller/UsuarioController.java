package com.fl.SpringSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fl.SpringSecurity.DTO.UsuarioRegistroDTO;
import com.fl.SpringSecurity.service.IUsuarioService;

@Controller
@RequestMapping("/registro")
public class UsuarioController {

	private IUsuarioService userService;

	public UsuarioController(IUsuarioService userService) {
		super();
		this.userService = userService;
	}

	@ModelAttribute("usuario")
	public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO() {
		return new UsuarioRegistroDTO();
	}

	@GetMapping
	public String mostrarFormularioRegistro() {
		return "registro";
	}
	
	public String registrarCuentaUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO) {
		userService.save(registroDTO);
		return "redirect:/registro?exito";
	}
	
	
}
