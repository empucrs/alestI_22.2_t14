public class Principal {

    public static void main(String[] args) {
        MyArrayList mal = new MyArrayList(4);

        System.out.println("\n-=-=-=-=-=-=-=-=-=-");
        System.out.println("Nro de elementos na lista: "+mal.quantidade());
        mal.insere(5);
        debug01(mal);
        mal.insere(6);
        debug01(mal);
        mal.insere(7);
        debug01(mal);
        mal.insere(8);
        debug01(mal);
        mal.insere(9);
        debug01(mal);
        mal.insere(10);
        debug01(mal);
        mal.insere(11);
        debug01(mal);
        mal.insere(12);
        debug01(mal);
        mal.insere(13);
        debug01(mal);

        mal.removeByIndex(mal.quantidade()-1);
        debug01(mal);
        mal.removeByIndex(mal.quantidade()-1);
        debug01(mal);
        mal.removeByIndex(mal.quantidade()-1);
        debug01(mal);
        mal.removeByIndex(mal.quantidade()-1);
        debug01(mal);
        mal.removeByIndex(mal.quantidade()-1);
        debug01(mal);
        mal.removeByIndex(mal.quantidade()-1);
        debug01(mal);
        mal.removeByIndex(mal.quantidade()-1);
        debug01(mal);
        mal.removeByIndex(mal.quantidade()-1);
        debug01(mal);
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