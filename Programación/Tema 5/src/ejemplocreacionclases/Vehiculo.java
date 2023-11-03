/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplocreacionclases;

/**
 *
 * @author kekom
 */
public class Vehiculo {
       private double precio;
       private String matricula,marca,modelo;     
       
       public  void arrancar(){
            System.out.println("El coche esta arrancando");
        }
        public  void parar(){
            System.out.println("El coche esta parando");
         }   
        protected  void puerta(){
            System.out.println("la puerta se abre");
        }
}
