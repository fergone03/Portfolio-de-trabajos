import java.util.Scanner;

public class calculadoraplusplusplus {

 public static void mensaje() {
        // Mensaje de bienvenida y opciones
        System.out.println("Calculadora+++++++2UltimateEdition2. Ahora es personal");
        System.out.println("Pulsa 1 para Suma");
        System.out.println("Pulsa 2 para Resta");
        System.out.println("Pulsa 3 para Multiplicación");
        System.out.println("Pulsa 4 para División");
        System.out.println("Pulsa 5 para Resto");
        System.out.println("Pulsa 6 para Editar números");
        System.out.println("Pulsa 7 para Salir");
        System.out.println("Elige una opción");
    }

    public static double pedirNumero() {
        Scanner scanner = new Scanner(System.in);     // Crea un objeto Scanner para leer la entrada del usuario desde la consola

        double num = scanner.nextDouble();     // Lee un número de tipo double ingresado por el usuario

        return num;     // Devuelve el número leído

    }

    public static void main(String[] args) {
        mensaje(); // Llamada a la función mensaje
        Scanner scanner = new Scanner(System.in);

        int opcion = scanner.nextInt();
        System.out.print("Ingresa el primer número: ");
        double numero1 = pedirNumero();
        System.out.print("Ingresa el segundo número: ");
        double numero2 = pedirNumero();

        while (opcion != 7) {
            if (opcion == 1) {
                // Suma
                double resultado = numero1 + numero2;
                System.out.println("El resultado de la suma es: " + resultado);
            } else if (opcion == 2) {
                // Resta
                double resultado = numero1 - numero2;
                System.out.println("El resultado de la resta es: " + resultado);
            } else if (opcion == 3) {
                // Multiplicación
                double resultado = numero1 * numero2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
            } else if (opcion == 4) {
                // División
                if (numero2 == 0) {
                    System.out.println("No se puede dividir por cero. Por favor, ingresa un segundo número diferente de cero.");
                } else {
                    double resultado = numero1 / numero2;
                    System.out.println("El resultado de la división es: " + resultado);
                }
            } else if (opcion == 5) {
                // Resto
                double resultado = numero1 % numero2;
                System.out.println("El resto es: " + resultado);
            } else if (opcion == 6) {
                // Edición de números
                System.out.println("Editando números...");
                System.out.print("Ingresa el primer número: ");
                numero1 = pedirNumero();
                System.out.print("Ingresa el segundo número: ");
                numero2 = pedirNumero();
                System.out.println("Números actualizados con éxito.");
            } else {
                System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
            }

            System.out.println("Pulsa una opción (1-7):");
            opcion = scanner.nextInt();
        }

        // Mensaje de despedida
        System.out.println("Saliendo del programa. ¡Hasta luego!");
        scanner.close();
    }
}
