
package br.edu.unasp.main.first_class;

public class Caneta {
	public int carga;
	public boolean tampada;
	public String cor;
	
	
	public void destampar() {
		if (tampada == true) {
			tampada = false;
		}
	}
	
	public void status() {
		System.out.println("\r\nA caneta tem cor: " + this.cor);
		System.out.println("A caneta tem carga: " + this.carga);
		if (this.tampada == true) {
			System.out.println("A caneta esta tampada");
		} else {
			System.out.println("A caneta esta destampada");
			}
	}

	public boolean verificar_tampa() {
		if (this.tampada == true) {
			return true;
		}
		else {
			return false;
		}
	}
}
