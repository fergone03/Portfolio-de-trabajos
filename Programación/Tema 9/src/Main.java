import java.util.Scanner;

/**
 * Clase principal que contiene el método main para iniciar.
 *
 * @author Esteban Fernández González v1.1
 */
public class Main {
    /**
     * Método principal que sirve como punto de entrada para el programa.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en este
     * caso).
     */
    public static void main(String[] args) {
        // Crear una instancia de la clase Granja con parámetros específicos.
        Granja granja = new Granja("A", "Vaca", "A", 100);
        Scanner scanner = new Scanner(System.in);

        // Número total de animales que se desea agregar a la granja.
      

        // Crear objetos de la clase Vaca con constructores por defecto y por parámetros.
        Vaca vaca1 = new Vaca("Vaca1", "Vaca", "Granja A", 50, "Blanco y Negro", "Holstein", 25.5);
        Vaca vaca2 = new Vaca(); // Crear una instancia de Vaca con el constructor por defecto.

        // Crear objetos de la clase Pollo con constructores por defecto y por parámetros.
        Pollo pollo1 = new Pollo("Pollo1", "Pollo", "Granja B", 100, 2, 15, "Granos");
        Pollo pollo2 = new Pollo(); // Crear una instancia de Pollo con el constructor por defecto.
        // Imprimir información sobre la producción de leche de la vaca1 y mostrar la representación en cadena de vaca2
        System.out.println("Producción de leche de la vaca: " + vaca1.getProduccionLeche() + " litros.");
        System.out.println(vaca2);

        // Imprimir información sobre el tamaño del pollo1 y mostrar la representación en cadena de pollo2.
        System.out.println("Tamaño del pollo: " + pollo1.getTamaño() + " cm.");
        System.out.println(pollo2);
        System.out.println("¿Cuantos animales quieres añadir a la granja?");

        int numAnimales = scanner.nextInt();

        // Verificar si hay suficiente capacidad en la granja para el número especificado de animales.
        if (granja.verificarCuantoDisponible(numAnimales)) {
            System.out.println("Hay suficiente capacidad para " + numAnimales + " animales en la granja.");
        } else {
            System.out.println("No hay suficiente capacidad para " + numAnimales + " animales en la granja.");
        }
    }
}
