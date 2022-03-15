package Classes;

import java.util.Scanner;

public class Aluno
{
    private String nome, ra;
    private Scanner s;

    public Aluno()
    {
        s =new Scanner(System.in);
        nome = ra = "";
    }

    public void lerDados()
    {
        System.out.println("Informe o nome do aluno: ");
        nome =s.nextLine();
        System.out.println("Informe o RA: ");
        ra = s.nextLine();
    }

    public void imprimirDados()
    {
        System.out.println("Nome = " + nome);
        System.out.println("RA = " + ra);
    }

}
