package Ejercicioatributos;
/**
 *
 * Clase musica que calcula la velocidad en base a los bpm y calcula el prdel cd en base a su pista
 *  @author Alejandro,Esteban
 * version 1.0
 */
public class Musica {
    private String genero, artista, fechaestreno;
    private int pista, bpm;
    private float preciocd;

    public Musica() {
        genero = "";
        artista = "";
        fechaestreno = "";
        pista = 0;
        bpm = 0;
        preciocd = 0.0f;
    }

    public Musica(String genero, String artista, String fechaestreno, int pista, int bpm) {
        this.genero = genero;
        this.artista = artista;
        this.fechaestreno = fechaestreno;
        this.pista = pista;
        this.bpm = bpm;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getFechaestreno() {
        return fechaestreno;
    }

    public void setFechaestreno(String fechaestreno) {
        this.fechaestreno = fechaestreno;
    }

    public int getPista() {
        return pista;
    }

    public void setPista(int pista) {
        this.pista = pista;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }
 
    public float getPreciocd() {
        return preciocd;

    }

    public void setPreciocd(float preciocd) {
        this.preciocd = preciocd;
    }

    public void aumentarPrecio() {
         preciocd = 3.5f * pista;
        System.out.println("Como tu cd tiene " + pista + " cuesta " + preciocd + "€.");

    }
   
    public String velocidadMusica() {
        if (bpm > 120) {
            return "Este CD es rápido";
        } else {
            return "Este CD es lento";
        }
    }

    @Override
    public String toString() {
        return "Musica{" + "genero=" + genero + "artista=" + artista + ", fechaestreno=" + fechaestreno
                + ", pista=" + pista + ", bpm="
                + bpm + ", preciocd=" + preciocd + '}';
    }
}
