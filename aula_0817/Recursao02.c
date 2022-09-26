#include <stdio.h>
#include <stdlib.h>

int inversaoRecursivaA(int*, int, int);
int inversaoRecursivaB(int*, int, int);
void imprime(int*, int);


int main(int argc, char * argv[]){

    int tamVet = atoi(argv[1]);
    int vetor[tamVet];
    for(int i=0; i<tamVet; i++)
        vetor[i]=i+1;

    imprime(vetor, tamVet);
    inversaoRecursivaB(vetor, 0, tamVet-1);
    imprime(vetor, tamVet);


}
void imprime(int *vet, int tamVet){
    for(int i=0; i<tamVet; i++)
      printf("%d\n", vet[i]);
    printf("-=-=-=-=-==-\n");
}

int inversaoRecursivaA(int vet [], int idxL, int idxR){

        if(idxL<idxR){
            int aux=vet[idxL];
            vet[idxL]=vet[idxR];
            vet[idxR]=aux;
            inversaoRecursivaA(vet, idxL+1, idxR-1);
        }
}

int inversaoRecursivaB(int vet[], int indice, int tamVet){

    if(indice<tamVet/2){
        int aux=vet[indice];
        vet[indice]=vet[(tamVet-1)-indice];
        vet[(tamVet-1)-indice]=aux;
        inversaoRecursivaB(vet, indice+1, tamVet);
    }


}
