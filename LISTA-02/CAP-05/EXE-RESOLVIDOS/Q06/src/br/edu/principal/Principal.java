package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo, nht;
        double valor, sal_min = 450.0, sal_inicial, aux, sal_final;
        String turno, categoria;

        for (int cont = 1; cont <= 10; cont++) {
            System.out.print("Digite o código do funcionário: ");
            codigo = scanner.nextInt();

            System.out.print("Digite o número de horas trabalhadas: ");
            nht = scanner.nextInt();

            System.out.print("Digite o turno (M - matutino, V - vespertino, N - noturno): ");
            turno = scanner.next().toUpperCase();

            while (!(turno.equals("M") || turno.equals("V") || turno.equals("N"))) {
                System.out.print("Turno inválido. Digite novamente (M - matutino, V - vespertino, N - noturno): ");
                turno = scanner.next().toUpperCase();
            }

            System.out.print("Digite a categoria (G - gerente, O - operário): ");
            categoria = scanner.next().toUpperCase();

            while (!(categoria.equals("G") || categoria.equals("O"))) {
                System.out.print("Categoria inválida. Digite novamente (G - gerente, O - operário): ");
                categoria = scanner.next().toUpperCase();
            }

            if (categoria.equals("G")) {
                if (turno.equals("N")) {
                    valor = sal_min * 18 / 100;
                } else {
                    valor = sal_min * 15 / 100;
                }
            } else {
                if (turno.equals("N")) {
                    valor = sal_min * 13 / 100;
                } else {
                    valor = sal_min * 10 / 100;
                }
            }

            sal_inicial = nht * valor;

            if (sal_inicial <= 300) {
                aux = sal_inicial * 20 / 100;
            } else if (sal_inicial < 600) {
                aux = sal_inicial * 15 / 100;
            } else {
                aux = sal_inicial * 5 / 100;
            }

            sal_final = sal_inicial + aux;

            System.out.println("Código: " + codigo);
            System.out.println("Número de horas trabalhadas: " + nht);
            System.out.println("Valor da hora trabalhada: R$ " + valor);
            System.out.println("Salário inicial: R$ " + sal_inicial);
            System.out.println("Auxílio alimentação: R$ " + aux);
            System.out.println("Salário final: R$ " + sal_final);
            System.out.println();
        }
    }
}
