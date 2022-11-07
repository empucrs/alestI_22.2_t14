public class ArvoreBinariaDePesquisa {

    //nodo
    private class BinaryTreeNode{
        public int value;
        public BinaryTreeNode father;
        public BinaryTreeNode left, right;

        public BinaryTreeNode(int e){
            this.value=e;
            father=left=right=null;
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
    private void add(int e, BinaryTreeNode ref) throws Exception{
        if(ref==null)
            throw new Exception();
        
        if(e <= ref.value){ // tem de ir para a esquerda
            if(ref.left==null)
                ref.left=new BinaryTreeNode(e);
            else
                add(e, ref.left);
        }
        else{ // tem de ir para a direita
            if(ref.right==null)
                ref.right=new BinaryTreeNode(e);
            else
                add(e, ref.right);
        }        

    }
    public void add(int e){
        if(nElementos==0)
            root=new BinaryTreeNode(e);
        else
            try{
                add(e, root);
            }
            catch(Exception exc){
                System.err.println("Elemento não pode ser inserido");
                return;
            }
        
        nElementos++;
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
    private int fillCentral(int [] vet, int pos, BinaryTreeNode ref){
        if(ref!=null){
            // visito o filho  da esquerda
            pos=fillCentral(vet, pos, ref.left);
            // visito a mim mesmo
            vet[pos]=ref.value;            
            pos++;
            // visito o filho da direita
            pos = fillCentral(vet, pos, ref.right);
        }
        return pos;
    }
    public int[] positionsCentral(){
        // tem de revisitar para implementar        
        if(nElementos==0)
            return null;

        int [] resultado = new int[nElementos];
        fillCentral(resultado, 0, root);

        return resultado;
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
