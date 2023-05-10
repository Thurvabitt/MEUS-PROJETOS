#include <stdio.h>

int main()
{
    int dividendo;
    int divisor;
    double resultado;
    
    printf("Digite um valor \n");
    scanf("%d", &dividendo);
    
    do{
    printf("Digite o 2ndo valor \n");
    scanf("%d", &divisor);
    } 
    while(divisor ==0); 
   
  
    resultado = dividendo / divisor;
    printf("O resultado é %0.2f \n", resultado);


    return 0;
}