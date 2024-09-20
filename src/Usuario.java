import java.time.LocalDate;

public class Usuario {

    private String nome;
    private LocalDate dataNascimento;
    private String cpf;
    private char sexo;
    private String email;
    private String senha;

    public Usuario() { }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    void cadastrar() {
        System.out.println("USUÁRIO CADASTRADO");
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("CPF: " + cpf);
        System.out.println("Sexo: " + sexo);
        System.out.println("E-mail: " + email);
        System.out.println("Senha: " + senha);
    }

    String login(String email, String senha) {
        if (this.email.equals(email) && this.senha.equals(senha)) {
            return "Usuário logado com sucesso!";
        }

        return "Credenciais inválidas!";
    }

}