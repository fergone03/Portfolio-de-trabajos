import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declaración de variables
        double[][] matrizCalificaciones = new double[3][3]; // Matriz para almacenar las calificaciones de los estudiantes
        Scanner entrada = new Scanner(System.in); // Objeto Scanner para entrada de datos
        File archivo = null; // Objeto para manejar el archivo
        FileWriter escritorArchivo = null; // Objeto para escribir en el archivo
        PrintWriter escritor = null; // Objeto para escribir en el archivo
        BufferedReader lectorLinea = null; // Objeto para leer el archivo línea por línea
        FileReader lectorCaracter = null; // Objeto para leer el archivo caracter por caracter
        double media = 0.0; // Variable para almacenar la media de calificaciones
        double sumaNotas = 0.0; // Variable para almacenar la suma de las calificaciones

        try {
            // Crear el archivo y objetos de escritura
            escritorArchivo = new FileWriter("Notas.txt");
            escritor = new PrintWriter(escritorArchivo);

            // Bucle para cada estudiante
            for (int i = 0; i < 3; i++) {
                sumaNotas = 0.0; // Reiniciar la suma de calificaciones para el siguiente estudiante
                escritor.println("Estudiante " + (i + 1)); // Escribir en el archivo el nombre del estudiante
                // Bucle para cada nota del estudiante
                for (int j = 0; j < 3; j++) {
                    System.out.println("Alumno " + (i + 1) + " ¿Qué nota deseas introducir? ");
                    matrizCalificaciones[i][j] = entrada.nextDouble(); // Leer la nota del usuario
                    sumaNotas += matrizCalificaciones[i][j]; // Sumar la nota a la suma total
                    escritor.println("Nota " + (j + 1) + ": " + matrizCalificaciones[i][j]); // Escribir la nota en el archivo
                }
                media = sumaNotas / 3; // Calcular la media de calificaciones del estudiante
                String resultado = "";

                // Determinar el resultado basado en la media
                if (media < 3) {
                    resultado = "Muy Insuficiente";
                } else if (media == 4) {
                    resultado = "Insuficiente";
                } else if (media == 5 || media == 6) {
                    resultado = "Suficiente";
                } else if (media == 7 || media == 8) {
                    resultado = "Notable";
                } else if (media == 9) {
                    resultado = "Sobresaliente";
                } else if (media == 10) {
                    resultado = "Matrícula de Honor";
                } else if (media > 10) {
                    resultado = "No puedes sacar más de 10";
                }

                // Escribir la media y resultado en el archivo
                escritor.println("Media: " + media + " - " + resultado);
                escritor.println();
            }

        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.toString());
        } finally {
            // Cerrar los objetos de escritura de archivo
            try {
                escritor.close();
                escritorArchivo.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        try {
            // Abrir el archivo y objetos de lectura
            archivo = new File("Notas.txt");
            lectorCaracter = new FileReader(archivo);
            lectorLinea = new BufferedReader(lectorCaracter);

            // Leer el contenido del archivo línea por línea y mostrarlo en la consola
            String linea;
            while ((linea = lectorLinea.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            // Cerrar los objetos de lectura de archivo
            try {
                lectorCaracter.close();
                lectorLinea.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }

    }
}
