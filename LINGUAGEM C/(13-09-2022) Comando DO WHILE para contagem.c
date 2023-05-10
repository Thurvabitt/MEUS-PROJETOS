#include <stdio.h>


int main()
{
    int escolha;
    int contador=0;
    int resp;
    
    
    do{
    printf("Digite um numero ");
    scanf("%d", &escolha);
    
    while(escolha >= contador){
        if(contador !=0){
        printf("\n %d", contador);
        }
        contador++;
    }
    
    printf("\n Fim da contagem!");
    
    printf("\n Digite 1 se quiser continuar: ");
    scanf("%d", &resp);
    }while(resp==1);
    return 0;
}