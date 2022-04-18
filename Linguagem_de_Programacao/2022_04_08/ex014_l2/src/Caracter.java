import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Caracter {

    private String v;
    private String val;
    private String caracter;
    private int qtvogais;
    private Scanner s;

    public Caracter(){
        s =new Scanner(System.in);
       caracter = "";
    }

    public void lerDados(){
        System.out.println("Digite 15 caracteres: ");
        caracter = s.nextLine().toUpperCase();


    }

    public void compararVogal(){

        v = String.valueOf(caracter);
        char [] c = v.toCharArray();

        for (int i = 0; i < 15; i++) {
            val = String.valueOf(c[i]);
            if (val.equals("A") || val.equals("E") || val.equals("I") || val.equals("O") || val.equals("U")) {
                qtvogais++;
            }
        }
    }
    public void imprimir(){
        System.out.println("O numero de vogais é: " + qtvogais);
    }
}
