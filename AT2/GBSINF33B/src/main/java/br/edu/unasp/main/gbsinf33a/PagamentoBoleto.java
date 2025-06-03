
package br.edu.unasp.main.gbsinf33a;

class PagamentoBoleto extends Pagamento {
	
    public PagamentoBoleto(double valor, String data) {
        super(valor, data);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento com boleto: R$ " + getValor());
    }
}