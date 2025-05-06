package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] X = new int[5];
        int[] Y = new int[5];
        int[] R = new int[10];
        int i, j, aux;

        System.out.println("Digite os elementos para o vetor X:");
        for (i = 0; i < 5; i++) {
            X[i] = sc.nextInt();
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4 - i; j++) {
                if (X[j] > X[j + 1]) {
                    aux = X[j];
                    X[j] = X[j + 1];
                    X[j + 1] = aux;
                }
            }
        }

        System.out.println("Digite os elementos para o vetor Y:");
        for (i = 0; i < 5; i++) {
            Y[i] = sc.nextInt();
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4 - i; j++) {
                if (Y[j] > Y[j + 1]) {
                    aux = Y[j];
                    Y[j] = Y[j + 1];
                    Y[j + 1] = aux;
                }
            }
        }

        j = 0;
        for (i = 0; i < 5; i++) {
            R[j++] = X[i];
            R[j++] = Y[i];
        }

        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9 - i; j++) {
                if (R[j] > R[j + 1]) {
                    aux = R[j];
                    R[j] = R[j + 1];
                    R[j + 1] = aux;
                }
            }
        }

        System.out.println("Vetor X ordenado:");
        for (i = 0; i < 5; i++) {
            System.out.print(X[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor Y ordenado:");
        for (i = 0; i < 5; i++) {
            System.out.print(Y[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor combinado R ordenado:");
        for (i = 0; i < 10; i++) {
            System.out.print(R[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
