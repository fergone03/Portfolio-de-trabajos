
package Ejercicioatributos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tipo, corteza;
        int anillos;
        float alturatotal, edadarbol;
        //apartado 8a
        Madera madera1 = new Madera();

        Carne carne1 = new Carne();

        Musica musica1 = new Musica();
        
        
        
        System.out.println("Intrduce el tipo de arbol, tallaje de su corteza, cuantos anillos tiene el tronco, cuanto medía el árbol y finalmente sabrás su edad");
        tipo = scanner.nextLine();
        madera1.setTipo(tipo);
        corteza = scanner.nextLine();
        madera1.setCorteza(corteza);
        anillos = scanner.nextInt();
        madera1.setAnillos(anillos);
        alturatotal = scanner.nextFloat();
        madera1.setEdadarbol(alturatotal);
        System.out.println(madera1);

        System.out.println("Este es el origen, fecha de caducidad, peso y precio kilo de la carne:");
        carne1.setOrigen("Badalona");
        carne1.setFechacaducidad("12/07/2024");
        carne1.setPeso(13);
        carne1.setPreciokilo(25);
        System.out.println(carne1);
        
        System.out.println("Intrduce el tipo de arbol, tallaje de su corteza, cuantos anillos tiene el tronco, cuanto medía el árbol y finalmente sabrás su edad");
        musica1.setArtista("Taylor Swift");
        musica1.setBpm(120);
        musica1.setFechaestreno("15/04/2012");
        musica1.setGenero("Pop");
        musica1.setPista(5);
        System.out.println(musica1);

        //apartado 8b
        Madera madera2 = new Madera("Pino", "Áspera", 57, 5.5f);

        Carne carne2 = new Carne("Galicia", "12/7/2024", 23, 10.90f, 13.25f);

        Musica musica2= new Musica("Pop", "Taylor Swift", "15/04/2012", 5, 120);

        System.out.println(madera2);

        madera2.MaderaMasVendida();


















        // 2 métodos personalizados de la clase Madera

        /*madera1.MaderaMasVendida();

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

        scanner.close();*/

    }
}
