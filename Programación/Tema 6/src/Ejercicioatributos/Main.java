
package Ejercicioatributos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2 métodos personalizados de la clase Madera
        Madera madera1 = new Madera("pino", "lisa", 20, 5.5f); 

        madera1.MaderaMasVendida();

        System.out.println("Indica cuantos anillos tiene tu madera:");

        int edadPorAnillos = scanner.nextInt();

        Madera madera2 = new Madera("", "", edadPorAnillos, 0.0f);

        System.out.println("Como tu madera tiene "+ edadPorAnillos +" anillos, tu madera tiene " + madera2.getEdadarbol() + " años.");

        // 2 métodos personalizados de la clase Musica

        // 2 métodos personalizados de la clase Carne

        scanner.close();

    }
}
