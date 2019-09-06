package br.com.argentum.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.argentum.model.Negociacao;
import br.com.argentum.webservice.ClientWebService;

@ViewScoped
@ManagedBean
public class ArgentumBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Negociacao> negociacoes;

	public ArgentumBean() {
		negociacoes = new ClientWebService().getNegociacoes();
	}

	public List<Negociacao> getNegociacoes() {
		return negociacoes;
	}

}
