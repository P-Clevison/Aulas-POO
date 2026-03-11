
package estojo;

public class Estojo {

	public static void main(String[] args) {
		System.out.println("Instanciando uma caneta");
		
		Caneta bic = new Caneta("Azul", 100, true);
		System.out.println(bic.cor);
		/*
		bic.destampar();
		
		if (bic.tampada == true) {
			System.out.println("A caneta esta tampada");
		} else {
			System.out.println("A caneta esta DEStampada");
		} */
		
	}
	
}
