public class NumerosAoQuadrado {
    private int i;
    private int soma;

    public NumerosAoQuadrado(){
        soma = 0;
    }
    public void quadrado(){
        for (i = 1; i <= 30; i++){
            /*System.out.println(i + "² = " + (int) Math.pow(i , 2));
            soma = soma + (int) Math.pow(i , 2);*/
            System.out.println(i + "² = " + i*i);
            soma = soma + i*i;
        }

    }
    public void imprimirSoma(){
        System.out.println("A soma dos quadrados de 1 a 30 é: " + soma);
    }
}
