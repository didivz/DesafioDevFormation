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
        for (Computador computadore : computadores) {
            if (computadore != null) {
                System.out.println(computadore.mostrar());
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
        for (Pessoa pessoa : pessoas) {
//            pessoa.codar();
            System.out.println(pessoa.getNome() + " esta na mesa");
        }

    }
    public void adicionarPessoa(Pessoa pessoa) {
        for(int i = 0; i < pessoas.length; i++) {
            if(pessoas[i] == null) {
                pessoas[i] = pessoa;
                break;
            }
        }
    }
}


