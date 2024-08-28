package br.com.sistema.cmd;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		calcular cadastro = new calcular();
		lucrativo melhor = new lucrativo();
		
		
		System.out.print("Insira o preço da gasolina: "); //Enviar dados para a classe calcular
		cadastro.setGasolina(scan.nextDouble());
		
		System.out.print("Insira o preço da etanol: ");
		cadastro.setEtanol(scan.nextDouble());
		
		System.out.printf(
				"\n\n" +
				"Gasolina: " + cadastro.getGasolina() + "\n" +
				"Etanol: " + cadastro.getEtanol() + "\n" +
				"Indíce: %.2f", cadastro.getResultado()
		);
		
		//Enviar (Indice) getResultado para Lucrativo
		
		melhor.setReceberdado(cadastro.getResultado());
		
		System.out.println(
				"\n" + 
				"Melhor Opção: " + melhor.getMenssage()
		);

	}

}
