package usuariosDelSistema;

public class ComercioLocal extends RubroDecorator implements I_TipoTrabajo{
	private String rubro="ComercioLocal"; 
    public ComercioLocal(Empleador empleador) {
        super(empleador);
    }

    @Override
    public double getComision() {
        return getEmpleador().getComision() + 0.4 - 0.01* getEmpleador().getPuntaje();
    }

    @Override
    public double versus(I_TipoTrabajo tipoTrabajo) {
        return tipoTrabajo.ComercioLocal();
    }

    @Override
    public double Salud() {
        return -1;
    }

    @Override
    public double ComercioLocal() {
        return 1;
    }

    @Override
    public double ComercioInternacional() {
        return -1;
    }

	@Override
	public String getRubro() {
		return "ComercioLocal";
	}
}
