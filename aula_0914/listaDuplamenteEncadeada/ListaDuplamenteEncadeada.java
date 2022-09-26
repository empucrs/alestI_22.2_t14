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
            return this.prox;
        }
        public void setPrev(Nodo referencia) {
            this.prev = referencia;
        }        
    }

    private Nodo inicio, fim;
    private int size;

    public ListaDuplamenteEncadeada(){
        clear();
    }

    public boolean add(int value){
        Nodo novoObjeto = new Nodo(value);

        if(isEmpty()){
            inicio=novoObjeto;            
        }
        else{
            fim.setProx(novoObjeto);
            novoObjeto.setPrev(fim);
        }
        fim=novoObjeto;
        size++;
        return true;
    }

    // remove o último elemento da lista
    public boolean remove(){
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (this.size==0);
    }

    public int getDoInicio(int idx){
        if( (idx>=0) && (idx<size) ){
            Nodo amyrKlink = inicio;
            while(idx>0){
                amyrKlink=amyrKlink.getProx();
                idx--;
            }
            return amyrKlink.getValor();
        }
        return -1;
    }

    public int getDoFim(int idx){
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
    }

    public void clear(){
        inicio=fim=null;
        size=0;
    }

    public boolean addAt(int idx, int value){
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
    }

    public boolean removeAt(int idx){
        
    }

    public boolean swapValor(int idx01, int idx02){
    }

    public boolean swapNodo(int idx01, int idx02){
    }

}