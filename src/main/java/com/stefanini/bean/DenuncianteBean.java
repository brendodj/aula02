package com.stefanini.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Denunciante;
import com.stefanini.model.Telefones;
import com.stefanini.service.DenuncianteService;
import com.stefanini.service.TelefoneService;

@Named ("denuncianteMB")
@RequestScoped
public class DenuncianteBean {
	@Inject
    private DenuncianteService denuncianteService;
	Denunciante denunciante= new Denunciante();

	public Denunciante getDenunciante() {
		return denunciante;
	}

	public void setDenunciante(Denunciante denunciante) {
		this.denunciante = denunciante;
	}

	public void salvar() {
		denuncianteService.incluir(denunciante);
		
		}
}
