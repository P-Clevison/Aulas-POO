
package br.edu.unasp.main.gbecom33a;

public class BicicletaCompartilhada extends Veiculo {
    public BicicletaCompartilhada(String modelo, int capacidade) {
        super(modelo, capacidade);
    }

    @Override
    public double calcularTarifa() {
        return 2.00;
    }
}
