package trabalho;

public class Euro extends Moeda {
    // Taxa de conversão fixa para o exemplo.
    private static final double TAXA_DE_CAMBIO = 5.70;

    // Construtor que chama o construtor da classe mãe ->Moeda.
    public Euro(double valor) {
        super(valor);
    }

    // método info.
    @Override
    public void info() {
        System.out.printf("Euro - € %.2f%n", valor);
    }

    // método converter, multiplicando o valor pela taxa de câmbio.
    @Override
    public double converter() {
        return this.valor * TAXA_DE_CAMBIO;
    }
}
