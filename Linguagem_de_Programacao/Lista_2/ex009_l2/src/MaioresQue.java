import java.util.Scanner;

public class MaioresQue {
    private int i;
    private int num;
    private int maiores;
    private Scanner s;

    public MaioresQue(){
        s = new Scanner(System.in);
        num = maiores = 0;
    }

    public void lerComparaDados(){
        for (i = 0; i < 20; i++){
            System.out.println("Digite o " + (i+1) + "° numero: ");
            num = s.nextInt();
            if (num > 50){
                maiores++;
            }
        }
    }

    public void imprimir(){
        System.out.println("A quantida de numeros maiores que 50 é: " + maiores);
    }
}
