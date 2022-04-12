import java.util.Scanner;

public class ParImpar {
    private int vetor[];
    private int i;
    private int par;
    private int impar;
    private Scanner s;

    public ParImpar(){
        s = new Scanner(System.in);
        vetor = new int[20];
        par = impar = 0;
    }
    public void lerDados(){
        for ( i = 0; i < 20 ; i++) {
            System.out.println("Digite o " + (i+1) + "° numero: ");
            vetor[i]= s.nextInt();
        }
    }
    public void compararDados(){
        for (i = 0; i < 20 ; i++) {
            if (vetor[i] % 2 == 0){
                par++;
            }else{
                impar++;
            }
        }
    }
    public void imprimir(){
        System.out.println("Os numeros infomrados foram: ");
        for (i = 0; i < 20 ; i++) {
            System.out.printf(" [%d] ", vetor[i]);
        }
        System.out.println("A quantidade de numeros pares = " + par +" e impares = " + impar);
    }
}
