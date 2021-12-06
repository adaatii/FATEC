#include <stdio.h>
int main()
{
    float cf,pd,imp,pf;
    printf("Digite o valor do custo de fabrica:");
    scanf("%f",&cf);

    pd=(cf*12)/100;
    imp=(cf*30)/100;

    pf=cf+pd+imp;

    printf("O preco final do carro = %.2f\n",pf);



    return(0);
}