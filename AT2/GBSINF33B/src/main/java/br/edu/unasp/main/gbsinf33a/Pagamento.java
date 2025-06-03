
package br.edu.unasp.main.gbsinf33a;

abstract class Pagamento {
    private double valor;
    private String data;

    public Pagamento(double valor, String data) {
        this.valor = valor;
        this.data = data;
    }

    public double getValor() { 
		return valor; 
	}
	
    public String getData() { 
		return data; 
	}

    public abstract void processarPagamento();
}