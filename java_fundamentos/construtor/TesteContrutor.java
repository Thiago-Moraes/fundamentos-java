package construtor;

public class TesteContrutor {

    public static void main(String args[]) {
        Construtor construtor = new Construtor(10);
        System.out.println(construtor.getNumber());
        
        Construtor construtor1 = new Construtor(11, "Texto de teste");
        System.out.println(construtor1.getNumber());
        System.out.println(construtor1.getTexto());
    }
}