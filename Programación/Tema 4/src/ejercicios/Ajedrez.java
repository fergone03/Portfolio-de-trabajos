package ejercicios;

public class Ajedrez {

    public static void main(String[] args) {

        char[][] matriz = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    matriz[i][j] = 'B';
                } else {
                    matriz[i][j] = 'N';
                }
            }

        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
