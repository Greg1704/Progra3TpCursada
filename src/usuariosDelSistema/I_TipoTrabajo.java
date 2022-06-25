package usuariosDelSistema;


public interface I_TipoTrabajo {
    public abstract double versus(I_TipoTrabajo tipoTrabajo);

    public abstract double Salud();

    public abstract double ComercioLocal();

    public abstract double ComercioInternacional();
    
    public abstract String getRubro();
}
