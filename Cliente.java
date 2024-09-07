public class Cliente {
    private String nome;
    private String endereco;
    private double renda;

    // Construtor da classe Cliente
    public Cliente(String nome, String endereco, double renda) {
        this.nome = nome;
        this.endereco = endereco;
        this.renda = renda;
    }

    // Métodos getters e setters para os atributos da classe Cliente
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
}