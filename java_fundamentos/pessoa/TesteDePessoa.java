package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        try{
            var pessoa = new Pessoa("João das Couves", 30, new Cpf("05945411744"));

            System.out.println(pessoa.nome);
            System.out.println(pessoa.idade);
            System.out.println(pessoa.cpf);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
