package usuariosDelSistema;

public class ComercioInternacional extends RubroDecorator implements I_TipoTrabajo{
	private String rubro="Comercio Internacional"; 
    public ComercioInternacional(Empleador empleador) {
        super(empleador);
    }

    @Override
    public double getComision() {
        return getEmpleador().getComision() + 0.5 - 0.01* getEmpleador().getPuntaje();
    }

    @Override
    public double versus(I_TipoTrabajo tipoTrabajo) {
        return tipoTrabajo.ComercioInternacional();
    }

    @Override
    public double Salud() {
        return -1;
    }

    @Override
    public double ComercioLocal() {
        return -1;
    }

    @Override
    public double ComercioInternacional() {
        return 1;
    }

	@Override
	public String getRubro() {
		return this.rubro;
	}
}
