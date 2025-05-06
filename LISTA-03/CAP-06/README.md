
# **Capítulo 06: Vetores**

Bem-vindo ao repositório de exercícios do **Capítulo 06** de **Programação Orientada a Objetos (POO)**, que aborda o conceito de **Vetores**. Este repositório foi criado como parte da disciplina de **POO** no **IFCE Campus Maranguape**, ministrada pelo professor **Roger Moura Sarmento**.

## **🎯 Objetivo**

O objetivo deste capítulo é proporcionar aos alunos o entendimento e a aplicação dos **vetores** em **Java**, que são uma das estruturas de dados mais fundamentais. Os vetores permitem armazenar múltiplos valores do mesmo tipo em uma única variável, facilitando o gerenciamento e manipulação desses dados.

### **Conceito de Vetores**

Em **Java**, um vetor (ou **array**) é uma estrutura de dados que permite armazenar uma coleção de elementos, todos do mesmo tipo, de forma sequencial. Isso significa que os dados dentro de um vetor estão em uma sequência e podem ser acessados por um índice, começando de 0.

Os vetores são úteis quando você precisa lidar com uma quantidade conhecida de dados, como uma lista de números, nomes ou qualquer outro tipo de valor que possa ser representado em uma sequência.

### **🔧 Sintaxe Básica:**

Para declarar e inicializar um vetor em Java:

```java
tipo[] nomeVetor = new tipo[tamanho];
````

Exemplo de um vetor de inteiros com 5 elementos:

```java
int[] numeros = new int[5];
```

### **Acesso aos Elementos de um Vetor**

Você pode acessar os elementos de um vetor utilizando seu índice, que começa em 0:

```java
int valor = numeros[0]; // Acessando o primeiro elemento
numeros[1] = 10;        // Modificando o segundo elemento
```

## **🧩 Trabalhando com Vetores em POO**

Em **Programação Orientada a Objetos (POO)**, os vetores são frequentemente usados para armazenar instâncias de objetos ou coleções de dados que precisam ser manipuladas em conjunto.

Exemplo de uso de vetor com objetos:

```java
Pessoa[] pessoas = new Pessoa[5];
pessoas[0] = new Pessoa("João", 25);
pessoas[1] = new Pessoa("Maria", 30);
```

Além disso, os vetores são amplamente utilizados em **algoritmos de ordenação**, **busca** e em outros contextos que exigem manipulação eficiente de conjuntos de dados.

### **🛠️ Como Usar Vetores em Java**

1. **Declaração e Inicialização**:

   * A forma básica de declarar um vetor é: `tipo[] nomeVetor = new tipo[tamanho];`
   * O vetor pode ser inicializado com valores diretamente:

   ```java
   int[] numeros = {1, 2, 3, 4, 5};
   ```

2. **Acessar e Modificar Elementos**:

   * Use o índice para acessar ou modificar valores: `nomeVetor[indice]`.

3. **Percorrer o Vetor**:

   * Você pode usar um loop **`for`** para percorrer todos os elementos do vetor:

   ```java
   for (int i = 0; i < numeros.length; i++) {
       System.out.println(numeros[i]);
   }
   ```

### **Exemplo Prático:**

```java
public class VetorExemplo {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        
        // Percorrendo o vetor
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + numeros[i]);
        }
    }
}
```

---

Este repositório oferece uma excelente oportunidade para você praticar **vetores** em **POO** com **Java**, permitindo que você refine suas habilidades na manipulação de dados em sequências e aprenda a aplicar vetores de forma eficaz.

🌟 **Aproveite os exercícios e divirta-se aprendendo!**

