public class Editora {

    private String nome;
    private int anoFundacao;
    private String telefone;
    private String email;
    private String website;
    private String facebook;
    private String instagram;
    private String twitter;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
    
    public void exibirDetalhes() {
        System.out.println("DETALHES DA EDITORA");
        System.out.println("Nome: " + nome);
        System.out.println("Fundação: " + anoFundacao);
        System.out.println("Telefone: " + telefone);
        System.out.println("Website: " + website);
        System.out.println("Facebook: " + facebook);
        System.out.println("Instagram: " + instagram);
        System.out.println("Twitter: " + twitter);
    }


}
