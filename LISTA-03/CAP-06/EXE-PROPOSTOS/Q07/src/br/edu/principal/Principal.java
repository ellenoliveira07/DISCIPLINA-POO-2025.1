package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[8];
        int i = 0, j, z, aux;

        System.out.println("Digite 8 números inteiros:");

        while (i < 8) {
            System.out.print("Número " + (i + 1) + ": ");
            aux = sc.nextInt();
            j = 0;
            while (j < i && vet[j] < aux) {
                j++;
            }
            z = i;
            while (z > j) {
                vet[z] = vet[z - 1];
                z--;
            }
            vet[j] = aux;
            i++;
        }

        System.out.print("Números em ordem crescente: ");
        for (i = 0; i < 8; i++) {
            System.out.print(vet[i] + " ");
        }

        sc.close();
    }
}
