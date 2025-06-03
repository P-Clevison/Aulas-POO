
package br.edu.unasp.main.gbsinf33a;

public class GBSINF33A {

    public static void main(String[] args) {
		Pagamento p1 = new PagamentoCartao(150.0, "25/05/2025");
        Pagamento p2 = new PagamentoBoleto(200.0, "25/05/2025");
        Pagamento p3 = new PagamentoPIX(75.0, "25/05/2025");

        p1.processarPagamento();
        p2.processarPagamento();
        p3.processarPagamento();
	}
}
