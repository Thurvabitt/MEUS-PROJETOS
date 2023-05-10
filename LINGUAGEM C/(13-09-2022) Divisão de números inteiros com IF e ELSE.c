#include <stdio.h>

int main()
{
    int dividendo;
    int divisor;
    double resultado;
    
    printf("Digite um valor \n");
    scanf("%d", &dividendo);
    
    printf("Digite outro valor \n");
    scanf("%d", &divisor);
    
    if(divisor == 0){
        printf("Digite um número válido! \n");
    } else {
        resultado = dividendo / divisor;
    }
    
    printf("o resultado da divisão é %0.2f", resultado);
    return 0;
}
