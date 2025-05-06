package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num, x;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        x = verifica(num);

        if (x == 1) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

        sc.close();
    }

    public static int verifica(int num) {
        if (num >= 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
