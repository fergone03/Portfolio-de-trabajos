package ejercicios_resueltos;

import java.util.Scanner;

public class cnumprimos {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario.
        Scanner scanner = new Scanner(System.in);
        
        // Solicitamos al usuario que ingrese un número para comprobar si es primo.
        System.out.println("Ingresa un número para comprobar si es primo");
        int numero = scanner.nextInt();
        
        // Inicializamos la variable "primo" como verdadera (true) de manera predeterminada.
        boolean primo = true;
        
        // Iniciamos un bucle for para comprobar si el número es primo.
        for (int i = 2; i < numero; i++) {
            // Si el número es divisible por cualquier valor entre 2 y "numero-1", entonces no es primo.
            if (numero % i == 0) {
                primo = false;
                // Si encontramos un divisor, no necesitamos continuar comprobando más valores.
                break;
            }
        }
        
        // Comprobamos el valor de "primo" y mostramos un mensaje adecuado.
        if (primo) {
            System.out.println(numero + " es primo");
        } else {
            System.out.println(numero + " no es primo");
        }
    }
}
