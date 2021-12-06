#include <stdio.h>

int main()
{
    int b,a,x;

    printf("Digite o valor da base: ");
    scanf("%d",&b);
    printf("Digite o valor da altura: ");
    scanf("%d",&a);

    x=(b*a)/2;

    printf("A area do triangulo: %d\n",x);

    return(0);
}