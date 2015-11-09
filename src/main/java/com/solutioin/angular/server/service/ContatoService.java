package com.solutioin.angular.server.service;

import java.util.List;

import javax.annotation.security.PermitAll;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.ambientinformatica.jpa.exception.PersistenciaException;

import com.solutioin.angular.server.entidade.Contato;
import com.solutioin.angular.server.persistencia.ContatoDao;

@Path("/contatoservice")
@Component
public class ContatoService {
	
	@Autowired
	private ContatoDao contatoDao;
	
	@GET
	@Path("/listar")
	@Produces("application/json")
	@PermitAll
	public List<Contato> listar(){
		try {
			return contatoDao.listar();
		} catch (PersistenciaException e) {
			e.printStackTrace();
			return null;
		}
	}

}
