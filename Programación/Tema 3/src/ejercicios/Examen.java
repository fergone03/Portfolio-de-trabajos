package ejercicios;



import java.util.Scanner; 

public class Examen {

    public static void main(String[] args) {
        int[] monedero = new int[100]; //Declaro Arrays
        int[] juegos = new int[0];
        int TotalMonedero = 0; //Declaro variables
        int MaxJuegos = 100;
        String[] nombrejuegos = new String[MaxJuegos];
        Scanner antonio = new Scanner(System.in);
        System.out.println("¿Como te llamas?"); // Te pido el nombre
        String nombre = antonio.next();
        System.out.println("¡Bienvenido a MedacGames " + nombre + "!"); //Te doy la bienvenida
        while (true) {
            System.out.println("\n¿Qué deseas hacer?\n 1.Comprar un juego\n 2.Vender un juego\n 3.Ver cuántos juegos tienes\n 4.Ver cuanto dinero tienes\n 5.Sacar dinero \n 6.Salir del programa");

            int opcion = antonio.nextInt(); // te pido que introduzcas una opción del panel

            if (opcion == 1) { 
                for (int i = 0; i < 60; i++) { //Compras un juego si tienes saldo
                    if (monedero[i] < 60) {
                        monedero[i] -= 60;
                        System.out.println("Has comprado un juego por 60€");

                    } else {
                        System.out.println("¡No tienes suficiente saldo!");
                    }
                }

            } else if (opcion == 2) { //Vendes un juego
                System.out.println("Has vendido un juego y has recuperado 30€");
                for (int i = 0; i < 100; i++) {
                    monedero[i] + 30;
                    juegos[]-1;
                }
            } else if (opcion == 3) { //Ves los juegos que tienes
                System.out.println("Tienes " + juegos + " juegos");

            } else if (opcion == 4) { //Ves el dinero que tienes
                System.out.println("Tienes " + monedero + " €");

            } else if (opcion == 5) { //Añades saldo al monedero

                for (int i = 0; i < 100; i++) {
                    double damedinero = antonio.nextDouble();

                    System.out.println("Has sacado " + damedinero + " € del banco y se han ingresado en tu monedero");
                }
            } else { //Sales del programa
                System.out.println("Saliendo del programa...  ¡Hasta la vista!");
                for (int i = 0; i < 100; i++) {
                    if (juegos[i] != 0) {
                        System.out.println("¿Cual es el nombre de tus juegos?");
                        antonio.nextLine();
                        System.out.println("Tienes estos juegos " + nombrejuegos[i]);

                    }
                }
                break;
            }
        }

    }
}
