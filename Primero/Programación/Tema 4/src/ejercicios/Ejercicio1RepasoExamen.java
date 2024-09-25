package ejercicios;

import java.util.Scanner;

public class Ejercicio1RepasoExamen {

    public static void main(String[] args) {
        int[] notas;
        int ninos;
        double media = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca cuántos alumnos son");
        ninos = teclado.nextInt();
        int[] var = new int[ninos];
        notas = new int[ninos];
        for (int i = 0; i < ninos; i++) {
            System.out.println("Introduzca la nota del alumno " + (i + 1));
            var[i] = teclado.nextInt();
            notas[i] = var[i];
        }
        System.out.println("Las notas de los alumnos son:");

        for (int i = 0; i < ninos; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + var[i]);

        }
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("Pulsa 1 para calcular la media\nPulsa 2 para mostrar las notas iguales o mayores que el promedio\nPulsa 3 para salir");

            opcion = teclado.nextInt();
            if (opcion == 1) {
                double suma = 0;
                for (int i = 0; i < notas.length; i++) {
                    suma += notas[i];

                }
                media = suma / ninos;
                System.out.println("El resultado de la media es: " + media);
            } else if (opcion == 2) {
                System.out.println("Las notas iguales o mayores que el promedio son:");
                for (int i = 0; i < ninos; i++) {
                    if (var[i] >= media) {
                        System.out.println("Alumno " + (i + 1) + ": " + var[i]);
                    }
                }
            }
        }
    }
}
