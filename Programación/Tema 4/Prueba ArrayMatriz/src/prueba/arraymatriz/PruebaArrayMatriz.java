package prueba.arraymatriz;

import java.util.Scanner;

public class PruebaArrayMatriz {

    public static void main(String[] args) {
        int filas, columnas;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el tamaño de las filas");
        filas = teclado.nextInt();
        System.out.println("Introduce el tamaño de las columnas");
        columnas = teclado.nextInt();

        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Introduce valor en la fila" + i + " columna " + j);
                matriz[i][j] = teclado.nextInt();
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("");
        }
    }

}
