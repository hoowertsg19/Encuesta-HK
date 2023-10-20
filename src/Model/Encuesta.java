package Model;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Encuesta implements EncuestaInterface {

    @Override
    public void guardarEncuesta(String primerNombre, String primerApellido, String correoElectronico, int edad) throws Excepciones {

        if (primerNombre == null || primerNombre.length() > 3 || primerNombre.isEmpty()) {
            throw new Excepciones("El primer nombre no es válido");
        }

        if (primerApellido == null || primerApellido.length() > 3 || primerApellido.isEmpty()) {
            throw new Excepciones("El primer Apellido no es válido");
        }

        String emailPattern = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@" +
                "[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$";
        Pattern pattern = Pattern.compile(emailPattern);
            Matcher matcher = pattern.matcher(correoElectronico);
                if (!matcher.matches()) {
                    throw new Excepciones("El correo Electrónico no es válido");
                }

        if (edad < 30 || edad > 50) {
            throw new Excepciones("La edad debe tener un rango de (30-50 años)");
        }

        System.out.println("Encuesta guardada exitosamente");
    }

}