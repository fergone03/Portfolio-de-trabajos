
package ejercicios;

        import java.util.Arrays;
import java.util.Scanner;
public class Estonoesunacalculadora {

    public static void main(String[] args) {


        // Crear un array de enteros
        int[] numeros = {5, 10, 15, 20, 25};

        // Mostrar el array original
        System.out.println("Array original: " + Arrays.toString(numeros));

        // Crear una variable String e introducir la cadena por consola
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena de caracteres: ");
        String texto = scanner.nextLine();

        // Usar métodos de la clase String
        System.out.println("Cadena original: " + texto);
        System.out.println("Longitud de la cadena: " + texto.length());
        System.out.println("Cadena en mayúsculas: " + texto.toUpperCase());
        System.out.println("Cadena en minúsculas: " + texto.toLowerCase());
        System.out.println("Caracter en la posición 3: " + texto.charAt(2));
        System.out.println("Índice de la primera 'a': " + texto.indexOf('a'));
        System.out.println("Reemplazar 'a' con 'X': " + texto.replace('a', 'X'));
        System.out.println("Subcadena desde la posición 3 hasta 7: " + texto.substring(2, 7));
        System.out.println("¿La cadena comienza con 'Hola'? " + texto.startsWith("Hola"));
        System.out.println("¿La cadena termina con 'mundo'? " + texto.endsWith("mundo"));

        // Cerrar el scanner
    }
}

    


