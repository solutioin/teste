package com.solutioin.angular.server.persistencia;

import org.springframework.stereotype.Repository;

import com.solutioin.angular.server.entidade.Contato;

import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;

@Repository
public class ContatoDao extends PersistenciaJpa<Contato>{

	private static final long serialVersionUID = 1L;

}
