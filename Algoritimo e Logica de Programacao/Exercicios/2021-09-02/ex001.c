#include <stdio.h>

int main()
{
    int a,b,r;
    printf("Entre com o valor de A:");
    scanf("%d",&a);
    printf("Entre com o valor de B:");
    scanf("%d",&b);

    r= (a==b) ? a+b : a*b;

    printf("Resultado: %d\n",r);

    return(0);
    
}