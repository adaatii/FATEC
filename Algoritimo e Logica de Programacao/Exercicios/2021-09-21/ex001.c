#include <stdio.h>

int main (){
    int n,x,fat=1;

    printf("Digite um numero inteiro: ");
    scanf("%d",&n);
    if (n!=0)
    {
        for(x=1;x<=n;x++){
            fat=fat*x;
        }
    }
    printf("O fatorial de %d = %d",n,fat);
    
    return(0);
}