#include <stdio.h>

int main()
{
    float dd,pd,t;
    printf("Valor produto em dolar:");
    scanf("%f",&pd);
    printf("Cotacao do dolar em real:");
    scanf("%f",&dd);

    t=pd*dd;

    printf("Valor total em real: %.2f\n",t);


    return(0);
}

