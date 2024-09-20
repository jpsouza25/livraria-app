public class App2 {
    
    public static void main(String[] args) {
        Endereco moradia = new Endereco();

        moradia.setBairro("Ilha do Retiro");
        moradia.setCep("50750-320");
        moradia.setCidade("Recife");
        moradia.setUf("PE");
        moradia.setNumero("100");
        moradia.setComplemento("Próximo ao Sport Club do Recife");

        // moradia.exibirDetalhes();


        Livro livro1 = new Livro();

        livro1.setPreco(50);
        livro1.setCapaDura(true);

        System.out.println("Preço (antes do desconto): " + livro1.getPreco());
        
        livro1.aplicarDesconto(0.1);

        System.out.println("Preço (depois do desconto): " + livro1.getPreco());

        livro1.exibirDetalhes();
    }

}
