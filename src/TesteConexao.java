
public class TesteConexao {

	public static void main(String[] args) {
		
		//try with resouces
		
		try(Conexao con = new Conexao() ) {
			con.leDados();
		} catch(IllegalStateException e) {
			System.out.println("Deu erro na conex�o");
		}
		
	}

}
		
		
//		Conexao con = null;
//		 
//		try {
//			con = new Conexao();
//			con.leDados();
//			con.fecha();
//		} catch(IllegalStateException e) {
//			System.out.println("Deu erro na conex�o");
//		} finally {
//			con.fecha();
//		}

