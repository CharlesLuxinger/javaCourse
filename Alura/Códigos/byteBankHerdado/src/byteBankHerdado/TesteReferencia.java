package byteBankHerdado;

public class TesteReferencia {

	public static void main(String[] args) {
		Gerente ger1 = new Gerente();

		ger1.setNome("Charles");
		ger1.setSalario(5000.0);
		
		//Funcionario func1 = new Funcionario(); Classe Abstrata não permite instanciar objeto

		
		EditorVideo edit1 = new EditorVideo();

		edit1.setNome("Joaquim");
		edit1.setSalario(5000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(ger1);
		
		controle.registra(edit1);
		
		

	}

}
