package br.com.casadocodigo.loja.infra;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

public class MessagesHelper {

	@Inject
	private FacesContext facesContext;
	
	public void addMessage(FacesMessage facesMessage) {
		facesContext.getExternalContext().getFlash()
			.setKeepMessages(true);
		facesContext.addMessage(null, facesMessage);
	}

}
