
public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        metodo1();
        //� possivel fazer um catch generico que captura todas as excecoes -> catch(Exception e)
        }catch(Exception e) {
        	System.out.println("Exception " + e.getMessage());
        	e.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao{
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        throw new MinhaExcecao("Deu muito errado");
        //System.out.println("Fim do metodo2");
    } 
}