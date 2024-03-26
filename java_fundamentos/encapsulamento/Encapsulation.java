package encapsulamento;

class Encapsulation {

    private String numero;
    private String titular;
    private double balance;

    public Encapsulation(String numero, String titular, double saldo) {
        this.setNumber(numero);
        this.setName(titular);
        this.setBalance(saldo);
    }

    public String getNumber() {
        return this.numero;
    }

    public void setNumber(String numero) {
        this.numero = numero;
    }

    public String getName() {
        return this.titular;
    }

    public void setName(String titular) {
        this.titular = titular;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double value) {
        this.balance += value;
        this.balanceMessage("depositou", value);
    }

    public void withDraw(double value) {
        this.balance -= value;
        this.balanceMessage("sacou", value);
    }

    private void balanceMessage(String action, double value) {
        System.out.println("Você " + action + " R$" + value + ". Seu saldo atual é: R$ " + this.getBalance());
    }
}