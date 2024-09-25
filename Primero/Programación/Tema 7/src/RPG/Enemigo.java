
package RPG;

import java.lang.Math;
import java.util.Random;

/**
 *
 * @author Esteban y Alex Castillo
 */
public class Enemigo {

    private String nombre;
    private int puntos_ataque;

    /**
     *
     */
    public Enemigo() {
        nombre = "";
        puntos_ataque = 0;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param puntos_ataque
     */
    public void setPuntos_ataque(int puntos_ataque) {
        this.puntos_ataque = puntos_ataque;
    }

    /**
     *
     * @return
     */
    public int getPuntos_ataque() {
        return puntos_ataque;
    }
    
    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return
     */
    public int calcularFuerzaEnemigo() {
        Random random = new Random();
        this.puntos_ataque = random.nextInt(10) + 1;
        return this.puntos_ataque;
    }

    /**
     *
     * @return
     */
    public int soltarOro() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }
}
