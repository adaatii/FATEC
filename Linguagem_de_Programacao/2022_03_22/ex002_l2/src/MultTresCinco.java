import java.util.Scanner;

public class MultTresCinco {
    private Scanner s;
    private int vetor[];
    private int num;
    private int mposi;
    private int i;


    public MultTresCinco(){
        s = new Scanner(System.in);
        vetor = new int[100];
       mposi = i = num = 0;
    }

    public void lerDados(){
        for ( i = 0; num != -1; i++){

            System.out.println("Informe um numero inteiro: " + "(Para finalizar digite -1)");
            num = s.nextInt();
            vetor[i]=num;

        }
        mposi = i;
    }

    public void imprimi(){
        System.out.println("Os valores multiplos de 3 e 5 são: ");
        for ( i = 0; i < mposi; i++){
            if (vetor[i] % 3 == 0 || vetor[i] % 5 == 0) {
                System.out.println(vetor[i]);
            }
        }

    }
}
