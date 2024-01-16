public abstract class Conta {
    private String numConta;
    private String agencia;
    private double saldo;

    public Conta(String numConta, String agencia) {
        this.numConta = numConta;
        this.agencia = agencia;
        this.saldo = 0.0;

    }
    
    public boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        } else {
            System.out.println("ERRO!");
            return false;
        }
    }
    
    public abstract boolean sacar(double valor);
    
    public boolean transferir(ContaCorrente contaDestino, double valor) {
        if (this.sacar(valor)) {
            if (contaDestino != null && contaDestino.depositar(valor)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean transferir(ContaPoupanca contaDestino, double valor) {
        if (this.sacar(valor)) {
            if (contaDestino != null && contaDestino.depositar(valor)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean transferir(ContaEspecial contaDestino, double valor) {
        if (this.sacar(valor)) {
            if (contaDestino != null && contaDestino.depositar(valor)) {
                return true;
            }
            return false;
        }
        return false;
    }
    public boolean transferir(ContaEmpresarial contaDestino, double valor) {
        if (this.sacar(valor)) {
            if (contaDestino != null && contaDestino.depositar(valor)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void extrato() {
        System.out.println("Saldo: " + this.getSaldo());
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
