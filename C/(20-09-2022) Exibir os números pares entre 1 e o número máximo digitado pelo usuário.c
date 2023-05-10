#include <stdio.h>

int main()
{
    int cont;
    int max;

    printf("Digite um número máximo: ");
    scanf("%d", &max);
  
    for(cont = 1; cont <= max; cont ++){
        
    if(cont%2 == 0){
        printf("\n %d", cont);
    }
  }
    return 0;
}
