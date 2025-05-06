package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] voo = new int[12];
        String[] origem = new String[12];
        String[] destino = new String[12];
        int[] lugares = new int[12];
        

        for (int i = 0; i < 12; i++) {
            System.out.println("Digite o número do voo: ");
            voo[i] = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite a origem do voo: ");
            origem[i] = sc.nextLine();
            System.out.println("Digite o destino do voo: ");
            destino[i] = sc.nextLine();
            System.out.println("Digite o número de lugares disponíveis: ");
            lugares[i] = sc.nextInt();
        }

        int op = 0;
        while (op != 3) {
            System.out.println("1- Consultar");
            System.out.println("2- Reservar");
            System.out.println("3- Finalizar");
            System.out.print("Digite sua opção: ");
            op = sc.nextInt();
            
            if (op == 1) {
                int op2 = 0;
                while (op2 != 4) {
                    System.out.println("1- Consulta por voo");
                    System.out.println("2- Consulta por origem");
                    System.out.println("3- Consulta por destino");
                    System.out.println("4- Voltar");
                    System.out.print("Digite sua opção: ");
                    op2 = sc.nextInt();

                    if (op2 == 1) {
                        System.out.print("Digite o número do voo: ");
                        int num_voo = sc.nextInt();
                        int i = 0;
                        while (i < 12 && voo[i] != num_voo) {
                            i++;
                        }
                        if (i >= 12) {
                            System.out.println("Voo inexistente");
                        } else {
                            System.out.println("Número do voo: " + voo[i]);
                            System.out.println("Local de origem: " + origem[i]);
                            System.out.println("Local de destino: " + destino[i]);
                            System.out.println("Lugares disponíveis: " + lugares[i]);
                        }
                    } else if (op2 == 2) {
                        sc.nextLine();  
                        System.out.print("Digite o local de origem: ");
                        String local = sc.nextLine();
                        for (int i = 0; i < 12; i++) {
                            if (origem[i].equalsIgnoreCase(local)) {
                                System.out.println("Número do voo: " + voo[i]);
                                System.out.println("Local de origem: " + origem[i]);
                                System.out.println("Local de destino: " + destino[i]);
                                System.out.println("Lugares disponíveis: " + lugares[i]);
                            }
                        }
                    } else if (op2 == 3) {
                        sc.nextLine();  
                        System.out.print("Digite o local de destino: ");
                        String local = sc.nextLine();
                        for (int i = 0; i < 12; i++) {
                            if (destino[i].equalsIgnoreCase(local)) {
                                System.out.println("Número do voo: " + voo[i]);
                                System.out.println("Local de origem: " + origem[i]);
                                System.out.println("Local de destino: " + destino[i]);
                                System.out.println("Lugares disponíveis: " + lugares[i]);
                            }
                        }
                    }
                }
            } else if (op == 2) {
                System.out.print("Digite o número do voo desejado: ");
                int num_voo = sc.nextInt();
                int i = 0;
                while (i < 12 && voo[i] != num_voo) {
                    i++;
                }
                if (i >= 12) {
                    System.out.println("Número de voo não encontrado");
                } else {
                    if (lugares[i] == 0) {
                        System.out.println("Voo lotado");
                    } else {
                        lugares[i]--;
                        System.out.println("Reserva confirmada!");
                    }
                }
            }
        }

        sc.close();
    }
}
