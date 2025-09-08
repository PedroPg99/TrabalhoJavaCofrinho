package trabalho;

public class Dolar extends Moeda{
    // Taxa de conversão fixa para o exemplo.
    private static final double TAXA_DE_CAMBIO = 5.25;

    // Construtor que chama o construtor da classe mãe (Moeda).
    public Dolar(double valor) {
        super(valor);
    }

    //método info.
    @Override
    public void info() {
        System.out.printf("Dólar - US$ %.2f%n", valor);
    }

    // Método converter, multiplicando o valor pela taxa de câmbio.
    @Override
    public double converter() {
        return this.valor * TAXA_DE_CAMBIO;
    }
}
