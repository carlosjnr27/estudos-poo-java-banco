public class PessoaFisica extends Pessoa{
  
    private String cpf;

    public PessoaFisica(String nome, String cpf, String endereco, String telefone) {
        super(nome, endereco, telefone);
        this. cpf = cpf;
    }
    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
