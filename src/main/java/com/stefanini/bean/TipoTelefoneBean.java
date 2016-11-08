package com.stefanini.bean;
import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.swing.JOptionPane;

import com.stefanini.model.Agente;
import com.stefanini.model.Tipotelefone;
import com.stefanini.service.AgenteService;
import com.stefanini.service.TipoTelefoneService;

@Named ("tipotelefoneMB")
@RequestScoped
public class TipoTelefoneBean {
	@Inject
    private TipoTelefoneService tipoTelefoneService;
	Tipotelefone tipotelefone= new Tipotelefone();
 

   

	public Tipotelefone getTipotelefone() {
		return tipotelefone;
	}




	public void setTipotelefone(Tipotelefone tipotelefone) {
		this.tipotelefone = tipotelefone;
	}




	public void salvar() {
		tipoTelefoneService.incluir(tipotelefone);
		JOptionPane.showMessageDialog(null, "Agente salvo com sucesso!");
		}

}
