
# **Capítulo 08: Sub-rotinas**

Bem-vindo ao repositório de exercícios do **Capítulo 08** de **Programação Orientada a Objetos (POO)**, que aborda o conceito de **Sub-rotinas**. Este repositório foi criado como parte da disciplina de **POO** no **IFCE Campus Maranguape**, ministrada pelo professor **Roger Moura Sarmento**.

## **🎯 Objetivo**

O objetivo deste capítulo é proporcionar aos alunos o entendimento e a aplicação das **sub-rotinas** em **Java**, uma das bases da reutilização de código e da modularização de programas. As sub-rotinas (ou funções/métodos) são blocos de código que realizam uma tarefa específica e podem ser chamadas várias vezes em diferentes partes de um programa, tornando-o mais organizado e eficiente.

### **O que são Sub-rotinas?**

Em **Java**, as sub-rotinas são conhecidas como **métodos**. Um **método** é um bloco de código que pode ser executado quando chamado pelo nome. Métodos permitem que você divida um programa em partes menores, mais fáceis de entender e manter. Além disso, eles possibilitam a reutilização do código, o que evita repetições e facilita modificações futuras.

### **🔧 Sintaxe Básica:**

A declaração de um método pode ser feita da seguinte forma:

```java
tipoDeRetorno nomeDoMetodo(parâmetros) {
    // Corpo do método
    // Código a ser executado
}
````

Exemplo de um método simples que retorna a soma de dois números:

```java
public int somar(int a, int b) {
    return a + b;
}
```

Para chamar esse método dentro de outro código, basta invocar seu nome:

```java
int resultado = somar(5, 3); // resultado será 8
```

### **Tipos de Métodos**

1. **Métodos sem valor de retorno (void):**

   * Esses métodos não retornam nenhum valor, mas realizam uma ação.
   * Exemplo:

   ```java
   public void imprimirMensagem(String mensagem) {
       System.out.println(mensagem);
   }
   ```

2. **Métodos com valor de retorno:**

   * Esses métodos retornam um valor após sua execução.
   * Exemplo:

   ```java
   public int multiplicar(int a, int b) {
       return a * b;
   }
   ```

### **Métodos e Parâmetros**

Os métodos podem receber parâmetros, que são valores passados para o método quando ele é chamado. Esses parâmetros permitem que o método seja mais flexível e trabalhe com diferentes entradas.

Exemplo de um método com parâmetros:

```java
public void exibirDados(String nome, int idade) {
    System.out.println("Nome: " + nome + ", Idade: " + idade);
}
```

### **Métodos Recursivos**

Um **método recursivo** é aquele que chama a si próprio para resolver um problema em partes menores. A recursão é útil em problemas que podem ser divididos em subproblemas semelhantes.

Exemplo de um método recursivo para calcular o fatorial de um número:

```java
public int fatorial(int n) {
    if (n == 0) {
        return 1; // Caso base
    } else {
        return n * fatorial(n - 1); // Chamada recursiva
    }
}
```

## **🧩 Trabalhando com Sub-rotinas em POO**

Em **Programação Orientada a Objetos (POO)**, os métodos são fundamentais para interagir com os objetos, ou seja, são as ações que um objeto pode realizar. Eles definem o comportamento de uma classe e são usados para manipular dados contidos nas instâncias da classe.

Exemplo de uso de sub-rotinas (métodos) em uma classe:

```java
public class ContaBancaria {
    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public double obterSaldo() {
        return saldo;
    }
}
```

No exemplo acima, os métodos `depositar`, `sacar` e `obterSaldo` são sub-rotinas que manipulam o estado do objeto `ContaBancaria`.

---

Este repositório oferece uma excelente oportunidade para você praticar **sub-rotinas** em **POO** com **Java**, permitindo que você refine suas habilidades na construção de métodos e na organização de código de forma eficiente e reutilizável.

🌟 **Aproveite os exercícios e divirta-se aprendendo!**


