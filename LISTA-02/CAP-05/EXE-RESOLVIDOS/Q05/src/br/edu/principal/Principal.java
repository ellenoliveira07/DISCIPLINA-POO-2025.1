package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num_termos, x, i, j, expoente, denominador = 1;
        double s = 0, fat, den = 0;

        System.out.print("Digite o número de termos: ");
        num_termos = scanner.nextInt();

        System.out.print("Digite um valor positivo para X: ");
        x = scanner.nextInt();

        for (i = 1; i <= num_termos; i++) {
            fat = 1;
            expoente = i + 1;
            for (j = 1; j <= denominador; j++) {
                fat *= j;
            }

            if (expoente % 2 == 0) {
                s -= Math.pow(x, expoente) / fat;
            } else {
                s += Math.pow(x, expoente) / fat;
            }

            if (denominador == 4) {
                den = -1;
            } else if (denominador == 1) {
                den = 1;
            }

            if (den == 1) {
                denominador++;
            } else {
                denominador--;
            }
        }

        System.out.println("O valor da série é: " + s);
    }
}
