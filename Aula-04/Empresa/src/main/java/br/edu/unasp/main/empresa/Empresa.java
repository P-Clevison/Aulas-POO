
package br.edu.unasp.main.empresa;

public class Empresa {

    public static void main(String[] args) {
		Gerente gerente1 = new Gerente("Carlos Silva", 40, 9000.00, "TI");
        //Desenvolvedor dev1 = new Desenvolvedor("Ana Souza", 28, 6500.00, "Java");

        System.out.println("Informacoes do Gerente:");
        gerente1.exibirInformacoes();

        //System.out.println("\nInformacoes do Desenvolvedor:");
        //dev1.exibirInformacoes();
    }
}
