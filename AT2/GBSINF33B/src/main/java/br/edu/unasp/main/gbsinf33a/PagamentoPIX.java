
package br.edu.unasp.main.gbsinf33a;

class PagamentoPIX extends Pagamento {
	
    public PagamentoPIX(double valor, String data) {
        super(valor, data);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via PIX: R$ " + getValor());
    }
}