package com.djg.emprestalivro.emprestalivroapi.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djg.emprestalivro.emprestalivroapi.dominio.Usuario;
import com.djg.emprestalivro.emprestalivroapi.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServico {
	
	@Autowired //o spring cria o get e set
	private UsuarioRepositorio usuarioRepositorio; //cria uma instancia do UsuarioRepositorio e passa pro usuarioRepositorio
	
	public void salva(Usuario usuario) {
		usuarioRepositorio.save(usuario);
	}
}
