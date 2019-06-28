/*
public class aulaLaçosEncadeados {
	public static void main(String[] args) {
		for (int multiplicador = 0; multiplicador < 10; multiplicador++) {
			for (int contador = 1; contador < 10; contador++) {
				System.out.print(multiplicador*contador + " "); 
			}
			System.out.println();
		}
	}
}*/
public class aulaLaçosEncadeados {
	public static void main(String[] args) {
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 10; coluna++) {
				if(coluna > linha) {
					break;
				}
				System.out.print("*" + " "); 
			}
			System.out.println();
		}
	}
}