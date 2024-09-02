import java.util.Random;

public class MatrizVetor {
    public static void main(String[] args) {
        int[][] matriz = new int[7][7];
        int[] maioresLinhas = new int[7];
        int[] menoresColunas = new int[7];
        Random random = new Random();

        
        for (int i = 0; i < 7; i++) {
            maioresLinhas[i] = Integer.MIN_VALUE;
            for (int j = 0; j < 7; j++) {
                matriz[i][j] = random.nextInt(100); 
                if (matriz[i][j] > maioresLinhas[i]) {
                    maioresLinhas[i] = matriz[i][j];
                }
                if (i == 0 || matriz[i][j] < menoresColunas[j]) {
                    menoresColunas[j] = matriz[i][j];
                }
            }
        }

        
        System.out.println("Matriz 7x7:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        
        System.out.println("\nMaiores elementos de cada linha:");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%4d", maioresLinhas[i]);
        }
        System.out.println();

        
        System.out.println("\nMenores elementos de cada coluna:");
        for (int j = 0; j < 7; j++) {
            System.out.printf("%4d", menoresColunas[j]);
        }
        System.out.println();
    }
}

