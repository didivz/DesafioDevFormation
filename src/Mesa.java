public class Mesa {
    private Computador[] computadores = new Computador[2];
    private Pessoa[] pessoas = new Pessoa[2];

    public Computador[] getComputadores() {
        return computadores;
    }

    public void setComputadores(Computador[] computadores) {
        this.computadores = computadores;
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

    public void adicionarPessoa(Pessoa pessoa) {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] == null) {
                pessoas[i] = pessoa;
                break;
            }
        }
    }

    public void mostraPessoas() {
        for (Pessoa pessoa : pessoas) {
            if (pessoa != null) {
                System.out.println(pessoa.getNome());
            }
        }
    }

    public void mostraComputadoresDesligados() {
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null) {
                if (!computadores[i].getLigado()) {
                    System.out.println("O computador " + computadores[i].mostrar() + " esta desligado.");
                }
            }
        }
    }
}