package br.com.api.modelo;

import org.springframework.stereotype.Component;


@Component

public class RespostaModelo {
	
	private String mensagem;

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
