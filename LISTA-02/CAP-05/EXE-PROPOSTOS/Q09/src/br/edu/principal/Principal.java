package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaIdade = 0;
        int countPesoSuperior90AlturaInferior150 = 0;
        int countIdadeEntre10e30AlturaSuperior190 = 0;
        int countAlturaSuperior190 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = sc.nextInt();
            System.out.print("Digite o peso da " + i + "ª pessoa: ");
            double peso = sc.nextDouble();
            System.out.print("Digite a altura da " + i + "ª pessoa: ");
            double altura = sc.nextDouble();

            somaIdade += idade;

            if (peso > 90 && altura < 1.50) {
                countPesoSuperior90AlturaInferior150++;
            }

            if (altura > 1.90) {
                countAlturaSuperior190++;
                if (idade >= 10 && idade <= 30) {
                    countIdadeEntre10e30AlturaSuperior190++;
                }
            }
        }

        double mediaIdade = somaIdade / 10.0;
        double porcentagemIdadeEntre10e30 = countAlturaSuperior190 > 0 ? (countIdadeEntre10e30AlturaSuperior190 * 100.0) / countAlturaSuperior190 : 0;

        System.out.println("Média das idades: " + mediaIdade);
        System.out.println("Quantidade de pessoas com peso superior a 90kg e altura inferior a 1.50m: " + countPesoSuperior90AlturaInferior150);
        System.out.printf("Porcentagem de pessoas com idade entre 10 e 30 anos e altura superior a 1.90m: %.2f%%\n", porcentagemIdadeEntre10e30);

        sc.close();
    }
}
