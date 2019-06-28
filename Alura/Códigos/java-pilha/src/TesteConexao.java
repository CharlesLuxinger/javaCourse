
public class TesteConexao {
	
	public static void main(String[] args) {
		try (Conexao conex = new Conexao()) {
			conex.leDados();
		} catch (IllegalStateException ex){
			System.out.println("Erro Conex�o");
			
		}
		
		
		
		// Forma Extensa
//		Conexao con = null;
//		
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException ex) {
//			System.out.println("Erro Conex�o");
//		} finally {
//			System.out.println("Finally");
//			if (con != null) {
//				con.close();
//			}
//		}
	}

}
