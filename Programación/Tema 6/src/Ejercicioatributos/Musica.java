
package Ejercicioatributos;

public class Musica {
   private String genero, artista, fechaestreno;
   private int pista, bpm;
   private double preciocd;

   public Musica() {
      genero = "";
      artista = "";
      fechaestreno = "";
      pista = 0;
      bpm = 0;
      preciocd = 0;
   }

   public Musica(String genero, String artista, String fechaestreno, int pista, int bpm, double preciocd) {
      this.genero = genero;
      this.artista = artista;
      this.fechaestreno = fechaestreno;
      this.pista = pista;
      this.bpm = bpm;
      this.preciocd = preciocd;
   }

   public String Getogenero() {
      return genero;
   }

   public void setgenero() {
      this.genero = genero;
   }

   public String Getartista() {
      return artista;
   }

   public void setartista() {
      this.artista = artista;
   }

   public String Getfechaestreno() {
      return fechaestreno;
   }

   public void Setfechaestreno() {
      this.fechaestreno = fechaestreno;
   }

   public int Getpista() {
      return pista;
   }

   public void setpista() {
      this.pista = pista;
   }

   public double Getbpm() {
      return bpm;
   }

   public void setbpm() {
      this.bpm = bpm;
   }

     public double Getpreciocd() {
      return preciocd;
   }
   public void preciocd() {
      this.preciocd = preciocd;
   }


   @Override
   public String toString() {
      return "Musica{" + "genero=" + genero + ", artista=" + artista
            + ", fechaestreno=" + fechaestreno + ", pista="
            + pista + ", bpm=" + bpm +", preciocd=" + preciocd + '}';
   }

}
