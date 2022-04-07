import java.util.Scanner;

public class Numero {
    private int i;
    private int num;
    private Scanner s;

    public Numero(){
        s =new Scanner(System.in);
        num = 0;
    }

    public void lerDados(){
        System.out.println("Digite um numero inteiro: ");
        num = s.nextInt();
    }
    public void imprimir(){
        for (int i = 1; i <= num; i++) {
            System.out.printf(" %d, %d, %d,", i, (i+3),(i+3));
        }
        System.out.printf("...");
    }
}
