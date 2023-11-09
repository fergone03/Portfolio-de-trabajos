/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicioatributos;

/**
 *
 * @author kekom
 */
public class Madera {
 private String tipo,corteza;
    private int edadarbol,anillos;
    private double alturatotal;
    
    public Madera (){
     tipo="";
    corteza ="";
    edadarbol =0;
    anillos =0;
    alturatotal =0;
   }
   public String Getotipo() {
      return tipo;
   }

   public void settipo() {
      this.tipo = tipo;
   }

   public String Getacorteza() {
      return corteza;
   }

   public void setcorteza() {
      this.corteza = corteza;
   }

   public int Getedadarbol() {
      return edadarbol;
   }

   public void Setedadarbol() {
      this.edadarbol = edadarbol;
   }

   public int Getanillos() {
      return anillos;
   }

   public void setanillos() {
      this.anillos = anillos;
   }

   public double Gealturatotal() {
      return alturatotal;
   }

   public void Setalturatotal() {
      this.alturatotal = alturatotal;
   }

 

  @Override
public String toString() {
    return "Madera{" +
            "tipo=" + tipo +
            ", corteza=" + corteza +  
            ", edadarbol=" + edadarbol +
            ", anillos=" + anillos +
            ", alturatotal=" + alturatotal + 
            '}';
}
}