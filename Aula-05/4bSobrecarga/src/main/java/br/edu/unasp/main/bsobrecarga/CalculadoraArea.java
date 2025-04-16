
package br.edu.unasp.main.bsobrecarga;

public class CalculadoraArea {
    // Área do quadrado
    double calcularArea(double lado) {
        return lado * lado;
    }

    // Área do retângulo
    double calcularArea(double base, double altura) {
        return base * altura;
    }

    // Área do círculo
    double calcularArea(int raio, double pi) {
        return pi * raio * raio;
    }
}
