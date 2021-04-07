package projetoyoutube;

public class Usuario extends Pessoa {

    private int totAssistido;
    private String login;

    public Usuario(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade);
        this.login = login;
    }

    public void Status() {

        System.out.println("\n-----------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Login: " + this.getLogin());
        System.out.println("Videos assistidos: " + this.getTotAssistido());
        System.out.println("-----------------\n");

    }

    public void viuMaisUm() {
        this.setTotAssistido(this.getTotAssistido() + 1);
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

}
