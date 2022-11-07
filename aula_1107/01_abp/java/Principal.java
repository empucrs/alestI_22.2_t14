public class Principal {

    public static void main(String[] args) {

        ArvoreBinariaDePesquisa abp = new ArvoreBinariaDePesquisa();
        abp.add(10);
        abp.add(5);
        abp.add(15);
        abp.add(8);
        abp.add(12);

        int [] vetor = abp.positionsCentral();
        for (int i : vetor)
            System.out.print(i+", ");            
        System.out.println();
        
    }

}