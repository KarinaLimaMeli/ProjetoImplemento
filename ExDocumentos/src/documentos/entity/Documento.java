package documentos;

public abstract class Documento {

    private int numeroPaginas;
    private String autor;

    public Documento() {
    }

    public Documento(int numeroPaginas, String autor) {
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
    }

}
