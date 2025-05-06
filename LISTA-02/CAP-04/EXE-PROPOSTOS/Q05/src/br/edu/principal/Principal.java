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
        System.out.println("1 - Média entre os números digitados");
        System.out.println("2 - Diferença do maior pelo menor");
        System.out.println("3 - Produto entre os números digitados");
        System.out.println("4 - Divisão do primeiro pelo segundo");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                double media = (num1 + num2) / 2;
                System.out.println("Média entre os números: " + media);
                break;

            case 2:
                double maior = Math.max(num1, num2);
                double menor = Math.min(num1, num2);
                double diferenca = maior - menor;
                System.out.println("Diferença do maior pelo menor: " + diferenca);
                break;

            case 3:
                double produto = num1 * num2;
                System.out.println("Produto entre os números: " + produto);
                break;

            case 4:
                if (num2 != 0) {
                    double divisao = num1 / num2;
                    System.out.println("Divisão do primeiro pelo segundo: " + divisao);
                } else {
                    System.out.println("Erro: Não é possível dividir por zero.");
                }
                break;

            default:
                System.out.println("Opção inválida! Programa encerrado.");
                break;
        }
    }
}
