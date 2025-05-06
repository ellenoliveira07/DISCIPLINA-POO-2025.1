package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, result;

        do {
            System.out.print("Digite o valor de 'a' (maior que 1): ");
            a = sc.nextInt();
        } while (a <= 1);

        System.out.print("Digite o valor de 'b': ");
        b = sc.nextInt();

        System.out.print("Digite o valor de 'c': ");
        c = sc.nextInt();

        result = divisores(a, b, c);
        System.out.println("Soma dos inteiros divisíveis por " + a + " entre " + b + " e " + c + " = " + result);

        sc.close();
    }

    public static int divisores(int a, int b, int c) {
        int s = 0;
        for (int i = b; i <= c; i++) {
            if (i % a == 0) {
                s += i;
            }
        }
        return s;
    }
}
