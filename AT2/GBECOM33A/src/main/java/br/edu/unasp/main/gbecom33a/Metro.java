package br.edu.unasp.main.gbecom33a;

public class Metro extends Veiculo {
    public Metro(String modelo, int capacidade) {
        super(modelo, capacidade);
    }

    @Override
    public double calcularTarifa() {
        return 5.00;
    }
}