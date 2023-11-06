/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Videojuego;

/**
 *
 * @author kekom
 */
public class Videojuego {
    
    private String nombre,genero,desarrollador;
    private int pegi;
    private double precio;
    
    static int descuento = 10;
    
    public Videojuego(){
       
        nombre ="";
        genero ="";
        desarrollador = "";
        pegi = 0;
        precio = 0;
        
        
    }
    
    public Videojuego(String nombre,String genero,String desarrollador, int pegi, double precio){
      this.nombre = nombre;
      this.genero = genero;
      this.pegi = pegi;
      this. precio = precio;
      this.desarrollador = desarrollador;
        
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getDesarrollador(){
        return desarrollador;
    }
        public void setDesarrollador(String desarrollador){
        this.desarrollador = desarrollador;
    }
    public int getPegi(){
        return pegi;
    }
        public void setPegi(int pegi){
        this.pegi = pegi;
    }
    public double getPrecio(){
        return precio;
    }
        public void setPrecio(int precio){
        this.precio = precio;   
}

    /**
     *
     * @return
     */
        
        
    //esto es un método personalizado
    public void aplicarDescuento(){
        if(precio >= 15){
            precio = precio - descuento;
         //puedes omitir las llaves si es solo una linea de código
        }
        else
            System.out.println("No se puede aplicar el descuento");
    }
        
        //el metodo toString se deja para el final     
        @Override
        public String toString(){
            return"Videojuego{" + "Nombre=" + nombre + ", genero=" + genero
                    + ", desarrollador=" + desarrollador + ", pegi="
                    + pegi + ", precio=" + precio +'}';
        }
        }
