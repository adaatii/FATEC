package Numeros;

import java.util.Scanner;

public class NumerosInteiros {
    private Scanner s;
    private int x;
    private int y;


    public NumerosInteiros(){
        s = new Scanner(System.in);
        x = y = 0;
    }

    public void lerDados(){
        System.out.println("Informe o primeiro numero: ");
        x = s.nextInt();
        System.out.println("Informe o segundo numero: ");
        y = s.nextInt();
    }

    public int comparacao(){
        int result = 0;
        String a = null;
        if (x > y)
        {
            result = x;
        }
        else if(x < y)
        {
            result = y;
        }

        return result;
    }

    public void imprimir()
    {
        System.out.println("O maior valor é = " + comparacao());
    }

}



