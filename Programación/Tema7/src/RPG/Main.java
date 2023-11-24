package RPG;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Paco");
        Enemigo enemigo = new Enemigo();

        int fuerzaActualJefe = enemigo.calcularFuerzaEnemigo();
        String[] jefes;
        Scanner scanner = new Scanner(System.in);

        jefes = new String[5];
        jefes[0] = "Dios Luis";
        jefes[1] = "Dios Javi";
        jefes[2] = "Dios Jose";
        jefes[3] = "Renegada MariaJose";
        jefes[4] = "Ultradios Marcos";

        System.out.println(
                "En un continente y año desconocido se hallaba un renegado de medac. Este fue expulsado del panteón de los dioses de la programación por osar no poner tabulación en el código.");
        System.out.println(
                "Su deber es demostrar no ser merecedor de tal exilio y desprestigio, y lo probará con los puños");
        System.out.print("Ingresa tu nombre: ");
        String nombreJugador = scanner.nextLine();
        System.out.println("Hola, " + nombreJugador + "!");
        int fuerzaInicial = jugador1.calcularFuerzaInicial();
        System.out.println("Tu fuerza inicial es: " + fuerzaInicial);
        System.out.println("Empiezas con 2 duros que has encontrado en el suelo como dinero inicial");

        while (jugador1.getDinero() > 0) {
            System.out.println("¿Quieres cambiar tu fuerza por 1 oro? (s/n)");
            String respuesta = scanner.nextLine();

            int nuevoValorFuerza = jugador1.calcularFuerzaInicial();

            if (respuesta.equals("s")) {
                jugador1.setDinero(jugador1.getDinero() - 1);
                System.out.println("Tu nueva fuerza es: " + nuevoValorFuerza);
            } else if (respuesta.equals("n")) {
                System.out.println("Te quedas con tu fuerza actual.");
            } else {
                System.out.println("¡s/n!");
            }

            while (true) {
                System.out.println("Que deseas hacer?\n1. Luchar contra el enemigo\n2. \n3. Consultar estadísticas\n4. ");
                
                int eleccion = scanner.nextInt();

                switch (eleccion) {
                    case 1:

                        int random = (int) (Math.random() * 5);
                        String jefeSeleccionado = jefes[random];
                        System.out.println("Estás por enfrentar a " + jefeSeleccionado);
                        int puntosEnemigo = enemigo.calcularFuerzaEnemigo();

                        int oroSoltado = enemigo.soltarOro();

                        if (puntosEnemigo <= nuevoValorFuerza) {
                            System.out.println("¡Has ganado! Obtienes " + oroSoltado + " oro");
                            
                        } else {
                            System.out.println("Has perdido contra " + jefeSeleccionado + ".");
                        }
                        break;
                    case 2:
                        System.out.println(
                                "Opciones de compra:\n1. Calculadora - Puntos de ataque: 5 - Precio: 3\n2. HTML - Recupera 10 puntos de salud - Precio: 5\n3. CalculadoraPlus - Puntos de ataque: 7 - Precio: 7\n4. CalculadoraPlusPlus - Puntos de ataque: 20 - Precio: 12\n5. CalculadoraPlusPlusPlus - Puntos de ataque: 30 - Precio: 24\n6. CalculadoraPlusPlusPlusPlus - Puntos de ataque: 99 - Precio: 33\n7. Salir de la tienda");
                        int opcionCompra = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcionCompra) {
                            case 1:
                                if (jugador1.getDinero() >= 3) {
                                    jugador1.setDinero(jugador1.getDinero() - 3);
                                    jugador1.setPuntosAtaque(jugador1.getPuntosAtaque() + 5);
                                    System.out.println("Has comprado una Calculadora. Tu nuevo ataque es: "
                                            + jugador1.getPuntosAtaque());
                                } else {
                                    System.out.println("No tienes suficiente oro para comprar una calculadora.");
                                }
                                break;
                            case 2:
                                if (jugador1.getDinero() >= 2) {
                                    jugador1.setDinero(jugador1.getDinero() - 5);
                                    jugador1.setPuntosSalud(jugador1.getPuntosSalud() + 10);
                                    System.out.println("Has estudiado HTML. Tu nueva salud es: "
                                            + jugador1.getPuntosSalud());
                                } else {
                                    System.out.println(
                                            "No tienes suficiente oro para estudiar en Medac. Esto es un privado");
                                }
                                break;
                            case 3:
                                if (jugador1.getDinero() >= 7) {
                                    jugador1.setDinero(jugador1.getDinero() - 7);
                                    jugador1.setPuntosAtaque(jugador1.getPuntosAtaque() + 6);
                                    System.out.println("Has comprado una Calculadora+++++++. Tu nuevo ataque es: "
                                            + jugador1.getPuntosAtaque());
                                } else {
                                    System.out.println("No tienes suficiente oro para comprar una Calculadora+++++++.");
                                }
                                break;
                            case 4:
                                if (jugador1.getDinero() >= 12) {
                                    jugador1.setDinero(jugador1.getDinero() - 12);
                                    jugador1.setPuntosAtaque(jugador1.getPuntosAtaque() + 7);
                                    System.out.println(
                                            "Has comprado una Calculadora+++++++2UltimateEdition. Tu nuevo ataque es: "
                                                    + jugador1.getPuntosAtaque());
                                } else {
                                    System.out.println(
                                            "No tienes suficiente oro para comprar una Calculadora+++++++2UltimateEdition.");
                                }
                                break;
                            case 5:
                                if (jugador1.getDinero() >= 24) {
                                    jugador1.setDinero(jugador1.getDinero() - 24);
                                    jugador1.setPuntosAtaque(jugador1.getPuntosAtaque() + 30);
                                    System.out.println(
                                            "Has comprado una Calculadora+++++++2UltimateEdition2. Ahora es personal. Tu nuevo ataque es: "
                                                    + jugador1.getPuntosAtaque());
                                } else {
                                    System.out.println(
                                            "No tienes suficiente oro para comprar una Calculadora+++++++2UltimateEdition2. Ahora es personal.");
                                }
                                break;
                            case 6:
                                if (jugador1.getDinero() >= 33) {
                                    jugador1.setDinero(jugador1.getDinero() - 33);
                                    jugador1.setPuntosAtaque(jugador1.getPuntosAtaque() + 99);
                                    System.out.println(
                                            "Has comprado una Calculadora+++++++++++2UltimateEdition3. La rebelión de los arrays. Ahora es personal. Tu nuevo ataque es: "
                                                    + jugador1.getPuntosAtaque());
                                } else {
                                    System.out.println(
                                            "No tienes suficiente oro para comprar una Calculadora+++++++++++2UltimateEdition3. La rebelión de los arrays. Ahora es personal.");
                                }
                                break;
                            case 7:
                                System.out.println("Saliendo de la tienda.");
                                return;
                            default:
                                System.out.println("Opción no válida.");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Consultando estadísticas:");
                        System.out.println(jugador1.toString());
                        break;
                    case 4:
                        System.out.println("Saliendo del juego.");
                        return;
                    default:
                        System.out.println("Selecciona una de las 4 opciones");
                        break;
                }
            }
        }
    }
}
