package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Produto bala = new Produto("Juquinha", 0.15);
		System.out.println("Bala " + bala.getNome() + "pre�o: " + String.format("%.2f", bala.getPreco()));
	}
}
