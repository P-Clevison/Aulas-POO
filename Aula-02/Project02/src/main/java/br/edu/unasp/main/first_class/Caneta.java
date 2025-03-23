
package br.edu.unasp.main.first_class;

public class Caneta /*implements ItemDeEscrita */ {
	protected int carga;
	private boolean tampada;
	private String cor;
	private String tipoItem;
	private String tipoPonta;
	
	// Métodos próprios
	public Caneta criarCaneta(String newCor, String newTipoPonta){
		this.carga = 105;		//permite inserir valor incorreto
		//this.setCarga(105);	//valida e evita valor incorreto
		this.tampada = true;
		this.cor = newCor;
		this.tipoItem = "QuadroBranco";
		this.tipoPonta = newTipoPonta;
		
		return this;
	}
	
	public void status() {
		System.out.println("\r\nA caneta tem cor: " + this.cor);
		System.out.println("A caneta tem carga: " + this.carga);
		if (this.tampada == true) {
			System.out.println("A caneta esta tampada");
		} else {
			System.out.println("A caneta esta destampada");
			}
		System.out.println("Este item e " + this.tipoItem);
		System.out.println("A ponta desta caneta e " + this.tipoPonta);
	}
	
	public boolean getTampada() {
		return this.tampada;
	}

	public String getCor() {
		return this.cor;
	}
		
	public void setTampada(boolean newTampada) {
		if (newTampada == true) {
			this.tampada = true;
		} else {
			this.tampada = false;
		}
	}
	
	public void setCarga(int newCarga) {
		if (newCarga >=0 && newCarga < 101) {
			this.carga = newCarga;
		} else {
			System.out.println("Novo valor invalido para carga");
		}
	}

	public void setCor(String newCor) {
		if (newCor != null && !newCor.isBlank()) {
			this.cor = newCor;
		} else {
			System.out.println("Novo cor invalida");
		}
	}


}
