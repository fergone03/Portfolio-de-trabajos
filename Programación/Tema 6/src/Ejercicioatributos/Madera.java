
package Ejercicioatributos;


public class Madera {
    private String tipo, corteza;
    private int edadarbol, anillos;
    private double alturatotal;

    public Madera() {
        tipo = "";
        corteza = "";
        edadarbol = 0;
        anillos = 0;
        alturatotal = 0;
    }

    public Madera(String tipo, String corteza, int edadarbol, int anillos, double alturatotal) {
        this.tipo = tipo;
        this.corteza = corteza;
        this.edadarbol = edadarbol;
        this.anillos = anillos;
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

    public double getAlturatotal() {
        return alturatotal;
    }

    public void setAlturatotal(double alturatotal) {
        this.alturatotal = alturatotal;
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
