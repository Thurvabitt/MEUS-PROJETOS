#include <stdio.h>

void MostraMenu();
void soma2Mostra(int n1, int n2);
int soma2(int n1, int n2);


int main()
{
    int resp,x,y,z;
    int a[3] = {0,1,2};
    
    printf("%d \n", a[0]);
    printf("%d \n", a[1]);
    printf("%d \n", a[2]);
    
    
    x = 10;
    y = 20;
    z = 30;
    
    
    MostraMenu();
    
    soma2Mostra(x,y);
    soma2Mostra(x,z);
    soma2Mostra(z,y);
    soma2Mostra(a[0], a[1]);
    
    resp = soma2(x,y);
 
    MostraMenu();
    return 0;
}


/*Void nos permite azer funões que não retornam nada e funções que não tem parâmetros*/
void MostraMenu(){
    printf("\nBem-vindo, para ajuda aperte: F1 \n");
}


void soma2Mostra(int n1, int n2){
    int resp;
    resp = n1 + n2;
    printf("n1 + n2 = %d \n", resp);
}


int soma2(int n1, int n2){
    int resp;
    resp = n1 + n2;
    return resp;
}