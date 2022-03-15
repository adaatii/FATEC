import java.util.Scanner;

public class Matriz1 {
    private int matriz[][];
    private Scanner s;


    public Matriz1()
    {
        s = new Scanner(System.in);
        matriz = new int [3][3];
    }

    public void lerMatriz()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j<3; j++)
            {
                System.out.println("Informe valor inteiro: ");
                matriz[i][j] = s.nextInt();
            }
        }
        s.close();
    }

    public void imprimirMatriz()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Matriz1 obj = new Matriz1();
        obj.lerMatriz();
        obj.imprimirMatriz();
    }

}
