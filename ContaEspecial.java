public class ContaEspecial extends Conta {
    private PessoaFisica titular;
    private double limite;

    public ContaEspecial(PessoaFisica titular, String numConta, String agencia) {
        super(numConta, agencia);
        this.titular = titular;

    }

    public boolean sacar(double valor) {
        if (valor <= super.getSaldo() + this.limite && valor > 0) {
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

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}