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
       public String getOrigen() {
           return origen;
       }
       
       public void setOrigen(String origen){
           this.origen = origen;
       }
       
        public String getFechacaducidad() {
           return fechacaducidad;
       }
       
       public void setFechacaducidad(String fechacaducidad){
           this.fechacaducidad = fechacaducidad;
       }
              public void setPorcentajegrasa(int porcentajegrasa){
           this.porcentajegrasa = porcentajegrasa;
       
       }
               public int getPorcentajegrasa() {
           return porcentajegrasa;
       }
       
       public void setPeso(int peso){
           this.peso = peso;
       
       }
       
        public double getPeso() {
           return peso;
       }
       
       public void setPreciokilo(double preciokilo){
           this.preciokilo = preciokilo;
       
       }
       
        public double getPreciokilo() {
           return preciokilo;
       }
       
        public void dosporuno(){
            if (peso> 20){
                System.out.println("Has obtenido un bono de"+ peso+ "kilos al pasar de 20 kilos totales");
                System.out.println("Ahora tienes"+ peso * 2 + "kilos");
            }

        }        
        public void calidad(){
            if (porcentajegrasa<40){
            System.out.println("la carne es de calidad saludable!");
        } 
            if (porcentajegrasa>40){
            System.out.println("la carne es de calidad 4");
        }
            if (porcentajegrasa>50){
                System.out.println("la carne es de calidad 5");
            }
           if (porcentajegrasa>60){
                System.out.println("la carne es de calidad 6 o superior");
            }
        }
    @Override
    public String toString(){
        return"Carne{" + "origen=" + origen + ", fechacaducidad=" + fechacaducidad
                    + ", porcentajegrasa=" + porcentajegrasa + ", peso="
                    + peso + ", preciokilo=" + preciokilo +'}';
        }

       
       
       
}
