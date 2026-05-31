public class Livro {
//Atributos
    private String titulo;
    private String autor;
    private int totalPaginas;
//Construtor

    public Livro(String titulo, String autor, int totalPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
    }

//Getters e Setters


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        if (totalPaginas > 0) this.totalPaginas = totalPaginas;
    }

//Metodos

    public void mostrarDetalhes(){
        System.out.printf("Titulo: %s\nAutor: %s\nTotal de paginas:%d\n",titulo,autor,totalPaginas);
    }
}
