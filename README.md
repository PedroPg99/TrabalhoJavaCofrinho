# Projeto Cofrinho 

## 📖 Descrição

Cofrinho Virtual é uma aplicação desenvolvida em Java que simula o funcionamento de um cofrinho de moedas. O programa permite ao usuário adicionar e remover moedas de diferentes tipos (Real, Dólar e Euro), listar as moedas existentes e calcular o valor total convertido para a moeda Real.

O principal objetivo deste projeto é aplicar e demonstrar os conceitos da Programação Orientada a Objetos (POO).

## ✨ Funcionalidades

*Adicionar Moedas: Permite adicionar moedas dos tipos Real, Dólar e Euro.
*Remover Moedas: Remove uma moeda específica do cofrinho.
*Listar Moedas: Exibe todas as moedas contidas no cofrinho.
*Calcular Total: Calcula e exibe o valor total de todas as moedas, com as devidas conversões para Real (BRL).

## 🎓 Conceitos de POO Aplicados

Este projeto foi estruturado para fazer uso prático dos pilares da Programação Orientada a Objetos:

* **Herança:** As classes `Real`, `Dolar` e `Euro` herdam atributos e comportamentos da classe base `Moeda`.
* **Polimorfismo:** A classe `Cofrinho` manipula uma lista de objetos `Moeda`. Ao percorrer a lista, os métodos `info()` e `converter()` são chamados, e o Java executa a implementação correta de cada subclasse (Real, Dolar ou Euro) em tempo de execução.
* **Abstração:** A classe `Moeda` é declarada como `abstract` e define métodos abstratos (`info` e `converter`). Isso cria um "contrato" que obriga todas as subclasses a implementarem seus próprios comportamentos específicos.
* **Encapsulamento:** O acesso à lista de moedas na classe `Cofrinho` é controlado por métodos públicos (`adicionar`, `remover`, etc.), mantendo a lista em si como um detalhe interno (`private`) da classe. O mesmo ocorre com o atributo `valor` na classe `Moeda`, que é `protected`.

## 🛠️ Tecnologias Utilizadas

* Linguagem: [Java](https://www.java.com/pt-BR/) (JDK 11 ou superior)

## ⚙️ Pré-requisitos

* JDK (Java Development Kit) versão 11 ou superior instalado e configurado no sistema.

## 🚀 Como Rodar o Projeto

Existem duas maneiras principais de executar a aplicação:

### 1. Utilizando uma IDE (Ambiente de Desenvolvimento Integrado)

Esta é a forma mais simples:
1.  Abra o projeto em sua IDE favorita (Eclipse, IntelliJ IDEA, VS Code, etc.).
2.  Localize o arquivo `Principal.java`.
3.  Execute o método `main` contido neste arquivo.

### 2. Através do Terminal (Linha de Comando)

1.  Abra o terminal e navegue até a pasta raiz do projeto (a pasta que contém a pasta `trabalho`).
2.  Compile todos os arquivos `.java` com o seguinte comando:
    ```bash
    javac trabalho/*.java
    ```
3.  Execute a classe principal:
    ```bash
    java trabalho.Principal
    ```
4.  O menu interativo do cofrinho será exibido no terminal.

## 📁 Estrutura do Projeto

* `Principal.java`: Classe principal que contém o método `main`. Responsável por exibir o menu e interagir com o usuário.
* `Cofrinho.java`: Classe que gerencia a coleção de moedas, permitindo adicionar, remover, listar e calcular o total.
* `Moeda.java`: Classe abstrata que serve como modelo base para todas as moedas, definindo os atributos e métodos comuns.
* `Real.java`: Subclasse de `Moeda` que representa a moeda Real.
* `Dolar.java`: Subclasse de `Moeda` que representa a moeda Dólar, com sua própria lógica de conversão.
* `Euro.java`: Subclasse de `Moeda` que representa a moeda Euro, com sua própria lógica de conversão.

## 👨‍💻 Autor

Desenvolvido por **Pedro**.