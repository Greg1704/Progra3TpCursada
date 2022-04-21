package usuariosDelSistema;

public class Sistema {
    private static Sistema instancia=null;

    private Sistema(){
        System.out.println("Faltan cosas");
    }

    public static Sistema getInstancia(){
        if(instancia == null)
            instancia=new Sistema();
        return instancia;
    }

}
