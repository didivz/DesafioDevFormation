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
        for (Computador computadores : computadores) {
            if (computadores != null) {
                System.out.println(computadores.mostrar());
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
        for(Computador computador : computadores){
            if(!computador.getLigado()) {
                System.out.println("Computador " + computador.mostrar() + " está desligado");
            }
        }
    }

//    public void mostraComputadoresLigados() {
//        for(Computador computador : computadores){
//            if(computador.getLigado()) {
//                System.out.println("Computador " + computador.mostrar() + " está ligado");
//            }
//        }
//    }

    public void mostrarPessoas() {
        for (Pessoa pessoa : pessoas) {
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


