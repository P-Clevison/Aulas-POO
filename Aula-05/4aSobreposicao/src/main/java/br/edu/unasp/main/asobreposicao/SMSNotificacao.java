
package br.edu.unasp.main.asobreposicao;

public class SMSNotificacao  extends Notificacao {
    @Override
    void enviarMensagem() {
        System.out.println("Enviando notificacao por SMS...");
    }
}
