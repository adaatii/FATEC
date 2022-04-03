import java.util.Scanner;

public class Exemplo {
    private Scanner s;
    private int n1, n2;
    private double num1,num2;

    public Exemplo(){
        s = new Scanner(System.in);
        n1 = n2 = 0;
        num1 = num2 = 0;
    }

    public void lerInteiros(){
        System.out.println("Informe n1: ");
        n1 = s.nextInt();
        System.out.println("Informe n2: ");
        n2 = s.nextInt();
    }
    public void lerReais(){
        System.out.println("Informe num1: ");
        num1 = s.nextDouble();
        System.out.println("Informe num2: ");
        num2 = s.nextDouble();
    }

    public void imprimirInteiros(){
        System.out.println("A soma dos inteiros = " + somar(n1,n2));
    }
    public void imprimirReais(){
        System.out.println("A soma dos reais = " + somar(num1,num2));
    }

    public int somar(int x, int y){
        return (x+y);
    }
    public double somar(double x, double y){
        return (x+y);
    }

    public static void main(String[] args) {
        Exemplo obj = new Exemplo();
        obj.lerInteiros();
        obj.imprimirInteiros();
        obj.lerReais();
        obj.imprimirReais();
    }
}
