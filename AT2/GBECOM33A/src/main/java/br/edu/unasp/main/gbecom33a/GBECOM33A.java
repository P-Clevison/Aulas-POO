
package br.edu.unasp.main.gbecom33a;

public class GBECOM33A {

    public static void main(String[] args) {
        Veiculo v1 = new Onibus("Mercedes", 40);
        Veiculo v2 = new Metro("Linha Verde", 300);
        Veiculo v3 = new BicicletaCompartilhada("Bike 101", 1);

        System.out.println(v1.getModelo() + " - Tarifa: R$ " + v1.calcularTarifa());
        System.out.println(v2.getModelo() + " - Tarifa: R$ " + v2.calcularTarifa());
        System.out.println(v3.getModelo() + " - Tarifa: R$ " + v3.calcularTarifa());
    }
}
