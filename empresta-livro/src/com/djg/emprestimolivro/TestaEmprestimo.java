package com.djg.emprestimolivro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.djg.emprestimolivro.dominio.Emprestimo;
import com.djg.emprestimolivro.dominio.Livro;
import com.djg.emprestimolivro.dominio.Usuario;

public class TestaEmprestimo {
	
	public static void main(String args[]) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = scanner.nextLine();

		System.out.println("Digite seu endereco:");
		String endereco = scanner.nextLine();

		Usuario usuario1 = new Usuario("001", nome, "22/09/1994", "Rua Azul");
		Livro   livro1   = new Livro  ("001", "Use a Cabeça! SQL", "Lynn Beighley");	
							
		LocalDate dataEmprestimo = LocalDate.parse("2019-08-24", DateTimeFormatter.ISO_DATE);
		LocalDate dataDevolucao = dataEmprestimo.plusDays(7); //calcula 7 dias após a data de emprestimo
		Long codigoSolicitacao = (long) 1;
		
		System.out.println("\r\n");
		Emprestimo emprestimo1 = new Emprestimo(codigoSolicitacao, usuario1, livro1, dataEmprestimo, dataDevolucao);
		emprestimo1.imprimeEmprestimo();	
	}

}
