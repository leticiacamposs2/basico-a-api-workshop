package com.djg.emprestimolivro;

import javax.swing.JOptionPane;

import com.djg.emprestimolivro.dominio.Livro;

public class TestaLivro {

	public static void main(String[] args) {
		
		String titulo = "";
		String autor = "";
		
		titulo = JOptionPane.showInputDialog("Informe o título do livro: ");
		autor = JOptionPane.showInputDialog("Informe o nome do autor do livro: ");
				
		Livro livro1 = new Livro("001", titulo, autor);	
		livro1.imprimeLivro();		
		
	}

}
