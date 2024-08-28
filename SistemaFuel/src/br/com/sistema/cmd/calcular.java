package br.com.sistema.cmd;

public class calcular {
	// variaveis de modo privado recebendo dados do SET e enviando para o GET
	private Double gasolina;
	private Double etanol;
	private Double resultado;
	
	public Double getGasolina() {
		return gasolina;
	}
	public void setGasolina(Double gasolina) {
		this.gasolina = gasolina;
	}
	public Double getEtanol() {
		return etanol;
	}
	public void setEtanol(Double etanol) {
		this.etanol = etanol;
	}
	public Double getResultado() {
		resultado = etanol / gasolina;
		return resultado;
	}
	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}
	
}
// para gerar automaticamente, selecione as variaveis, botao direito do mouse, source - generate getters and setters