
public class sumaconfunciones {
public static int sumar (int numero1, int numero2){
int suma= numero1+numero2;
return suma;
}    
public static void mensaje(){
    System.out.println("Hola Mundo");  
}
    public static void main(String[] args) {
    int numero1=4;
        int numero2=6;
        int resultado= sumar(numero1,numero2);
        System.out.println("Resultado"+ resultado);
        mensaje();
    }
}
//No funciona pq java está muy bug, copiar y pegar el código en pruebas.java