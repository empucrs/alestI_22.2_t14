package pilhas;

import java.lang.NullPointerException;
import java.util.Arrays;

public class Pilha {
    private int pilha[];
    private int topo; // representa a PRÓXIMA posição "vazia"
    // private int capacidade; // em C seria necessário um atributo para armazenar o tamanho do array

    public Pilha () {
        this(10);
    }
    
    public Pilha (int size) {
        final int TAMANHO_PADRAO = 10;
        if (size <= 0) { size = TAMANHO_PADRAO; } // se size for inválido, atribuir tamanho padrão
        this.pilha = new int[size];

        this.topo = 0;
    }

    public void push (int value) {
        if (isFull()) { grow(); }

        pilha[topo] = value;
        topo++;
    }

    public int pop () throws NullPointerException {
        int value = top(); // obter o primeiro elemento da pilha para retornar
        topo--; // "remover" o primeiro elemento da pilha
    
        return value;
    }

    public int top () throws NullPointerException {
        if (topo > 0)
            return pilha[topo-1];
        else
            throw new NullPointerException("Cannot access the top of an empty stack.");
    }

    public int size () {
        return this.topo;
    }

    public boolean isEmpty () {
        return this.topo == 0;
    }

    public void clear () {
        topo = 0;
        // em C, não há gc, então esse trabalho precisaria ser feito manualmente aqui
    }

    private boolean isFull () {
        return size() == pilha.length;
    }

    private void grow() {
        pilha = Arrays.copyOf(pilha, pilha.length*2); // O(n), pois precisa percorrer todo o array, copiando
    }
}
