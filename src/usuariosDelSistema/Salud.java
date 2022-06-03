package usuariosDelSistema;

public class Salud extends RubroDecorator implements I_TipoTrabajo {

    public Salud(Empleador empleador) {
        super(empleador);
    }

    @Override
    public double getComision() {
        return getEmpleador().getComision() + 0.3 -0.01* getEmpleador().getPuntaje();
    }

    @Override
    public double versus(I_TipoTrabajo tipoTrabajo) {
        return tipoTrabajo.Salud();
    }

    @Override
    public double Salud() {
        return 1;
    }

    @Override
    public double ComercioLocal() {
        return -1;
    }

    @Override
    public double ComercioInternacional() {
        return -1;
    }
}
