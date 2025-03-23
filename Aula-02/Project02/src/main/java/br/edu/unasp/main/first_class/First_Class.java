
package br.edu.unasp.main.first_class;

public class First_Class {

	public static void main(String[] args) {
		
		/*
		Caneta caneta1 = new Caneta();
		caneta1.cor = "preta";
		caneta1.tampada = true;
		*/
		/*
		caneta1.carga = 100;
		caneta1.setCor("azul");
		caneta1.setTampada(true);
		*/
		
		Caneta caneta1 = new Caneta().criarCaneta("vermelha", "esferografica");
		
		caneta1.status();
		
	}
	
}
