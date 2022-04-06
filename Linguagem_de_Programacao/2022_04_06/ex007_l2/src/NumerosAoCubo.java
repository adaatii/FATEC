import java.util.Scanner;

public class NumerosAoCubo {
    private int i;
    private int pot;
    private int vetor[];
    private int cubo[];
    private Scanner s;


    public NumerosAoCubo(){
        s = new Scanner(System.in);
        vetor = new int[30];
        cubo = new int[30];
    }

    public void lerDados(){
        for (i = 1; i <= 30; i++){
            System.out.println("Digite o " + i + "° numero:");
            vetor[i] = s.nextInt();
        }
    }
    public void Cubo(){
        for (i = 1; i <= 30; i++){
            cubo[i] = (int) Math.pow(vetor[i], 3 );
        }
    }
    public void imprimirDados(){
        for (i = 1; i <= 30; i++){
            System.out.println(vetor[i] + "³ = " + cubo[i]);
        }
    }

}
