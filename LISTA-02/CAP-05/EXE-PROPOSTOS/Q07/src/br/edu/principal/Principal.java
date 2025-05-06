package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countIdadeMaior50 = 0;
        double somaAlturas10a20 = 0;
        int count10a20 = 0;
        int countPesoInferior40 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite a idade da " + i + "ª pessoa:");
            int idade = sc.nextInt();
            System.out.println("Digite a altura da " + i + "ª pessoa:");
            double altura = sc.nextDouble();
            System.out.println("Digite o peso da " + i + "ª pessoa:");
            double peso = sc.nextDouble();

            if (idade > 50) {
                countIdadeMaior50++;
            }

            if (idade >= 10 && idade <= 20) {
                somaAlturas10a20 += altura;
                count10a20++;
            }

            if (peso < 40) {
                countPesoInferior40++;
            }
        }

        double mediaAltura10a20 = count10a20 > 0 ? somaAlturas10a20 / count10a20 : 0;
        double porcentagemPesoInferior40 = (countPesoInferior40 * 100.0) / 5;

        System.out.println("Quantidade de pessoas com idade superior a 50 anos: " + countIdadeMaior50);
        System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaAltura10a20);
        System.out.printf("Porcentagem de pessoas com peso inferior a 40 kg: %.2f%%\n", porcentagemPesoInferior40);

        sc.close();
    }
}
