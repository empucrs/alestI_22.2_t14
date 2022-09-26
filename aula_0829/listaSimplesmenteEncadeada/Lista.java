public class ListaEncadeada{

    private class nodo{
        private int valor;
        private nodo referencia;
        public nodo(int valor) {
            this.valor = valor;
            this.referencia = null;
        }
        public int getValor() {
            return valor;
        }
        public void setValor(int valor) {
            this.valor = valor;
        }
        public nodo getReferencia() {
            return referencia;
        }
        public void setReferencia(nodo referencia) {
            this.referencia = referencia;
        }        
    }

    private nodo inicio, fim;
    private int size;


    public ListaEncadeada(){
        clear();
    }

    public boolean add_On(int value){
        if(isEmpty()){
            inicio = new nodo(value);
            size++;
        }
        else{            
            nodo amyrKlink = inicio;
            while(amyrKlink.getReferencia()!=null)
                amyrKlink=amyrKlink.getReferencia();
            nodo auxiliar = new nodo(value);
            amyrKlink.setReferencia(auxiliar);
            size++;
        }
    }

    public boolean add_O1(int value){
        if(isEmpty()){
            fim  = inicio = new nodo(value);
            size++;
        }
        else{            
            nodo auxiliar = new nodo(value);
            fim.setReferencia(auxiliar);
            fim = auxiliar;
            size++;
        }
    }

    public boolean remove(int pos){
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (size==0);
    }

    public int get(int pos){
        if((pos>=0) && (pos<size)){
            nodo amyrKlink=inicio;
            while(pos>0){
                amyrKlink=amyrKlink.getReferencia();
                pos--;
            }
            return amyrKlink.getValor();
        }
        else
            return -1;

    }

    public void clear(){
        inicio=fim=null;
        size=0;
    }

}