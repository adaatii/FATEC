#include <stdio.h>

int main(){
    float temp,r;
    int num;
    printf("De Celsius para Fahrenheit digite 1\n");
    printf("De Fahrenheit para Celsius digite 2\n");
    printf("Digite uma das opcoes acima:");
    scanf("%d",&num);
    printf("Digite  o valor a ser convertido:");
    scanf("%f",&temp);

    switch (num)
    {
    case 1:
        r=(temp*9/5)+32;
        printf("O resultado de Celsius para Fahrenheit e:%.2f",r);
        break;
    case 2:
        r=(temp-32)/1.8;
        printf("O resultado de Fahrenheit para Celsius:%.2f",r);
        break;
    default:
        break;
    }
return(0);
}


    