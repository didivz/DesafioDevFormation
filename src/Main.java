public class Main {
    public static void main(String[] args) {
        Pessoa beatriz = new Pessoa("Beatriz", 24);
        beatriz.codar();
        beatriz.reclamar();

        Pessoa larissa = new Pessoa("Larissa", 27);
        larissa.codar();
        larissa.chorar();

        Computador computadorBeatriz = new Computador("LG", "PHILIPS", "PHILIPS", "FORTREK");
        Computador computadorLarissa = new Computador("SAMSUNG", "PHILIPS", "LOGITECH", "HARDLINE");

        Mesa mesaDoFinanceiro = new Mesa();
        mesaDoFinanceiro.adicionarComputador(computadorBeatriz);
        mesaDoFinanceiro.adicionarComputador(computadorLarissa);

        mesaDoFinanceiro.mostraComputadores();

        // Dever de casa: Implementar o metodo que mostra o nome das pessoas que estao na mesa.
        // Resultado esperado:
        // - Beatriz
        // - Larissa
        mesaDoFinanceiro.mostrarPessoas();

        computadorLarissa.ligar();

        // Dever de casa: Implementar o metodo que mostra apenas os computadores que estao desligados.
        // Resultado esperado:
        // - Computador 'LG PHILIPS PHILIPS FORTREK' esta desligado.
        mesaDoFinanceiro.mostraComputadoresDesligados();
    }
}