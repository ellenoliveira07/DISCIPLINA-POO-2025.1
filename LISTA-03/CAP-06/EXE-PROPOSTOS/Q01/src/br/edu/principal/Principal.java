package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int i, j, cont;

        for (i = 1; i <= 9; i++) {
            System.out.println("Digite o " + i + "º número:");
            num[i] = sc.nextInt();
        }

        for (i = 1; i <= 9; i++) {
            cont = 0;
            for (j = 1; j <= num[i]; j++) {
                if (num[i] % j == 0) {
                    cont = cont + 1;
                }
            }
            if (cont <= 2) {
                System.out.println("Número primo: " + num[i]);
                System.out.println("Posição: " + i);
            }
        }

        sc.close();
    }
}
