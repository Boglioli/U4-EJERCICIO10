public class Main {
    public static void main(String[] args) {
        ControladorAcceso controlador = new ControladorAcceso();
        MecanismoAutenticacion password = new AuthPasswordTradiconal();
        MecanismoAutenticacion biometrica = new AuthBiometrica();
        MecanismoAutenticacion oauth = new AuthOAuthProveedor();
        System.out.println("autenticacion tradicional");
        controlador.iniciarSesion(password, "martin", "12345");
        System.out.println("autenticacion biometrica");
        controlador.iniciarSesion(biometrica, "martin", "huella12345");
        System.out.println("autenticacion oauth");
        controlador.iniciarSesion(oauth, "martin" , "google12345");
        System.out.println("intento incorrecto");
        controlador.iniciarSesion(password, "martin", "1010");
    }
}