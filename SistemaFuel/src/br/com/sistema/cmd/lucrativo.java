package br.com.sistema.cmd;

public class lucrativo {
	private Double receberdado;
	private String menssage;
	
	public Double getReceberdado() {
		return receberdado;
	}
	public void setReceberdado(Double receberdado) {
		this.receberdado = receberdado;
	}
	public String getMenssage() {
		//Fazer IF's para retornar qual é o melhor combutivel
		if (receberdado < 0.7) {
			menssage = "O etanol é a melhor opção no momento.";
		}
		else if (receberdado == 0.7) {
			menssage = "Tanto etanol quanto gasolina são equivalentes!";
		}
		else {
			menssage = "A gasolina é a melhor opção no momento";
		}
		return menssage;
	}
	public void setMenssage(String menssage) {
		this.menssage = menssage;
	}
	
	
}
