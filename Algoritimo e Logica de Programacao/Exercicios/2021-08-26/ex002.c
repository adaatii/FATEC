#include <stdio.h>

int main()
{
    int n,x,y;
    printf("Digite um numero: ");
    scanf("%d",&n);

    y=n-1;
    x=n+1;    
    

    printf("O antecessor desse numero: %d\n",y);
    printf("O sucessor desse numero: %d\n",x);

    return(0);
}