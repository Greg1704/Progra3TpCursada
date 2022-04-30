package usuariosDelSistema;

/**
 * En esta clase se aplica patrón decorator para los rubros del empleador, con esto logramos ahorrarnos generar varias clases nuevas de empleador.
 * 
 * 
 */

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
