package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hora_i, min_i, hora_f, min_f, minutos;
        
        System.out.print("Digite a hora de início: ");
        hora_i = sc.nextInt();
        System.out.print("Digite os minutos de início: ");
        min_i = sc.nextInt();
        
        System.out.print("Digite a hora de término: ");
        hora_f = sc.nextInt();
        System.out.print("Digite os minutos de término: ");
        min_f = sc.nextInt();
        
        minutos = calculo(hora_i, min_i, hora_f, min_f);
        
        System.out.println("A duração do jogo em minutos é: " + minutos);
        
        sc.close();
    }
    
    public static int calculo(int h_i, int m_i, int h_f, int m_f) {
        int tot_h, tot_m, total;
        
        if (m_f < m_i) {
            m_f += 60;
            h_f -= 1;
        }
        
        if (h_f < h_i) {
            h_f += 24;
        }
        
        tot_m = m_f - m_i;
        tot_h = h_f - h_i;
        total = tot_h * 60 + tot_m;
        
        return total;
    }
}
