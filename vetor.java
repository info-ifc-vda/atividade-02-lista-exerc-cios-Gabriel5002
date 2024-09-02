import java.util.ArrayList;
import java.util.List;

public class vetor {
    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetor2 = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        List<Integer> naoComuns = new ArrayList<>();

        for (int i = 0; i < vetor1.length; i++) {
            if (!contidoNoVetor(vetor1[i], vetor2)) {
                naoComuns.add(vetor1[i]);
            }
        }

        for (int i = 0; i < vetor2.length; i++) {
            if (!contidoNoVetor(vetor2[i], vetor1)) {
                naoComuns.add(vetor2[i]);
            }
        }

        System.out.println("Números não comuns entre os vetores: " + naoComuns);
    }

    private static boolean contidoNoVetor(int numero, int[] vetor) {
        for (int i : vetor) {
            if (i == numero) {
                return true;
            }
        }
        return false;
    }
}


