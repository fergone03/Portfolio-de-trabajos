/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplocreacionclases;

/**
 *
 * @author kekom
 */

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.arrancar();
        vehiculo.parar();
        vehiculo.puerta();
        
        Pelicula pelicula = new Pelicula();
        pelicula.empezar();
        pelicula.descanso();
        pelicula.acabar();
        
        Animal animal = new Animal();
        animal.caminar();
        animal.dormir();
        animal.respirar();
        
        Videojuego videojuego = new Videojuego();
        videojuego.Cargar();
        videojuego.Encender();
        videojuego.Reiniciar();
        
}


    }
