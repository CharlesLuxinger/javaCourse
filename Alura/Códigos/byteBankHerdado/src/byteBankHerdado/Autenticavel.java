package byteBankHerdado;
//Uma interface n�o pode haver nada concreto(objeto, m�todo)
public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
