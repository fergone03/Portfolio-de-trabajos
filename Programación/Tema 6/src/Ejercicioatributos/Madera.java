
package Ejercicioatributos;

public class Madera {
   private String tipo, corteza;
   private int edadarbol, anillos;
   private float alturatotal;

   public Madera() {
      tipo = "";
      corteza = "";
      edadarbol = 0;
      anillos = 0;
      alturatotal = 0;
   }

   public Madera(String tipo, String corteza, int edadarbol, int anillos, float alturatotal) {
      this.tipo = tipo;
      this.corteza = corteza;
      this.edadarbol = edadarbol;
      this.anillos = anillos;
      this.alturatotal = alturatotal;
   }

   public Madera(String tipo, float alturatotal) {
      this.tipo = tipo;
      this.alturatotal = alturatotal;
   }

   public String getTipo() {
      return tipo;
   }

   public void setTipo(String tipo) {
      this.tipo = tipo;
   }

   public String getCorteza() {
      return corteza;
   }

   public void setCorteza(String corteza) {
      this.corteza = corteza;
   }

   public int getEdadarbol() {
      return edadarbol;
   }

   public void setEdadarbol(int edadarbol) {
      this.edadarbol = edadarbol;
   }

   public int getAnillos() {
      return anillos;
   }

   public void setAnillos(int anillos) {
      this.anillos = anillos;
   }

   public float getAlturatotal() {
      return alturatotal;
   }

   public void setAlturatotal(float alturatotal) {
      this.alturatotal = alturatotal;
   }

   public int calcularEdadPorAnillos() {
      return anillos;
  } 
  public void imprimirDetallesEspecificos() {
   System.out.println("Detalles Específicos de la Madera:");
   System.out.println("Tipo de madera: " + tipo);
   System.out.println("Altura total: " + alturatotal);
}
   @Override
   public String toString() {
      return "Madera{" +
            "tipo='" + tipo + '\'' +
            ", corteza='" + corteza + '\'' +
            ", edadarbol=" + edadarbol +
            ", anillos=" + anillos +
            ", alturatotal=" + alturatotal +
            '}';
   }
}
