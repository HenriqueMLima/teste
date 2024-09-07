public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Construtor que recebe dia, mês e ano
    public Data(int dia, int mes, int ano) {
        if (dataEhValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida!");
            // Outra ação, como lançar uma exceção, poderia ser feita aqui
        }
    }

    // Método para verificar se a data é válida
    private boolean dataEhValida(int dia, int mes, int ano) {
        if (ano < 0 || mes < 1 || mes > 12) {
            return false;
        }

        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Verificando se é ano bissexto
        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            diasPorMes[1] = 29;
        }

        return dia >= 1 && dia <= diasPorMes[mes - 1];
    }

    // Métodos getters e setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}