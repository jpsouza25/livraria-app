public class Livro {

    private String titulo;
    private Autor autor;
    private String genero;
    private String isbn;
    private Editora editora;
    private int anoLancamento;
    private double preco;
    private boolean capaDura;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isCapaDura() {
        return capaDura;
    }

    public void setCapaDura(boolean capaDura) {
        this.capaDura = capaDura;
    }

    public double aplicarDesconto(double porcentagem) {
        if (preco < 20) {
            return preco;
        }

        // cálculo do desconto
        double desconto = porcentagem * preco;

        // atualiza o preco do livro
        preco -= desconto;

        return desconto;
    }

    public void exibirDetalhes() {
        System.out.println("DETALHES DO LIVRO: ");
        System.out.println("Título: " + titulo);
        System.out.println("Gênero: " + genero);
        System.out.println("ISBN: " + isbn);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("É capa dura? " + (capaDura ? "SIM" : "NÃO"));
        autor.exibirDetalhes();
        editora.exibirDetalhes();
    }

}
