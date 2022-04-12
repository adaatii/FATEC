import java.util.Scanner;

public class Vetores {
    private int vetor1[];
    private int vetor2[];
    private int vetor3[];
    private Scanner s;

    public Vetores(){
        s = new Scanner(System.in);
        vetor1 = new int[10];
        vetor2 = new int[10];
        vetor3 = new int[20];

    }

    public void lerDados(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i+1) + "° numero do vetor 1");
            vetor1[i] = s.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i+1) + "° numero do vetor 2");
            vetor2[i] = s.nextInt();
        }
    }
    public void vetorFinal() {
        int i;
        int j;
        for (i = 0; i < 10; i++) {
            vetor3[i] = vetor1[i];
        }
       for (i = 10, j = 0 ; i < 20; i++, j++) {

            vetor3[i] = vetor2[j];
        }
    }
    public void imprimir(){
        for (int i = 0; i < 20; i++) {
            System.out.printf("[%d]", vetor3[i]);

        }

    }
}
