public class PessoaJuritica extends Pessoa{
    private String cnpj;

    public PessoaJuritica(String cnpj, String nome, String telefone, String endereco) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
