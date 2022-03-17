package Numeros;

import java.util.Scanner;

public class Numeros {
    private Scanner s;
    int x;

    public Numeros(){
        s = new Scanner(System.in);
        x = 0;
    }

    public void lerDados(){
        System.out.println("Digite um numero inteiro: ");
        x = s.nextInt();
    }

    public void comparaDados(){
        if (x % 2 == 0){
            System.out.println("O numero " + x + " é par.");
        }
        else{
            System.out.println("O numero " + x + " é impar.");
        }
    }


}
