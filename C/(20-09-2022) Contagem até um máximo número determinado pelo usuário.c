#include <stdio.h>

int main()
{
    int cont;
    int max;
    
    printf("Digite um número máximo: ");
    scanf("%d", &max);
    
    for(cont = 1; cont <= max; cont++ ){
        printf("%d \n", cont);
    }
    return 0;
}
