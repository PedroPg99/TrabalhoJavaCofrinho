package trabalho;

public abstract class Moeda {
    protected double valor;

    // Construtor que recebe o valor da moeda.
    public Moeda(double valor) {
        this.valor = valor;
    }


    // para exibir as informações da moeda.
    public abstract void info();


    // para converter o valor da moeda para Real.
    public abstract double converter();

    // Getter para o valor, útil para comparações.
    public double getValor() {
        return valor;
    }
    @Override
    public boolean equals(Object obj) {
        // Verifica se o objeto comparado é ele mesmo.
        if (this == obj)
            return true;
        // Verifica se o objeto é nulo ou de uma classe diferente.
        if (obj == null || getClass() != obj.getClass())
            return false;
        // Converte o objeto para o tipo Moeda.
        Moeda outraMoeda = (Moeda) obj;
        // Compara o valor das duas moedas.
        return Double.compare(outraMoeda.valor, valor) == 0;
    }
}

