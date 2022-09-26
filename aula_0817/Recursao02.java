import javax.imageio.ImageIO;

public class Recursao02 {

    public static void main(String[] args) {

        int parametro = Integer.parseInt(args[0]);
        int vetor[] = new int [parametro];
        for(int i=0; i<vetor.length; i++)
            vetor[i]=i+1;
        imprime(vetor);

        //System.out.println(vetor);
        inversaoRecursivaB(vetor, 0, parametro-1);
        imprime(vetor);

    }

    private static void imprime(int [] vet){
        for(int i : vet)
            System.out.println(i);
        System.out.println("-=-=-=-=-");
    }

    private static void inversaoRecursiva(int vet[]){
        inversaoRecursiva(vet, 0);
    }

    private static void inversaoRecursiva(int vet[], int indice){

        if(indice<vet.length/2){
            int aux=vet[indice];
            vet[indice]=vet[(vet.length-1)-indice];
            vet[(vet.length-1)-indice]=aux;
            inversaoRecursiva(vet, indice+1);
        }


    }
    
    private static void inversaoRecursiva(int vet[], int indice, int tamVet){

        if(indice<tamVet/2){
            int aux=vet[indice];
            vet[indice]=vet[(tamVet-1)-indice];
            vet[(tamVet-1)-indice]=aux;
            inversaoRecursiva(vet, indice+1);
        }


    }
    
    private static void inversaoRecursivaB(int vet[], int idxL, int idxR){

        if(idxL<idxR){
            int aux=vet[idxL];
            vet[idxL]=vet[idxR];
            vet[idxR]=aux;
            inversaoRecursivaB(vet, idxL+1, idxR-1);
        }


    }
    
}
