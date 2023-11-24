
package RPG;

import java.lang.Math;
import java.util.Random;

/**
 *
 * @author Esteban y Alex Castillo
 */
public class Jugador {
    private String Nombre;
    private int PuntosSalud;
    private int PuntosAtaque;
    private int Dinero;

    public Jugador(String Nombre) {
        this.Nombre = Nombre;
        this.PuntosSalud = 10;
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
        this.PuntosAtaque = puntosAtaque;

    }

    public int getDinero() {
        return Dinero;
    }

    public void setDinero(int dinero) {
        Dinero = dinero;
    }

public int calcularFuerzaInicial() {
    Random random = new Random();
    this.PuntosAtaque = random.nextInt(10) + 1;
    return this.PuntosAtaque;
}


    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + Nombre + '\'' +
                ", puntosSalud=" + PuntosSalud +
                ", puntosAtaque=" + PuntosAtaque +
                ", dinero=" + Dinero +
                '}';

    }
}
