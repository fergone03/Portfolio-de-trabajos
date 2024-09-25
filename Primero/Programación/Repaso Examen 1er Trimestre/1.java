
import java.util.Scanner;

public class Ejercicio1RepasoExamen {

    public static void main(String[] args) {
        int[] notas;
        int ninos;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca cuántos alumnos son");
        ninos = teclado.nextInt();
        int[] var = new int[ninos];
        notas = new int[ninos];
        for (int i = 0; i < ninos; i++) {
            System.out.println("Introduzca la nota del alumno " + (i + 1));
            var[i] = teclado.nextInt();
        }
        System.out.println("El primer elemento es: " + notas[0]);
        System.out.println("El segundo elemento es: " + notas[1]);
        System.out.println("El tercer elemento es: " + notas[2]);
        System.out.println("El cuarto elemento es: " + notas[3]);
        System.out.println("El quinto elemento es: " + notas[4]);
    }

}
