

package garagem;

public class Garagem {

	public static void main(String[] args) {
		Carro carro1 = new Carro("Onix", true, 25000);
		String msg;
		if (carro1.getLigado() == true) {
			msg = "O carro 1 esta ligado";
		} else {
			msg = "O carro 1 esta desligado";
		}
		System.out.println(msg);
		
		Carro carro2 = new Carro("Sandero", false, 127000);
		carro2.setLigado(true);
		System.out.println("Quilometragem do carro 2 e " + carro2.getQuilometragem() );
		carro2.dirigir();
		System.out.println("Quilometragem do carro 2 e " + carro2.getQuilometragem() );
		
	}
	
}
