#include <stdio.h>
#include <stdlib.h>

void verificabuffer()
{
char c;
while ((c=getchar()) != '\n' && c!= EOF);
}


int main (){

    int vagas,num,entrada[vagas],horaentrada,horasaida,op,vagasat;
    char placa[vagas];



    printf("====CONTROLE DE ESTACIONAMENTO====\n\n");
    
    printf("Informar quantidade de vagas disponiveis:\n");
    scanf("%d",&vagas);

    do
    {
    printf("\nSelecione uma das opcoes baixo:\n1. ENTRADA DE VEICULO\n2. SAIDA DE VEICULO\n3. IMPRIMIR RELATÓRIO EM ARQUIVO\n 4. IMPRIMIR RELATÓRIO EM TELA\n5. FECHAR PROGRAMA\n");
    scanf("%d",&op);

    verificabuffer();

    switch (op)
    {
    case 1:
        printf("Informar a placa do veiculo:\n");
        gets(placa);
        printf("Digite a hora de entrada:\n");
        scanf("%d",&horaentrada);        

        break;

    case 2:
        printf("Digite a hora de saida:\n");
        scanf("%d",&horasaida);

    
    case 3:
        break;
    
    default:
        break;
    }


    } while (op != 5);
    

    


    return(0);
}