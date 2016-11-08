package com.stefanini.service;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Agente;
import com.stefanini.repository.AgenteReposirory;

@Stateless
public class AgenteService {
	  @Inject
	    private AgenteReposirory agenteReposirory;

	    @TransactionAttribute(TransactionAttributeType.REQUIRED)
	    public void incluir(Agente agente){
	    	agenteReposirory.incluir(agente);
	    }
	   
}
