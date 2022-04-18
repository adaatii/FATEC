import java.util.Scanner;

public class Primos {

     private int[] vetor;
     private int i;
     private Scanner s;
     private int tamanho;

     
     public Primos(){
         s = new Scanner(System.in);
         tamanho = 0;

     }
     
     public void lerDados(){
         System.out.println("Digite a quantidade de numeros que deseja informar:");
         tamanho = s.nextInt();
         vetor = new int[tamanho];

         for (int i = 0; i < tamanho; i++) {
             System.out.println("Digite o "+ (i+1) +"° numero: ");
             vetor[i] =s.nextInt();
         }
     }
     public void compPrimos(){
         for (int i = 0; i < tamanho ; i++) {

             if (ehPrimo(vetor[i])){
                 System.out.println(vetor[i] + " é primo");
             }else {
                 System.out.println(vetor[i] + " não é primo");
             }
         }

     }


     public boolean ehPrimo(int numero){
         for (int j = 2; j < numero; j++) {
             if (numero % j == 0)  return false;
         }
         return true;
     }


}


