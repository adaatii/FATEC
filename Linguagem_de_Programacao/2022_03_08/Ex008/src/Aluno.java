import java.util.Scanner;

public class Aluno {
    private double nota1, nota2, media;
    private Scanner s;

    public Aluno(){
        s = new Scanner(System.in);
        nota1 = nota2 = media = 0;
    }

    public void lerNotas(){
        System.out.println("Informe a nota 1 do Aluno: ");
        nota1 = s.nextDouble();
        System.out.println("Informe a nota 2 do Aluno: ");
        nota2 = s.nextDouble();
    }

    public void processaMedia(){
        media = (nota1*2 + nota2*3)/(2+3);

    }

    public void imprimirResultado(){
        System.out.println("Média do aluno = " + media);
        if (media < 6){
            System.out.println("Aluno Reprovado!");
        }else{
            System.out.println("Aluno Aprovado!");
        }
    }

    public static void main(String[] args) {
        Aluno obj = new Aluno();
        obj.lerNotas();
        obj.processaMedia();
        obj.imprimirResultado();


    }




}


