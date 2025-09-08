package trabalho;

import java.util.ArrayList;

public class Cofrinho {
    // ArrayList das Moedas
    private ArrayList<Moeda> listaMoedas = new ArrayList<>();

    // Método para adicionar uma moeda à lista.
    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
        System.out.println("Moeda adicionada com sucesso!");
    }

    // Método para remover uma moeda da lista.
    public void remover(Moeda moeda) {
        // Verifica se a moeda foi encontrada e removida.
        if (listaMoedas.remove(moeda)) {
            System.out.println("Moeda removida com sucesso!");
        } else {
            System.out.println("Moeda não encontrada no cofrinho.");
        }
    }

    // Método para listar todas as moedas no cofrinho.
    public void listagemMoedas() {
        if (listaMoedas.isEmpty()) {
            System.out.println("O cofrinho está vazio.");
            return;
        }
        System.out.println("--- Moedas no Cofrinho ---");
        // Laço for-each que percorre cada moeda na lista e chama seu método info().
        // dependendo se o objeto é Real, Dolar ou Euro.
        for (Moeda moeda : listaMoedas) {
            moeda.info();
        }
        System.out.println("--------------------------");
    }

    // Método para calcular o valor total convertido para Real.
    public double totalConvertido() {
        double total = 0;
        // Percorre cada moeda na lista.
        for (Moeda moeda : listaMoedas) {
            // Soma o valor convertido de cada moeda ao total.

            total += moeda.converter();
        }
        return total;
    }

}
