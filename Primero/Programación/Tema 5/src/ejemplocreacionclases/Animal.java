/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplocreacionclases;

/**
 *
 * @author kekom
 */
public class Animal {
       private int edad;
       private double altura;
       private String nombre, raza, sexo;  
       
              public  void respirar(){
            System.out.println("El animal esta respirando");
        }
        public  void caminar(){
            System.out.println("El anima esta caminando");
         }   
        protected  void dormir(){
            System.out.println("El animal esta durmiendo");
        }
}
