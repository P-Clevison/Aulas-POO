
package br.edu.unasp.main.gbsinf33a;

class PagamentoCartao extends Pagamento {
	
    public PagamentoCartao(double valor, String data) {
        super(valor, data);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento com cartao: R$ " + getValor());
    }
}