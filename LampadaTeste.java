public class LampadaTeste {
    private boolean acesa;
    private int watts;

    // Construtor que recebe o número de watts da lâmpada
    public LampadaTeste(int watts) {
        this.watts = watts;
    }

    // Construtor sem argumentos que considera 60 watts por padrão
    public LampadaTeste() {
        this(60); 
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

    // Método getter para obter o número de watts da lâmpada
    public int getWatts() {
        return this.watts;
    }

    // Método setter para alterar o número de watts da lâmpada
    public void setWatts(int watts) {
        this.watts = watts;
    }
}