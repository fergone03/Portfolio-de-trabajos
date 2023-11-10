
package Ejercicioatributos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Madera madera1 = new Madera("pino", "lisa", 20, 5.5f); 
        Carne carne1 = new Carne("Galicia","12/7/2024",23, 10.90,13);
        Musica musica1= new Musica("Pop","Taylor Swift","15/04/2002",5,120,10); 
        
        // 2 métodos personalizados de la clase Madera     
        
       
        
        madera1.MaderaMasVendida();
        
        System.out.println("Indica cuantos anillos tiene tu madera:");

        int edadPorAnillos = scanner.nextInt();

        Madera madera2 = new Madera("", "", edadPorAnillos, 0.0f);

        System.out.println("Como tu madera tiene "+ edadPorAnillos +" anillos, tu madera tiene " + madera2.getEdadarbol() + " años.");

        // 2 métodos personalizados de la clase Musica
        musica1.Vasporlapista();
        // 2 métodos personalizados de la clase Carne
        System.out.println("Cuanto porcentaje de grasa tenia tu carne?");

        double porcentajegrasa = scanner.nextDouble();

        Carne carne2 = new Carne("", "", 0, porcentajegrasa, 0);
        carne2.calidad();
        carne1.dosporuno();
        
        
        
        scanner.close();

    }
}
