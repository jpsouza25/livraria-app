public class App3 {
    
    public static void main(String[] args) {
        Autor autor = new Autor();

        autor.setNome("J.K. Rowling");
        autor.setNacionalidade("Britânica");

        Editora editora = new Editora();

        editora.setNome("Treina Recife");

        Livro livro = new Livro();

        livro.setTitulo("Harry Potter");
        livro.setAnoLancamento(1995);
        livro.setCapaDura(true);
        livro.setIsbn("1234567890-XYZ");
        livro.setGenero("Fantasia");
        livro.setPreco(52.5);
        livro.setAutor(autor);
        livro.setEditora(editora);

        livro.exibirDetalhes();
    }

}
