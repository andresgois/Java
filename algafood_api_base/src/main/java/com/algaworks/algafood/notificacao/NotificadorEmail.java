package com.algaworks.algafood.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.modelo.Cliente;

@Component
public class NotificadorEmail implements Notificador {
	
	private boolean caixaAlta;
	private String hostServidorSmtp;
	
	public NotificadorEmail(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
		System.out.println("Construtor: NotificadorEmail");
	}

	@Override
	public void notificar(Cliente c, String m) {
		if(caixaAlta) {
			m = m.toUpperCase();
		}
		System.out.printf("Notificando %s através do e-mail %s - usando SMTP %s: %s\n",
				c.getNome(), this.hostServidorSmtp ,c.getEmail(), m);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
}
