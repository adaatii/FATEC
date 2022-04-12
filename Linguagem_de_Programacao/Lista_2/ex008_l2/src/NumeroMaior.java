import java.util.Scanner;

public class NumeroMaior {
    private int num;
    private int i;
    private int maior;
    private Scanner s;

    public NumeroMaior(){
        s =new Scanner(System.in);
        num = maior = 0;
    }

    public void lerDados(){
        for (i = 0; i < 10; i++){
            System.out.println("Digite o " + (i+1) + "° numero:");
            num = s.nextInt();
            if (num > maior){
                maior = num;
            }
        }
    }

    public void imprimir(){
        System.out.println("O maior numero digitado foi: " + maior);
    }

}
