package CuentaCorriente;

    public class CuentaCorriente {
        private String dni, nombre;
        private double saldo;

        // Constructor parametrizado
        public CuentaCorriente(String dni, String nombre) {
            this.dni = dni;
            this.nombre = nombre;
            this.saldo = 0.0; // saldo por defecto
        }

        // Ingreso de dinero en la cuenta
        public void ingresarDinero(double cantidad) {
            this.saldo += cantidad;
        }

        // Extracción de dinero. Devuelve si la operación ha sido exitosa o no
        public boolean sacarDinero(double cantidad) {
            boolean resultado = true;

            // Comprobación de saldo suficiente
            if (this.saldo < cantidad) {
                resultado = false;
            }
            else {
                this.saldo -= cantidad;
            }

            return resultado;
        }

        // Muestra la información relativa a la cuenta bancaria
        public void mostrar() {
            System.out.println("DATOS DE LA CUENTA BANCARIA");
            System.out.println("DNI del titular: " + this.dni);
            System.out.println("Nombre del titular: " + this.nombre);
            System.out.println("Saldo de la cuenta: " + this.saldo);
        }
    }


