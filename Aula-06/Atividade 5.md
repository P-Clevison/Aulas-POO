# Atividade de POO: Gerenciamento de Torneio de Futebol

## Objetivo:
Criar um sistema orientado a objetos em Java que simule partidas entre 4 times de futebol e registre seus resultados em um torneio simples.

### Etapa 1: Modelagem das Classes
Tarefas:

#### 1. Criar a classe Time

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
- getSaldoGols  
// calcula golsMarcados - golsSofridos
- Getters/Setters (opcional)

#### 2. Criar a classe Partida

**Atributos:**
- timeCasa
- timeVisitante
- golsTimeCasa
- golsTimeVisitante

**Métodos:**
- Construtor
- jogarPartida(int golsCasa, int golsVisitante)  
    // imprime o resultado e atualiza os times

#### 3. Criar a classe Torneio

**Atributos:**
- timePrimeiroLugar
- timeSegundoLugar
- timeTerceiroLugar

**Métodos:**
- adicionarTime(Time time)  
    // Cadastra o time no Torneio
- agendarPartidas()  
    // Agenda partidas entre os times 1 e 2, 3 e 4, vencedor 1 x vencedor 2  
    // (O primeiro time será sempre o time da Casa e o segundo sempre o visitante)
    // (O terceiro lugar será determinado pelo saldo de gols)
- iniciarTorneio()  
    // Realiza as partidas entre os times e preenche os atributos do Torneio
- exibirClassificacao()  
    // Exibe os resultados

---
To be continue...