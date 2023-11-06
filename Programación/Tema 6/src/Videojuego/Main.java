/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Videojuego;

import java.util.Scanner;

/**
 *
 * @author kekom
 */
public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String nombre; 
        String genero;
        String desarrollador;
        int pegi;
        Videojuego mivideojuego = new Videojuego();
        Videojuego mivideojuego2 = new Videojuego("GTA VI", "Accion", "Rockstar games", 18, 10);
        
        
        /*System.out.println("Introduce el nombre del videojuego");
        nombre = teclado.nextLine();
        mivideojuego.setNombre(nombre);
        //gracias a esto se le da el nombre a un valor
        
        System.out.println("El nombre del juego es:"+ mivideojuego.getNombre());
       
        
        System.out.println("Introduce el género del videojuego");
        genero = teclado.nextLine();
        mivideojuego.setGenero(genero);
        
        System.out.println("El genero del juego es:"+ mivideojuego.getGenero());
        
        
        System.out.println("Introduce el desarrollador del videojuego");
        desarrollador = teclado.nextLine();
        mivideojuego.setDesarrollador(desarrollador);
        
        System.out.println("El genero del juego es:"+ mivideojuego.getDesarrollador());
        

  
        
        System.out.println("El genero del juego es:"+ mivideojuego.getDesarrollador());*/
        











        //System.out.println("El valor del descuento es" +  Videojuego.descuento  + "euros");
        /*System.out.println("El nombre del juego es" + mivideojuego2.getNombre());
        System.out.println("El genero del juego es" + mivideojuego2.getGenero());
        System.out.println("La desarrolladora del juego es" + mivideojuego2.getGenero());
        System.out.println("El PEGI del juego es" + mivideojuego2.getPegi());
        System.out.println("El precio del juego es" + mivideojuego2.getPrecio());*/
    
        System.out.println(mivideojuego2);
        mivideojuego2.aplicarDescuento();
        System.out.println("El precio con descuento es" + mivideojuego2.getPrecio());
    }
    
    
    
}
