package usuariosDelSistema;

public abstract class RubroDecorator implements EmpleadorComision{
    EmpleadorComision empleadorComision;

    public RubroDecorator(EmpleadorComision empleadorComision) {
        this.empleadorComision = empleadorComision;
    }

    public EmpleadorComision getEmpleadorComision() {
        return empleadorComision;
    }

    public void setEmpleadorComision(EmpleadorComision empleadorComision) {
        this.empleadorComision = empleadorComision;
    }
}
