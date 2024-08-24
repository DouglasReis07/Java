public class OperadoresRelacionais {
    public static void main(String[] args) {
        String nomeUm = "Douglas";
        String nomeDois = "Douglas";

        System.out.println(nomeUm == nomeDois);

        String nomeUmm = "Douglas";
        String nomeDoiss = new String("Douglas");

        System.out.println(nomeUm.equals(nomeDois));



        
        int numero1 = 1;
        int numero2 = 5;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("A nossa condiçao é verdadeira");
        }

        System.out.println("numeroUM é igual a numeroDOIS? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUM é diferente a numeroDOIS? " + simNao);
    }
    
}
