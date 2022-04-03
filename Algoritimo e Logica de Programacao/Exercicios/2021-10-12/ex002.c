#include <stdio.h>

int main(){
    float notas[4];
    int cont;
    
    //entrada de dados
    for (cont=0; cont <=3 ; cont++)
    {
       printf("Digite a nota do aluno:\n");
       scanf("%f",&notas[cont]);
    } 
    //saida de dados
    for (cont = 0; cont <= 3; cont++)
    {
         printf("Valor da nota %d = %.2f\n",cont, notas[cont]);
    }
    

    return(0);
}