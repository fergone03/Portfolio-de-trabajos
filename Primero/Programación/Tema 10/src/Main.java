public class Main {

    public static int dividir(int numero1, int numero2) throws ArithmeticException {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir entre 0");
        }
        return numero1 / numero2;
    }

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 0;

        try {
            int resultado = dividir(numero1, numero2); // Pass both arguments separately
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException error) {
            System.out.println("Error: " + error.toString());
        }
        System.out.println("Ha finalizado el programa");
    }
}
