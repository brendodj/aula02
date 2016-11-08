package com.stefanini.bean;


import java.io.Serializable;

import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.swing.JOptionPane;

import com.stefanini.model.Agente;
import com.stefanini.model.Telefones;
import com.stefanini.service.AgenteService;
import com.stefanini.service.TelefoneService;


@Named ("telefoneMB")
@RequestScoped
public class TelefoneBean {
	 
	@Inject
    private TelefoneService telefoneService;
	Telefones telefones= new Telefones();
     
	public Telefones getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefones telefones) {
		this.telefones = telefones;
	}

	public void salvar() {
		telefoneService.incluir(telefones);
		
		}
   
}
