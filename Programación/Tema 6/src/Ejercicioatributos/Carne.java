/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicioatributos;

/**
 *
 * @author kekom
 */
public class Carne {
 private String origen,fechacaducidad;
    private int porcentajegrasa,peso;
    private double preciokilo;
    
    public Carne (){
    origen ="";
    fechacaducidad ="";
    porcentajegrasa =0;
    peso =0;
    preciokilo=0;
   }     
       public Carne (String origen,String fechacaducidad,int porcentajegrasa,int peso,double preciokilo){
       this.origen = origen;
       this.fechacaducidad = fechacaducidad;
       this.porcentajegrasa = porcentajegrasa;
       this.peso = peso;
       this.preciokilo = preciokilo;
       }

}
