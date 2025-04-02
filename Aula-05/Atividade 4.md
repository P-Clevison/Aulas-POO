# 4. Polimorfismo

### 4a. por Sobreposição
1. Crie uma classe base Notificacao abstrata com um método enviarMensagem(), que imprime "Enviando notificação..."
2. Crie duas subclasses: EmailNotificacao e SMSNotificacao
3. Nas subclasses, sobrescreva o método enviarMensagem() para exibir mensagens diferentes:
- EmailNotificacao: "Enviando notificação por e-mail..."
- SMSNotificacao: "Enviando notificação por SMS..."
4. No método main, crie 2 variáveis (ou um array de objetos Notificacao) e armazene instâncias de EmailNotificacao e SMSNotificacao. Chame enviarMensagem() para cada objeto e observe a execução do polimorfismo.
---
### 4b por sobrecarga
1. Crie uma classe CalculadoraArea.
2. Adicione um método calcularArea() sobrecarregado para calcular a área de:
- Um quadrado (recebendo um único parâmetro lado).
- Um retângulo (recebendo dois parâmetros base e altura).
-  Um círculo (recebendo o raio e PI).
3. No main, instancie a classe CalculadoraArea e chame calcularArea() para cada forma geométrica.