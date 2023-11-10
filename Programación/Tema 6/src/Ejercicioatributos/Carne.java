
package Ejercicioatributos;

/**
 *
 * Clase carne que calcula el porcentaje de grasa y hace un dos por uno al llegar a un precio en concreto
 *  @author Alejandro,Esteban
 * version 1.0
 */
public class Carne {
    private String origen, fechacaducidad;
    private int peso;
    private float preciokilo, porcentajegrasa;

    /**
     *
     */
    public Carne() {
        origen = "";
        fechacaducidad = "";
        porcentajegrasa = 0;
        peso = 0;
        preciokilo = 0f;
    }

    /**
     *
     * @param origen
     * @param fechacaducidad
     * @param peso
     * @param porcentajegrasa
     * @param preciokilo
     */
    public Carne(String origen, String fechacaducidad, int peso, float porcentajegrasa, float preciokilo) {
        this.origen = origen;
        this.fechacaducidad = fechacaducidad;
        this.porcentajegrasa = porcentajegrasa;
        this.peso = peso;
        this.preciokilo = preciokilo;
    }

    /**
     *
     * @return
     */
    public String getOrigen() {
        return origen;
    }

    /**
     *
     * @param origen
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     *
     * @return
     */
    public String getFechacaducidad() {
        return fechacaducidad;
    }

    /**
     *
     * @param fechacaducidad
     */
    public void setFechacaducidad(String fechacaducidad) {
        this.fechacaducidad = fechacaducidad;
    }

    /**
     *
     * @param porcentajegrasa
     */
    public void setPorcentajegrasa(float porcentajegrasa) {
        this.porcentajegrasa = porcentajegrasa;

    }

    /**
     *
     * @return
     */
    public float getPorcentajegrasa() {
        return porcentajegrasa;
    }

    /**
     *
     * @param peso
     */
    public void setPeso(int peso) {
        this.peso = peso;

    }

    /**
     *
     * @return
     */
    public float getPeso() {
        return peso;
    }

    /**
     *
     * @param preciokilo
     */
    public void setPreciokilo(float preciokilo) {
        this.preciokilo = preciokilo;

    }

    /**
     *
     * @return
     */
    public float getPreciokilo() {
        return preciokilo;
    }

    /**
     *
     */
    public void dosporuno() {
        if (peso > 20) {
            System.out.println("Has obtenido un bono de " + peso + " kilos al pasar de 20 kilos totales. Ahora tienes "
                    + peso * 2 + " kilos.");
        }

    }

    /**
     *
     */
    public void calidad() {
        if (porcentajegrasa > 0 && porcentajegrasa < 10) {
            System.out.println("la carne es de calidad 0");
        } else if (porcentajegrasa >= 10 && porcentajegrasa < 20) {
            System.out.println("la carne es de calidad 1");
        } else if (porcentajegrasa >= 20 && porcentajegrasa < 30) {
            System.out.println("la carne es de calidad 2");
        } else if (porcentajegrasa >= 30 && porcentajegrasa < 40) {
            System.out.println("la carne es de calidad 3");
        } else if (porcentajegrasa >= 40 && porcentajegrasa < 50) {
            System.out.println("la carne es de calidad 4");
        } else if (porcentajegrasa >= 50 && porcentajegrasa < 60) {
            System.out.println("la carne es de calidad 5");
        } else {
            System.out.println("la carne es de calidad 6 o superior estas comiendo cancer");
        }
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Carne{" + "origen=" + origen + ", fechacaducidad=" + fechacaducidad
                + ", porcentajegrasa=" + porcentajegrasa + ", peso="
                + peso + ", preciokilo=" + preciokilo + '}';
    }

}
