package RPG;

import java.lang.Math;
import java.util.Random;

/**
 *
 * @author Esteban/Alex Castillo
 */
public class Jugador {

    private String Nombre;
    private int PuntosSalud;
    private int PuntosAtaque;
    private int Dinero;

    /**
     *
     * @param Nombre
     */
    public Jugador(String Nombre) {
        this.Nombre = Nombre;
        this.PuntosSalud = 10;
        this.PuntosAtaque = 0;
        this.Dinero = 2;

    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    /**
     *
     * @return
     */
    public int getPuntosSalud() {
        return PuntosSalud;
    }

    /**
     *
     * @param puntosSalud
     */
    public void setPuntosSalud(int puntosSalud) {
        PuntosSalud = puntosSalud;
    }

    /**
     *
     * @return
     */
    public int getPuntosAtaque() {
        return PuntosAtaque;
    }

    /**
     *
     * @param puntosAtaque
     */
    public void setPuntosAtaque(int puntosAtaque) {
        this.PuntosAtaque = puntosAtaque;

    }

    /**
     *
     * @return
     */
    public int getDinero() {
        return Dinero;
    }

    /**
     *
     * @param dinero
     */
    public void setDinero(int dinero) {
        Dinero = dinero;
    }

    /**
     *
     * @return
     */
    public int calcularFuerzaInicial() {
        Random random = new Random();
        this.PuntosAtaque = random.nextInt(10) + 1;
        return this.PuntosAtaque;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Jugador{"
                + "nombre='" + Nombre + '\''
                + ", puntosSalud=" + PuntosSalud
                + ", puntosAtaque=" + PuntosAtaque
                + ", dinero=" + Dinero
                + '}';

    }
}
