package br.com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.modelo.ProdutoModelo;
import br.com.api.servico.ProdutoServico;

@RestController

public class ProdutoController {
	@Autowired
	private ProdutoServico ps;
	
	@GetMapping("listar")
	public Iterable<ProdutoModelo> listar(){
		return ps.listar();
	}
	
	@GetMapping("/")
	public String rota() {
		return "Api Ok";
	}
}
