package CuentaCorriente;
import java.util.Scanner;
public class password {
    private static final String CONTRASENA_CORRECTA = "1234";

    public static boolean verificarContrasena() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ingrese la contraseña:");
            String contrasenaIngresada = scanner.nextLine();

            if (contrasenaIngresada.equals(CONTRASENA_CORRECTA)) {
                return true;
            } else {
                System.out.println("Contraseña incorrecta. Inténtelo de nuevo.");
            }
        }
    }
}
