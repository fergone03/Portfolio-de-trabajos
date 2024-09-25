import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();

        CalculadoraReturn calculadora = new CalculadoraReturn(num1, num2);

        boolean continuar = true;
        while (continuar) {
            System.out.println("Menú de Operaciones:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Raíz Cuadrada");
            System.out.println("6. Potencia");
            System.out.println("7. Factorial");
            System.out.println("8. Logaritmo");
            System.out.println("9. Salir");

            System.out.println("Seleccione una operación (1-9):");
            int opcion = scanner.nextInt();

            try {
                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + calculadora.sumar());
                        break;
                    case 2:
                        System.out.println("Resultado: " + calculadora.restar());
                        break;
                    case 3:
                        System.out.println("Resultado: " + calculadora.multiplicar());
                        break;
                    case 4:
                        System.out.println("Resultado: " + calculadora.dividir());
                        break;
                    case 5:
                        System.out.println("Resultado: " + calculadora.raizCuadrada());
                        break;
                    case 6:
                        System.out.println("Resultado: " + calculadora.potencia());
                        break;
                    case 7:
                        System.out.println("Resultado: " + calculadora.factorial());
                        break;
                    case 8:
                        System.out.println("Resultado: " + calculadora.logaritmo());
                        break;
                    case 9:
                        continuar = false;
                        System.out.println("Saliendo del programa. ¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                        break;
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.toString());
            }
        }

        scanner.close();
    }
}
