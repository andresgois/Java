package com.algaworks.algafood.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	//pontos de contrução
	@Autowired (required = false)//instânciação opcional//1
	private List<Notificador> notificadores;
	
	/*@Autowired
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		System.out.println("AtivacaoClienteService: "+notificador);
	}*/

	public void ativar(Cliente c) {
		c.ativo();
		
		/*if(notificador != null) {
			this.notificador.notificar(c, "Seu cadastro está ativo!");
		}else {
			System.out.println("Está nulo!");
		}*/
		for (Notificador notificador: notificadores) {
			notificador.notificar(c, "Seu cadastro está ativo!");
		}
	}

	/*public Notificador getNotificador() {
		return notificador;
	}
	//@Autowired
	public void setNotificador(Notificador notificador) {
		this.notificador = notificador;
	}*/
}
