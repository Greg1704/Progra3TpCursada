package usuariosDelSistema;

/**
 * Clase en la que se aplica patrón factory para poder obtener una nueva instancia de rubro específico del empleador.
 * 
 * 
 */ 

public class RubroFactory {
    public RubroDecorator getRubro(String rubro, Empleador empleador){
        if(rubro == null)
            return null;
        if(rubro.equalsIgnoreCase("Salud"))
            return (Salud) new Salud(empleador);
        if(rubro.equalsIgnoreCase("ComercioLocal"))
            return (ComercioLocal) new ComercioLocal(empleador);
        if(rubro.equalsIgnoreCase("ComercioInternacional"))
            return (ComercioInternacional) new ComercioInternacional(empleador);
        return null;
    }
}
