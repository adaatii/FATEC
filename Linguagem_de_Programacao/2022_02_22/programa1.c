#include <stdio.h>

#define MAX 2

struct dados
{
    char nome[100];
    float salario;
    int idade;
}pessoas[MAX];

void cadastrar(void);
void listagem(void);

int main()
{
    cadastrar();
    listagem();
    return(0);
}

void cadastrar(void)
{
    int i;
    for (i = 0; i < MAX; i++)
    {
        printf("Informe um nome: ");
        scanf("%s",&pessoas[i].nome);
        printf("Informe o salario: ");
        scanf("%f",&pessoas[i].salario);
        printf("Informe a Idade: ");
        scanf("%d",&pessoas[i].idade);

    }
    
}

void listagem(void)
{
    int i;
    for ( i = 0; i < MAX; i++)
    {
        printf("\nNome: %s",&pessoas[i].nome);
        printf("\nSalario: %f",&pessoas[i].salario);
        printf("\nIdade: %d",&pessoas[i].idade);
    }
    
}
