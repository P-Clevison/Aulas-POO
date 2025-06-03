
package br.edu.unasp.main.gbsinf33a;

abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
		return nome; 
	}
	
    public double getSalarioBase() {
		return salarioBase;
	}

    public abstract double calcularSalario();
}
