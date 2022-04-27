package usuariosDelSistema;

public class Salud extends RubroDecorator{

    public Salud(Empleador empleador) {
        super(empleador);
    }

    @Override
    public double getComision() {
        return getEmpleador().getComision() + 0.3 -0.01* getEmpleador().getPuntaje();
    }
}
