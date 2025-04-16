# Atividade de POO: Gerenciamento de Torneio de Futebol

## Objetivo:
Criar um sistema orientado a objetos em Java que simule partidas entre 4 times de futebol e registre seus resultados em um torneio simples.

### Etapa 1: Modelagem das Classes
Tarefas:
1. Criar a classe Time

**Atributos:**
- nome
- quantidadeVitorias
- quantidadeDerrotas
- golsMarcados
- golsSofridos

**Métodos:**
- Construtor
- registrarVitoria(int golsFeitos, int golsSofridos)
- registrarDerrota(int golsFeitos, int golsSofridos)
- registrarEmpate(int gols) (atualiza apenas os gols)
- Getters (opcional)

2. Criar a classe Partida

**Atributos:**
- timeCasa
- timeVisitante
- golsTimeCasa
- golsTimeVisitante

**Métodos:**
- Construtor
- jogarPartida(int golsCasa, int golsVisitante)  
    // imprime o resultado e atualiza os times

3. Criar a classe Torneio

* Atributos:
1. timePrimeiroLugar
1. timeSegundoLugar
1. timeTerceiroLugar

* Métodos:
1. adicionarTime(Time time)      // Cadastra o time no Torneio
1. agendarPartidas()             // Agenda partidas entre os times 1 e 2, 3 e 4, vencedor 1 x vencedor 2
1. iniciarTorneio()              // Realiza as partidas entre os times e preenche os atributos do Torneio
1. exibirClassificacao()         // Exibe os resultados
