
package br.edu.unasp.main.gbsinf33a;

class Engenheiro extends Funcionario {
    public Engenheiro(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + 1000;
    }
}