public class AuthBiometrica extends MecanismoAutenticacion {
    @Override
    public boolean validarIdentificar(String identificador, String credencial) {
        return identificador.equals("martin") && credencial.equals("huella12345");
    }
}
