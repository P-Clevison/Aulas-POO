
package br.edu.unasp.main.gbecom33a;

abstract class Veiculo {
    private String modelo;
    private int capacidade;

    public Veiculo(String modelo, int capacidade) {
        this.modelo = modelo;
        this.capacidade = capacidade;
    }

    public String getModelo() { return modelo; }
    public int getCapacidade() { return capacidade; }

    public abstract double calcularTarifa();
}
