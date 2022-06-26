package usuariosDelSistema;

public class TipoTrabajoFactory { //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA NO SIRVE CREO
    public RubroDecorator getTipoTrabajo(String tipoTrabajo, Empleador empleador){
        if(tipoTrabajo.equalsIgnoreCase("Salud"))
            return (Salud) new Salud(empleador);
        if(tipoTrabajo.equalsIgnoreCase("Comercio Local"))
            return (ComercioLocal) new ComercioLocal(empleador);
        if(tipoTrabajo.equalsIgnoreCase("Comercio Internacional"))
            return (ComercioInternacional) new ComercioInternacional(empleador);
        return null;
    }
}
