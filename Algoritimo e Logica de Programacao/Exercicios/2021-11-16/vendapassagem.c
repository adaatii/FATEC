#include <stdio.h>
#include <stdlib.h>

void verificabuffer()
{
char c;
while ((c=getchar()) != '\n' && c!= EOF);
}

float precofinal (float preco,float quantidade){
    
    return (preco*quantidade);
}

int main(){

   
    int op,quantidade=0,opf=1,num;
    float preco;
    char cidadeorigem[50],cidadedestino[50],horariosaida[10],horariochegada[10];

    FILE *arquivo;    

    printf("Para a Emissao de passagens digite 1\nPara impressao da ultima emissao digite 2.\n");
    scanf("%d",&num);

    verificabuffer();

    switch (num)
    {
    case 1:
        while (opf==1)
    {
        do{
            arquivo=fopen("vendapassagens.txt","w");
        
            printf("Digite a cidade de origem:\n");
            gets(cidadeorigem);
            printf("Digite a cidade de destino:\n");
            gets(cidadedestino);
            printf("Previsao de saida:\n");
            gets(horariosaida);
            printf("Previsao de chegada:\n");
            gets(horariochegada);
            printf("Digite o valor da passagem:\n");
            scanf("%f",&preco);        
        
            printf("\n\n====DADOS DO PEDIDO====\n\n");
            printf("Origem: %s\n",cidadeorigem); 
            printf("Destino: %s\n",cidadedestino);    
            printf("Saida: %s\n",horariosaida);
            printf("Chegada: %s\n",horariochegada);   
            printf("Preco: %.2f\n\n",preco);
        

            printf("Dados corretos? 1-SIM ou 2-NAO\n");
            scanf("%d",&op);

            verificabuffer();

            } while (op==2);

          


            printf("Digite a quantidade de passagens que deseja:\n");
            scanf("%d",&quantidade);
            
            printf("\n\nValor da passagem = %.2f\nQuantidade de passagens %d\nValor final = %.2f\n\n",preco,quantidade,precofinal(preco,quantidade));
            
            printf("Deseja finaliza a compra? 1-SIM ou 2-NAO\n");
            scanf("%d",&op);

            if (op==1)
            {
                printf("Compra efetuada com sucesso.\n\n");

                    fprintf(arquivo,"Origem: %s\n",cidadeorigem);
                    fprintf(arquivo,"Destino: %s\n",cidadedestino);
                    fprintf(arquivo,"Saida: %s\n",horariosaida);
                    fprintf(arquivo,"Chegada: %s\n",horariochegada);
                    fprintf(arquivo,"Preco: %.2f\n\n",preco);
                    fprintf(arquivo,"\n\nValor da passagem = %.2f\nQuantidade de passagens %d\nValor final = %.2f\n\n",preco,quantidade,precofinal(preco,quantidade));
                    fprintf(arquivo,"Compra efetuada com sucesso.\n\n");
            }
            else{
                printf("Compra NAO efetuada\n\n");
        }

        printf("Deseja realizar outra emissao? 1-SIM ou 2-NAO\n\n");
        scanf("%d",&opf);

        verificabuffer();
    }    
    
    fclose(arquivo);   
    break;
    case 2:
        /* code */
    break;
    default:
        break;
    }
    

    return(0);
}