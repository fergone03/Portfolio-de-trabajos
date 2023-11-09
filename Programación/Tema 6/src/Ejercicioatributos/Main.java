
package Ejercicioatributos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tipo de madera: ");
        String tipoDeMadera = scanner.nextLine();

        System.out.print("Ingrese la cantidad de anillos: ");
        int cantidadDeAnillos = scanner.nextInt();

        Madera madera1 = new Madera(tipoDeMadera, "Lisa", 20, cantidadDeAnillos, 5.5f);
        System.out.println("Detalles de la madera:\nLa madera es de:"+ tipoDeMadera);
        int edadPorAnillos = madera1.calcularEdadPorAnillos();
        System.out.println("Edad del árbol según anillos: " + edadPorAnillos);

        madera1.imprimirDetallesEspecificos();

        scanner.close();

    }
}
