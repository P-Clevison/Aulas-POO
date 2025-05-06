
package br.edu.unasp.main.futebol;

// Classe Partida
public class Partida {
    private Time timeCasa;
    private Time timeVisitante;
    private int golsTimeCasa;
    private int golsTimeVisitante;

    public Partida(Time timeCasa, Time timeVisitante) {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
    }

    public void jogarPartida(int golsCasa, int golsVisitante) {
        this.golsTimeCasa = golsCasa;
        this.golsTimeVisitante = golsVisitante;

        if (golsCasa >= golsVisitante) {
            timeCasa.registrarVitoria(golsCasa, golsVisitante);
            timeVisitante.registrarDerrota(golsVisitante, golsCasa);
        } else {
            timeVisitante.registrarVitoria(golsVisitante, golsCasa);
            timeCasa.registrarDerrota(golsCasa, golsVisitante);
        } 
    }

    public Time getTimeCasa() {
        return timeCasa;
    }

    public Time getTimeVisitante() {
        return timeVisitante;
    }

    public int getGolsTimeCasa() {
        return golsTimeCasa;
    }

    public int getGolsTimeVisitante() {
        return golsTimeVisitante;
    }
}
