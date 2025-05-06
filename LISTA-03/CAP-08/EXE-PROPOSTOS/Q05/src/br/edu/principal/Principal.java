package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o preço antigo do produto: ");
        double precoAntigo = sc.nextDouble();
        
        System.out.print("Digite o preço atual do produto: ");
        double precoAtual = sc.nextDouble();
        
        double acrescimo = calculoReajuste(precoAntigo, precoAtual);
        
        System.out.println("O percentual de acréscimo é: " + acrescimo + "%");
        
        sc.close();
    }
    
    public static double calculoReajuste(double PA, double PN) {
        double result = (100 * (PN - PA)) / PA;
        return result;
    }
}
