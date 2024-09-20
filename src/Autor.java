import java.time.LocalDate;

public class Autor {

    private String nome;
    private LocalDate dataNascimento;
    private String nacionalidade;
    private String biografia;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void exibirDetalhes() {
        System.out.println("DETALHES DO AUTOR");
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Biografia: " + biografia);
    }

}
