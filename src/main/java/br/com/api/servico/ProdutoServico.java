package br.com.api.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.api.modelo.ProdutoModelo;
import br.com.api.modelo.RespostaModelo;
import br.com.api.repository.ProdutoRepositorio;

@Service
public class ProdutoServico {
	
	@Autowired
	private ProdutoRepositorio pr;
	
	@Autowired
	private RespostaModelo rm;
	
	
	// Método para listar todos os produtos
	public Iterable<ProdutoModelo> listar(){
		return pr.findAll();
	}
	
	//Método para cadastrar produtos
	public ResponseEntity<?> cadastrar(ProdutoModelo pm) {
		if(pm.getNome().equals("")) { //Criando nome do produto
			rm.setMensagem("O nome do produto é obrigatório!");
			return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);
		}else if(pm.getMarca().equals("")) {
			rm.setMensagem("O nome da marca é obrigatório!");
			return new ResponseEntity<RespostaModelo>(rm,HttpStatus.BAD_REQUEST);
		}else {
			return new ResponseEntity<ProdutoModelo>(pr.save(pm),HttpStatus.CREATED);
		}
	}
}
