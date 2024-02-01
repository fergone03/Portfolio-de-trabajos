public class NewClass {
    public void method1() {
        int[] numeros = { 1, 2, 3, 4, 5 };
        System.out.println("Inicio");

        for (int i = 0; i < numeros.length; i++) {
            int cuadrado = numeros[i] * numeros[i];
            System.out.println("El cuadrado de " + numeros[i] + " es: " + cuadrado);
        }
    }
}
