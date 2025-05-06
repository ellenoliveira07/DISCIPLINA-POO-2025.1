
# **Capítulo 04: Estrutura Condicional**

Bem-vindo ao repositório de exercícios do **Capítulo 04** de **Programação Orientada a Objetos (POO)**, que aborda o conceito de **Estrutura Condicional**. Este repositório foi criado como parte da disciplina de **POO** no **IFCE Campus Maranguape**, ministrada pelo professor **Roger Moura Sarmento**.

## **🎯 Objetivo**

O objetivo deste capítulo é proporcionar aos alunos o entendimento e a aplicação das **estruturas condicionais** em **Java**, que são essenciais para controlar o fluxo de execução do programa com base em **condições específicas**.

Ao trabalhar com **estruturas condicionais**, você será capaz de tomar decisões durante a execução do código, alterando seu comportamento dependendo do resultado de uma comparação. Com isso, o programa pode se comportar de maneira diferente, dependendo das entradas ou das condições que ele encontra durante a execução.

## **🧩 Conceito de Estrutura Condicional**

Em programação, **estruturas condicionais** permitem que o código tome decisões com base em **condições** (expressões booleanas) que podem ser verdadeiras ou falsas. Com isso, diferentes caminhos podem ser seguidos, dependendo do valor dessas condições.

Em **Java**, as estruturas condicionais mais comuns são:

- **`if`**: Executa um bloco de código se a condição for verdadeira.
- **`else`**: Executa um bloco de código alternativo caso a condição do `if` seja falsa.
- **`else if`**: Permite verificar múltiplas condições de forma sequencial.
- **`switch`**: Permite comparar uma variável contra vários valores possíveis e executar um bloco de código correspondente.

### **🔧 Sintaxe Básica:**

#### `if` e `else`

```java
if (condição) {
    // Código a ser executado se a condição for verdadeira
} else {
    // Código a ser executado se a condição for falsa
}
````

#### `else if`

```java
if (condição1) {
    // Código se a condição1 for verdadeira
} else if (condição2) {
    // Código se a condição2 for verdadeira
} else {
    // Código se nenhuma das condições anteriores for verdadeira
}
```

#### `switch`

```java
switch (variável) {
    case valor1:
        // Código a ser executado se a variável for igual a valor1
        break;
    case valor2:
        // Código a ser executado se a variável for igual a valor2
        break;
    default:
        // Código a ser executado se a variável não for igual a nenhum dos valores
}
```

## **🔍 Aplicações da Estrutura Condicional em POO**

Em **Programação Orientada a Objetos (POO)**, as **estruturas condicionais** são essenciais para controlar o comportamento de objetos e suas interações. Elas são comumente usadas em:

1. **Validação de dados**: Antes de modificar o estado de um objeto, é comum validar entradas para garantir que elas atendem a certos critérios.

   Exemplo:

   ```java
   if (idade >= 18) {
       // Permite o cadastro de um usuário maior de idade
   } else {
       // Exibe uma mensagem de erro
   }
   ```

2. **Alteração de estado de objetos**: Condições podem ser usadas para determinar qual ação um objeto deve realizar em diferentes situações.

   Exemplo:

   ```java
   if (saldo >= valor) {
       conta.sacar(valor);
   } else {
       System.out.println("Saldo insuficiente.");
   }
   ```

3. **Decisão entre diferentes tipos de objetos**: Muitas vezes, é necessário tomar decisões com base nas características ou tipos de objetos, como classes, atributos ou estados.

   Exemplo:

   ```java
   if (animal instanceof Cachorro) {
       ((Cachorro) animal).latir();
   } else {
       System.out.println("Não é um cachorro.");
   }
   ```

---

Este repositório oferece uma excelente oportunidade para você praticar **estruturas condicionais** em **POO** com **Java**, permitindo que você refine suas habilidades e aprenda a aplicar as decisões lógicas em programação de forma eficaz.

🌟 **Aproveite os exercícios e divirta-se aprendendo!**


