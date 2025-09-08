package trabalho;

public class Real extends Moeda{
    // Construtor que chama o construtor da classe mãe (Moeda).
    public Real(double valor) {
        super(valor);
    }

    // do método info para  exiber os dados da moeda.
    @Override
    public void info() {
        // Formata o valor para exibir com duas casas decimais.
        System.out.printf("Real - R$ %.2f%n", valor);
    }

    // método converter, retorna o próprio valor.
    @Override
    public double converter() {
        return this.valor;
    }
}

