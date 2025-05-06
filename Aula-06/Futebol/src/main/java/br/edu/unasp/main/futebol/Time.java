
package br.edu.unasp.main.futebol;

// Classe Time
public class Time {
    private String nome;
    private int quantidadeVitorias = 0;
    private int quantidadeDerrotas = 0;
    private int golsMarcados = 0;
    private int golsSofridos = 0;

    public Time(String nome) {
        this.nome = nome;
    }

    public void registrarVitoria(int golsFeitos, int golsSofridos) {
        quantidadeVitorias++;
        this.golsMarcados += golsFeitos;
        this.golsSofridos += golsSofridos;
    }

    public void registrarDerrota(int golsFeitos, int golsSofridos) {
        quantidadeDerrotas++;
        this.golsMarcados += golsFeitos;
        this.golsSofridos += golsSofridos;
    }

    public int getSaldoGols() {
        return golsMarcados - golsSofridos;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeVitorias() {
        return quantidadeVitorias;
    }

    public int getQuantidadeDerrotas() {
        return quantidadeDerrotas;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }

    public int getGolsSofridos() {
        return golsSofridos;
    }
}
