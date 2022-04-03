#include <stdio.h>
#include <string.h>

int main(){

    char nome_cliente[]="Fulano";
    int cont;
    
    for (cont=0; cont < 6; cont++)
    {
        printf("Valor do elemento %d da string = %s\n",cont,nome_cliente);
    }
    

    return(0);
}