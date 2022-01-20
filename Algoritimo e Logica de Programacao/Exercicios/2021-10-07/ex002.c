#include <stdio.h>

int main(){
    int v[10],cont,sub=1;

    for(cont=0;cont<10;cont++){
        printf("Digite um numero inteiro:\n");
        scanf("%d",&v[cont]);
        if (v[cont]<30)
        {
            printf("\nVetor [%d] = %d\n",cont,sub);
        }
        else{
            printf("\nVetor [%d] = %d\n",cont,v[cont]);
        }  

    }
        

    return(0);
}