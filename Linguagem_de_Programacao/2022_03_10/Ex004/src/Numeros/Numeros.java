package Numeros;

import java.util.Scanner;

public class Numeros {
    private double n1,n2,soma,sub,mult,div;
    Scanner s;

    public Numeros(){
        s = new Scanner(System.in);
        n1 = n2 = soma = sub = mult = div = 0;
    }

    public void lerDados(){
        System.out.println("Informe o primeiro numero: ");
        n1 = s.nextDouble();
        System.out.println("Informe o segundo numero: ");
        n2 =s.nextDouble();
    }

    public void calcularDados(){
        soma = n1 + n2;
        sub = n1 - n2;
        mult = n1 * n2;
        div = n1 / n2;
    }

    public void imprimirDados(){
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divisão: " + div);
    }
}
