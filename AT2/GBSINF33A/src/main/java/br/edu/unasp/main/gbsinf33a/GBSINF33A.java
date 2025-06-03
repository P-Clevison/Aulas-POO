
package br.edu.unasp.main.gbsinf33a;

public class GBSINF33A {

    public static void main(String[] args) {
		Funcionario f1 = new Gerente("Ana", 5000);
        Funcionario f2 = new Engenheiro("Carlos", 4000);
        Funcionario f3 = new Estagiario("Pedro", 1500);

        System.out.println(f1.getNome() + ": R$ " + f1.calcularSalario());
        System.out.println(f2.getNome() + ": R$ " + f2.calcularSalario());
        System.out.println(f3.getNome() + ": R$ " + f3.calcularSalario());
	}
}
