public class Fluxo {
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} //catch (ArithmeticException | NullPointerException | MyException ex) {
		 catch (Exception ex) {
			System.out.println("Exception " + ex.getMessage());
			ex.printStackTrace();
		} 		
		System.out.println("Fim do Main");

	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");

		metodo2();

		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		//ArithmeticException exception = new ArithmeticException("Msg de erro!");// Msg Default = Null
		throw new MyException("Msg de erro!"); // Não compila nenhum código abaixo. Interrompe a execução até encontrar tratamento.
		
		//System.out.println("Fim do metodo2");
	}
}