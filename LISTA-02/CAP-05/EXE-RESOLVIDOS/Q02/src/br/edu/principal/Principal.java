package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        double e = 1;

        System.out.println("Digite um valor inteiro e positivo: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int fat = 1;
            for (int j = 1; j <= i; j++) {
                fat *= j;
            }
            e += 1.0 / fat;
        }

        System.out.println("O valor de E é: " + e);
    }
}
