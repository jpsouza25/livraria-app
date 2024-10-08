public class Endereco {

    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String uf;
    private String numero;
    private String complemento;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void exibirDetalhes() {
        System.out.println("DETALHES DO ENDEREÇO");
        System.out.println("CEP: " + cep);
        System.out.println("Logradouro: " + logradouro);
        System.out.println("Bairro: " + bairro);
        System.out.println("Cidade: " + cidade);
        System.out.println("UF: " + uf);
        System.out.println("Número: " + numero);
        System.out.println("Complemento: " + complemento);
    }

}
