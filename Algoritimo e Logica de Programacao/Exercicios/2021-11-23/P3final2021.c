#include <stdio.h>
#include <stdlib.h>
#include <string.h>


void verificabuffer()
{
char c;
while ((c=getchar()) != '\n' && c!= EOF);
}

int calcpreco (int horario_entrada,int horario_saida){
    
    return ((horario_saida-horario_entrada) * 1);
}


int main(){

    FILE *arq;

    int quantvagas=0,op, i, j,k, cont=0,ret;

    printf("\n=====CONTROLE DE ESTACIONAMENTO====\n");

    printf("\nDigite o numero de Vagas:\n");
    scanf("%d",&quantvagas);

    int ENTRADA[quantvagas],RELATORIO[100][4],  horario_saida;
    char PLACA[quantvagas][8], PLACA_REL[100][8], placa[8],placaaux;

    for ( i = 0; i < quantvagas; i++)
    {

        ENTRADA[i] = 0;           
        
    }   


    for ( i = 0; i < 4; i++)
    {
        for (j=0 ; j < 100; j++)
        {
            RELATORIO[i][j] = 0;
            
        }
        
    }
    

    do
    {
    printf("\nSelecione uma das opcoes baixo:\n1. ENTRADA DE VEICULO\n2. SAIDA DE VEICULO\n3. IMPRIMIR RELATORIO EM TELA\n4. IMPRIMIR RELATORIO EM ARQUIVO\n5. FECHAR PROGRAMA\n");
    scanf("%d",&op);

    verificabuffer();

    switch (op)
    {
    case 1:

         printf("ENTRADA VEICULO \n");
        //verificar se há vagas disponiveis

        for (i = 0; i < quantvagas; i++)
        {
           if (ENTRADA[i] == 0){

               
                cont=cont+1;
                printf("\nVaga disponivel!\nDigite a placa do veiculo:\n");
                scanf("%s",&PLACA[i]);
              

                printf("\nDigite o horario de entrada:\n");
                scanf("%d",&ENTRADA[i]);

                break;
                
           }
            
        }
        if (quantvagas <= i)
        {
             printf("\nNAO HA VAGAS\n"); 
        }
        

       
        break;

    case 2:
        printf("\nSAIDA VEICULO\n");

         printf("\nInforme a placa do veiculo que vai sair \n");
         scanf("%s",&placa);
         
         for ( i = 0; i < quantvagas; i++)
         {
             ret= (strcmp(PLACA[i],placa));
             

            if (ret==0)
            {
                
                printf("\nVeiculo encontrado no estacionamento. Informe o horario de saida\n");
                scanf("%d",&horario_saida);


                //verifica se é a primeira vez
                if (RELATORIO[0][0] == 0)
                {
                    /*RELATORIO[0][0] = PLACA[i]; */
                    RELATORIO[0][0] = i;
                    RELATORIO[0][1] = ENTRADA[i]; 
                    RELATORIO[0][2] = horario_saida; 
                    RELATORIO[0][3] = calcpreco (ENTRADA[i], horario_saida);

                    strcpy(PLACA_REL[0], PLACA[i]) ;

                    k=1;
                }

                else{

                    RELATORIO[k][0] = i; 
                    RELATORIO[k][1] = ENTRADA[i]; 
                    RELATORIO[k][2] = horario_saida; 
                    RELATORIO[k][3] = calcpreco (ENTRADA[i], horario_saida);

                    strcpy(PLACA_REL[k], PLACA[i]) ;

                    ++k;
                }
                


                

                strcpy(PLACA[i], "") ;
                ENTRADA[i] = 0;

                break;
            }


            
         }

        

        if (quantvagas < i)
        {
             printf("\nveiculo nao encontrado no estacionamento\n"); 
           
        }
         
        break;
        
        
        
    case 3:
        if (RELATORIO[0][1] != 0){

            printf("\nIMPRESSAO RELATORIO\n");

            printf("\nPLACA        ENTRADA       SAIDA     PRECO   \n");
            
            for ( i = 0; i < k; i++)
            {
                for (j=0 ; j < 4 ; j++)
                {

                    if (j== 0){                        
                  
                        printf("%s     ", PLACA_REL[i]);
                        
                    }

                    if(RELATORIO[i][j] != 0 && j != 0){
                        
                        printf("     %d     ", RELATORIO[i][j]);
                        
                    }
                    
                }
                printf("\n");
                }          
            }
        else{
            printf("\nNAO OCORREU NENHUMA ENTRADA E SAIDA\n");
            }
            
            
           
        break;
    
    case 4:
            if (RELATORIO[0][1] != 0)
            {
            arq=fopen("relatorioestacionamento.txt","w");

            fprintf(arq,"\nIMPRESSAO RELATORIO\n");

            fprintf(arq,"\nPLACA        ENTRADA       SAIDA     PRECO   \n");
            
            for ( i = 0; i < cont; i++)
            {
                for (j=0 ; j < 4 ; j++)
                {
                    

                    if(RELATORIO[i][j] != 0){
                        
                        fprintf(arq,"     %d     ", RELATORIO[i][j]);
                        
                    }
                    
                }
                fprintf(arq,"\n");
        
            }  
            fclose(arq); 
            }
            else{
                printf("\nARQUIVO NAO CRIADO\n");
            }
           
            
           

        break;
    
    case 5:

        printf("Estacionamento fechado. Foram computados o total de entrada de veiculos igual a %d\n", cont);

    default:
        break;
    }


    } while (op != 5);
    



    return(0);
}

