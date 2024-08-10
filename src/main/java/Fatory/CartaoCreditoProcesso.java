package Fatory;

public class CartaoCreditoProcesso extends  ProcessoDePagamento {
    private String numeroDeCartao;
    private String nomeDoTitular;
    private String dataDeVencimento;
    private String cvv;

   public CartaoCreditoProcesso(String detalhesDeConta, String numeroDeCartao, String nomeDoTitular, String dataDeVencimento, String cvv){
       super(detalhesDeConta);
       this.numeroDeCartao = numeroDeCartao;
       this.nomeDoTitular = nomeDoTitular;
       this.dataDeVencimento = dataDeVencimento;
       this.cvv = cvv;
   }

    @Override
    public void ProcessarPagamento(double quantidade) {
        // simulaçao de logica , nesse caso aqui iria ocorrer a logica do processo.

        System.out.println("Processando pagamento: " + quantidade + " com Cartao de credito ");
        System.out.println("Detalhes da cartao: " + numeroDeCartao + "," + nomeDoTitular + "," + dataDeVencimento + "," + cvv );
    }
}
