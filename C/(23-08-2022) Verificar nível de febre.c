#include <stdio.h>

int main()
{
 float temperatura;
 
 printf("Insira sua temperatura: ");
 scanf("%f", &temperatura);
 
 
 
 if(temperatura >= 37.5){
     printf("você está com febre! \n");
 //V1 - O paciente esta com febre - proposta do slide
     
 }
 
 if(temperatura >=40){
     printf("-Febre: alta! \n");
    
 //V2- FEBRE ALTA
     
 }

 if(temperatura >= 38.1 && temperatura <= 39){
     printf("-Febre: baixa! Procure medicar-se para que a mesma não aumente. \n");
     //V3-FEBRE BAIXA
 }
 


 if(temperatura >= 37.6  && temperatura < 38.5){
    printf("-Febre: média! Procure medicar-se para que a mesma não aumente.");
    //V5- SE 38 A 40, Febre media
 }
 
  if(temperatura>= 37.5){
     printf("\n-Medicamentos como paracetamol e ibuprofeno podem ajudar a aliviar o desconforto \n");
     //MENSAGEM-GUIA SOBRE O QUE O PACIENTE DEVE REALIZAR EM SITUAÇÕES DE FEBRE ALTA
     
 }
 
  printf("-CUIDE-SE SEMPRE \n");
    return 0;
    
}
