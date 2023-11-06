
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        double numero1, numero2; // Permite el uso de numeros reales, es decir que admiten decimales//
        double suma, resta, multiplicacion, division, resto;

        System.out.println("Introduzca el primer valor");
        Scanner leer = new Scanner(System.in);
        numero1 = leer.nextDouble();
        //Introduces el primer valor
        System.out.println("Introduzca el segundo valor");
        numero2 = leer.nextDouble();
        //Introduces el segundo valor
        suma = numero1 + numero2;
        System.out.println("El resultado de la suma es " + suma);
        resta = numero1 - numero2;
        System.out.println("El resultado de la resta es " + resta);
        multiplicacion = numero1 * numero2;
        System.out.println("El resultado de la multiplicacion es " + multiplicacion);
        division = numero1 / numero2;
        System.out.println("El resultado de la division es " + division);
        resto = numero1 % numero2;
        System.out.println("El resultado del resto es " + resto);
        //Finalmente, muestra los resultados de estas operaciones 
    }
}
