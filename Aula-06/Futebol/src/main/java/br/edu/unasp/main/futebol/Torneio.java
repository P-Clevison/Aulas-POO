
package br.edu.unasp.main.futebol;

import java.util.ArrayList;

public class Torneio {
    private ArrayList<Time> listaDeTimes = new ArrayList<>();
    private ArrayList<Partida> listaDePartidas = new ArrayList<>();
    
    private Time timePrimeiroLugar;
    private Time timeSegundoLugar;
    private Time timeTerceiroLugar;

    private Time perdedorPartida1;
    private Time perdedorPartida2;

    public void adicionarTime(Time time) {
        if (listaDeTimes.size() < 4) {
            listaDeTimes.add(time);
        } else {
            System.out.println("O torneio só pode ter 4 times.");
        }
    }

    public void agendarPartidas() {
        if (listaDeTimes.size() != 4) {
            System.out.println("E necessario exatamente 4 times para agendar as partidas.");
            return;
        }

        listaDePartidas.clear(); // Reinicia as partidas

        // Semifinal 1: Time 0 x Time 1
        Partida semi1 = new Partida(listaDeTimes.get(0), listaDeTimes.get(1));
        listaDePartidas.add(semi1);

        // Semifinal 2: Time 2 x Time 3
        Partida semi2 = new Partida(listaDeTimes.get(2), listaDeTimes.get(3));
        listaDePartidas.add(semi2);
    }

    public void iniciarTorneio() {
        if (listaDePartidas.size() < 2) {
            System.out.println("As partidas não foram agendadas corretamente.");
            return;
        }

        // Joga Semifinal 1
        Partida semi1 = listaDePartidas.get(0);
        int gols1Casa = (int)(Math.random() * 6);
        int gols1Visitante = (int)(Math.random() * 6);
        semi1.jogarPartida(gols1Casa, gols1Visitante);
        Time vencedor1;
		if (gols1Casa >= gols1Visitante) {
			vencedor1 = semi1.getTimeCasa();
			perdedorPartida1 = semi1.getTimeVisitante();
		} else {
			vencedor1 = semi1.getTimeVisitante();
			perdedorPartida1 = semi1.getTimeCasa();
		}

        // Joga Semifinal 2
        Partida semi2 = listaDePartidas.get(1);
        int gols2Casa = (int)(Math.random() * 6);
        int gols2Visitante = (int)(Math.random() * 6);
        semi2.jogarPartida(gols2Casa, gols2Visitante);
		Time vencedor2;
		if (gols2Casa >= gols2Visitante) {
			vencedor2 = semi2.getTimeCasa();
			perdedorPartida2 = semi2.getTimeVisitante();
		} else {
			vencedor2 = semi2.getTimeVisitante();
			perdedorPartida2 = semi2.getTimeCasa();
		}
		
        // Joga Final: vencedor1 x vencedor2
        Partida finalPartida = new Partida(vencedor1, vencedor2);
        int golsFinalCasa = (int)(Math.random() * 6);
        int golsFinalVisitante = (int)(Math.random() * 6);
        finalPartida.jogarPartida(golsFinalCasa, golsFinalVisitante);
        listaDePartidas.add(finalPartida);


        // Define 1º e 2º lugar
		if (golsFinalCasa >= golsFinalVisitante) {
			timePrimeiroLugar = finalPartida.getTimeCasa();
			timeSegundoLugar = finalPartida.getTimeVisitante();
		} else {
			timePrimeiroLugar = finalPartida.getTimeVisitante();
			timeSegundoLugar = finalPartida.getTimeCasa();
		}

        // Joga Disputa de 3º lugar: perdedor1 x perdedor2
		int saldoPerdedor1 = perdedorPartida1.getSaldoGols();
		int saldoPerdedor2 = perdedorPartida2.getSaldoGols();

		if (saldoPerdedor1 >= saldoPerdedor2) {
			timeTerceiroLugar = perdedorPartida1;
		} else {
			timeTerceiroLugar = perdedorPartida2;
		}
	}

    public void exibirClassificacao() {
        System.out.println("\nResultados das Partidas:");
        for (Partida partida : listaDePartidas) {
            System.out.println(partida.getTimeCasa().getNome() + " " + partida.getGolsTimeCasa() +
                    " x " + partida.getGolsTimeVisitante() + " " + partida.getTimeVisitante().getNome());
        }

        System.out.println("\nCLASSIFICACAO FINAL:");
        System.out.println("1 lugar: " + timePrimeiroLugar.getNome());
        System.out.println("2 lugar: " + timeSegundoLugar.getNome());
        System.out.println("3 lugar: " + timeTerceiroLugar.getNome());
    }
}
