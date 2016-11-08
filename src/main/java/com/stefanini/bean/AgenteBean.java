package com.stefanini.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.swing.JOptionPane;

import com.stefanini.model.Agente;
import com.stefanini.service.AgenteService;

@Named ("agenteMB")
@RequestScoped
public class AgenteBean{

	@Inject
	    private AgenteService agenteService;
		Agente agente= new Agente();
	 

	    public Agente getAgente() {
			return agente;
		}


		public void setAgente(Agente agente) {
			this.agente = agente;
		}

		public void salvar() {
			agenteService.incluir(agente);
			
			}

	    }


