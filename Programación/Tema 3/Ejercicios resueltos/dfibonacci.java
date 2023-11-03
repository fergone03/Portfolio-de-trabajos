import java.util.Scanner;

public class dfibonacci {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario.
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que ingrese cuántos números Fibonacci desea mostrar.
        System.out.println("Selecciona cuántos números Fibonacci quieres mostrar");
        int numero = scanner.nextInt();

        // Inicializamos las variables para los dos primeros valores de la secuencia Fibonacci.
        int valor1 = 0, valor2 = 1;

        // Imprimimos un encabezado.
        System.out.print("Secuencia de Fibonacci");

        // Iniciamos un bucle para generar la secuencia de Fibonacci.
        for (int i = 0; i < numero; i++) {
            // Imprimimos el valor actual de la secuencia Fibonacci.
            System.out.println(valor1 + "");

            // Calculamos el siguiente valor de la secuencia sumando los dos valores anteriores.
            int valor3 = valor1 + valor2;

            // Actualizamos los valores de valor1 y valor2 para el próximo cálculo.
            valor1 = valor2;
            valor2 = valor3;
        }
    }
}
