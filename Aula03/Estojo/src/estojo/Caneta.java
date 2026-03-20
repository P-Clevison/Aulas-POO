
package estojo;


public class Caneta {
	public String cor;
	private int carga;
	public boolean tampada;

	public Caneta(String cor, int carga, boolean tampada) {
		this.cor = cor;
		this.carga = carga;
		this.tampada = tampada;
	}
	
	public int getCarga() {
		return this.carga -10;
	}
	
	public void destampar() {
		if (this.tampada == true) {
			this.tampada = false;
		}
	}
	
}
