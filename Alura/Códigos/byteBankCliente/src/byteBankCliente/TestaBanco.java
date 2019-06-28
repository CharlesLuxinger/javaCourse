package byteBankCliente;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente charles = new Cliente();
		charles.nome = "Charles Maciel Luxinger";
		charles.cpf = "000.000.000-99";
		charles.profissao = "Eng de Audio";

		Conta contaCharles = new Conta();
		contaCharles.deposita(100);

		contaCharles.titular = charles;

		// Forma contraída
		// contaCharles.titular = new Cliente();
		// contaCharles.titular.nome = "Charles Maciel Luxinger";

		System.out.println(contaCharles.titular.nome);
	}

}
