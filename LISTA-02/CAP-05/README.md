
# **Capítulo 05: Estrutura de Repetição**

Bem-vindo ao repositório de exercícios do **Capítulo 05** de **Programação Orientada a Objetos (POO)**, que aborda o conceito de **Estrutura de Repetição**. Este repositório foi criado como parte da disciplina de **POO** no **IFCE Campus Maranguape**, ministrada pelo professor **Roger Moura Sarmento**.

## **🎯 Objetivo**

O objetivo deste capítulo é proporcionar aos alunos o entendimento e a aplicação das **estruturas de repetição** em **Java**, que são essenciais para executar blocos de código de forma repetitiva, até que uma determinada condição seja satisfeita.

As estruturas de repetição são fundamentais em programação, pois permitem que você execute uma mesma tarefa várias vezes, sem ter que escrever o mesmo código repetidamente. Com isso, você consegue otimizar o código e trabalhar de forma mais eficiente.

## **🧩 Conceito de Estrutura de Repetição**

Em programação, as **estruturas de repetição** (ou **laços de repetição**) permitem que um bloco de código seja repetido várias vezes até que uma condição de término seja atingida. Isso é útil quando se deseja executar um conjunto de instruções diversas vezes, com base em uma condição de controle.

Em **Java**, as estruturas de repetição mais comuns são:

- **`for`**: Utilizado quando o número de repetições é conhecido antecipadamente.
- **`while`**: Utilizado quando não se sabe o número exato de repetições, mas sabe-se a condição de parada.
- **`do while`**: Semelhante ao `while`, mas a condição é verificada após a execução do bloco de código, garantindo que o código seja executado pelo menos uma vez.

### **🔧 Sintaxe Básica:**

#### `for`

```java
for (inicialização; condição; incremento) {
    // Código a ser executado enquanto a condição for verdadeira
}
````

#### `while`

```java
while (condição) {
    // Código a ser executado enquanto a condição for verdadeira
}
```

#### `do while`

```java
do {
    // Código a ser executado pelo menos uma vez
} while (condição);
```

## **🔍 Aplicações da Estrutura de Repetição em POO**

As **estruturas de repetição** são amplamente usadas em **Programação Orientada a Objetos (POO)**, principalmente para percorrer coleções de objetos, processar listas, ou quando se deseja realizar uma ação repetidamente até que uma condição seja atingida.

1. **Percorrer Arrays e Listas**: Muitas vezes, em POO, você precisa percorrer um conjunto de objetos armazenados em um **vetor** ou **lista** para realizar operações em cada um deles.

   Exemplo:

   ```java
   for (int i = 0; i < lista.size(); i++) {
       System.out.println(lista.get(i));
   }
   ```

2. **Execução de Ações em Objetos**: Você pode precisar executar um método várias vezes em diferentes objetos, ou repetir um processo dentro de um objeto até que um critério seja alcançado.

   Exemplo:

   ```java
   while (estoque > 0) {
       venda.realizarVenda();
       estoque--;
   }
   ```

3. **Simulações e Processos Iterativos**: A estrutura de repetição também é essencial para simulações, como um processo que deve ser repetido até um determinado número de ciclos ser completado.

   Exemplo:

   ```java
   for (int i = 1; i <= 10; i++) {
       // Simulação de uma ação repetitiva
   }
   ```
---

Este repositório oferece uma excelente oportunidade para você praticar **estruturas de repetição** em **POO** com **Java**, permitindo que você refine suas habilidades e aprenda a aplicar loops de forma eficaz.

🌟 **Aproveite os exercícios e divirta-se aprendendo!**


