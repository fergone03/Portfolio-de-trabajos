package Ejercicioatributos;

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
        preciocd = 0;
    }

    public Musica(String genero, String artista, String fechaestreno, int pista, int bpm, float preciocd) {
        this.genero = genero;
        this.artista = artista;
        this.fechaestreno = fechaestreno;
        this.pista = pista;
        this.bpm = bpm;
        this.preciocd = preciocd;
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

    public double getPreciocd() {
        return preciocd;
    }

    public void setPreciocd(float preciocd) {
        this.preciocd = preciocd;
    }

    @Override
    public String toString(){
        return"Madera{" + "artista=" + artista + ", fechaestreno=" + fechaestreno
                    + ", pista=" + pista + ", bpm="
                    + bpm + ", preciocd=" + preciocd +'}';
        }
}
