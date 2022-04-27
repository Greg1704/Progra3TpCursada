package usuariosDelSistema;

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
