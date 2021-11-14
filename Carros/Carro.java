package Carros;

import Carros.Modos.*;
import java.util.ArrayList;

public abstract class Carro implements ModoProductividad, ModoRadio, ModoTelefono, ModoReproduccion{
    private ArrayList<Cancion> listaPop;
    private ArrayList<Cancion> listaRock;
    private ArrayList<Cancion> listaRockAlternativo;
    private ArrayList<Cancion> listaActual;
    private Cancion cancionActual;
    private int posicionCancionActual;

    public Carro(){
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
    }
    // ----------------------------------------- MODO RADIO -----------------------------------
    public void subirEmisora(){

    }
    public void bajarEmisora(){

    }
    public void cambiarModo(){

    }
    // ----------------------------------------------------------------------------------------
    /* --------------------------------------- MODO PRODUCTIVIDAD -----------------------------

                        SE IMPLEMENTA DE MANERA ABSTRACTA EN CADA TIPO DE CARRO

       ----------------------------------------------------------------------------------------*/
    // ----------------------------------------- MODO REPRODUCCION ----------------------------
    // AGREGARLES 5 CANCIONES C/U
    private void inicializarListaPop(){
        //listaPop.add(new Cancion());
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
}
