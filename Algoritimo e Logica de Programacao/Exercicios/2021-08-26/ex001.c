#include <stdio.h>
int main()
{
    int v,t,d;
    printf("Digigte o valor da velocidade: ");
    scanf("%d",&v);
    printf("Digite o valor do tempo: ");
    scanf("%d",&t);

    d=v*t;

    printf("Distancia = %d\n",d); 

    return(0);
}
