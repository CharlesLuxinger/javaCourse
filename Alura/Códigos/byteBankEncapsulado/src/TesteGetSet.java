
public class TesteGetSet {

	public static void main(String[] args) {
		Conta conta = new Conta(100,115);

		conta.setNumero(1234);
		System.out.println(conta.getNumero());

		conta.setAgencia(4321);
		System.out.println(conta.getAgencia());

		Cliente charles = new Cliente();

		charles.setNome("Charles Maciel Luxinger");
		conta.setTitular(charles);

		System.out.println(conta.getTitular().getNome());

		conta.getTitular().setProfissao("Programador");

	}

}
