public class Computador {
    private String tela;
    private String teclado;
    private String mouse;
    private String cpu;
    private boolean ligado = false;

    public Computador(String tela, String teclado, String mouse, String cpu) {
        this.tela = tela;
        this.teclado = teclado;
        this.mouse = mouse;
        this.cpu = cpu;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public boolean getLigado() { return ligado; }

    public void ligar() {
        // Deve ligar o computador
        if (!this.ligado) {
            this.ligado = true;
        }
        System.out.println("O computador esta ligado!");
    }

    public void desligar() {
        // Deve desligar o computador
        if (this.ligado) {
            this.ligado = false;
        }
        System.out.println("O computador esta desligado!");
    }

    public String mostrar() {
        return this.tela + " " + this.teclado + " " + this.mouse + " " + this.cpu;
    }
}