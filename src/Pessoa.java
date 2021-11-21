public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void codar() {
        System.out.println(this.getNome() + " - Estou codando like a Jiraya!");
    }

    public void reclamar() {
        System.out.println(this.getNome() + " - Aff, odeio Python!");
    }

    public void chorar() {
        System.out.println(this.getNome() + " - EU NAO AGUENTO MAIS A FACULDADE!");
    }
}