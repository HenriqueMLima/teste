public class Contador {
    private int valor;

    // Construtor que não recebe argumentos e considera que o contador começa do zero
    public Contador() {
        this.valor = 0;
    }

    // Construtor que aceita um valor inicial para contagem
    public Contador(int valorInicial) {
        this.valor = valorInicial;
    }

    // Métodos para incrementar e decrementar o contador
    public void incrementar() {
        this.valor++;
    }

    public void decrementar() {
        this.valor--;
    }

    // Método para obter o valor atual do contador
    public int getValor() {
        return this.valor;
    }

    // Método setter para definir o valor do contador
    public void setValor(int novoValor) {
        this.valor = novoValor;
    }
}