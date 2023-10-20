import Model.Encuesta;
import Model.Excepciones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("👋 Bienvenido a Encuesta HK");
        System.out.println("=========================================");
        System.out.println("Por favor, ingrese los datos de la encuesta:");

        Scanner scanner = new Scanner(System.in);

        System.out.print("👤 Primer Nombre: ");
        String primerNombre = scanner.nextLine();

        System.out.print("👤 Primer Apellido: ");
        String primerApellido = scanner.nextLine();

        System.out.print("📧 Correo Electrónico: ");
        String correoElectronico = scanner.nextLine();

        System.out.print("🎂 Edad: ");
        int edad = scanner.nextInt();

        Encuesta encuesta = new Encuesta();
        try {
            encuesta.guardarEncuesta(primerNombre, primerApellido, correoElectronico, edad);
            System.out.println("✅ ¡La encuesta se ha guardado con éxito en Encuesta HK!");
        } catch (Excepciones e) {
            System.err.println("❌ Error al guardar la encuesta: " + e.getMessage());
        }

        scanner.close();
    }
}
