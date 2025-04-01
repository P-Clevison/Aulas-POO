
package br.edu.unasp.main.empresa;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, int idade, double salario, String departamento) {
        super(nome, idade, salario);
        this.departamento = departamento;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Departamento: " + departamento);
    }
	
}
