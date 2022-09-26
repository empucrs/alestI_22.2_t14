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
            fim = inicio = new nodo(value);
            size++;
        }
        else{            
            nodo amyrKlink = inicio;
            while(amyrKlink.getReferencia()!=null)
                amyrKlink=amyrKlink.getReferencia();
            nodo auxiliar = new nodo(value);
            amyrKlink.setReferencia(auxiliar);
            fim = amyrKlink;
            size++;
        }
    }

    public boolean add_O1_fim(int value){
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

    public boolean add_01_inicio(int value){

        if(isEmpty()){
            fim  = inicio = new nodo(value);
            size++;
        }
        else{
            nodo auxiliar = new nodo(value);
            auxiliar.setReferencia(inicio);
            inicio=auxiliar;
            size++;
        }


    }

    public boolean add_01_inicio_Alternativo(int value){

        size++;
        nodo auxiliar = new nodo(value);
        
        if(isEmpty())
            fim  = inicio = auxiliar;
        else{
            auxiliar.setReferencia(inicio);
            inicio=auxiliar;
        }
    }

    public boolean remove(int pos){

        //1. confere se pos é valido
        //1.1 se for válida entao
        if(pos>=0 && pos<size){
        //  --> achar o nodo da posicao pos (nodoPos)
        //  --> nodoAnterior ao nodoPos (nodoAnt)
        //  --> Passar ref do nodoPos para referencia do nodoAnt
            if(pos>0){
                nodo nodoAnt, nodoPos;
                nodoAnt=inicio;
                while(pos>1){
                    nodoAnt=nodoAnt.getReferencia();
                    pos--;
                }
                nodoPos=nodoAnt.getReferencia();
                nodoAnt.setReferencia(nodoPos.getReferencia());
                nodoPos.setReferencia(null);
                nodoPos=null;
            }
            else{
                nodo nodoPos = inicio;
                inicio = inicio.getReferencia();
                nodoPos.setReferencia(null);
                nodoPos=null;
            }

            size--;

            return true;
        }
        else
        //1.2 se não for válida (return false)
            return false;



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