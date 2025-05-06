package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[9];
        int[] pos = new int[9];
        int[] neg = new int[9];
        int cont_n, cont_p, i;

        cont_n = 1;
        cont_p = 1;

        for (i = 1; i <= 8; i++) {
            System.out.println("Digite o " + i + "º número:");
            num[i] = sc.nextInt();

            if (num[i] >= 0) {
                pos[cont_p] = num[i];
                cont_p = cont_p + 1;
            } else {
                neg[cont_n] = num[i];
                cont_n = cont_n + 1;
            }
        }

        if (cont_n == 1) {
            System.out.println("Vetor de negativos vazio");
        } else {
            for (i = 1; i <= cont_n - 1; i++) {
                System.out.println("Negativo: " + neg[i]);
            }
        }

        if (cont_p == 1) {
            System.out.println("Vetor de positivos vazio");
        } else {
            for (i = 1; i <= cont_p - 1; i++) {
                System.out.println("Positivo: " + pos[i]);
            }
        }

        sc.close();
    }
}
