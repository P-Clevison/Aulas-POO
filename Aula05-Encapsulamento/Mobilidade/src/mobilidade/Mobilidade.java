
package mobilidade;

public class Mobilidade {

	public static void main(String[] args) {
		Carro mobi = new Carro(false, 2, 4);
		
		System.out.println(" A velocidade e: " + mobi.getVelocidade() );
		mobi.acelerar();
		mobi.acelerar();
		mobi.acelerar();
		mobi.acelerar();
		System.out.println(" A velocidade e: " + mobi.getVelocidade() );

		System.out.println(" A lotacao atual e: " + mobi.getQtdPassageiros() );
		mobi.subirPassageiro();
		mobi.subirPassageiro();
		mobi.subirPassageiro();
		System.out.println(" A lotacao atual  e: " + mobi.getQtdPassageiros() );

	}
	
}
