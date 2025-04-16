
package br.edu.unasp.main.asobreposicao;

public class EmailNotificacao extends Notificacao {
    @Override
    void enviarMensagem() {
        System.out.println("Enviando notificacao por e-mail...");
    }
}
