#include <stdio.h>

int main(){
    int v[10],conta,soma=0;

    for(conta=0;conta<=9;++conta){
        printf("Digite um numero inteiro:\n");
        scanf("%d",&v[conta]);

        soma=soma+v[conta];
    }
    printf("A soma dos valores =%d\n",soma);


    return(0);
}