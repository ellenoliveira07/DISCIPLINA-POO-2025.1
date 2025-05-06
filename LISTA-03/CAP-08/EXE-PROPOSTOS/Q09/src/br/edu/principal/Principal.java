package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        maiorMenor();
        
        sc.close();
    }

    public static void maiorMenor() {
        Scanner sc = new Scanner(System.in);
        int num, maior, menor;
        
        maior = Integer.MIN_VALUE;
        menor = Integer.MAX_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            num = sc.nextInt();

            if (i == 1) {
                maior = num;
                menor = num;
            } else {
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
            }
        }

        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("O menor número digitado foi: " + menor);
        
        sc.close();
    }
}
