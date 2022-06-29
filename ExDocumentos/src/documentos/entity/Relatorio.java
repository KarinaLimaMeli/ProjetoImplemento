package documentos.entity;

public class Relatorio extends Documento {

    private String textoComprimento;
    private String autor;
    private String revisor;


    public Relatorio(int numeroPaginas, String autor, String textoComprimento, String autor1, String revisor) {
        super(numeroPaginas, autor);
        this.textoComprimento = textoComprimento;
        this.autor = autor1;
        this.revisor = revisor;
    }
}
