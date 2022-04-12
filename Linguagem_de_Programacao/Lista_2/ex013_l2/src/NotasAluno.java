import java.util.Scanner;

public class NotasAluno {
    private double media;
    private double soma;
    private double nota[];
    private Scanner s;

    public NotasAluno(){
        nota = new double[4];
        s = new Scanner(System.in);
        media = 0;
    }
    public void lerDados(){
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a " + (i+1) + "° nota do aluno: ");
            nota[i] = s.nextDouble();
        }
    }
    public void calcularMedia(){
        for (int i = 0; i < 4; i++) {
            soma = soma + nota[i];
        }
        media = soma/4;
    }
    public void imprimirCondicao(){
        if (media < 3){
            System.out.println("REPROVADO");
        }else if (media >= 3 && media < 7){
            System.out.println("EXAME");
        }else {
            System.out.println("APROVADO");
        }
    }

}
