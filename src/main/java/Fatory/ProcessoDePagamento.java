package Fatory;

public  abstract class ProcessoDePagamento { // classe absratata (fatory)
    protected String detalhesDeConta;

    public ProcessoDePagamento(String detalhesDeConta){
        this.detalhesDeConta = detalhesDeConta;
    }

    public abstract void ProcessarPagamento(double quantidade); // recebe um parametro
    // metodo da classe absratata(methodd)



}
