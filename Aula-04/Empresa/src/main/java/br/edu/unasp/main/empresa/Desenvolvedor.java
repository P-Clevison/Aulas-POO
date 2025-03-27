
package br.edu.unasp.main.empresa;

public class Desenvolvedor extends Funcionario {
    private String linguagem;

    public Desenvolvedor(String nome, int idade, double salario, String linguagem) {
        super(nome, idade, salario);
        this.linguagem = linguagem;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Linguagem de programacao: " + linguagem);
    }
}
