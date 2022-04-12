import java.util.Arrays;
import java.util.Scanner;

public class OrdemCrescente {
    private int i;
    private int num[];
    private Scanner s;

    public OrdemCrescente(){
        s = new Scanner(System.in);
        num = new int[10];
    }

    public void lerDados(){
        for ( i = 0; i < 10 ; i++) {
            System.out.println("Digite o " + (i+1) +"° numero inteiro: ");
            num[i] = s.nextInt();
        }
    }
    public void ordenarDados(){
        Arrays.sort(num);
    }
    public void imprimir(){
        for (int number: num) {
            System.out.printf("[%d]",number);
        }
    }
}
