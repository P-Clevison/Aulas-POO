
package garagem;

public class Carro {
	public String modelo;
	private boolean ligado;
	private int quilometragem;

	/* Considerando o contexto de um carro, o método  
	   construto abaixo poderia não receber ligado ou quilometragem
		e ter valores iniciais pré-definidos */
	public Carro(String modelo, boolean ligado, int quilometragem) {
		this.modelo = modelo;
		this.ligado = ligado;
		this.quilometragem = quilometragem;
	}

	public boolean getLigado() { // ou isLigado
		return this.ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getQuilometragem() {
		return this.quilometragem;
	}

	/* Considerando o contexto de um carro, o método  
	   abaixo poderia não existir e o incremento ser
		somente no método dirigir */
	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}
	
	public void dirigir() {
		this.quilometragem = this.quilometragem + 1;
	}
	
}
