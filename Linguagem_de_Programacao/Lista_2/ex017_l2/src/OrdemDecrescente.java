import java.util.Arrays;
import java.util.Scanner;

public class OrdemDecrescente {
    private int i;
    private int vetor[];
    private Scanner s;

    public OrdemDecrescente(){
        s = new Scanner(System.in);
        vetor = new int[10];

    }

    public void lerDados(){
        for ( i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i+1) + "° numero:");
            vetor[i] = s.nextInt();
        }
    }
    public void ordenar(){
        for ( i = 0; i < 10 ; i++) {
            for (int j = 0; j < i; j++) {
                if (vetor[i] > vetor [j]){
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }

    }
    public void imprimirDecrescente(){
        for (int number: vetor) {
            System.out.printf("[%d]",number);
        }

    }




}
