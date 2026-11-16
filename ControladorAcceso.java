public class ControladorAcceso {
    public void iniciarSesion(MecanismoAutenticacion mecanismo, String identificador, String credencial) {
        if (mecanismo.validarIdentificar(identificador, credencial)) {
            System.out.println("acceso permitido");
        } else {
            System.out.println("acceso denegado");
        }
    }
}
