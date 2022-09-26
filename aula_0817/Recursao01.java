public class Recursao01{
    public static void main(String[] args) {

        int base = Integer.parseInt(args[0]);
        int expoente = Integer.parseInt(args[1]);

        System.out.println(potenciaRecursiva(base, expoente));

    }

    private static int potencia(int base, int expoente){
        System.out.println(expoente);
        if(expoente==0){            
            System.out.println(expoente);
            return 1;
        }
        else{
            int resultado=1;
            while(expoente-->0)
                resultado*=base;
            System.out.println(expoente);
            return resultado;
        }

    }

    private static int potenciaRecursiva(int base, int expoente){
        
        if(expoente==0){
            
            return 1;
        }
        else{
            int resultado = base * potenciaRecursiva(base, expoente-1);
            System.out.println(expoente);
            return resultado;
        }
    }


}