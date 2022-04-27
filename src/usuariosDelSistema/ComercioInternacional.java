package usuariosDelSistema;

public class ComercioInternacional extends RubroDecorator{

    public ComercioInternacional(Empleador empleador) {
        super(empleador);
    }

    @Override
    public double getComision() {
        return getEmpleador().getComision() + 0.5;
    }
}
