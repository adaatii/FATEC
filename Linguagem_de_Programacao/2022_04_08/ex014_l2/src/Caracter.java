import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Caracter {
    private char vetor[];
    private String caracter;
    private int qtvogais;
    private Scanner s;

    public Caracter(){
        s =new Scanner(System.in);
        vetor = new char[15];
    }

    public void lerDados(){
        System.out.println("Digite 15 caracteres: ");
        caracter = s.nextLine().toUpperCase();
        char vetor[] = caracter.toCharArray();
    }

    public void comprarVogal(){
        for (int i = 0; i < 15; i++) {
            
        }
    }
    public void imprimir(){
        System.out.println("O numero de vogais é: " + qtvogais);
    }
}
