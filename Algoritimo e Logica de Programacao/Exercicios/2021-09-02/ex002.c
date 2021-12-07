#include <stdio.h>

int main(){

    float sal,emp,r;
    printf("Entre com o valor do seu salario bruto:");
    scanf("%f",&sal);
    printf("Entre com o valor de credito desejado:");
    scanf("%f",&emp);

    r=(sal*0.3);

   
    if(emp<=r){
        printf("Valor do crédito aprovado");      
    }
    else{
        printf("Valor do crédito negado");
    }
    
return(0);

}