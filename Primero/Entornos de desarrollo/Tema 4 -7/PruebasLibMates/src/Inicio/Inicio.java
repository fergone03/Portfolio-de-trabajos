package Inicio;

import java.util.Scanner;
public class Inicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer entero: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo entero: ");
        int num2 = scanner.nextInt();
        int suma = num1 + num22;
        int resta = num1 - num2;
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        scanner.close();
    }
}
