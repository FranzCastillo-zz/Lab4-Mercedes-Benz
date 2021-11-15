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
        listaPop.add(new Cancion("Wake Me Up", "4:07", "Avicii", "Pop"));
        listaPop.add(new Cancion("Cocoon", "4:15", "Milky Chance", "Pop"));
        listaPop.add(new Cancion("Old Me", "3:07", "5SOS", "Pop"));
        listaPop.add(new Cancion("Counting Stars", "4:17", "OneRepublic", "Pop"));
        listaPop.add(new Cancion("Saturday", "2:52", "Twenty One Pilots", "Pop"));
    }
    private void inicializarListaRock(){
        //listaPop.add(new Cancion());
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
    public String escucharCancion(Cancion c){
        return c.getCancion();
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
