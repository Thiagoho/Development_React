package br.com.api.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.modelo.ProdutoModelo;
import br.com.api.repository.ProdutoRepositorio;

@Service
public class ProdutoServico {
	
	@Autowired
	private ProdutoRepositorio pr;
	
	// Método para listar todos os produtos
	public Iterable<ProdutoModelo> listar(){
		return pr.findAll();
	}
}
