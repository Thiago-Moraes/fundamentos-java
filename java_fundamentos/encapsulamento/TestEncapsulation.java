package encapsulamento;

public class TestEncapsulation {
    public static void main(String[] args) {

        Encapsulation encapsulation = new Encapsulation("12345678901", "João das Couves", 100.0);

        System.out.println("Olá " + encapsulation.getName() + "! Seu saldo inicial é: R$ " + encapsulation.getBalance());
        encapsulation.deposit(25);
        encapsulation.withDraw(100);
    }
}