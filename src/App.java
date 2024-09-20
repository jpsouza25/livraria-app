import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario usuario1 = new Usuario();

        usuario1.setNome("Alexandre");
        usuario1.setCpf("123456789-00");
        usuario1.setDataNascimento(LocalDate.of(2024, 6, 26));;
        usuario1.setEmail("alex@treina.com");
        usuario1.setSenha("1234");
        usuario1.setSexo('M');

        usuario1.cadastrar();

        System.out.println(usuario1.login("alex@treina.com", "1234"));
    }
}
