
package br.edu.unasp.main.gbecom33a;

public class Onibus extends Veiculo {
    public Onibus(String modelo, int capacidade) {
        super(modelo, capacidade);
    }

    @Override
    public double calcularTarifa() {
        return 4.50;
    }
}