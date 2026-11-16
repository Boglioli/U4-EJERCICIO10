public class AuthOAuthProveedor extends MecanismoAutenticacion {
    @Override
    public boolean validarIdentificar(String identificador, String credencial) {
        return identificador.equals("martin") && credencial.equals("google12345");
    }
}
