/**
 * Clase que añade una Vaca a nuestra granjita y hereda de la clase Granja.
 * 
 * @author Esteban Fernández González v1.1
 */
public class Vaca extends Granja {
    // Atributos adicionales de la clase Vaca
    private String color;
    private String raza;
    private double produccionLeche;  // Cambiado el nombre del atributo

    // Constructor por defecto

    /**
     * Constructor por defecto que inicializa los atributos de Vaca y llama al constructor de la clase base (Granja).
     */
    public Vaca() {
        // Llamada al constructor de la clase base (Granja)
        super();
        this.color = "";
        this.raza = "";
        this.produccionLeche = 0;
    }

    // Constructor con parámetros

    /**
     * Constructor que permite la creación de una instancia de Vaca con parámetros específicos.
     * 
     * @param nombre             El nombre de la vaca.
     * @param claseDeAnimal      El tipo de animal (en este caso, "Vaca").
     * @param ubicacion          La ubicación de la vaca.
     * @param capacidad          La capacidad de la granja.
     * @param color              El color de la vaca.
     * @param raza               La raza de la vaca.
     * @param produccionLeche    La producción de leche diaria de la vaca en litros.
     */
    public Vaca(String nombre, String claseDeAnimal, String ubicacion, int capacidad, String color, String raza, double produccionLeche) {
        // Llamada al constructor de la clase base (Granja) con parámetros
        super(nombre, claseDeAnimal, ubicacion, capacidad);
        this.color = color;
        this.raza = raza;
        this.produccionLeche = produccionLeche;
    }

    // Getters y setters para los atributos adicionales de la clase Vaca

    /**
     * Método que obtiene el color de la vaca.
     * 
     * @return El color de la vaca.
     */
    public String getColor() {
        return color;
    }

    /**
     * Método que establece el color de la vaca.
     * 
     * @param color El nuevo color de la vaca.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Método que obtiene la raza de la vaca.
     * 
     * @return La raza de la vaca.
     */
    public String getRaza() {
        return raza;
    }

    /**
     * Método que establece la raza de la vaca.
     * 
     * @param raza La nueva raza de la vaca.
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * Método que obtiene la producción de leche diaria de la vaca.
     * 
     * @return La producción de leche diaria de la vaca en litros.
     */
    public double getProduccionLeche() {
        return produccionLeche;
    }

    /**
     * Método que establece la producción de leche diaria de la vaca.
     * 
     * @param produccionLeche La nueva producción de leche diaria de la vaca en litros.
     */
    public void setProduccionLeche(double produccionLeche) {
        this.produccionLeche = produccionLeche;
    }

    /**
     * Método que proporciona una representación en cadena de la vaca.
     * 
     * @return Representación en cadena de la vaca.
     */
    @Override
    public String toString() {
        return "Vaca: " + getNombre() + ", Color: " + getColor() + ", Raza: " + getRaza() + ", Producción de Leche: " + getProduccionLeche() + " litros/día";
    }
}
