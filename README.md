# Income Tax Calculator

Calculadora de imposto de renda desenvolvida em Java para calcular a tributação de diferentes tipos de contribuintes.

O projeto foi desenvolvido com foco na prática de conceitos fundamentais de Programação Orientada a Objetos, especialmente **herança, polimorfismo, abstração e sobrescrita de métodos**, utilizando diferentes regras de cálculo de acordo com o tipo de contribuinte.

## Funcionalidades

* Cadastro de contribuintes.
* Identificação do tipo de contribuinte.
* Suporte a pessoa física e pessoa jurídica.
* Cálculo do imposto conforme o tipo de contribuinte.
* Exibição dos valores calculados.
* Processamento de múltiplos contribuintes.

## Tecnologias

* Java
* Programação Orientada a Objetos
* Herança
* Polimorfismo
* Classes abstratas
* Enumerações
* `ArrayList`
* `Scanner`

## Estrutura do Projeto

```text
src/
└── aplication/
    └── Main.java
```

> O projeto também possui classes de domínio responsáveis pela representação dos diferentes tipos de contribuintes e suas respectivas regras de tributação.

## Conceitos de POO aplicados

### Herança

O projeto utiliza uma classe base para representar características comuns aos contribuintes, permitindo que diferentes tipos de contribuintes compartilhem atributos e comportamentos.

### Polimorfismo

O cálculo do imposto pode ser realizado de maneira diferente para cada tipo de contribuinte. Dessa forma, o programa consegue trabalhar com diferentes objetos através de uma mesma referência, respeitando as regras específicas de cada classe.

### Abstração

A estrutura do projeto utiliza abstração para representar comportamentos comuns e permitir que as classes especializadas implementem suas próprias regras de cálculo.

### Enumeração

Um `enum` é utilizado para representar informações relacionadas ao tipo de contribuinte, tornando o código mais organizado e evitando o uso de valores soltos para representar categorias.

## Fluxo da aplicação

```text
Entrada dos dados
       ↓
Identificação do contribuinte
       ↓
Criação do objeto correspondente
       ↓
Aplicação das regras de tributação
       ↓
Cálculo do imposto
       ↓
Exibição dos resultados
```

## Exemplo de funcionamento

O programa solicita informações do contribuinte e identifica se ele pertence à categoria de **pessoa física ou pessoa jurídica**.

A partir dessa informação, é criado o objeto correspondente e aplicado o método responsável pelo cálculo da tributação.

Dessa forma, cada tipo de contribuinte pode possuir sua própria regra de cálculo sem comprometer a estrutura principal da aplicação.

## Como executar

1. Clone o repositório:

```bash
git clone git@github.com:Davi-S1va/income-tax-calculator.git
```

2. Abra o projeto em uma IDE compatível com Java, como Eclipse ou IntelliJ IDEA.

3. Execute a classe principal `Main`.

4. Informe os dados solicitados pelo programa no terminal.

## Objetivo

Este projeto faz parte da minha evolução no desenvolvimento com Java e tem como objetivo consolidar conhecimentos de **Programação Orientada a Objetos**, principalmente herança, polimorfismo, abstração e implementação de regras de negócio.

---

Desenvolvido por **Davi Silva**.
