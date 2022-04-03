import java.util.Scanner;

public class NumerosInteiros {
    private Scanner s;
    private int vetorPares[];
    private int num;
    private int mposi;
    private int i;
    private int result;

    public NumerosInteiros(){
        s = new Scanner(System.in);
        vetorPares = new int[100];
        result = mposi = i = num = 0;
    }

    public void lerDados(){
        for ( i = 0; num != -1; i++){

            System.out.println("Informe um numero inteiro: " + "(Para finalizar digite -1)");
            num = s.nextInt();
            vetorPares[i]=num;

        }
        mposi = i;
    }
    public int Somar(){
        for ( i = 0; i < mposi; i++){
            if (vetorPares[i] % 2 ==0){
                result = result +vetorPares[i];
            }
        }
        return result;
    }
    public void imprimiPares(){
        System.out.println("Os valores pares são: ");
        for ( i = 0; i < mposi; i++){
            if (vetorPares[i] % 2 == 0) {
                System.out.println(vetorPares[i]);
            }
        }
        System.out.println("Os soma de todo os numeros pares: " + result);
    }
}
