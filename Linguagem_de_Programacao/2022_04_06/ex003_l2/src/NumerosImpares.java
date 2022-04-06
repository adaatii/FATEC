import java.util.Scanner;

public class NumerosImpares {
    private Scanner s;
    private int impar;
    private int num;
    private int i;

    public NumerosImpares(){
        s = new Scanner(System.in);
        num = i = 0;
    }

    public void lerDados(){
        for (i = 1; i <= 30; i++ ){
            System.out.println("Digite o " + i +"° numero inteiro: ");
            num = s.nextInt();
            if (num % 2 != 0){
                impar = impar + 1;
            }
        }
    }
    public void imprimirDados(){
        System.out.println("O quantidade de numeros impares foram: " + impar + " de 30 numeros informados.");
    }

}
