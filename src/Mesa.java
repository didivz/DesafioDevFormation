public class Mesa {
    private Computador[] computadores = new Computador[2];
    private Pessoa[] pessoas = new Pessoa[2];

    public Computador[] getComputadores() {
        return computadores;
    }

    public void setComputadores(Computador[] computadores) {
        this.computadores = computadores;
    }

    public Pessoa[] getPessoas() {
        return pessoas;
    }

    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }

    // Se tiver computador, imprimir os atributos dele
    public void mostraComputadores() {
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null) {
                System.out.println(computadores[i].mostrar());
            }
        }
    }

    public void adicionarComputador(Computador computador) {
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] == null) {
                computadores[i] = computador;
                break;
            }
        }
    }

    public void mostraComputadoresDesligados() {

    }

    public void mostrarPessoas() {

    }
}