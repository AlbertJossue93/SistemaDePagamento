package Fatory;

public class PaypalProcesso extends  ProcessoDePagamento {
    private String email;

    public PaypalProcesso(String detalhesDeConta, String email){
        super(detalhesDeConta);
        this.email = email;
    }

    @Override
    public void ProcessarPagamento(double quantidade) { // Polimorfismo de sobreposiçao mesma assinatura classes diferentes
        //Logica de processo de pagamento de paypal por email

        System.out.println("processando pagamento de: " + quantidade + " com Paypal ");
        System.out.println("Email do Paypal: "  + email );
    }
}
