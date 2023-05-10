#include <stdio.h>

int main()
{
   int escolha;
    int contador = 1;
    
    printf("Digite um número ");
    scanf("%d", &escolha);
    
    while(escolha >= contador){
        printf("\n %d", contador);
        contador++;
    }
    
    printf("\n Fim da contagem!");
   
    return 0;
}