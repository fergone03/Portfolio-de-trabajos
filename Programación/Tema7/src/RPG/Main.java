
package RPG;

import java.util.Scanner;

/**
 *
 * @author kekom
 */
public class Main {
    public static void main(String[] args) {

        String[] jefes;
        Scanner scanner = new Scanner(System.in);

        jefes = new String[5];

        Jugador jugador1 = new Jugador("Paco");

        jefes[0] = "Dios Luis";
        jefes[1] = "Dios Javi";
        jefes[2] = "Dios Jose";
        jefes[3] = "Renegada MariaJose";
        jefes[4] = "Ultradios Marcos";

        System.out.println(
                "En un continente y ano desconocido se hallaba un renegado de medac.Este fue expulsado del panteon de los dioses de la programación por osar no poner tabulacion en el codigo.");
        System.out.println(
                "Su deber es demostrar no ser merecedor de tal exilio y desprestigio, y lo probara con los punos");
        System.out.print("Ingresa tu nombre: ");
        String nombreJugador = scanner.nextLine();
        System.out.println("Hola, " + nombreJugador + "!");
        int fuerzaInicial = jugador1.calcularFuerzaInicial();
        System.out.println("Tu fuerza inicial es: " + fuerzaInicial);
        System.out.println("¿Quieres cambiar tu fuerza por 1 oro? (s/n)");
        String respuesta = scanner.nextLine();
        if (respuesta.equals("s")) {
            int nuevoValorFuerza = jugador1.calcularFuerzaInicial(fuerzaInicial);
            System.out.println("Tu nueva fuerza es: " + nuevoValorFuerza);
        } else if (respuesta.equals("n")) {
            System.out.println("Te quedas con tu fuerza actual.");

        } else {
            System.out.println("¡s/n!");
        }
    }

}
