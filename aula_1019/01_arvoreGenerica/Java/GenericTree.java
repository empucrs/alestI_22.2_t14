public class GenericTree{

    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    //NODO BASICO PARA A CONSTRUÇÃ DA ÁRVORE
    private class TreeNode{
        public int value;
        public TreeNode father;
        private TreeNode [] children;
        private int nChild;

        public TreeNode (Integer element){
            father=null;
            children=new TreeNode[10];
            value=element;
            nChild=0;
        }
        public void addSubtree (TreeNode n){
            if(nChild==children.length)
                grow();
            children[nChild] = n;
            n.father=this;
            nChild++;
        }
        private void grow(){
            TreeNode aux [] = new TreeNode[children.length*2];
            for(int i=0; i<children.length; i++)
              aux[i]=children[i];
            children=aux;            
        }
        boolean removeSubtree(TreeNode n){
            return true;
        }
        // busca subtree pelo indice dentro da lista de filhos
        TreeNode getSubtree(int i){
            if(i>=0 && i<nChild)
              return children[i];
            return null;
        }
        //retorna o número de filhos
        int getSubtreeSize(){
            return nChild;
        }  
    }
    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=



    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // ATRIBUTOS E MÉTODOS DA ÁRVORE
    private TreeNode root;
    private int nElements;

    public GenericTree(){
        this.root=null;
        this.nElements=0;
    }


    // método privado elaborado na versão 0.2
    private TreeNode searchNode(Integer value, TreeNode ref){

        if(ref!=null){
            if(ref.value==value)
                return ref;
            else{
                TreeNode aux=null;
                for(int i=0; i<ref.getSubtreeSize(); i++){
                    aux=searchNode(value, ref.getSubtree(i));
                    if(aux != null)
                        return aux;
                }
                return null;
            }
        }
        else
            return null;

    }

    //insere o elemento e como filho de father
    // Versao 0.1 -> Inclui root e inclui filho de root
    // Versao 0.2 -> Permite a inclusão de mais níveis na árvore
    public boolean add(Integer e, Integer father){
        TreeNode aux;
        if(nElements==0){
            this.root=new TreeNode(e);
        }
        else{
            aux = searchNode(father, root);
            if(aux==null)
                return false;
            else
                aux.addSubtree(new TreeNode(e));
        }
        nElements++;

        return true;
    }

    //retorna o elemento armazenado na raiz
    public Integer getRoot(){
        if(root!=null)
            return root.value;
        return null;
    }

    //altera o elemento armazenado na raiz
    public void setRoot(Integer e){
        if((e!=null) && (root!=null)){
            root.value=e;
        }

        
    }

    //retorna o pai do elemento e
    Integer getParent(Integer e){
        return 0;
    }

    //remove o elemento e e seus filhos
    boolean removeBranch(Integer e){
        return true;
    }

    //retorna true se a árvore contém o elemento e    
    boolean contains(Integer e){
        return true;
    }

    //retorna true se o elemento está armazenado em um nodo interno
    boolean isInternal(Integer e){
        return true;
    }

    //retorna true se o elemento está armazenado em um nodo externo
    boolean isExternal(Integer e){
        return true;
    }

    //retorna true se o elemento e está armazenado na raiz
    boolean isRoot(Integer e){
        if((root!=null)&&(e!=null)&&(root.value==e))
            return true;
        return false;
    }

    //retorna true se a árvore está vazia    
    boolean isEmpty(){
        return (nElements==0);
    }

    //retorna o número de elementos armazenados na árvore
    int size(){
        return nElements;
    }
    //remove todos os elementos da árvore
    void clear(){
        //requer navegação
        //ou solução baseada em garbage collector
        root=null;
        nElements=0;
    }

    //retorna uma lista com todos os elementos da árvore na ordem pré-fixada
    int [] positionsPre(){
        return null;
    }
    
    //retorna uma lista com todos os elementos da árvore na ordem pos-fixada
    int [] positionsPos(){
        return null;
    }

    //retorna uma lista com todos os elementos da árvore com um caminhamento em largura
    int [] positionsWidth(){
        return null;
    }

    public void doTheString(){

        printValue(root);

    }

    private void printValue(TreeNode ref){

        if(ref!=null){
            System.out.print(ref.value+"; ");
            for(int i=0; i<ref.getSubtreeSize(); i++)
                printValue(ref.getSubtree(i));
        }

    }

}