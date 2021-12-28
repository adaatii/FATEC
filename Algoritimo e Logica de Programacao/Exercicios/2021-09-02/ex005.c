#include <stdio.h>

int main(){
    int opcao;
    float raio, result;

    printf("Area da circunferencia digite 1\n");
    printf("Perimetro da Circunferencia digite 2\n");
    printf("Digite aqui sua opcao:");
    scanf("%d",&opcao);
    printf("Digite o valor do raio:");
    scanf("%f",&raio);

    switch (opcao)
    {
    case 1:
        result=(raio*raio)*3.14;
        printf("A Area da circunferencia = %.2f",result);
        break;
    case 2:
        result=2*3.14*raio;
        printf("O Perimetro da circunferencia = %.2f",result);
        break;
    
    default: printf("O indicador de operacao foi mal fornecido!");
        break;
    }
return(0);

}