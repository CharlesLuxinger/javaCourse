package application;

public class Program {
	public static void main(String[] args) {
		String[] vect = new String[] { "Maria", "Bob", "Alex" };

		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}

		// FOR EACH(PARA CADA OBJ CONTIDO EM VECT, FA�A:)
		for (String obj : vect) {
			System.out.println(obj);
		}
	}
}