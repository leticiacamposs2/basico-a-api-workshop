package com.djg.emprestimolivro.dominio;

import java.time.LocalDate;

public class Emprestimo {

	private Long codigoSolicitacao;
    private String usuarioSolicitante;
    private String livroSolicitado;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Long codigoSolicitacao, Usuario usuarioSolicitante, Livro livroSolicitado, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
    	this.codigoSolicitacao = codigoSolicitacao;
        this.usuarioSolicitante = usuarioSolicitante.getNomeCompleto();
        this.livroSolicitado = livroSolicitado.getTituloLivro();
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }
    
    public Long getcodigoSolicitacao() {
		return codigoSolicitacao;
	}

	public void setcodigoSolicitacao(Long codigoSolicitacao) {
		this.codigoSolicitacao = codigoSolicitacao;
	}

	public String getUsuarioSolicitante() {
        return usuarioSolicitante;
    }

    public void setUsuarioSolicitante(String usuarioSolicitante) {
        this.usuarioSolicitante = usuarioSolicitante;
    }

    public String getLivroSolicitado() {
        return livroSolicitado;
    }

    public void setLivroSolicitado(String livroSolicitado) {
        this.livroSolicitado = livroSolicitado;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    public void imprimeEmprestimo() {
        System.out.println("Código de solicitação: " + codigoSolicitacao);
        System.out.println("Usuario: " + usuarioSolicitante);
        System.out.println("Livro: " + livroSolicitado);
        System.out.println("Data de empréstimo: " + dataEmprestimo);
        System.out.println("Data de devolução: " + dataDevolucao);
    }
}
