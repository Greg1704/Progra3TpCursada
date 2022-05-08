package usuariosDelSistema;


public class RubroFactory {
	
	/**
	 * Clase en la que se aplica patrón factory para poder obtener una nueva instancia de rubro específico del empleador. <br>
	 * @param rubro: El atributo rubro es un string que pasa el rubro al que se dedica el empleador <br>
	 * PreCond: rubro debe ser un atributo válido: ComercioInternacional ó ComercioLocal ó Salud.
	 * 
	 */ 
	
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
