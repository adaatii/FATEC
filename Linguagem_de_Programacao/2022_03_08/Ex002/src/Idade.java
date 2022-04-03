import java.util.Scanner;

public class Idade {
    private Scanner s;
    private int idade;
    private int quantDias;

    public Idade(){
        s = new Scanner(System.in);
        idade = 0;
    }

    public void lerIdade(){
        System.out.println("Informe a idade: ");
        idade = s.nextInt();
    }

    public void calcularIdade(){
        quantDias = idade * 365;
    }

    public void imprimirIdadeDias(){
        System.out.println("Quantidade de dias vividos: " + quantDias);
    }

    public static void main(String[] args) {
        Idade obj = new Idade();
        obj.lerIdade();
        obj.calcularIdade();
        obj.imprimirIdadeDias();
    }

}
