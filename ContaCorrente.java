public class ContaCorrente extends Conta{
    private PessoaFisica titular;
    
    public ContaCorrente(String numConta, String agencia, PessoaFisica titular){
        super(numConta, agencia);
        this.titular = titular;
    }
    
    public boolean sacar(double valor) {
        if (valor <= super.getSaldo() && valor > 0) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }
    public PessoaFisica getTitular() {
        return titular;
    }
    public void setTitular(PessoaFisica titular) {
        this.titular = titular;
    }
}
