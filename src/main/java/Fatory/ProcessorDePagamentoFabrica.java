package Fatory;

public class ProcessorDePagamentoFabrica { // Essa classe aqui é a fabrica fatory porque? porque nela é uma abordagem muito melhor para encapsular a logica dos objetos concretos que ja forma criados
    public static ProcessoDePagamento criarProcessadorDePagamento(String metodo, String detalhesDeConta, String... detalhes) {
        return switch (metodo) {
            case "cartao-credito" -> new CartaoCreditoProcesso(detalhesDeConta, detalhes[0], detalhes[1], detalhes[2], detalhes[3]);
            case "Paypal" -> new PaypalProcesso(detalhesDeConta, detalhes[0]);
            default -> throw new IllegalArgumentException("Metodo de Pagamento desconhecido");




        };
    }

}

