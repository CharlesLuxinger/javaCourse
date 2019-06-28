package byteBankHerdado;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente ger1 = new Gerente ();
		
		//Classe Funcionario
		ger1.setNome("Manuel");
		ger1.setCpf("122-122-122-11");
		ger1.setSalario(3000);
		
		//Classe Gerente
		ger1.setSenha(2222);
		
		System.out.println(ger1.getNome());
		
		

	}

}
