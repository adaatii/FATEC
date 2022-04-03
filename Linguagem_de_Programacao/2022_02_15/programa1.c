#include<stdio.h>

void soma (int, int);

int main (){
    soma(10,20);
    return(0);
}

void soma (int a, int b) //Variaveis locais 
{
    printf("Soma = %d\n", a+b);
}