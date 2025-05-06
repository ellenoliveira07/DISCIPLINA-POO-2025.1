package br.edu.principal;
import java.util.Calendar;

public class Principal {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();

        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH) + 1; // Janeiro = 0
        int ano = calendario.get(Calendar.YEAR);
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int min = calendario.get(Calendar.MINUTE);

        System.out.print("Data Atual: " + dia + "/" + mes + "/" + ano + " – ");

        if (mes == 1) {
            System.out.println("janeiro");
        }
        if (mes == 2) {
            System.out.println("fevereiro");
        }
        if (mes == 3) {
            System.out.println("março");
        }
        if (mes == 4) {
            System.out.println("abril");
        }
        if (mes == 5) {
            System.out.println("maio");
        }
        if (mes == 6) {
            System.out.println("junho");
        }
        if (mes == 7) {
            System.out.println("julho");
        }
        if (mes == 8) {
            System.out.println("agosto");
        }
        if (mes == 9) {
            System.out.println("setembro");
        }
        if (mes == 10) {
            System.out.println("outubro");
        }
        if (mes == 11) {
            System.out.println("novembro");
        }
        if (mes == 12) {
            System.out.println("dezembro");
        }

        System.out.println("Hora Atual: " + hora + ":" + min);
    }
}
