package br.com.argentum.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloWorld {

	private String mensagem = "Hello Word!";
	private String nome;

	public String getMensagem() {
		return this.mensagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void onClickButton() {
		System.out.println("Nome: " + this.nome);
	}
}
