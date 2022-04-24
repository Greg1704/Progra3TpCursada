package usuariosDelSistema;

public class ComercioInternacional extends RubroDecorator{

    public ComercioInternacional(EmpleadorComision empleadorComision) {
        super(empleadorComision);
    }

    @Override
    public double getComision() {
        return getEmpleadorComision().getComision() + 0.5;
    }
}
