#include <stdio.h>

int main(){
    float notas[5]={7,5,9.5,9.9,5.2};
    int cont;

    for(cont = 0; cont <= 4; cont++)
    {
        printf("Notas [%d] = %.2f\n",cont,notas[cont]);
    }
    

    return(0);
}