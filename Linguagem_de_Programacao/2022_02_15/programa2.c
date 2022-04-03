#include<stdio.h>

int soma(int,int);

int main(){
    int res;

    res = soma(10,20);
    printf("Soma = %d\n", res);
      
    res = soma(50,70);  
    printf("Soma = %d\n", res);

    return(0);
}

int soma (int x, int y){
    return(x+y);
}