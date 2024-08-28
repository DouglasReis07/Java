public class CaixaEletronico {
    public static void main(String[] args) {
        
        double saldo = 25.0;
        double ValorSolicitado = 26.0;

        if (ValorSolicitado < saldo)
            saldo = saldo - ValorSolicitado;

        System.out.println("O saldo é de R$" + saldo  + " Reais");
    }
}
