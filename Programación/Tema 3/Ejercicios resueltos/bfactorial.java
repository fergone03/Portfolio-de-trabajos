import java.util.Scanner;

public class bfactorial {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Factorial de un número");
        System.out.print("Ingresa un número: "); // Solicita al usuario que ingrese el primer número

        int num = scanner.nextInt(); // Lee el número ingresado por el usuario y lo almacena en la variable 'num'

        int factorial = 1; // Inicializa una variable 'factorial' en 1 para almacenar el resultado del factorial
        for (int i = 1; i <= num; i++) { 
            factorial *= i; // Calcula el factorial multiplicando 'factorial' por 'i' en cada repetición
        }
        
        // Imprime el resultado del factorial
        System.out.println("El factorial del número " + num +  " es: " + factorial);
    }
}
