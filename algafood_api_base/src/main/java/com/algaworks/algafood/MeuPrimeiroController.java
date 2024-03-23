package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algaworks.algafood.di.service.AtivacaoClienteService;
import com.algaworks.algafood.modelo.Cliente;

//@RestController
@Controller
@RequestMapping("/hello")
public class MeuPrimeiroController {
	
	private AtivacaoClienteService clienteService;
	
	public MeuPrimeiroController(AtivacaoClienteService clienteService) {
		this.clienteService = clienteService;
		System.out.println("MeuPrimeiroController: "+clienteService);
	}

	@GetMapping
	@ResponseBody
	public String hello() {
		Cliente c = new Cliente("Andre", "a@email.com", "33334445");
		clienteService.ativar(c);
		
		return "Hello world";
	}
}
