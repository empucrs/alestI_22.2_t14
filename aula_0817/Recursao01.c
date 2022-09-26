#include <stdio.h>
#include <stdlib.h>

int potencia(int, int);
int potenciaRecursiva(int, int);

int main(int argc, char * argv[]){

    int base = atoi(argv[1]);
    int expoente = atoi(argv[2]);

    printf("%d\n", potenciaRecursiva(base, expoente));


}

int potencia(int base, int expoente){

    if(expoente==0)        
        return 1;
    else{
        int resultado=1;
        while(expoente-->0)
            resultado*=base;
        return resultado;
    }

}

int potenciaRecursiva(int base, int expoente){

    if(expoente==0)        
        return 1;
    else{
        int resultado = base * potenciaRecursiva(base, expoente-1);
        return resultado;
    }

}