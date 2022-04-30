package calculosAspectosLaborales;

import excepciones.AtributoInvalidoException;

public class CargaHorariaFactory {

    public I_CargaHoraria getCargaHoraria(String cargaHoraria) throws AtributoInvalidoException {
        if (cargaHoraria.equalsIgnoreCase("Media"))
            return (Media) new Media();
        if (cargaHoraria.equalsIgnoreCase("Completa"))
            return (Completa) new Completa();
        if(cargaHoraria.equalsIgnoreCase("Extendida"))
            return (Extendida) new Extendida();
        throw new AtributoInvalidoException("Atributo Carga Horaria invalido");
    }
}
