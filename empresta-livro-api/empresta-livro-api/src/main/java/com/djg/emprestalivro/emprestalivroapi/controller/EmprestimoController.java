package com.djg.emprestalivro.emprestalivroapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.djg.emprestalivro.emprestalivroapi.servico.EmprestimoServico;
import com.djg.emprestalivro.emprestalivroapi.vo.EmprestimoVO;

@RestController
public class EmprestimoController {
	
	private EmprestimoServico emprestimoServico;
	private EmprestimoVO emprestimoVO;
	
	@PostMapping("/emprestimo")
	public void salvaEmprestimo(EmprestimoVO emprestimo) {
		emprestimoServico.salva(emprestimo);
	}

}
