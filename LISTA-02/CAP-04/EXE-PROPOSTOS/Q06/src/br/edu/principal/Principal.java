package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        System.out.println("Escolha a operação desejada: ");
        System.out.println("a) O primeiro número elevado ao segundo número.");
        System.out.println("b) Raiz quadrada de cada um dos números.");
        System.out.println("c) Raiz cúbica de cada um dos números.");

        char opcao = scanner.next().charAt(0);

        switch (opcao) {
            case 'a':
                double potencia = Math.pow(num1, num2);
                System.out.println("O primeiro número elevado ao segundo número: " + potencia);
                break;

            case 'b':
                if (num1 >= 0 && num2 >= 0) {
                    double raizQuadradaNum1 = Math.sqrt(num1);
                    double raizQuadradaNum2 = Math.sqrt(num2);
                    System.out.println("Raiz quadrada de " + num1 + ": " + raizQuadradaNum1);
                    System.out.println("Raiz quadrada de " + num2 + ": " + raizQuadradaNum2);
                } else {
                    System.out.println("Erro: Não é possível calcular a raiz quadrada de números negativos.");
                }
                break;

            case 'c':
                double raizCubicaNum1 = Math.cbrt(num1);
                double raizCubicaNum2 = Math.cbrt(num2);
                System.out.println("Raiz cúbica de " + num1 + ": " + raizCubicaNum1);
                System.out.println("Raiz cúbica de " + num2 + ": " + raizCubicaNum2);
                break;

            default:
                System.out.println("Opção inválida! Programa encerrado.");
                break;
        }
    }
}
