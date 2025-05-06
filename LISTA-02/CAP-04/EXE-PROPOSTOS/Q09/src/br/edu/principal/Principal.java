package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoMedio, credito;

        System.out.println("Digite o saldo médio do cliente: ");
        saldoMedio = scanner.nextDouble();

        if (saldoMedio > 400.00) {
            credito = saldoMedio * 0.30; 
            System.out.println("Saldo médio: R$ " + saldoMedio);
            System.out.println("Valor do crédito: R$ " + credito);
        } else if (saldoMedio >= 300.00 && saldoMedio <= 400.00) {
            credito = saldoMedio * 0.25; 
            System.out.println("Saldo médio: R$ " + saldoMedio);
            System.out.println("Valor do crédito: R$ " + credito);
        } else if (saldoMedio >= 200.00 && saldoMedio < 300.00) {
            credito = saldoMedio * 0.20;
            System.out.println("Saldo médio: R$ " + saldoMedio);
            System.out.println("Valor do crédito: R$ " + credito);
        } else {
            credito = saldoMedio * 0.10; 
            System.out.println("Saldo médio: R$ " + saldoMedio);
            System.out.println("Valor do crédito: R$ " + credito);
        }
    }
}
