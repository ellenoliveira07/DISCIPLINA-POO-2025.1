package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario;

        System.out.println("Digite o salário do funcionário: ");
        salario = scanner.nextDouble();

        if (salario < 500.00) {
            double aumento = salario * 0.30;
            double salarioReajustado = salario + aumento;
            System.out.println("O salário reajustado é: R$ " + salarioReajustado);
        } else {
            System.out.println("O funcionário não tem direito ao aumento.");
        }
    }
}
