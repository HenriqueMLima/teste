public class Lampada {
    private boolean acesa;

    // Construtor que recebe o estado inicial da lâmpada
    public Lampada(boolean estadoInicial) {
        this.acesa = estadoInicial;
    }

    // Métodos para ligar e desligar a lâmpada
    public void ligar() {
        this.acesa = true;
    }

    public void desligar() {
        this.acesa = false;
    }

    // Método para verificar o estado da lâmpada
    public boolean estaAcesa() {
        return this.acesa;
    }

    // Método setter para alterar o estado da lâmpada
    public void setAcesa(boolean acesa) {
        this.acesa = acesa;
    }
}