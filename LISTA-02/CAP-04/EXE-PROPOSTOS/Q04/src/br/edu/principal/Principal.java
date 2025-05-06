package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, num3;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número: ");
        num3 = scanner.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("O maior número é: " + num3);
        }
    }
}
