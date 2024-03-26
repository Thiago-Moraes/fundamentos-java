package pessoa;

public class Pessoa {
    
    String nome;
    int idade;
    String cpf;

    Pessoa(String nome, int idade, Cpf cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf.getValue();
    }
}
