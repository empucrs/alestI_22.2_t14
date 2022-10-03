public class Principal {

    public static void main(String[] args) {
        MyArrayList mal01 = new MyArrayList(4);
        mal01.insere( 4);
        mal01.insere(12);
        mal01.insere( 7);
        mal01.insere(30);
        mal01.insere(20);
        mal01.insere(59);
        mal01.insere(28);

        MyArrayList mal02 = new MyArrayList(4);
        mal02.insere(50);
        mal02.insere( 7);
        mal02.insere( 4);
        mal02.insere(21);
        mal02.insere(33);

        //busca menor valor qualquer
        boolean encontrouInterseccao=false;
        int valor=0;
        for(int i=0; i<mal01.quantidade(); i++)
            for(int j=0; j<mal02.quantidade(); j++){
                if(mal01.consulta(i)==mal02.consulta(j))
                    if(encontrouInterseccao==false){
                        valor=mal02.consulta(j);
                        encontrouInterseccao=true;
                    }
                    else{
                        if(valor<mal02.consulta(j))
                            valor=mal02.consulta(j);
                    }
            }
        

        if(encontrouInterseccao){
            System.out.println("Há valor de intersecção e o maior encontrado foi "+valor);
        }
        else
            System.out.println("Não foi encontrado valor de intersecção");
        
        

    }

    public static void debug01(MyArrayList mal){
        System.out.println("\n-=-=-=-=-=-=-=-=-=-");
        System.out.println("Nro de elementos na lista: "+mal.quantidade());
        System.out.println("Capacidade da lista: "+mal.capacidade());
        System.out.println("Elementos na lista: ");
        for(int i=0; i<mal.quantidade(); i++)
            System.out.print(mal.consulta(i)+", ");
        
        System.out.println();
    }
    
}