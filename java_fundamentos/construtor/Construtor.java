package construtor;

public class Construtor {
    
    private int numero;
    private String texto;

    
    public Construtor(int numero) {
        this.numero = numero;
    }
    
    public Construtor(int numero, String texto) {
        this.numero = numero;
        this.texto = texto;
    }
    
    public void setNumber(int numero) {
        this.numero = numero;
    }
    
    public int getNumber() {
        return this.numero;
    }
    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}