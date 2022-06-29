package documentos.entity;

public class Livro extends Documento {


    private String autor;
    private String titulo;
    private String genero;


    public Livro(int numeroPaginas, String autor, String autor1, String titulo, String genero) {
        super(numeroPaginas, autor);
        this.autor = autor1;
        this.titulo = titulo;
        this.genero = genero;
    }
}

