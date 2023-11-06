package ejercicios_resueltos;

import java.util.Scanner;

public class econtadorpares {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número
        System.out.println("Elige un número para calcular la suma de sus pares:");
        int numero = scanner.nextInt();

        int suma = 0;  // Inicializar una variable para almacenar la suma de números pares

        // Usar un bucle "for" para iterar desde 0 hasta el número ingresado por el usuario
        for (int i = 0; i <= numero; i++) {
            // Verificar si el número "i" es par (divisible por 2)
            if (i % 2 == 0) {
                suma += i;  // Si es par, agregarlo a la suma
            }
        }

        // Mostrar el resultado al usuario
        System.out.println("La suma de los números pares hasta " + numero + " es " + suma);
    }
}
