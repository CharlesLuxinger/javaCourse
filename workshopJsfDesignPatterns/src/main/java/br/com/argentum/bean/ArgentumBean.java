package br.com.argentum.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.argentum.model.Negociacao;
import br.com.argentum.webservice.ClientWebService;

@ManagedBean
public class ArgentumBean {

	public List<Negociacao> getNegociacoes() {
		return new ClientWebService().getNegociacoes();
	}

}
