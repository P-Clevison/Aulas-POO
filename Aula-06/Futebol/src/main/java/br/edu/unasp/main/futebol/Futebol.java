
package br.edu.unasp.main.futebol;

public class Futebol {

    public static void main(String[] args) {
        // Criação dos times
        Time time1 = new Time("Tigres");
        Time time2 = new Time("Falcoes");
        Time time3 = new Time("Leoes");
        Time time4 = new Time("Tubaroes");

        // Instância do torneio
        Torneio torneio = new Torneio();

        // Adicionando os times ao torneio
        torneio.adicionarTime(time1);
        torneio.adicionarTime(time2);
        torneio.adicionarTime(time3);
        torneio.adicionarTime(time4);

        // Agendar e realizar partidas
        torneio.agendarPartidas();
        torneio.iniciarTorneio();

        // Exibir classificação final
        torneio.exibirClassificacao();

    }
}
