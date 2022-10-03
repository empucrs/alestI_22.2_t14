public class MyArrayList {

    private int capacidade;
    private int nElementos;
    private int lista[];

    public MyArrayList(int _capacitade){
        if(_capacitade<=0)
            _capacitade=10;
        this.capacidade=_capacitade;

        this.lista = new int[this.capacidade];
        this.nElementos=0;
    }

    public boolean insere(int valor){
        if(this.nElementos==this.capacidade)
            grow();

        this.lista[this.nElementos]=valor;
        this.nElementos++;
        return true;
    }

    private void grow(){
        int [] novoVetor = new int[this.lista.length*2];
        for(int i=0; i<this.lista.length; i++)
            novoVetor[i]=this.lista[i];
        this.lista=novoVetor;
        this.capacidade=novoVetor.length;
    }

    public boolean remove(){
        if(this.nElementos==0)
            return false;

        this.nElementos--;
        tryToShrink();
        return true;
    }

    public int quantidade(){
        return this.nElementos;
    }

    public int capacidade(){
        return this.lista.length;
    }

    public int consulta(int pos){
        if((pos<0) || (pos>=this.nElementos))
            throw new IndexOutOfBoundsException("MyArrayList index out of bound");
        return this.lista[pos];
    }

    public int alterar(int pos, int valor){
        if((pos<0) || (pos>=this.nElementos))
            throw new IndexOutOfBoundsException("MyArrayList index out of bound");
        return this.lista[pos];
    }

    public boolean removeByIndex(int pos){
        if((pos<0)||(pos>=this.nElementos))
            return false;
        for(int i=pos; i<this.nElementos-1;i++)
            this.lista[pos]=this.lista[pos+1];
        this.nElementos--;
        tryToShrink();
        return true;
    }

    private void tryToShrink(){
        if(this.nElementos<=(this.lista.length/4)){
            int novoTamanho=((this.lista.length/2)<4)?4:this.lista.length/2;
            if(novoTamanho!=this.lista.length){
                int [] novoVetor = new int[novoTamanho];
                for(int i=0; i<novoVetor.length; i++)
                    novoVetor[i]=this.lista[i];
                this.lista=novoVetor;
            }
        }
    }    
}