
package Ejercicioatributos;

public class Madera {
   private String tipo, corteza;
   private int anillos;
   private float alturatotal, edadarbol;

   public Madera() {
      tipo = "";
      corteza = "";
      anillos = 0;
      edadarbol = anillos * 1.5f;
      alturatotal = 0;
   }

   public Madera(String tipo, String corteza, int anillos, float alturatotal) {
      this.tipo = tipo;
      this.corteza = corteza;
      this.anillos = anillos;
      this.edadarbol = anillos * 1.5f;
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

   public float getEdadarbol() {
      return edadarbol;
   }

   public void setEdadarbol(float edadarbol) {
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

   public float calcularEdadPorAnillos() {
      return edadarbol;
   }

   public void MaderaMasVendida() {
      System.out.println("La madera más vendidad es de " + tipo + " de corteza " + corteza + " tiene " + anillos
            + " anillos, por lo que tiene " + edadarbol + " años. El árbol medía " + alturatotal + " pies.");
   }

   @Override
   public String toString() {
      return "Madera{" + "tipo=" + tipo + ", corteza=" + corteza
            + ", anillos=" + anillos + ", edadarbol="
            + edadarbol + ", alturatotal=" + alturatotal + '}';
   }
}
