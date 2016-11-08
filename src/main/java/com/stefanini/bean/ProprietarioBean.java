package com.stefanini.bean;
import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.swing.JOptionPane;

import com.stefanini.model.Proprietario;
import com.stefanini.service.ProprietarioService;

@Named ("proprietarioMB")
@RequestScoped

public class ProprietarioBean {
	@Inject
    private ProprietarioService proprietarioService;
	Proprietario proprietario= new Proprietario();

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public void salvar() {
		proprietarioService.incluir(proprietario);
    }
}
