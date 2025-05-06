package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double custoFabrica, precoConsumidor, porcentagemDistribuidor, porcentagemImpostos;

        System.out.println("Digite o custo de fábrica do carro: ");
        custoFabrica = scanner.nextDouble();

        if (custoFabrica <= 12000.00) {
            porcentagemDistribuidor = 5;
            porcentagemImpostos = 0;
        } else if (custoFabrica > 12000.00 && custoFabrica <= 25000.00) {
            porcentagemDistribuidor = 10;
            porcentagemImpostos = 15;
        } else {
            porcentagemDistribuidor = 15;
            porcentagemImpostos = 20;
        }

        precoConsumidor = custoFabrica + (custoFabrica * porcentagemDistribuidor / 100) 
                                  + (custoFabrica * porcentagemImpostos / 100);

        System.out.println("Custo de fábrica: R$ " + custoFabrica);
        System.out.println("Preço ao consumidor: R$ " + precoConsumidor);
    }
}
