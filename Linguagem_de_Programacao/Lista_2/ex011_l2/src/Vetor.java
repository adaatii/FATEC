import java.util.Scanner;

public class Vetor {
    private int i;
    private int vetor[];
    private Scanner s;

    public Vetor(){
        vetor = new int[10];
        s = new Scanner(System.in);
    }
    public void lerDados(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i+1) + "° numero: ");
            vetor[i] = s.nextInt();
        }
    }
    public void imprimir(){
        for (int i = 9; i >= 0; i--) {
            System.out.println("Vetor na posição [" + i + "] tem o valor de: " + vetor[i]);
        }
    }
}
