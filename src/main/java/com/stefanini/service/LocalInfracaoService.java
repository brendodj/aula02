package com.stefanini.service;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import com.stefanini.model.Agente;
import com.stefanini.model.Localinfracao;
import com.stefanini.model.Tipoinfracao;
import com.stefanini.repository.LocalInfracaoRepository;
import com.stefanini.repository.TipoInfracaoRepository;

@Stateless
public class LocalInfracaoService {
	 @Inject
	    private LocalInfracaoRepository localInfracaoRepository;

	    @TransactionAttribute(TransactionAttributeType.REQUIRED)
	    public void incluir(Localinfracao localinfracao){
	    	localInfracaoRepository.incluir(localinfracao);
	    }
}
