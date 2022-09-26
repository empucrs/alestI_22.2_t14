public class ListaDuplamenteEncadeada{

    private class Nodo{
        private int valor;
        private Nodo prox;
        private Nodo prev;
        public Nodo(int valor) {
            this.valor = valor;
            this.prox = null;
            this.prev = null;
        }
        public int getValor() {
            return valor;
        }
        public void setValor(int valor) {
            this.valor = valor;
        }
        public Nodo getProx() {
            return this.prox;
        }
        public void setProx(Nodo referencia) {
            this.prox = referencia;
        }        
        public Nodo getPrev() {
            return this.prev;
        }
        public void setPrev(Nodo referencia) {
            this.prev = referencia;
        }        
    }

    private Nodo inicio, fim;
    private int size;

    public ListaDuplamenteEncadeada(){
        clear();
        Nodo Header = new Nodo(0);
        Nodo Tailer = new Nodo(0);
        inicio=Header;
        fim=Tailer;
    }
    //funções de lista
    public void push(int e){
        add(e);
    }

    public Nodo pop(){
        if(size==0)
            return null;
        else{
            Nodo nodo=fim.getPrev();
            nodo.getPrev().setProx(fim);
            fim.setPrev(nodo.getPrev());
            nodo.setPrev(null);
            nodo.setProx(null);
            size--;
            return nodo;
        }
    }

    public Nodo top(){
        if(size==0)
            return null;
        else{
            Nodo nodo=fim.getPrev();
            return nodo;
        }
    }
    
    public boolean add(int value){
        Nodo novoObjeto = new Nodo(value);

        novoObjeto.setPrev(fim.getPrev());
        novoObjeto.setProx(fim);
        fim.getPrev().setProx(novoObjeto);
        fim.setPrev(novoObjeto);
        size++;
        return true;
    }

    // remove o último elemento da lista
    public boolean remove(){
        return true;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (this.size==0);
    }

    public Nodo getDoInicio(int idx){
        if( (idx>=0) && (idx<size) ){
            Nodo amyrKlink = inicio.getProx();
            while(idx>1){
                amyrKlink=amyrKlink.getProx();
                idx--;
            }
            return amyrKlink();
        }
        else
            return null;
    }

    /*public int getDoFim(int idx){
        if( (idx>=0) && (idx<size) ){
            int novoIdx = (size-1)-idx;
            Nodo amyrKlink = fim;
            while(novoIdx>0){
                amyrKlink=amyrKlink.getPrev();
                novoIdx--;
            }
            return amyrKlink.getValor();

        }
        return -1;
    }*/

    public void clear(){
        inicio=fim=null;
        size=0;
    }

    /*public boolean addAt(int idx, int value){
        if((idx>=0) && (idx<=size)){

            if(idx==0){
                if(isEmpty())
                  add(value);
                else{
                    Nodo novoNodo = new Nodo(value);
                    inicio.setPrev(novoNodo);
                    novoNodo.setProx(inicio);
                    inicio=novoNodo;
                    size++;
                }
            }
            else if(idx==size()){
                add(value);
            }
            else{
                Nodo amyrKlink = inicio;
                while(idx>0){
                    amyrKlink=amyrKlink.getProx();
                    idx--;
                }
                Nodo novoObjeto = new Nodo(value);
                novoObjeto.setProx(amyrKlink);
                novoObjeto.setPrev(amyrKlink.getPrev());
                amyrKlink.setPrev(novoObjeto);
                novoObjeto.getPrev().setProx(novoObjeto);

                size++;
            }
            

            return true;
        }
        return false;
    }*/

    public boolean removeAt(int idx){
        return false;
        
    }

    public boolean swapNodo(int idx01, int idx02){

        if(idx01==idx02 || idx01<0 || idx02<0 || idx01>=size || idx02>=size)
            return false;
        
        Nodo A, B, proxA, prevA, proxB, prevB;
        A=getDoInicio(idx01);
        B=getDoInicio(idx02);

        //swap nodos do meio
        proxA=A.getProx();
        prevA=A.getPrev();
        proxB=B.getProx();
        prevB=B.getPrev();
      

        prevA.setProx(B);
        proxA.setPrev(B);
        prevB.setProx(A);
        proxB.setPrev(A);
        A.setPrev(prevB);
        A.setProx(proxB);
        B.setPrev(prevA);
        B.setProx(proxA);

        return true;
    }

    public boolean swapValor(int idx01, int idx02){
        return false;
    }

}