#include <stdio.h>

int tab(int i,int a){
  return (i*a);
}


int main(){

  int a,b;
    printf("Tabuada\n", );

    printf("Digite o numero\n");
    scanf("%d",&a);

    for (i = 0; i < 10; i++) {
      printf("%d X %d = %d\n",i,a,tab(i,a));
    }



  return(0);
}
