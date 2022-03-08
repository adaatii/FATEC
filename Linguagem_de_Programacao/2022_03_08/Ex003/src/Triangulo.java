import java.util.Scanner;

public class Triangulo {
    private Scanner s;
    private double base;
    private double altura;
    private double area;

    public Triangulo(){
        s =new Scanner(System.in);
        base = altura = 0;
    }

    public void lerDados(){
        System.out.println("Informe o valor da base: ");
        base = s.nextDouble();
        System.out.println("Informe o valor da altura: ");
        altura = s.nextDouble();
        s.close();
    }

    public void calcularArea(){
        area = (base * altura)/2;
    }

    public void imprimiResultado(){
        System.out.println("A area do triangulo é: " + area);
    }

    public static void main(String[] args) {
        Triangulo obj = new Triangulo();
        obj.lerDados();
        obj.calcularArea();
        obj.imprimiResultado();
    }
}
