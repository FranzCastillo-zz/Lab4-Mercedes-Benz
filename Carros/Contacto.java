package Carros;

public class Contacto {
    private String nombre;
    private int numero;
    public Contacto(String nombre, int numero){
        this.nombre = nombre;
        this.numero = numero;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getNumero(){
        return this.numero;
    }
    public String getTarjetaDePresentacion(){
        String tarjeta = "";
        tarjeta += "Tarjeta de presentacion de " + nombre + ":\n\n";
        tarjeta += "Nombre: " + nombre + "\n";
        tarjeta += "Numero: " + numero + "\n";
        return tarjeta;
    }
}
