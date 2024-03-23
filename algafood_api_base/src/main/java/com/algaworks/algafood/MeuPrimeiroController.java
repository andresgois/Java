package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController
@Controller
@RequestMapping("/hello")
public class MeuPrimeiroController {

	@GetMapping
	@ResponseBody
	public String hello() {
		return "Hello world";
	}
}
