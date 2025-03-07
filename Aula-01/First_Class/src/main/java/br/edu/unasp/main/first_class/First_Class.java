
package br.edu.unasp.main.first_class;

public class First_Class {

	public static void main(String[] args) {
		System.out.println("Comecamos a brinca de POO");
		
		Caneta caneta1 = new Caneta();
		caneta1.cor = "preta";
		caneta1.tampada = true;
		caneta1.carga = 100;
		// Exibir status após a criação
		caneta1.status();
		// Destampar caneta se necessário
		caneta1.destampar();
		// Exibir status após destampar
		caneta1.status()
	}
	
}
