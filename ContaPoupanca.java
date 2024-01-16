public class ContaPoupanca extends ContaCorrente {

    public ContaPoupanca(String numConta, String agencia, PessoaFisica titular) {
        super(numConta, agencia, titular);

    }

    public void rendimento() {
        // this.saldo *= 1.005;
        double rendimento = this.getSaldo() * 0.005;
        this.depositar(rendimento);
    }
}
