package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anoAtual;
        double salario = 1000, percentual = 1.5 / 100, novoSalario;

        System.out.println("Digite o ano atual: ");
        anoAtual = scanner.nextInt();

        novoSalario = salario + percentual * salario;

        for (int i = 2007; i <= anoAtual; i++) {
            percentual *= 2;
            novoSalario += percentual * novoSalario;
        }

        System.out.println("O salário atual do funcionário é: R$ " + novoSalario);
    }
}
