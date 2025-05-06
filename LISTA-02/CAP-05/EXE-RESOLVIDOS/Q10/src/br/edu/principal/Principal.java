package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtde = 0, tot80 = 0;
        double mediaAltura = 0;
        
        for (int contTime = 1; contTime <= 5; contTime++) {
            double mediaIdade = 0;

            System.out.println("Time " + contTime);
            
            for (int contJog = 1; contJog <= 11; contJog++) {
                System.out.print("Digite a idade do jogador " + contJog + ": ");
                int idade = scanner.nextInt();
                System.out.print("Digite o peso do jogador " + contJog + ": ");
                double peso = scanner.nextDouble();
                System.out.print("Digite a altura do jogador " + contJog + ": ");
                double altura = scanner.nextDouble();

                if (idade < 18) {
                    qtde++;
                }

                mediaIdade += idade;
                mediaAltura += altura;

                if (peso > 80) {
                    tot80++;
                }
            }

            mediaIdade /= 11;
            System.out.println("Média de idade do time " + contTime + ": " + mediaIdade);
        }

        mediaAltura /= 55;
        double porc = (tot80 * 100.0) / 55;

        System.out.println("Quantidade de jogadores com idade inferior a 18 anos: " + qtde);
        System.out.println("Média das alturas de todos os jogadores do campeonato: " + mediaAltura);
        System.out.println("Porcentagem de jogadores com mais de 80 kg: " + porc + "%");
    }
}
