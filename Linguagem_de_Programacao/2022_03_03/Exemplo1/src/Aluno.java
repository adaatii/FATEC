import java.util.Scanner;

public class Aluno {
   private String nome, curso;
   private int idade;
   private Scanner s;

   //método construtor
   public Aluno(){
       nome = "";
       curso = "";
       idade = 0;
       s = new Scanner(System.in);
   }

   public void lerDados(){
       System.out.println("Informe o nome do aluno: ");
       nome = s.nextLine();
       System.out.println("Informe o curso do aluno: ");
       curso = s.nextLine();
       System.out.println("Informe a idade do aluno: ");
       idade = s.nextInt();
       s.close();

   }

   public void imprimirDados(){
       System.out.printf("Nome do aluno = %s\n", nome);
       System.out.println("Curso do aluno  = " + curso);
       System.out.println("Idade do aluno = " + idade);

   }

    public static void main(String[] args) {
        Aluno obj = new Aluno();
        obj.lerDados();
        obj.imprimirDados();
    }


}
