public class AuthPasswordTradiconal extends MecanismoAutenticacion{
    @Override
    public boolean validarIdentificar(String identificador, String credencial) {
        return identificador.equals("martin") && credencial.equals("12345");
    }
}
