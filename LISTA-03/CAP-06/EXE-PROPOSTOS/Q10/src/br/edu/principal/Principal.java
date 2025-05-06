package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] gabarito = new String[8];
        String[][] respostas = new String[10][8];
        int[] numeros = new int[10];
        int[] notas = new int[10];
        int totalAprovados = 0;

        System.out.println("Digite o gabarito da prova:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Resposta da questão " + (i + 1) + ": ");
            gabarito[i] = sc.next().toUpperCase();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("\nDigite o número do " + (i + 1) + "º aluno: ");
            numeros[i] = sc.nextInt();
            int pontos = 0;
            for (int j = 0; j < 8; j++) {
                System.out.print("Resposta do aluno " + numeros[i] + " para a questão " + (j + 1) + ": ");
                respostas[i][j] = sc.next().toUpperCase();
                if (respostas[i][j].equals(gabarito[j])) {
                    pontos++;
                }
            }
            notas[i] = pontos;
            if (pontos >= 6) {
                totalAprovados++;
            }
        }

        System.out.println("\nRESULTADOS:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Aluno " + numeros[i] + ": nota = " + notas[i]);
        }

        double percentual = totalAprovados * 100.0 / 10;
        System.out.printf("Percentual de aprovados: %.2f%%\n", percentual);

        sc.close();
    }
}
