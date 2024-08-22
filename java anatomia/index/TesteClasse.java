public class TesteClasse {
    public static void main (String [] args) {
        String primeiroNome ="Douglas";
        String segundoNome = "Reis";

        String nomeCompleto = nomecompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
        public static String nomecompleto (String primeiroNome, String segundoNome) {
            return "Resultado do método é " + primeiroNome.concat(" ").concat(segundoNome);
        }
}

