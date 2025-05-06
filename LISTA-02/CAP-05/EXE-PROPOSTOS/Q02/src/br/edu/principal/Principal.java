package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        double preco = 5.00;
        int ingressosVendidos = 120;
        double despesas = 200.00;
        double lucroMaximo = 0;
        double precoMaximo = 0;
        int ingressosMaximo = 0;

        System.out.println("Preço | Ingressos | Lucro");

        for (double i = 5.00; i >= 1.00; i -= 0.50) {
            double lucro = (preco * ingressosVendidos) - despesas;
            System.out.println(i + "  | " + ingressosVendidos + "       | " + lucro);

            if (lucro > lucroMaximo) {
                lucroMaximo = lucro;
                precoMaximo = i;
                ingressosMaximo = ingressosVendidos;
            }

            preco -= 0.50;
            ingressosVendidos += 26;
        }

        System.out.println("\nLucro máximo esperado:");
        System.out.println("Preço do ingresso: R$ " + precoMaximo);
        System.out.println("Quantidade de ingressos vendidos: " + ingressosMaximo);
        System.out.println("Lucro máximo: R$ " + lucroMaximo);
    }
}
