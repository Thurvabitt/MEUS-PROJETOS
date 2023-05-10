#include <stdio.h>

int main()
{
   int escolha;
   printf("Digite 1 para praia \n");
   printf("Digite 2 para cinema \n");
   printf("Digite 3 para churrasco \n");
   printf("Escolha algumas das opções exibidas logo acima: \n");
   scanf("%d", &escolha); 
   
   switch (escolha) {
       case 1:
       printf("Sair de casa as 8 horas");
       break;
       
       case 2:
       printf("Sair de casa as 14 horas");
       break;
       
       case 3:
       printf("Sair de casa as 12 horas");
       break;
       
       default:
       printf("Opção inserida não existente, tente novamente com as opções");
      //fim do switch-case 
       
    }
printf("\n\n\n\n");
    return 0;
}