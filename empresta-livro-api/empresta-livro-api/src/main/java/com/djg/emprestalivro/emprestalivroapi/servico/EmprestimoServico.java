package com.djg.emprestalivro.emprestalivroapi.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djg.emprestalivro.emprestalivroapi.dominio.Emprestimo;
import com.djg.emprestalivro.emprestalivroapi.dominio.Livro;
import com.djg.emprestalivro.emprestalivroapi.dominio.Usuario;
import com.djg.emprestalivro.emprestalivroapi.repositorio.EmprestimoRepositorio;
import com.djg.emprestalivro.emprestalivroapi.repositorio.LivroRepositorio;
import com.djg.emprestalivro.emprestalivroapi.repositorio.UsuarioRepositorio;
import com.djg.emprestalivro.emprestalivroapi.vo.EmprestimoVO;

@Service
public class EmprestimoServico {
	
	@Autowired
	private EmprestimoRepositorio emprestimoRepositorio;
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	@Autowired
	private LivroRepositorio livroRepositorio;

	public void salvaEmprestimo(EmprestimoVO emprestimoVO) {
		
		Usuario usuario = usuarioRepositorio.findById(emprestimoVO.getCodigoUsuario()).get();
		Livro livro = livroRepositorio.findById(emprestimoVO.getCodigoLivro()).get();
		
		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setUsuario(usuario);
		emprestimo.setLivro(livro);
		emprestimo.setDataDevolucao(emprestimoVO.getDataDevolucao());
		emprestimo.setDataSolicitacao(emprestimoVO.getDataSolicitacao());
		
		emprestimoRepositorio.save(emprestimo);
	}
}
