package com.algaworks.algafood.notificacao;

import com.algaworks.algafood.modelo.Cliente;

//@Component // foi colocado na classe AlgaCOnfig
public class NotificadorEmail implements Notificador {
	
	private boolean caixaAlta;
	private String hostServidorSmtp;
	
	/*
	 * Parameter 0 of constructor in com.algaworks.algafood.notificacao.NotificadorEmail required a bean of type 'java.lang.String' that could not be found.
		Não sabe o que é essa string
		isso antes da correção
	 */
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
