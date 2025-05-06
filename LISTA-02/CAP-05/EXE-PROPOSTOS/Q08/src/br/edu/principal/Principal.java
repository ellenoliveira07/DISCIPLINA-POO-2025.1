package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countIdadeMaior50PesoInferior60 = 0;
        double somaIdadeAlturaInferior150 = 0;
        int countAlturaInferior150 = 0;
        int countOlhosAzuis = 0;
        int countPessoasRuivasSemOlhosAzuis = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Digite a idade da " + i + "ª pessoa:");
            int idade = sc.nextInt();
            System.out.println("Digite o peso da " + i + "ª pessoa:");
            double peso = sc.nextDouble();
            System.out.println("Digite a altura da " + i + "ª pessoa:");
            double altura = sc.nextDouble();
            System.out.println("Digite a cor dos olhos da " + i + "ª pessoa (A - Azul, P - Preto, V - Verde, C - Castanho):");
            char corOlhos = sc.next().charAt(0);
            System.out.println("Digite a cor dos cabelos da " + i + "ª pessoa (P - Preto, C - Castanho, L - Louro, R - Ruivo):");
            char corCabelos = sc.next().charAt(0);

            if (idade > 50 && peso < 60) {
                countIdadeMaior50PesoInferior60++;
            }

            if (altura < 1.50) {
                somaIdadeAlturaInferior150 += idade;
                countAlturaInferior150++;
            }

            if (corOlhos == 'A') {
                countOlhosAzuis++;
            }

            if (corCabelos == 'R' && corOlhos != 'A') {
                countPessoasRuivasSemOlhosAzuis++;
            }
        }

        double mediaIdadeAlturaInferior150 = countAlturaInferior150 > 0 ? somaIdadeAlturaInferior150 / countAlturaInferior150 : 0;
        double porcentagemOlhosAzuis = (countOlhosAzuis * 100.0) / 6;

        System.out.println("Quantidade de pessoas com idade superior a 50 anos e peso inferior a 60kg: " + countIdadeMaior50PesoInferior60);
        System.out.println("Média das idades das pessoas com altura inferior a 1.50m: " + mediaIdadeAlturaInferior150);
        System.out.printf("Porcentagem de pessoas com olhos azuis: %.2f%%\n", porcentagemOlhosAzuis);
        System.out.println("Quantidade de pessoas ruivas e que não possuem olhos azuis: " + countPessoasRuivasSemOlhosAzuis);

        sc.close();
    }
}
