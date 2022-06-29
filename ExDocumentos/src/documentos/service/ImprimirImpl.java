package documentos.service;

import documentos.entity.Documento;

public class ImprimirImpl implements Imprimir {

    @Override
    public String imprimir(Documento documento) {
        return "imprimindo";
    }
}
