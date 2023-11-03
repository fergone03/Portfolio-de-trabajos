import java.util.Scanner;

public class sumapares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ejercicio suma pares");
        System.out.print("Ingresa el primer número: "); // Solicita al usuario que ingrese el primer número

        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: "); // Solicita al usuario que ingrese el segundo número

        int num2 = scanner.nextInt();

        int suma = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println("La suma de los números pares entre " + num1 + " y " + num2 + " es: " + suma);

    }
}
