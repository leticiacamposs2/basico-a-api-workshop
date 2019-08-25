package com.djg.emprestimolivro;

import javax.swing.JOptionPane;

import com.djg.emprestimolivro.dominio.Usuario;

public class TestaUsuario {
    public static void main(String[] args) {
    	
    	String nome = "";
    	String dataNascimento = "";
    	String endereco = "";
		
		nome = JOptionPane.showInputDialog("Digite seu nome");
		dataNascimento = JOptionPane.showInputDialog("Digite sua data de nascimento");
		endereco = JOptionPane.showInputDialog("Digite seu endereco:");
	
		Usuario usuario1 = new Usuario("001", nome, dataNascimento, endereco);
		System.out.print("\r\n");
		usuario1.imprimeUsuario();
    }
}