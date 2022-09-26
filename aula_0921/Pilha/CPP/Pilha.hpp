#ifndef PILHA_HPP
#define PILHA_HPP

class Pilha{

    private:
      int topo;
      int capacidade;
      int pilha[];
    public:
      Pilha(int size);
      bool push(int value);
      int pop();
      int top();
      int size();
      bool isEmpty();
      void clear();

};

#endif
