package com.stefanini.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Agente;
import com.stefanini.model.Tipoinfracao;
import com.stefanini.service.TipoInfracaoService;

@Named ("tipoinfracaoMB")
@RequestScoped
public class TipoInfracaoBean {
	@Inject
    private TipoInfracaoService tipoInfracaoService;
	Tipoinfracao tipoinfracao = new Tipoinfracao();

	public Tipoinfracao getTipoinfracao() {
		return tipoinfracao;
	}

	public void setTipoinfracao(Tipoinfracao tipoinfracao) {
		this.tipoinfracao = tipoinfracao;
	}

	public void salvar() {
		tipoInfracaoService.incluir(tipoinfracao);
		
		}

}
