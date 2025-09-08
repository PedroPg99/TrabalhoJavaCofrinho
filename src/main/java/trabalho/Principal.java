package trabalho;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        // Cria um Scanner para ler a entrada do teclado.
        Scanner scanner = new Scanner(System.in);
        // Cria uma instância do Cofrinho.
        Cofrinho meuCofrinho = new Cofrinho();

        int opcao = -1; // Variável para armazenar a opção do menu.

        // Loop principal do menu, continua até que o usuário escolha a opção 0 (Sair).
        while (opcao != 0) {
            // menu de opções.
            System.out.println("\n--- MENU COFRINHO ---");
            System.out.println("1. Adicionar Moeda");
            System.out.println("2. Remover Moeda");
            System.out.println("3. Listar Moedas");
            System.out.println("4. Calcular total em Reais");
            System.out.println("0. Sair");
            System.out.print("Digite sua opção: ");

            // Tenta ler um número inteiro, se não for, trata o erro.
            try {
                opcao = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Opção inválida! Por favor, digite um número.");
                scanner.next(); // Limpa o buffer do scanner.
                continue; // Volta para o início do loop.
            }


            // Sitch das opcoes de moedas
            switch (opcao) {
                case 1: { // Adicionar Moeda
                    int tipoMoeda = 0;
                    System.out.println("\nEscolha a Moeda:");
                    System.out.println("1. Real");
                    System.out.println("2. Dólar");
                    System.out.println("3. Euro");
                    tipoMoeda = scanner.nextInt();

                    System.out.print("Digite o valor: ");
                    double valorMoeda = scanner.nextDouble();

                    Moeda moeda = null; // Cria uma variável do tipo Moeda.
                    if (tipoMoeda == 1) {
                        moeda = new Real(valorMoeda);
                    } else if (tipoMoeda == 2) {
                        moeda = new Dolar(valorMoeda);
                    } else if (tipoMoeda == 3) {
                        moeda = new Euro(valorMoeda);
                    } else {
                        System.out.println("Tipo de moeda inválido!");
                    }

                    if (moeda != null) {
                        meuCofrinho.adicionar(moeda);
                    }
                    break;
                }

                case 2: { // Remover Moeda
                    // Para simplificar, vamos remover pedindo o tipo e o valor.
                    int tipoMoedaRemover = 0;
                    System.out.println("\nQual moeda deseja remover?");
                    System.out.println("1. Real");
                    System.out.println("2. Dólar");
                    System.out.println("3. Euro");
                    tipoMoedaRemover = scanner.nextInt();

                    System.out.print("Digite o valor: ");
                    double valorMoedaRemover = scanner.nextDouble();

                    Moeda moedaParaRemover = null;
                    if (tipoMoedaRemover == 1) {
                        moedaParaRemover = new Real(valorMoedaRemover);
                    } else if (tipoMoedaRemover == 2) {
                        moedaParaRemover = new Dolar(valorMoedaRemover);
                    } else if (tipoMoedaRemover == 3) {
                        moedaParaRemover = new Euro(valorMoedaRemover);
                    } else {
                        System.out.println("Tipo de moeda inválido!");
                    }

                    if(moedaParaRemover != null){


                        // Vamos adicionar o 'equals' em Moeda para que isso funcione.
                        meuCofrinho.remover(moedaParaRemover);
                    }

                    break;
                }

                case 3: { // Listar Moedas
                    meuCofrinho.listagemMoedas();
                    break;
                }

                case 4: { // Calcular Total Convertido
                    double total = meuCofrinho.totalConvertido();
                    System.out.printf("Total convertido para Real: R$ %.2f%n", total);
                    break;
                }

                case 0: { // Sair
                    System.out.println("Encerrando o programa...");
                    break;
                }

                default: { // Opção inválida
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
                }
            }
        }

    
        scanner.close();
    }
}
