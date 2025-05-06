package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] qtd = new int[11];
        double[] preco = new double[11];
        int i, ind, maior;
        double tot_vend, tot_geral, comissao;

        tot_geral = 0;

        for (i = 1; i <= 10; i++) {
            System.out.println("Digite a quantidade vendida do objeto " + i + ":");
            qtd[i] = sc.nextInt();
            System.out.println("Digite o preço unitário do objeto " + i + ":");
            preco[i] = sc.nextDouble();
        }

        for (i = 1; i <= 10; i++) {
            tot_vend = qtd[i] * preco[i];
            System.out.println("Quantidade: " + qtd[i]);
            System.out.println("Preço unitário: " + preco[i]);
            System.out.println("Total vendido: " + tot_vend);
            tot_geral = tot_geral + tot_vend;
        }

        comissao = tot_geral * 5 / 100;
        System.out.println("Total geral de vendas: " + tot_geral);
        System.out.println("Comissão: " + comissao);

        maior = qtd[1];
        ind = 1;

        for (i = 2; i <= 10; i++) {
            if (qtd[i] > maior) {
                maior = qtd[i];
                ind = i;
            }
        }

        System.out.println("Valor do objeto mais vendido: " + preco[ind]);
        System.out.println("Posição no vetor: " + ind);

        sc.close();
    }
}
