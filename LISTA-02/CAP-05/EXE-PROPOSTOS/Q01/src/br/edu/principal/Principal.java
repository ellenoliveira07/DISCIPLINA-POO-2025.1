package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] valores = new int[5][4];

        System.out.println("Digite 5 grupos de 4 números: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                valores[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Valores na ordem original:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(valores[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = j + 1; k < 4; k++) {
                    if (valores[i][j] > valores[i][k]) {
                        int temp = valores[i][j];
                        valores[i][j] = valores[i][k];
                        valores[i][k] = temp;
                    }
                }
            }
        }

        System.out.println("Valores em ordem crescente:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(valores[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = j + 1; k < 4; k++) {
                    if (valores[i][j] < valores[i][k]) {
                        int temp = valores[i][j];
                        valores[i][j] = valores[i][k];
                        valores[i][k] = temp;
                    }
                }
            }
        }

        System.out.println("Valores em ordem decrescente:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(valores[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
