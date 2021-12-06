#include <stdio.h>

int main()
{
    float qc,r;
    printf("Fornecer a quantidade de chuva:");
    scanf("%f",&qc);

    r=qc*25.4;

    printf("Resultado final = %.2f\n",r);

    return(0);
}