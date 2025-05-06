package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet1 = new int[11];
        int[] vet2 = new int[11];
        int[] vet3 = new int[21];
        int i, j;

        j = 1;

        for (i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "º número do vetor 1:");
            vet1[i] = sc.nextInt();
            vet3[j] = vet1[i];
            j = j + 1;

            System.out.println("Digite o " + i + "º número do vetor 2:");
            vet2[i] = sc.nextInt();
            vet3[j] = vet2[i];
            j = j + 1;
        }

        for (i = 1; i <= 20; i++) {
            System.out.println("vet3[" + i + "] = " + vet3[i]);
        }

        sc.close();
    }
}
