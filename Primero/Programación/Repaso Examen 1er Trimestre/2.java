
import java.util.Scanner;

public class 2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxProductos = 100; // Tamaño máximo del inventario
        String[] nombres = new String[maxProductos];
        double[] precios = new double[maxProductos];
        int[] cantidades = new int[maxProductos];
        int totalProductos = 0;
        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Ver inventario");
            System.out.println("3. Valor total del inventario");
            System.out.println("4. Productos agotados");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            if (opcion == 1) {
                if (totalProductos < maxProductos) {
                    System.out.print("Nombre del producto: ");
                    scanner.nextLine(); // Consumir el salto de línea
                    String nombre = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Cantidad en stock: ");
                    int cantidad = scanner.nextInt();
                    nombres[totalProductos] = nombre;
                    precios[totalProductos] = precio;
                    cantidades[totalProductos] = cantidad;
                    totalProductos++;
                } else {
                    System.out.println("El inventario está lleno.");
                }
            } else if (opcion == 2) {
                System.out.println("\nInventario de Productos:");
                for (int i = 0; i < totalProductos; i++) {
                    System.out.println("Nombre: " + nombres[i]);
                    System.out.println("Precio: $" + precios[i]);
                    System.out.println("Cantidad en stock: " + cantidades[i]);
                    System.out.println("------------------------");
                }
            } else if (opcion == 3) {
                double valorTotal = 0;
                for (int i = 0; i < totalProductos; i++) {
                    System.out.println("Nombre: " + nombres[i]);
                    System.out.println("Precio: $" + precios[i]);
                    System.out.println("Cantidad en stock: " + cantidades[i]);
                    System.out.println("------------------------");
                    valorTotal += precios[i] * cantidades[i];
                }
                System.out.println("Valor Total del Inventario: $" + valorTotal);
            } else if (opcion == 4) {
                System.out.println("\nProductos Agotados:");
                for (int i = 0; i < totalProductos; i++) {
                    if (cantidades[i] == 0) {
                        System.out.println("Nombre: " + nombres[i]);
                        System.out.println("Precio: $" + precios[i]);
                        System.out.println("------------------------");
                    }
                }
            } else if (opcion == 5) {
                System.out.println("Saliendo del programa.");
                break;
            } else {
                System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        }
    }
  }
