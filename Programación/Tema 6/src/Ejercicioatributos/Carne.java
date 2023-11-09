package Ejercicioatributos;

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
       public String Getorigen() {
           return origen;
       }
       
       public void setorigen(){
           this.origen = origen;
       }
       
        public String Getfechacaducidad() {
           return fechacaducidad;
       }
       
       public void setfechacaducidad(){
           this.fechacaducidad = fechacaducidad;
       }
              public void Setporcentajegrasa(){
           this.porcentajegrasa = porcentajegrasa;
       
       }
               public int Getporcentajegrasa() {
           return porcentajegrasa;
       }
       
       public void setpeso(){
           this.peso = peso;
       
       }
       
        public int Getpeso() {
           return peso;
       }
       
       public void setpreciokilo(){
           this.preciokilo = preciokilo;
       
       }
       
        public double Getpreciokilo() {
           return preciokilo;
       }
       
    @Override
    public String toString(){
        return"Carne{" + "origen=" + origen + ", fechacaducidad=" + fechacaducidad
                    + ", porcentajegrasa=" + porcentajegrasa + ", peso="
                    + peso + ", preciokilo=" + preciokilo +'}';
        }

       
       
       
}
