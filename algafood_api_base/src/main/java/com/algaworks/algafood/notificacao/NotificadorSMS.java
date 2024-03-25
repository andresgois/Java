package com.algaworks.algafood.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.modelo.Cliente;

@Component
public class NotificadorSMS implements Notificador {
	
	@Override
	public void notificar(Cliente c, String m) {
		System.out.printf("Notificando %s por SMS através do e-mail %s: %s\n",
				c.getNome(), c.getEmail(), m);
	}
}
