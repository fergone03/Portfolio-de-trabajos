
package RPG;

import java.util.Random;

/**
 *
 * @author kekom
 */
public class Jugador {
    private String Nombre;
    private int PuntosSalud;
    private int PuntosAtaque;
    private int Dinero;

    public Jugador(String Nombre) {
        this.Nombre = Nombre;
        this.PuntosSalud = 20;
        this.PuntosAtaque = 0;
        this.Dinero = 2;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getPuntosSalud() {
        return PuntosSalud;
    }

    public void setPuntosSalud(int puntosSalud) {
        PuntosSalud = puntosSalud;
    }

    public int getPuntosAtaque() {
        return PuntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        PuntosAtaque = puntosAtaque;
    }

    public int getDinero() {
        return Dinero;
    }

    public void setDinero(int dinero) {
        Dinero = dinero;
    }

    public void calcularFuerzaInicial() {
        Random random = new Random();
        this.puntosAtaque = random.nextInt(10) + 1;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", puntosSalud=" + puntosSalud +
                ", puntosAtaque=" + puntosAtaque +
                ", dinero=" + dinero +
                '}';

    }
}
