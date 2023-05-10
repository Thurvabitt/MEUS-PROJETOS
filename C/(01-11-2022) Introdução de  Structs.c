#include <stdio.h>

    struct pessoa{
        int idade;
        float salario;
        char nome[50];
        char sexo;
    };
    
int main(){
    
    struct pessoa p1;
    p1.idade;
    p1.salario;
    p1.nome;
    p1.sexo;

    printf("Digite sua idade: ");
    scanf("%d", &p1.idade);

    printf("Digite seu salário: ");
    scanf("%f", &p1.salario);

    printf("Digite seu primeiro nome: ");
    scanf("%s", p1.nome);
    
    printf("Digite Seu sexo: ");
    scanf(" %c \n", &p1.sexo);

    
    printf("\n Cadastro realizado com sucesso! Os dados inseridos foram: \n");

    printf("\nIdade: %d \n", p1.idade);
    printf("Salário: %2.f \n", p1.salario);
    printf("Primeiro Nome: %s \n", p1.nome);
    printf("Sexo: %c \n", p1.sexo);


    return 0;
}