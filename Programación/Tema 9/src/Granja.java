/**
 * Clase que representa una granja con ciertas características y métodos asociados.
 * 
 * @author Esteban Fernández González v1.1
 */
public class Granja {
    // Atributos de la clase
    private String nombre;
    private String clase_de_animal;
    private String ubicacion;
    private int capacidad;

    /**
     * Constructor predeterminado que inicializa los atributos con valores por defecto.
     */
    public Granja() {
        this.nombre = "";
        this.clase_de_animal = "";
        this.ubicacion = "";
        this.capacidad = 0;
    }

    /**
     * Constructor que permite la creación de una instancia de Granja con parámetros específicos.
     * 
     * @param nombre         El nombre de la granja.
     * @param claseDeAnimal  El tipo de animal que se cría en la granja.
     * @param ubicacion      La ubicación de la granja.
     * @param capacidad      La capacidad máxima de animales que puede albergar la granja.
     */
    public Granja(String nombre, String claseDeAnimal, String ubicacion, int capacidad) {
        this.nombre = nombre;
        this.clase_de_animal = clase_de_animal;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
    }

    // Métodos de acceso (getters y setters) para los atributos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getclase_de_animal() {
        return clase_de_animal;
    }

    public void setclase_de_animal(String clase_de_animal) {
        this.clase_de_animal = clase_de_animal;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * Método que verifica si hay suficiente capacidad en la granja para una cantidad específica de animales.
     * 
     * @param cantidadAnimales La cantidad de animales a verificar.
     * @return true si hay suficiente capacidad, false de lo contrario.
     */
    public boolean verificarCuantoDisponible(int cantidadAnimales) {
        return this.capacidad >= cantidadAnimales;
    }

    /**
     * Método que proporciona una representación en cadena de la instancia de Granja.
     * 
     * @return Representación en cadena de la instancia.
     */
    @Override
    public String toString() {
        return "Granja{" +
                "nombre='" + nombre + '\'' +
                ", claseDeAnimal='" + clase_de_animal + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
