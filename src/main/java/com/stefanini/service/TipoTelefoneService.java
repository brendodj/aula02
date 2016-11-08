package com.stefanini.service;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import com.stefanini.model.Tipotelefone;
import com.stefanini.repository.TipoTelefoneRepository;

@Stateless
public class TipoTelefoneService {
	@Inject
    private TipoTelefoneRepository tipoTelefoneRepository;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void incluir(Tipotelefone tipotelefone){
    	tipoTelefoneRepository.incluir(tipotelefone);
    }
}
