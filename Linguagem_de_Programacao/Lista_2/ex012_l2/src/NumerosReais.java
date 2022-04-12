import java.util.Scanner;

public class NumerosReais {
    private int i;
    private double vetor[];
    private double soma;
    private double media;
    private Scanner s;

    public NumerosReais(){
        s = new Scanner(System.in);
        vetor = new double[10];
        soma = media = 0;
    }
    public void lerDados(){
        for (i = 0; i < 10; i++){
            System.out.println("Digite o "+(i+1)+"° numero:");
            vetor[i] = s.nextDouble();
        }
    }
    public void calcular(){
        for (i = 0; i < 10; i++){
            soma = soma + vetor[i];
        }
        media = soma/10;
    }
    public void imprimir(){
        System.out.println("A soma dos numeros = " + soma + "\nA média = " + media);

    }
}
