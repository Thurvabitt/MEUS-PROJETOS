#include <stdio.h>

int main()
{
    int qtdnotas;

    printf("Quantas notas você tem? ");
    scanf("%d", &qtdnotas);
    
    float notas[qtdnotas];
    int cont;
    
    for(cont=0; cont < qtdnotas ; cont++){
    printf("Digite a nota %d: ", cont);
    scanf("%f", &notas[cont]);
    }
    
    
    for(cont=0; cont < qtdnotas ; cont++){
    printf("\n A nota %d: %0.1f", cont, notas[cont]);    
}

    float soma = 0;
    for(cont=0; cont < qtdnotas ; cont++){
    soma = soma + notas[cont];
}

    float media = soma / qtdnotas;
    printf("\n A média das notas é %0.1f", media);

    return 0;
}
