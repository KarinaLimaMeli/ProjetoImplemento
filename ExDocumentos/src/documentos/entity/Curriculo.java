package documentos.entity;

import documentos.entity.Documento;

import java.util.ArrayList;

public class Curriculo extends Documento {
    private String nome;
    private ArrayList<String> habilidades;


    public Curriculo(int numeroPaginas, String autor, String nome, ArrayList<String> habilidades) {
        super(numeroPaginas, autor);
        this.nome = nome;
        this.habilidades = habilidades;
    }

    public Curriculo(int numeroPaginas, String autor) {
        super(numeroPaginas, autor);

    }

    public Curriculo(String nome, ArrayList<String> habilidades) {
        this.nome = nome;
        this.habilidades = habilidades;
    }
}

