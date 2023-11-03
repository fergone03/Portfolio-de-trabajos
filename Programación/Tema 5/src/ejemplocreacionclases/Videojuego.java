/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplocreacionclases;

/**
 *
 * @author kekom
 */
public class Videojuego {
       private int pegi;
       private double precio,nota;
       private String nombre,genero;   
       
        public  void Encender(){
        System.out.println("El videojuego esta encendiendose");
        }
        public  void Cargar(){
            System.out.println("El videojuego esta cargando");
         }   
        protected  void Reiniciar(){
            System.out.println("El videojuego esta reiniciandose");
        }
}
