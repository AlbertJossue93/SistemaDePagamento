package Fatory;
// FABRICA EXPLICITA
public class Main {
    public static void main(String[] args) {
     ProcessoDePagamento processador = ProcessorDePagamentoFabrica.criarProcessadorDePagamento("cartao-credito","ContaN°", "1234-5678-9012-3456" , "Albert Ojeda", "12/25","025");
     processador.ProcessarPagamento(150.50);
     ProcessoDePagamento proces = ProcessorDePagamentoFabrica.criarProcessadorDePagamento("Paypal", "contaN°2", "albertjossue20@gmail.com");
     proces.ProcessarPagamento(300.70);
    }
}

// Duvidas da Fabrica Explicita que é uma abordagem completa do fatory method,
//  ao usar o ProcessorDePagamentoFabrica,  encapsulamos a lógica de criação dos objetos, deixando a classe main mais limpa e organizada.
//  Esse é o objetivo do padrão Factory Method: separar a lógica de criação dos objetos da lógica de uso dos objetos, promovendo um código mais modular, extensível e fácil de manter.