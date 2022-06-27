package usuariosDelSistema;


public class RubroFactory {
	
	/**
	 * Clase en la que se aplica patron factory para poder obtener una nueva instancia de rubro especifico del empleador. <br>
	 * @param rubro: El atributo rubro es un string que pasa el rubro al que se dedica el empleador <br>
	 * PreCond: rubro debe ser un atributo valido: ComercioInternacional o ComercioLocal o Salud.
	 * 
	 */ 
	
    public RubroDecorator getRubro(String rubro, Empleador empleador){
        if(rubro.equalsIgnoreCase("Salud"))
            return (Salud) new Salud(empleador);
        if(rubro.equalsIgnoreCase("ComercioLocal"))
            return (ComercioLocal) new ComercioLocal(empleador);
        if(rubro.equalsIgnoreCase("ComercioInternacional"))
            return (ComercioInternacional) new ComercioInternacional(empleador);
        return null;
    }
}
