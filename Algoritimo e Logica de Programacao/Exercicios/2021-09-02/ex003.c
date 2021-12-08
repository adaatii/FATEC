#include <stdio.h>

int main(){
    float peso,pesototal;
    int n;
    printf("Digite seu peso:\n");
    scanf("%f",&peso);
    printf("Para saber seu peso em:\n");
    printf("Mercurio digite 1\n");
    printf("Venus digite 2\n");
    printf("Marte digite 3\n");
    printf("Jupiter digite 4\n");
    printf("Saturno digite 5\n");

    printf("Digite o codigo do planeta:\n");
    scanf("%d",&n);
    printf("\n\n");

    switch (n)
    {
    case 1:
        pesototal=peso*0.37;
        printf("O peso em Mercurio:%.2f\n",pesototal);
        break;
    case 2:
        pesototal=peso*0.88;
        printf("O peso em Venus:%.2f\n",pesototal);
        break;
    case 3:
        pesototal=peso*0.38;
        printf("O peso em Marte:%.2f\n",pesototal);
        break;
    case 4:
        pesototal=peso*2.64;
        printf("O peso em Jupter:%.2f\n",pesototal);
        break;
    case 5:
        pesototal=peso*1.15;
        printf("O peso em Saturno:%.2f\n",pesototal);
        break;
    default:printf("ERRO");
        break;
    }



 return(0);



}