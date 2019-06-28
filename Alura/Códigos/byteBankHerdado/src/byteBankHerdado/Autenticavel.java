package byteBankHerdado;
//Uma interface não pode haver nada concreto(objeto, método)
public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
