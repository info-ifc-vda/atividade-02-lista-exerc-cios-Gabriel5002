import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[5];
        int[] vetorResultado1 = new int[10]; 
        int[] vetorResultado2 = new int[10]; 

        
        System.out.println("Digite os 10 elementos do primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = scanner.nextInt();
        }

        
        System.out.println("Digite os 5 elementos do segundo vetor:");
        for (int i = 0; i < 5; i++) {
            vetor2[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < 10; i++) {
            if (vetor1[i] % 2 == 0) { 
                int soma = 0;
                for (int j = 0; j < 5; j++) {
                    soma += vetor2[j];
                }
                vetorResultado1[i] = vetor1[i] + soma;
            } else {
                vetorResultado1[i] = vetor1[i]; 
            }
        }

        
        for (int i = 0; i < 10; i++) {
            if (vetor1[i] % 2 != 0) { 
                int divisores = 0;
                for (int j = 0; j < 5; j++) {
                    if (vetor1[i] % vetor2[j] == 0) {
                        divisores++;
                    }
                }
                vetorResultado2[i] = divisores;
            } else {
                vetorResultado2[i] = 0; 
            }
        }

        
        System.out.println("Primeiro vetor resultante (soma dos pares):");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorResultado1[i] + " ");
        }
        System.out.println();

        System.out.println("Segundo vetor resultante (divisores dos ímpares):");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorResultado2[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}


