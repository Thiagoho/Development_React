package br.com.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProdutoController {
	@GetMapping("produtos")
	public String rota() {
		return "Api Ok";
	}
}
