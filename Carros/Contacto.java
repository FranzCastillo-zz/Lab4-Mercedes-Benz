package Carros;

public class Contacto {
    private String nombre;
    private int numero;
    public Contacto(String nombre, int numero){
        this.nombre = nombre;
        this.numero = numero;
    }
    
    /** 
     * @return String El nombre del contacto
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /** 
     * @return int el numero telefonico del contacto
     */
    public int getNumero(){
        return this.numero;
    }
    
    /** 
     * @return String la tarjeta de presentacion del contacto
     */
    public String getTarjetaDePresentacion(){
        String tarjeta = "";
        tarjeta += "Tarjeta de presentacion de " + nombre + ":\n\n";
        tarjeta += "Nombre: " + nombre + "\n";
        tarjeta += "Numero: " + numero + "\n";
        return tarjeta;
    }
}
