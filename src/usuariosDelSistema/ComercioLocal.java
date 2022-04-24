package usuariosDelSistema;

public class ComercioLocal extends RubroDecorator{

    public ComercioLocal(EmpleadorComision empleadorComision) {
        super(empleadorComision);
    }

    @Override
    public double getComision() {
        return getEmpleadorComision().getComision() + 0.4;
    }
}
