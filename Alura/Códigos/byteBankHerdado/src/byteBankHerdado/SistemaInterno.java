package byteBankHerdado;


public class SistemaInterno {

	private int senha = 2222;
	
	public void autentica(Autenticavel fa) {
		boolean autenticado = fa.autentica(this.senha);
		
		if(autenticado) {
			System.out.println("Senha correta");
		}
		System.out.println("Senha incorreta");
		
	}
	
}


