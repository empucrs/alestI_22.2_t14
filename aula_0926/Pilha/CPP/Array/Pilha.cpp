#include "Pilha.hpp"

Pilha::Pilha(int size){
    if(size<=0)
        size=10;
    this->pilha=new int[size];
    this->topo=0;
    this->capacidade=size
}

bool Pilha::push(int value){

}

int  Pilha::pop(){
    
}

int  Pilha::top(){    
    if(topo>0)
      return pilha[topo-1];
    else
      return -1;
}

int  Pilha::size(){
    return this->topo;
}

bool Pilha::isEmpty(){
    return(this->topo==0);
    
}

void Pilha::clear(){
    this->topo=0;
    delete this->pilha;    
    this->pilha=new int[10];
}