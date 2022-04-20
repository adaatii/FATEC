#include <stdio.h>
#include <stdlib.h>

float financ (float valor, float porcentagem){

    return (valor+((valor*porcentagem)/100));

}

int main(){   
    FILE * arquivo;
    

    int op,parcelas,i;
    float valor,porcentagem,result;
    char carro [20];
   
    arquivo=fopen("financas.txt","w");

    if (arquivo == NULL)
    {
        printf("\nERRO\n");
    }
    else{
        printf("\n ARQUIVO CRIADO\n\n");
    }
    
    
    do
    {
       printf("Digite o o modelo do carro:\n");
       scanf("%s",&carro);
       printf("Digite o valor a ser financiado:\n");
       scanf("%f",&valor);
       printf("Digite o numero de parcelas:\n");
       scanf("%d",&parcelas);
       printf("Digite a taxa de juros:\n");
       scanf("%f",&porcentagem);

       printf("\nModelo do veiculo: %s\n\n",carro);
       fprintf(arquivo,"\nModelo do veiculo: %s\n\n",carro);

       printf("Valor inicial = %.2f\n",valor);
       fprintf(arquivo,"Valor inicial = %.2f\n",valor);

       for (i = 0; i < parcelas; i++)
       {
           valor=financ(valor,porcentagem);
           printf("\nValor da parcela (%d) = %.2f\n",i+1,valor);
           fprintf(arquivo,"\nValor da parcela (%d) = %.2f\n",i+1,valor);
       }
            
      

       printf("\nDeseja realizar outra simulacao ?\n 1-SIM (Descarta simulacao anterior)\n 2-NAO (Finaliza e salva simulacao)\n");
       scanf("%d",&op);




    } while (op == 1);
    

    fclose(arquivo);


    return(0);
}