import java.util.Scanner;

public class Vetor {
    private int i;
    private int vetor[];
    private Scanner s;

    public Vetor(){
        s = new Scanner(System.in);
        vetor = new int[10];
    }

    public void lerDados(){
        for (i = 0; i < 10; i++){
            System.out.println("Digite o " + (i+1) + "° numero: ");
            vetor[i] = s.nextInt();
        }
    }
    public void imprimir(){
        for(i = 0; i < 10; i++){
            System.out.println("[" + vetor[i] + "]");
        }
    }
}
