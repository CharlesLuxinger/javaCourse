package byteBank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaCharles = new Conta();
		Conta contaJoao = new Conta();

		contaCharles.saldo = 100;

		System.out.println(contaCharles.saldo);

		contaCharles.deposita(50);
		contaJoao.deposita(1000);

		contaCharles.titular = "Charles Maciel Luxinger";

		System.out.println(contaCharles.titular);
		System.out.println(contaCharles.saldo);

		boolean retorno = contaCharles.saca(50);
		if (retorno == true) {
			System.out.println("Saldo Atual ap�s saque: " + contaCharles.saldo);
		} else {
			System.out.println("Saldo Insuficiente");
		}

		if (contaJoao.transfere(contaCharles, 1001)) {
			System.out.println("Saldo ap�s transfer�ncia: " + contaCharles.saldo);
		} else {
			System.out.println("Saldo Insuficiente");
		}

	}

}
