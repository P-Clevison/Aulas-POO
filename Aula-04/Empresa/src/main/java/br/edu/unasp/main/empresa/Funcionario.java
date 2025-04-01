package br.edu.unasp.main.empresa;

public class Funcionario {
	protected String nome;
    protected int idade;
    protected double salario;

	public Funcionario(String nome, int idade, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}




    public void exibirInformacoes() {
        System.out.println("Funcionario: " + nome + ", Idade: " + idade + ", Salario: R$ " + String.format("%.2f", salario));
    }
}
