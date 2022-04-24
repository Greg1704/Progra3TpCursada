package usuariosDelSistema;

public class Salud extends RubroDecorator{

    public Salud(EmpleadorComision empleadorComision) {
        super(empleadorComision);
    }

    @Override
    public double getComision() {
        return getEmpleadorComision().getComision() + 0.3;
    }
}
