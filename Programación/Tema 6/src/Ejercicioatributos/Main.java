
package Ejercicioatributos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Madera madera1 = new Madera("pino", "lisa", 20, 5.5f);

        Carne carne1 = new Carne("Galicia", "12/7/2024", 23, 10.90f, 13.25f);

        Musica musica1 = new Musica("Pop", "Taylor Swift", "15/04/2012", 5, 120);

        // 2 métodos personalizados de la clase Madera

        madera1.MaderaMasVendida();

        System.out.println("Indica cuantos anillos tiene tu madera:");

        int edadPorAnillos = scanner.nextInt();

        Madera madera2 = new Madera("", "", edadPorAnillos, 0.0f);

        System.out.println("Como tu madera tiene " + edadPorAnillos + " anillos, tu madera tiene "
                + madera2.getEdadarbol() + " años.");

        // 2 métodos personalizados de la clase Musica

        musica1.Vasporlapista();

        System.out.println("¿Cuántas pistas tiene el CD que quieres comprar?");

        int pistas = scanner.nextInt();

        Musica musica2 = new Musica("", "", "", pistas, 0);

        System.out.println("El CD que quieres comprar tiene " + pistas + ", por lo que cuesta " + musica2.getPreciocd()
                + " €. Tu compra =" + musica2.PrecioPorXPistas());

        // 2 métodos personalizados de la clase Carne

        carne1.dosporuno();

        System.out.println("Cuanto porcentaje de grasa tenia tu carne?");

        float porcentajegrasa = scanner.nextFloat();

        Carne carne2 = new Carne("", "", 0, porcentajegrasa, 0);

        carne2.calidad();

        scanner.close();

    }
}
