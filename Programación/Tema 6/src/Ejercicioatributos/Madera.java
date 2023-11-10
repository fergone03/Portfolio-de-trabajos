
package Ejercicioatributos;

/**
 *
 * Clase madera que determina el tipo de hoja en base a la corteza y la altura promedio por anillos
 *  @author Alejandro,Esteban
 * version 1.0
 */

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

   public float calcularAlturaPromedioPorAnillo() {
      if (anillos != 0) {
         return alturatotal / anillos;
      } else {
         System.out.println("No se puede calcular la altura promedio por anillo porque el número de anillos es cero.");
         return 0;
      }
   }

   public String TipoHoja() {
      if (corteza==("lisa")) {
         return "El árbol es de hoja perenne.";
      } else if (corteza==("áspera")) {
         return "El árbol es de hoja caduca.";
      } else {
         return "No se puede determinar el tipo de hoja del árbol.";
      }
   }

   @Override
   public String toString() {
      return "Madera{" + "tipo=" + tipo + ", corteza=" + corteza
            + ", anillos=" + anillos + ", edadarbol="
            + edadarbol + ", alturatotal=" + alturatotal + '}';
   }
}
