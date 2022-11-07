public class ArvoreBinariaDePesquisa {

    //nodo
    private class BinaryTreeNode{
        public int value;
        public BinaryTreeNode father;
        public BinaryTreeNode left, right;

        public BinaryTreeNode(int e){
            this.value=e;
            father=left=rigth=null;
        }
    }

    
    //raiz
    BinaryTreeNode root;
    //nElementos
    int nElementos;

    // -- MÉTODOS --
    public ArvoreBinariaDePesquisa(){
        clear();
    }

    public boolean isEmpty(){       
        return nElementos==0;
    }
    public int size(){        
        return nElementos;
    }
    public void clear(){
        // solucao que se apoia em garbage collector
        root=null;
        nElementos=0;
    }
    public int getRoot() throws Exception{
        if(root!=null)        
            return root.value;
        throw new Exception();
    }
    public void add(int e){
        // tem de revisitar para implementar        
    }
    public boolean remove(int e){
        // tem de revisitar para implementar        
        return false;
    }
    public int getLeft(int e){
        // tem de revisitar para implementar        
        return 0;
    }
    public int getRight(int e){
        // tem de revisitar para implementar        
        return 0;        
    }
    public int getParent(int e){
        // tem de revisitar para implementar        
        return 0;
    }
    public int[] positionsPre(){
        // tem de revisitar para implementar        
        return null;        
    }
    public int[] positionsCentral(){
        // tem de revisitar para implementar        
        return null;        
    }
    public int[] positionsPos(){
        // tem de revisitar para implementar        
        return null;        
    }
    public int[] positionsWidth(){
        // tem de revisitar para implementar        
        return null;        
    }
    public int level(int e){
        // tem de revisitar para implementar        
        return 0;        
    }
    public boolean contains(int e){
        // tem de revisitar para implementar        
        return false;        
    }
    public int height(){
        // tem de revisitar para implementar
        return 0;        
    }
    boolean isInternal(Integer e){
        // tem de revisitar para implementar        
        return false;        
    }
    boolean isExternal(Integer e){
        // tem de revisitar para implementar        
        return false;        
    }
    
}
