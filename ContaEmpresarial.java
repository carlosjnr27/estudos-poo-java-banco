public class ContaEmpresarial extends Conta {
    private PessoaJuritica titular;
    private double limite; //cheque-especial

    public ContaEmpresarial(String numConta, String agencia, PessoaJuritica titular, double limite) {
        super(numConta, agencia);
        this.titular = titular;
        this.limite = limite;
        
    }

    public boolean sacar(double valor) {
        if(valor <= super.getSaldo() + this.limite && valor > 0){
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }

    public PessoaJuritica getTitular() {
        return titular;
    }

    public void setTitular(PessoaJuritica titular) {
        this.titular = titular;
    }

    public double getLimite() {
        return limite;
    }
    
    public void setLimite(double limite) {
        this.limite = limite;
    }
}