
package Ejercicioatributos;

import java.util.Scanner;
/**
 * Clase Main
 *@version 1.0
 * @author Alejandro,Esteban
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tipo, corteza;
        int anillos;
        float alturatotal;
        // Apartado 8A
        Madera madera1 = new Madera();

        Carne carne1 = new Carne();

        Musica musica1 = new Musica();

        System.out.println("Intrduce el tipo de arbol, tallaje de su corteza (lisa o áspera), cuantos anillos tiene el tronco, cuanto medía el árbol y finalmente sabrás su edad");
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
        carne1.setPeso(15);
        carne1.setPreciokilo(25.99f);
        System.out.println(carne1);

        System.out.println("Este es el artista, los beats por minuto(bpm), cuándo salió la canción, el género musical y finalmente sabrás cuanto cuesta el CD");
        musica1.setGenero("Pop");
        musica1.setArtista("Taylor Swift");
        musica1.setFechaestreno("15/04/2012");
        musica1.setPista(5);
        musica1.setBpm(120);
        System.out.println(musica1);

        // Apartado 8B
        Madera madera2 = new Madera("pino", "áspera", 57, 5.5f);

        Carne carne2 = new Carne("Galicia", "12/7/2024", 23, 10.90f, 13.25f);

        Musica musica2 = new Musica("Rock", "AC/DC", "15/04/1997", 12, 500);

        System.out.println(madera2);
        System.out.println(carne2);
        System.out.println(musica2);

        madera2.calcularAlturaPromedioPorAnillo();
        madera2.TipoHoja();
        
        musica2.aumentarPrecio();
        musica2.velocidadMusica();

        carne2.calidad();
        carne2.dosporuno();
     
        scanner.close();

    }
}
