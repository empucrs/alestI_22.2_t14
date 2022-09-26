public class Lista{

    int armazenamento[];
    int prox;

    public Lista(){
        armazenamento = new int[10];
        prox=0;
    }

    public boolean add(int value){
        if(! isFull() ){
            armazenamento[prox]=value;
            prox++;
            return true;
        }
        else
            return false;
    }

    public int size(){
        return prox;
    }

    public boolean isEmpty(){
        return (prox==0);
    }

    public boolean isFull(){
        return(prox==armazenamento.length);
    }

    public int capacity(){
        return armazenamento.length;
    }
    public int get(int pos){
        if((pos<prox)&&(pos>=0)){
            return armazenamento[pos];
        }
        else
            return armazenamento[0];
    }
    public void clear(){
        prox=0;
    }

}