package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] X = new int[10];
        int[] Y = new int[10];
        int[] U = new int[20];
        int[] D = new int[10];
        int[] S = new int[10];
        int[] P = new int[10];
        int[] IT = new int[10];
        int i, j, k, cont_u = 0, cont_d = 0, cont_i = 0;

        for (i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º número do vetor X:");
            X[i] = sc.nextInt();
            System.out.println("Digite o " + (i + 1) + "º número do vetor Y:");
            Y[i] = sc.nextInt();
        }

        // União
        for (i = 0; i < 10; i++) {
            boolean repetido = false;
            for (j = 0; j < cont_u; j++) {
                if (X[i] == U[j]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                U[cont_u++] = X[i];
            }
        }

        for (i = 0; i < 10; i++) {
            boolean repetido = false;
            for (j = 0; j < cont_u; j++) {
                if (Y[i] == U[j]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                U[cont_u++] = Y[i];
            }
        }

        System.out.println("\nUnião:");
        for (i = 0; i < cont_u; i++) {
            System.out.print(U[i] + " ");
        }

        for (i = 0; i < 10; i++) {
            boolean existe = false;
            for (j = 0; j < 10; j++) {
                if (X[i] == Y[j]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                boolean repetido = false;
                for (k = 0; k < cont_d; k++) {
                    if (X[i] == D[k]) {
                        repetido = true;
                        break;
                    }
                }
                if (!repetido) {
                    D[cont_d++] = X[i];
                }
            }
        }

        System.out.println("\n\nDiferença (X - Y):");
        for (i = 0; i < cont_d; i++) {
            System.out.print(D[i] + " ");
        }

        System.out.println("\n\nSoma:");
        for (i = 0; i < 10; i++) {
            S[i] = X[i] + Y[i];
            System.out.print(S[i] + " ");
        }

        System.out.println("\n\nProduto:");
        for (i = 0; i < 10; i++) {
            P[i] = X[i] * Y[i];
            System.out.print(P[i] + " ");
        }

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                if (X[i] == Y[j]) {
                    boolean repetido = false;
                    for (k = 0; k < cont_i; k++) {
                        if (IT[k] == X[i]) {
                            repetido = true;
                            break;
                        }
                    }
                    if (!repetido) {
                        IT[cont_i++] = X[i];
                    }
                    break;
                }
            }
        }

        System.out.println("\n\nInterseção:");
        for (i = 0; i < cont_i; i++) {
            System.out.print(IT[i] + " ");
        }

        sc.close();
    }
}
