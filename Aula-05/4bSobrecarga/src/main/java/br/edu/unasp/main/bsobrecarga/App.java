
package br.edu.unasp.main.bsobrecarga;

public class App {

    public static void main(String[] args) {
        // Criando um objeto da classe CalculadoraArea
        CalculadoraArea calculadora = new CalculadoraArea();

        // Chamando os métodos e armazenando os resultados em variáveis
        double areaQuadrado = calculadora.calcularArea(4);
        double areaRetangulo = calculadora.calcularArea(5, 3);
        double areaCirculo = calculadora.calcularArea(2, 3.14);

        // Exibindo os resultados
        System.out.println("Area do quadrado: " + areaQuadrado);
        System.out.println("Area do retangulo: " + areaRetangulo);
        System.out.println("Area do circulo: " + areaCirculo);
    }
}
