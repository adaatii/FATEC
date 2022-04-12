import java.util.Scanner;

public class Altura {
    private double altura[];
    private double menorAltura;
    private Scanner s;

    public Altura(){
        s = new Scanner(System.in);
        altura = new double[20];
        menorAltura = altura[1];
    }

    public void lerDados(){
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite a " + (i+1) + "° altura:");
            altura[i] = s.nextDouble();
        }
    }
    public void compAltura(){

        for (int i = 1; i < 20 ; i++) {
            if (menorAltura > altura[i]){
                menorAltura = altura[i];
            }
        }
    }
    public void imprimir(){
        System.out.println("A menor altura é: " + menorAltura);
    }



}
