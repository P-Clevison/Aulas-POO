
package br.edu.unasp.main.asobreposicao;

public class App {

    public static void main(String[] args) {
		Notificacao n1 = new EmailNotificacao();
        Notificacao n2 = new SMSNotificacao();

        n1.enviarMensagem();
        n2.enviarMensagem();
		
		/*
        Notificacao[] notificacoes = {
            new EmailNotificacao(),
            new SMSNotificacao()
        };

        for (Notificacao notificacao : notificacoes) {
            notificacao.enviarMensagem();
        }
		*/
    }
}
