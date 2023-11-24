package ejercicios;

import java.util.Scanner;

public class calculadoraplus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         // Muestra un mensaje de bienvenida
        System.out.println("Calculadora+++++++");
        System.out.print("Ingresa el primer número: ");         // Solicita al usuario que ingrese el primer número

        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");         // Solicita al usuario que ingrese el segundo número

        double num2 = scanner.nextDouble();

        System.out.println("Selecciona una operación:");         // Mostra un menú de opciones

        System.out.println("Pulsa 1 para Suma");
        System.out.println("Pulsa 2 para Resta");
        System.out.println("Pulsa 3 para Multiplicación");
        System.out.println("Pulsa 4 para División");

        int opcion = scanner.nextInt();         // Lee la opción seleccionada por el usuario


        double resultado = 0.0;

        switch (opcion) {         // Empieza una estructura de control switch para realizar la operación seleccionada

            case 1:
                resultado = num1 + num2;                 // Realiza una suma y muestra el resultado

                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;                 // Realiza una resta y muestra el resultado

                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;                 // Realiza una multiplicación y muestra el resultado

                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4:
                if (num2 != 0) {                        // Realiza una división y muestra el resultado

                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("No se puede dividir por cero.");
                }
                break;
        }

    }
}
