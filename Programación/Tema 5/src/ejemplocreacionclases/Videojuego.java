
package ejemplocreacionclases;

public class Videojuego {
       private int pegi;
       private double precio,nota;
       private String nombre,genero;   
       
        public  void Encender(){
        System.out.println("El videojuego esta encendiendose");
        }
        public  void Cargar(){
            System.out.println("El videojuego esta cargando");
         }   
        protected  void Reiniciar(){
            System.out.println("El videojuego esta reiniciandose");
        }
}
