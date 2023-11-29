package CuentaCorriente;

/*
    Clase para comprobar el funcionamiento de la clase CuentaCorriente
 */
public class CuentaCorrienteApp {
    public static void main(String[] args) {
        CuentaCorriente c1, c2;
        if(password.verificarContrasena()) {
            // Creación de 2 objetos de tipo CuentaCorriente
            c1 = new CuentaCorriente("11111111A", "David");
            c2 = new CuentaCorriente("22222222B", "Lorena");

            // 2 ingresos
            c1.ingresarDinero(100);
            c2.ingresarDinero(50.5);

            // Mostramos la información de ambas cuentas
            c1.mostrar();
            System.out.println(); // separador
            c2.mostrar();

            System.out.println(); // separador

            // Extraemos dinero de la cuenta 1
            System.out.println("OPERACIÓN CON LA CUENTA 1");

            // Comprobación del resultado de la operación
            if (c1.sacarDinero(80)) {
                System.out.println("DINERO SACADO CON ÉXITO");
            } else {
                System.out.println("NO HAY FONDOS SUFICIENTES");
            }

            System.out.println(); // separador

            // Extraemos dinero de la cuenta 2
            System.out.println("OPERACIÓN CON LA CUENTA 2");

            // Comprobación del resultado de la operación
            if (c2.sacarDinero(60)) {
                System.out.println("DINERO SACADO CON ÉXITO");
            } else {
                System.out.println("NO HAY FONDOS SUFICIENTES");
            }

        }else{
            System.out.println("Contraseña incorrecta");
        }
    }
}


