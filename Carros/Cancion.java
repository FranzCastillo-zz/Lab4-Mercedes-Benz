package Carros;

public class Cancion {
    private String nombre;
    private String duracion;
    private String autor;
    private String playlist;

    public Cancion(String nombre, String autor, String duracion, String playlist){
        this.nombre = nombre;
        this.autor = autor;
        this.duracion = duracion;        
        this.playlist = playlist;
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

    public String getPlaylist() {
        return this.playlist;
    }
    public String reproducir(){
        return "Esta sonando: " + this.nombre + " de " + this.autor;
    }
}
