package com.example.multas2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.br.multa2.dao.InfracaoDAO;
import com.br.multa2.model.Infracao;

@RestController
public class InfracaoController {
	public Infracao buscarPlaca(String num_placa) throws Exception {
		InfracaoDAO i1 = new InfracaoDAO();
		return i1.buscar(num_placa);

	}

	public Infracao buscar(int id) throws Exception {
		InfracaoDAO c = new InfracaoDAO();

		return c.buscar("id");

	}

	// este metodo retorna uma classe infração
	// este metodo não recebe parametros de entrada pq não existe nada entre
	// parenteses "BUSCAR"
	// O modificador desse metodo e public sendo que poderia tambem ser private
	// esse metodo lança (throws) a exceção EXCEPTION
	// modificador tipo_retorno nome_metodo (parametros) throws nome_exception
	public Infracao buscar() throws Exception {
		InfracaoDAO a = new InfracaoDAO();

		return a.buscar("AAA3244");

	}

	@RequestMapping(value = "/infracao/buscar/{num_placa}", method = RequestMethod.GET)
	public ResponseEntity<Infracao> buscar(@PathVariable("num_placa") String num_placa) throws Exception {

		InfracaoDAO infracaoDAO = new InfracaoDAO();
		Infracao infracao = infracaoDAO.buscar(num_placa);
		

		return new ResponseEntity<Infracao>(infracao, HttpStatus.OK);
	}

	@RequestMapping(value = "/buscar/{cod_renavan}", method = RequestMethod.GET)
	public ResponseEntity<Infracao> buscarRenavan(@PathVariable("cod_renavan") String cod_renavan) throws Exception {

		InfracaoDAO infracaoDAO = new InfracaoDAO();
		Infracao infracao = infracaoDAO.buscarRenavan(cod_renavan);
		

		return new ResponseEntity<Infracao>(infracao, HttpStatus.OK);
	}
}
