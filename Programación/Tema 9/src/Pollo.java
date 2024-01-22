/**
 * Clase que añade un Pollo a nuestra granjita y hereda de la clase Granja.
 * 
 * @author Esteban Fernández González v1.1
 */
public class Pollo extends Granja {
    // Atributos adicionales de la clase Pollo
    private int edad;
    private int tamaño;
    private String tipoAlimentacion;

    // Constructor por defecto

    /**
     * Constructor por defecto que inicializa los atributos de Pollo y llama al constructor de la clase base (Granja).
     */
    public Pollo() {
        // Llamada al constructor de la clase base (Granja)
        super();
        this.edad = 0;
        this.tamaño = 0;
        this.tipoAlimentacion = "";
    }

    // Constructor con parámetros

    /**
     * Constructor que permite la creación de una instancia de Pollo con parámetros específicos.
     * 
     * @param nombre             El nombre del pollo.
     * @param clase_de_animal    El tipo de animal (en este caso, "Pollo").
     * @param ubicacion          La ubicación del pollo.
     * @param capacidad          La capacidad de la granja.
     * @param edad               La edad del pollo en días.
  
     * @param tamaño             El tamaño del pollo en cm.
     * @param tipoAlimentacion   El tipo de alimentación del pollo.
     */
    public Pollo(String nombre, String claseDeAnimal, String ubicacion, int capacidad, int edad, int tamaño, String tipoAlimentacion) {
        // Llamada al constructor de la clase base (Granja) con parámetros
        super(nombre, claseDeAnimal, ubicacion, capacidad);
        this.edad = edad;
        this.tamaño = tamaño;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    // Getters y setters para los nuevos atributos de la clase Pollo

    /**
     * Método que obtiene la edad del pollo.
     * 
     * @return La edad del pollo en días.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método que establece la edad del pollo.
     * 
     * @param edad La nueva edad del pollo en días.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método que obtiene el tamaño del pollo.
     * 
     * @return El tamaño del pollo en cm.
     */
    public int getTamaño() {
        return tamaño;
    }

    /**
     * Método que establece el tamaño del pollo.
     * 
     * @param tamaño El nuevo tamaño del pollo en cm.
     */
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * Método que obtiene el tipo de alimentación del pollo.
     * 
     * @return El tipo de alimentación del pollo.
     */
    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    /**
     * Método que establece el tipo de alimentación del pollo.
     * 
     * @param tipoAlimentacion El nuevo tipo de alimentación del pollo.
     */
    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    /**
     * Método que proporciona una representación en cadena del pollo.
     * 
     * @return Representación en cadena del pollo.
     */
    
    @Override
    public String toString() {
        return "Pollo: " + getNombre() + ", Edad: " + getEdad() + " días, Tamaño: " + getTamaño() + " cm, Tipo de Alimentación: " + getTipoAlimentacion();
    }
}
