import java.util.Scanner;

public class tabela {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linha = 0;

        while (true) {
            System.out.print("Digite um número (número negativo ou 0 para sair): ");
            double valor = scanner.nextDouble();

            // Finaliza se o número for negativo ou 0
            if (valor <= 0) {
                break;
            }

            // Imprime o cabeçalho a cada 20 linhas
            if (linha % 20 == 0) {
                imprimirCabecalho();
            }

            // Calcula o cubo e a raiz quadrada do valor
            double cubo = Math.pow(valor, 3);
            double raizQuadrada = Math.sqrt(valor);

            // Imprime a linha da tabela
            System.out.printf("%10.2f | %15.2f | %15.2f%n", valor, cubo, raizQuadrada);

            linha++;
        }

        scanner.close();
    }

    public static void imprimirCabecalho() {
        System.out.printf("%10s | %15s | %15s%n", "Valor", "Cubo", "Raiz Quadrada");
        System.out.println("-----------------------------------------------");
    }
}
