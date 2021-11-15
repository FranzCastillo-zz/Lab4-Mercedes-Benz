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

    
    /** 
     * @return String El nombre de la cancion
     */
    public String getNombre() {
        return this.nombre;
    }

    
    /** 
     * @return String la duracion de la cancion
     */
    public String getDuracion() {
        return this.duracion;
    }

    
    /** 
     * @return String el nombre del Autor
     */
    public String getAutor() {
        return this.autor;
    }

    
    /** 
     * @return String EL nombre de la playlist a la que pertenece
     */
    public String getPlaylist() {
        return this.playlist;
    }
    
    /** 
     * @return String El efecto de reproducir esta cancion
     */
    public String reproducir(){
        return "Esta sonando: " + this.nombre + " de " + this.autor;
    }
}
