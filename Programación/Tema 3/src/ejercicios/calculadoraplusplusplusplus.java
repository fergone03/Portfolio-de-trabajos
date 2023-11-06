package ejercicios;

import java.util.Scanner;

public class calculadoraplusplusplusplus {


    public static void main(String[] args) {

        // Imprimir el título de la calculadora
        System.out.println("Calculadora+++++++++++2UltimateEdition3. La rebelión de los arrays");

        // Declarar un arreglo para almacenar los números a operar y la variable size
        // para su tamaño
        int[] posicionnums;
        int size;
        Scanner teclado = new Scanner(System.in);

        // Solicitar al usuario la cantidad de números a operar
        System.out.println("Introduzca cuántos números va a operar");
        size = teclado.nextInt();

        // Crear arreglos para almacenar los números y sus posiciones
        int[] numoperar = new int[size];
        posicionnums = new int[size];

        // Solicitar al usuario que ingrese los valores de los números a operar
        for (int i = 0; i < size; i++) {
            System.out.println("Introduzca el valor del número a operar " + (i + 1));
            posicionnums[i] = teclado.nextInt();
        }

        // Declarar variables para los resultados de las operaciones
        int suma = 0, resta = 0, multi = 1, divi = 1; // Inicializar las variables aquí
        int opcion = 0;
        while (opcion < 6) {
            // Solicitar al usuario que elija una operación
            System.out.println("Elija una operación: ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Editar números");
            System.out.println("6. Sal del programa");

            opcion = teclado.nextInt();

            // Realizar la operación seleccionada
            switch (opcion) {
                case 1:
                    // Sumar los números
                    suma = 0;
                    
                    for (int i = 0; i < numoperar.length; i++) {
                        suma += posicionnums[i];
                    }
                    System.out.println("El resultado de la suma es: " + suma);
                    break;
                case 2:
                    resta = posicionnums[0];
                    // Restar los números
                    for (int i = 1; i < numoperar.length; i++) {
                        resta = resta - posicionnums[i];
                    }
                    System.out.println("El resultado de la resta es: " + resta);
                    break;
                case 3:
                    // Multiplicar los números
                    multi = 1;
                    for (int i = 0; i < numoperar.length; i++) {
                        multi *= posicionnums[i];
                    }
                    System.out.println("El resultado de la multiplicación es: " + multi);
                    break;
                case 4:
                    // Dividir los números
                    divi = posicionnums[0];
                    for (int i = 1; i < numoperar.length; i++) {
                        divi /= posicionnums[i];
                    }
                    System.out.println("El resultado de la división es: " + divi);
                    break;
                case 5:
                    // Editar los números
                    for (int i = 0; i < size; i++) {
                        System.out.println("Introduzca el valor del número a operar " + (i + 1));
                        posicionnums[i] = teclado.nextInt();
                    }
                    break;

                default:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;

            }
        }
    }
}
