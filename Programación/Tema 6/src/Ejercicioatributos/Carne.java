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
    private int peso;
    private double preciokilo,porcentajegrasa;
    
    public Carne (){
    origen ="";
    fechacaducidad ="";
    porcentajegrasa =0;
    peso =0;
    preciokilo=0;
   }     
       public Carne (String origen, String fechacaducidad, int peso, double porcentajegrasa, double preciokilo){
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
              public void setPorcentajegrasa(double porcentajegrasa){
           this.porcentajegrasa = porcentajegrasa;
       
       }
               public double getPorcentajegrasa() {
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
                System.out.println("Has obtenido un bono de "+ peso+ " kilos al pasar de 20 kilos totales. Ahora tienes " + peso * 2 + " kilos.");
            }

        }        
        public void calidad(){
            if (porcentajegrasa>0 && porcentajegrasa < 10 ){
            System.out.println("la carne es de calidad 0");
        } 
           else if (porcentajegrasa>=10 && porcentajegrasa< 20 ){
            System.out.println("la carne es de calidad 1");
        } 
          else  if (porcentajegrasa>=20 && porcentajegrasa< 30 ){
            System.out.println("la carne es de calidad 2");
        } 
           else if (porcentajegrasa>=30 && porcentajegrasa< 40 ){
            System.out.println("la carne es de calidad 3");
        } 
          else  if (porcentajegrasa>=40 && porcentajegrasa<50 ){
            System.out.println("la carne es de calidad 4");
        }
         else   if (porcentajegrasa>=50 && porcentajegrasa<60){
                System.out.println("la carne es de calidad 5");
            }
           else {
                System.out.println("la carne es de calidad 6 o superior estas comiendo cancer");
            }
        }
    @Override
    public String toString(){
        return"Carne{" + "origen=" + origen + ", fechacaducidad=" + fechacaducidad
                    + ", porcentajegrasa=" + porcentajegrasa + ", peso="
                    + peso + ", preciokilo=" + preciokilo +'}';
        }

       
       
       
}
