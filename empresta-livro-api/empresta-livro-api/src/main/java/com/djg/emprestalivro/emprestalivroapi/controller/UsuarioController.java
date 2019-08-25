package com.djg.emprestalivro.emprestalivroapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.djg.emprestalivro.emprestalivroapi.dominio.Usuario;
import com.djg.emprestalivro.emprestalivroapi.servico.UsuarioServico;

@RestController
public class UsuarioController {
	
	//É a mesma coisa que fazer
	// private UsuarioServico usuarioServico = new UsuarioServico();
	
	@Autowired
	private UsuarioServico usuarioServico;
	
	@PostMapping("/usuario")
	public void criaUsuario(@RequestBody Usuario usuario) {
		usuarioServico.salva(usuario);
	}
	
}