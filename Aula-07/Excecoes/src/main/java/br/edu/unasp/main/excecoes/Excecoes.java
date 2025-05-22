
package br.edu.unasp.main.excecoes;

import java.util.Scanner;

public class Excecoes {

    public static void main(String[] args) {
	    
		int[] numeros = {10, 180, 43};
        System.out.println("Insira o indice a ser pesquisado");
		Scanner scan= new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("O nnmero  e: " + numeros[num]); // ArrayIndexOutOfBounds
		

		/*
		try {
			int[] numeros = {10, 180, 43};
			System.out.println("Insira o indice a ser pesquisado");
			Scanner scan= new Scanner(System.in);
			int num = scan.nextInt();
			System.out.println("O nnmero  e: " + numeros[num]); // ArrayIndexOutOfBounds
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("O indice informado nao esta disponivel"); // ArrayIndexOutOfBounds
		} catch (Exception e) {
			System.out.println("Houve um erro ao recuperar o numero"); // Generico
		} finally {
			System.out.println("Obrigado por usar nosso sistema");	
		}
		*/
    }
}
