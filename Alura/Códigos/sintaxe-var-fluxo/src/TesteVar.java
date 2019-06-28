
public class TesteVar {
	public static void main(String[] args) {

		int idade = 31;
		double salario = 1450.6;
		float horas = 1.5f;
		int valor = (int) salario; // Cast
		long numeroGrande = 1000000L;
		short numeroPequeno = 100;
		byte b = 127;

		char letra = 'a';

		String frase = "hello world";

		System.out.println("New Hello World");
		System.out.println(idade);
		System.out.println(salario);
		System.out.println(valor);
		System.out.println(letra);
		System.out.println(frase);

		if (idade > 30) {
			System.out.println(frase);
		}
	}
}
