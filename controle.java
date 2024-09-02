import java.util.Scanner;
public class controle {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] codigos = new int[10];
        double[] saldos = new double[10];

        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o código da conta " + (i + 1) + ": ");
            int codigo;
            while (true) {
                codigo = scanner.nextInt();
                if (isCodigoUnico(codigos, codigo)) {
                    codigos[i] = codigo;
                    break;
                } else {
                    System.out.print("Código já existente! Digite um código único: ");
                }
            }
            System.out.print("Digite o saldo inicial da conta " + codigos[i] + ": ");
            saldos[i] = scanner.nextDouble();
        }

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Efetuar depósito");
            System.out.println("2. Efetuar saque");
            System.out.println("3. Consultar o ativo bancário");
            System.out.println("4. Finalizar programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    
                    System.out.print("Digite o código da conta para depósito: ");
                    int codigoDeposito = scanner.nextInt();
                    int indiceDeposito = encontrarIndicePorCodigo(codigos, codigoDeposito);
                    if (indiceDeposito != -1) {
                        System.out.print("Digite o valor a ser depositado: ");
                        double valorDeposito = scanner.nextDouble();
                        saldos[indiceDeposito] += valorDeposito;
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;
                case 2:
                    
                    System.out.print("Digite o código da conta para saque: ");
                    int codigoSaque = scanner.nextInt();
                    int indiceSaque = encontrarIndicePorCodigo(codigos, codigoSaque);
                    if (indiceSaque != -1) {
                        System.out.print("Digite o valor a ser sacado: ");
                        double valorSaque = scanner.nextDouble();
                        if (saldos[indiceSaque] >= valorSaque) {
                            saldos[indiceSaque] -= valorSaque;
                            System.out.println("Saque realizado com sucesso!");
                        } else {
                            System.out.println("Saldo insuficiente!");
                        }
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;
                case 3:
                    
                    double ativoBancario = 0;
                    for (double saldo : saldos) {
                        ativoBancario += saldo;
                    }
                    System.out.println("O ativo bancário total é: R$ " + ativoBancario);
                    break;
                case 4:
                    
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }

    
    private static boolean isCodigoUnico(int[] codigos, int codigo) {
        for (int i : codigos) {
            if (i == codigo) {
                return false;
            }
        }
        return true;
    }

    
    private static int encontrarIndicePorCodigo(int[] codigos, int codigo) {
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigo) {
                return i;
            }
        }
        return -1; 
    }
}


