package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont, cod, num_vei, num_acid;
        int maior = 0, cid_maior = 0, menor = Integer.MAX_VALUE, cid_menor = 0;
        double media_vei, soma_vei = 0, media_acid = 0, soma_acid = 0;
        int cont_acid = 0;

        for (cont = 1; cont <= 5; cont++) {
            System.out.println("Digite os dados da cidade " + cont + " (Código, número de veículos, número de acidentes):");
            cod = scanner.nextInt();
            num_vei = scanner.nextInt();
            num_acid = scanner.nextInt();

            if (cont == 1) {
                maior = num_acid;
                cid_maior = cod;
                menor = num_acid;
                cid_menor = cod;
            } else {
                if (num_acid > maior) {
                    maior = num_acid;
                    cid_maior = cod;
                }
                if (num_acid < menor) {
                    menor = num_acid;
                    cid_menor = cod;
                }
            }

            soma_vei += num_vei;

            if (num_vei < 2000) {
                soma_acid += num_acid;
                cont_acid++;
            }
        }

        System.out.println("Maior índice de acidentes: " + maior + " na cidade " + cid_maior);
        System.out.println("Menor índice de acidentes: " + menor + " na cidade " + cid_menor);

        media_vei = soma_vei / 5;
        System.out.println("Média de veículos nas cinco cidades: " + media_vei);

        if (cont_acid == 0) {
            System.out.println("Não foi digitada nenhuma cidade com menos de 2000 veículos");
        } else {
            media_acid = soma_acid / cont_acid;
            System.out.println("Média de acidentes nas cidades com menos de 2000 veículos: " + media_acid);
        }
    }
}
