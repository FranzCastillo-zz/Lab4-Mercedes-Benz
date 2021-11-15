package Carros;

public class Cancion {
    private String nombre;
    private String duracion;
    private String autor;
    private String genero;

    public Cancion(String nombre, String autor, String duracion, String genero){
        this.nombre = nombre;
        this.autor = autor;
        this.duracion = duracion;        
        this.genero = genero;
    }

    public Cancion getCancion(){
        return this;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDuracion() {
        return this.duracion;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getGenero() {
        return this.genero;
    }

}
