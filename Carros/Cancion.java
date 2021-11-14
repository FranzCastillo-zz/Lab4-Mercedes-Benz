package Carros;

public class Cancion {
    private String nombre;
    private String duracion;
    private String autor;
    private String genero;

    public Cancion(String nombre, String duracion, String autor, String genero){
        this.nombre = nombre;
        this.duracion = duracion;
        this.autor = autor;
        this.genero = genero;
    }
    public String getCancion(){
        String cancion = "";
        
        cancion += "Ahora sonando: '" + this.nombre + "'\n";
        cancion += "De: " + this.autor + "\n";
        cancion += "Duracion: " + this.duracion + "\n";
        cancion += "Genero: " + this.genero + "\n";

        return cancion;
    }
}
