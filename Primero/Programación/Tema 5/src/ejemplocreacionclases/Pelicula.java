/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplocreacionclases;

/**
 *
 * @author kekom
 */
public class Pelicula {
       private int calificacionedad;
       private double fechaestreno,nota;
       private String nombre,genero;    
       
       public  void empezar(){
            System.out.println("La pelicula esta empezando");
        }
        public  void acabar(){
            System.out.println("La pelicula esta acabando");
         }   
        protected  void descanso(){
            System.out.println("Comienza el descanso");
        }
}
