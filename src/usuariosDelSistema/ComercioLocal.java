package usuariosDelSistema;

public class ComercioLocal extends RubroDecorator{
    public ComercioLocal(Empleador empleador) {
        super(empleador);
    }

    @Override
    public double getComision() {
        return getEmpleador().getComision() + 0.4 - 0.01* getEmpleador().getPuntaje();
    }


	@Override
	public String toString() {
		return "ComercioLocal";
	}
}
