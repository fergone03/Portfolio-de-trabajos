package ejercicios;

import java.util.Scanner;

public class calculadoraplusplus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 1;

        System.out.println("Calculadora+++++++2UltimateEdition"); // Muestra un mensaje de bienvenida

        System.out.print("Ingresa el primer número: "); // Solicita al usuario que ingrese el primer número

        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: "); // Solicita al usuario que ingrese el segundo número

        double num2 = scanner.nextDouble();

        System.out.println("Selecciona una operación:"); // Mostra un menú de opciones

        while (opcion != 7) { // Por alguna razón habilita el bucle

            System.out.println("Pulsa 1 para Suma");
            System.out.println("Pulsa 2 para Resta");
            System.out.println("Pulsa 3 para Multiplicación");
            System.out.println("Pulsa 4 para División");
            System.out.println("Pulsa 5 para Resto");
            System.out.println("Pulsa 6 para Editar números");
            System.out.println("Pulsa 7 para salir del programa");

            opcion = scanner.nextInt(); // Lee la opción seleccionada por el usuario

            double resultado = 0.0;

            // Empieza una estructura de control switch para realizar la operación
            // seleccionada
            if (opcion == 1) {
                resultado = num1 + num2; // Realiza una suma y muestra el resultado

                System.out.println("El resultado de la suma es: " + resultado);
            } else if (opcion == 2) {
                resultado = num1 - num2; // Realiza una resta y muestra el resultado

                System.out.println("El resultado de la resta es: " + resultado);
            } else if (opcion == 3) {
                resultado = num1 * num2; // Realiza una multiplicación y muestra el resultado

                System.out.println("El resultado de la multiplicación es: " + resultado);
            } else if (opcion == 4) {
                if (num2 == 0) {
                    System.out.println(
                            "No se puede dividir por cero. Por favor, ingresa un segundo número diferente de cero."); // No
                                                                                                                      // dividas
                                                                                                                      // por
                                                                                                                      // 0
                                                                                                                      // mono
                } else {
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado); // Realiza una división y
                                                                                        // muestra el resultado
                }
            } else if (opcion == 5) {
                resultado = num1 % num2;
                System.out.println("El resto es: " + resultado); // Realiza un resto y muestra el resultado
            } else if (opcion == 6) {
                System.out.println("Editando números..."); // Te permite redirigirte al primer paso donde puedes cambiar
                                                           // los números que van a ser operados

                System.out.print("Ingresa el primer número: "); // Solicita al usuario que ingrese el primer número
                num1 = scanner.nextDouble();
                System.out.print("Ingresa el segundo número: "); // Solicita al usuario que ingrese el segundo número
                num2 = scanner.nextDouble();
                System.out.println("Números actualizados con éxito.");
                continue;
            } else if (opcion == 7) {
                System.out.println("Saliendo del programa. ¡Hasta luego!"); // Te sales del programa
            } else {
                System.out.println("Opción no válida. Por favor, selecciona una opción válida."); // Por pulsar otro
                                                                                                  // número que no está
                                                                                                  // entre los 7 que te
                                                                                                  // salen
            }
        }
    }
}
