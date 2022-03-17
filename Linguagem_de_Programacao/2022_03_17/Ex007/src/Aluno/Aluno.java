package Aluno;

import java.util.Scanner;

public class Aluno {
    private double n1, n2, media;
    Scanner s;

    public Aluno(){
        s = new Scanner(System.in);
        n1 = n2 = media = 0;
    }

    public void lerNotas(){
        System.out.println("Digite a primeira nota: ");
        n1 = s.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = s.nextDouble();
    }
    public void calcularMedia(){
        media = (n1 + n2)/2;
    }

    public void imprimirDados(){
        System.out.println("A média do aluno é: " + media);
        if (media >= 6){
            System.out.println("Aluno aprovado");
        }
        else {
            System.out.println("Aluno reprovado");
        }
    }
}
