#include <stdio.h>

int main()
{
    float VlSalarioMin = 0;
    float QtdAgua = 0;
    float VlLitroAgua = 0;
    float VlContaAgua = 0;
    float VlDesconto = 10;
    float VlContaAguaLiq = 0;
    
    printf("Digite o Valor do Salario Minimo atual: ");
    scanf("%f", &VlSalarioMin);

    
    printf("Digite a Quantidade de litros de agua gasto no mes: ");
    scanf("%f", &QtdAgua);
   
    
    VlLitroAgua = VlLitroAgua * 0.02 / 1000;
    VlContaAgua = QtdAgua * VlLitroAgua;
    VlDesconto = VlContaAgua * 0.15;
    VlContaAguaLiq = VlContaAgua - VlDesconto;
    
    printf("\n\nCALCULO DA CONTA DE AGUA\n");
    printf("O valor do salario minimo atual e de R$ %0.2f \n\n", VlSalarioMin);
    printf("O valor do litro de agua esta em R$ %0.2f \n\n", VlLitroAgua);
    printf("Voce gastou este mes %f litros de agua \n\n", QtdAgua);
    printf("Desta forma sua conta ficou em R$ %0.2f\n\n", VlContaAgua);
    printf("Conseguimos conceder um desconto de R$ %0.2f ", VlDesconto);
    
    return 0;
}
