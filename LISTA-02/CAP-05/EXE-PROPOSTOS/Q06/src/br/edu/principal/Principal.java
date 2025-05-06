package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double totalAVista = 0;
        double totalAPrazo = 0;
        double totalCompras = 0;
        double primeiraPrestacao = 0;
        
        for (int i = 1; i <= 15; i++) {
            System.out.print("Digite o código (V para à vista ou P para a prazo) e o valor da transação " + i + ": ");
            String codigo = sc.next();
            double valor = sc.nextDouble();
            
            if (codigo.equals("V")) {
                totalAVista += valor;
            } else if (codigo.equals("P")) {
                totalAPrazo += valor;
            }
            
            totalCompras += valor;
        }
        
        if (totalAPrazo > 0) {
            primeiraPrestacao = totalAPrazo / 3;
        }
        
        System.out.println("Total das compras à vista: R$ " + totalAVista);
        System.out.println("Total das compras a prazo: R$ " + totalAPrazo);
        System.out.println("Total das compras efetuadas: R$ " + totalCompras);
        System.out.println("Valor da primeira prestação das compras a prazo: R$ " + primeiraPrestacao);
        
        sc.close();
    }
}
