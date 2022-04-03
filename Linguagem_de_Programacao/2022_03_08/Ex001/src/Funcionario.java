import java.util.Scanner;

public class Funcionario {
    private Scanner s;
    private double salarioAtual;
    private double salarioNovo;

    public Funcionario(){
        s = new Scanner(System.in);
        salarioAtual = 0;
        salarioNovo = 0;
    }

    public void lerSalario(){
        System.out.println("Informe o salário do funcionário:");
        salarioAtual = s.nextDouble();
    }

    public void processaSalario(){
        salarioNovo = salarioAtual * 1.25;
    }

    public void imprimirSalario(){
        System.out.println("Salário atual = " + salarioAtual);
        System.out.println("Salario novo = " + salarioNovo);
    }

    public static void main(String[] args) {
        Funcionario obj = new Funcionario();
        obj.lerSalario();
        obj.processaSalario();
        obj.imprimirSalario();
    }

}
