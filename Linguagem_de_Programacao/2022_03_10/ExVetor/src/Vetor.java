import java.util.Scanner;

public class Vetor {

    private int[] vetor;
    private Scanner s;

    public Vetor()
    {
        s = new Scanner(System.in);
        vetor = new int[5];
    }

    public void lerVetor()
    {
        for (int i = 0; i<5 ; i++)
        {
            System.out.println("Informe um valor inteiro: ");
            vetor[i] = s.nextInt();
        }
    }

    public void imprimirVetor()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("\nVetor["+i+"] = " + vetor[i]);
        }
    }

    public static void main(String[] args)
    {
        Vetor obj = new Vetor();
        obj.lerVetor();
        obj.imprimirVetor();
    }
}
