/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG;

import java.lang.Math;
import java.util.Random;

/**
 *
 * @author kekom
 */
public class Enemigo {

    private String nombre;
    private int puntos_ataque;

    public Enemigo() {
        nombre = "";
        puntos_ataque = 0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntos_ataque(int puntos_ataque) {
        this.puntos_ataque = puntos_ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public int calcularFuerzaEnemigo() {
        Random random = new Random();
        this.puntos_ataque = random.nextInt(10) + 1;
        return this.puntos_ataque;
    }

    public int soltarOro() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }
}
