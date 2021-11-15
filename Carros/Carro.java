package Carros;

import Carros.Modos.*;
import java.util.ArrayList;

public abstract class Carro implements ModoProductividad, ModoRadio, ModoTelefono, ModoReproduccion{
    // MODO REPRODUCCION
    private ArrayList<Cancion> listaPop;
    private ArrayList<Cancion> listaRock;
    private ArrayList<Cancion> listaRockAlternativo;
    private ArrayList<Cancion> listaActual;
    private Cancion cancionActual;
    private int posicionCancionActual;
    // MODO RADIO
    private boolean radioEncendido;
    // MODO TELEFONO
    private boolean telefonoConectado;
    // PROPIEDADES DEL CARRO
    private boolean encendido;
    private boolean estaEnLlamada;

    public Carro(){
        // -------------- MODO REPRODUCCION ---------------
        listaActual = new ArrayList<>();
        // POP
        listaPop = new ArrayList<>();
        inicializarListaPop();
        // ROCK
        listaRock = new ArrayList<>();
        inicializarListaRock();
        // ROCK ALTERNATIVO
        listaRockAlternativo = new ArrayList<>();
        inicializarListaRockAlternativo();
        listaActual = listaPop;
        posicionCancionActual = 0;
        cancionActual = listaActual.get(posicionCancionActual);
        // --------------- MODO RADIO --------------------
        radioEncendido = false;
        // --------------- MODO TELEFONO -----------------
        telefonoConectado = false;
        // ------------- ATRIBUTOS DEL CARRO -------------
        encendido = false;
    }
    // ----------------------------------------- MODO RADIO -----------------------------------
    public void subirEmisora(){

    }
    public void bajarEmisora(){

    }
    public void cambiarModo(){

    }
    public boolean radioEncendido(){
        return radioEncendido;
    }
    public void setRadioEncendido(boolean estado){
        radioEncendido = estado;
    }
    // ----------------------------------------------------------------------------------------
    // ----------------------------------------- MODO TELEFONO --------------------------------
    public boolean telefonoConectado(){
        return this.telefonoConectado;
    }
    public void setTelefonoConectado(boolean estado){
        this.telefonoConectado = estado;
    }
    // ----------------------------------------------------------------------------------------
    // --------------------------------------- MODO PRODUCTIVIDAD -----------------------------
    public abstract String getFuncionProductividad();
    //  ----------------------------------------------------------------------------------------
    // ----------------------------------------- MODO REPRODUCCION ----------------------------
    // AGREGARLES 5 CANCIONES C/U
    private void inicializarListaPop(){
        listaPop.add(new Cancion("Wake Me Up", "Avicii", "4:07", "Lista Pop"));
        listaPop.add(new Cancion("Cocoon", "Milky Chance", "4:15",  "Lista Pop"));
        listaPop.add(new Cancion("Old Me", "5SOS", "3:07", "Lista Pop"));
        listaPop.add(new Cancion("Counting Stars", "OneRepublic", "4:17", "Lista Pop"));
        listaPop.add(new Cancion("Saturday", "Twenty One Pilots", "2:52", "Lista Pop"));
    }
    private void inicializarListaRock(){
        listaRock.add(new Cancion("Golden Trunks","Arctic Monkeys","2:53","Lista Rock"));
    }
    private void inicializarListaRockAlternativo (){
        //listaPop.add(new Cancion());
    }
    public void seleccionarLista(int numeroDeLista){
        switch(numeroDeLista){
            case 0:
                listaActual = listaPop;
                break;
            case 1:
                listaActual = listaRock;
                break;
            case 2:
                listaActual = listaRockAlternativo;
                break;
        }
    }
    public void cambiarCancion(){

    }
    /*public String escucharCancion(Cancion c){
        //return c.getCancion();
        return null;
    }*/
    public Cancion getCancionActual(){
        return this.cancionActual;
    }
    public ArrayList<Cancion> getPlaylistActual(){
        return this.listaActual;
    }
    // ----------------------------------------------------------------------------------------
    // --------------------------------------- MODO TELEFONO ----------------------------------
    public String llamarContacto(Contacto c){
        String llamada = "";

        return llamada;
    }
    public abstract String getFuncionalidadTelefonoEspecifica();
    //------------------------------------------------------------------------------------------
    //------------------------------------------ SETTERS Y GETTERS -----------------------------
    public boolean getEncendido(){
        return this.encendido;
    }
    public void setEncendido(boolean estado){
        this.encendido = estado;
    }
}
