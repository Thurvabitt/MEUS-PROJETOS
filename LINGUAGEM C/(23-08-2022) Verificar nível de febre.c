#include <stdio.h>

int main()
{
 float temperatura;
 
 printf("Insira sua temperatura: ");
 scanf("%f", &temperatura);
 
 
 
 if(temperatura >= 37.5){
     printf("você está com febre! \n");   
 }
 
 if(temperatura >=40){
     printf("-Febre: alta! \n");
 }

 if(temperatura >= 38.1 && temperatura <= 39){
     printf("-Febre: baixa! Procure medicar-se para que a mesma não aumente. \n");
 }
 


 if(temperatura >= 37.6  && temperatura < 38.5){
    printf("-Febre: média! Procure medicar-se para que a mesma não aumente.");
 }
 
  if(temperatura>= 37.5){
     printf("\n-Medicamentos como paracetamol e ibuprofeno podem ajudar a aliviar o desconforto \n");
     //MENSAGEM-GUIA SOBRE O QUE O PACIENTE DEVE REALIZAR EM SITUAÇÕES DE FEBRE ALTA
 }
 
  printf("-CUIDE-SE SEMPRE \n");
    return 0;    
}
