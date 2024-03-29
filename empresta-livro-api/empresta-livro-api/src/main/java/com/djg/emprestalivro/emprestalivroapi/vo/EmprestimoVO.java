package com.djg.emprestalivro.emprestalivroapi.vo;

import java.time.LocalDate;

public class EmprestimoVO {

	private Long codigoUsuario;
	private Long codigoLivro;
	private LocalDate dataSolicitacao;
	private LocalDate dataDevolucao;
	
	public Long getCodigoUsuario() {
		return codigoUsuario;
	}
	
	public void setCodigoUsuario(Long codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	
	public Long getCodigoLivro() {
		return codigoLivro;
	}
	
	public void setCodigoLivro(Long codigoLivro) {
		this.codigoLivro = codigoLivro;
	}
	
	public LocalDate getDataSolicitacao() {
		return dataSolicitacao;
	}
	
	public void setDataSolicitacao(LocalDate dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

}
