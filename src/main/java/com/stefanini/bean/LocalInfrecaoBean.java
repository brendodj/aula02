package com.stefanini.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Localinfracao;
import com.stefanini.model.Tipoinfracao;
import com.stefanini.service.LocalInfracaoService;

@Named ("localinfracaoMB")
@RequestScoped
public class LocalInfrecaoBean {
	@Inject
    private LocalInfracaoService localInfracaoService;
	Localinfracao localinfracao = new Localinfracao();

	public Localinfracao getLocalinfracao() {
		return localinfracao;
	}

	public void setLocalinfracao(Localinfracao localinfracao) {
		this.localinfracao = localinfracao;
	}

	public void salvar() {
		localInfracaoService.incluir(localinfracao);
		
		}
}
