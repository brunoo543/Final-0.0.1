package util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Mensagem {

    public Mensagem() {
    }

    public static void inserirMensagem(String id, String message) {
        FacesContext.getCurrentInstance().addMessage(id,
            new FacesMessage(FacesMessage.SEVERITY_INFO, message, message));
    }

    public static void inserirMensagemErro(String id, String message) {
        FacesContext.getCurrentInstance().addMessage(id,
            new FacesMessage(FacesMessage.SEVERITY_ERROR, message, message));
    }

}
