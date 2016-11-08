package com.stefanini.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.swing.JOptionPane;

import com.stefanini.model.Categoria;
import com.stefanini.service.AgenteService;
import com.stefanini.service.CategoriaService;

@Named ("categoriaMB")
@RequestScoped
public class CategoriaBean {
	@Inject
    private CategoriaService categoriaService;
	Categoria categoria= new Categoria();
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public void salvar() {
		categoriaService.incluir(categoria);
		
		}

}
