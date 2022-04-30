package usuariosDelSistema;

public abstract class RubroDecorator implements EmpleadorComision{
    private Empleador empleador;

    public RubroDecorator(EmpleadorComision empleadorComision) {
        this.empleador = (Empleador) empleadorComision;
    }

    public Empleador getEmpleador() {
        return empleador;
    }

    public void setEmpleador(Empleador empleador) {
        this.empleador = empleador;
    }
}
