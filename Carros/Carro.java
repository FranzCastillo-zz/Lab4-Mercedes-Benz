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
    private ArrayList<Double> emisorasGuardadas;
    // MODO TELEFONO
    private boolean telefonoConectado;
    protected ArrayList<Contacto> contactos;
    // PROPIEDADES DEL CARRO
    private boolean encendido;
    private boolean estaEnLlamada;
    private String modoActual;
    private double emisoraActual;

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
        emisorasGuardadas = new ArrayList<>();
        // --------------- MODO TELEFONO -----------------
        estaEnLlamada = false;
        telefonoConectado = false;
        contactos = new ArrayList<>();
        inicializarContactos();
        // ------------- ATRIBUTOS DEL CARRO -------------
        encendido = false;
        modoActual = "FM";
        emisoraActual = 90.5;
    }
    // ----------------------------------------- MODO RADIO -----------------------------------
    public void subirEmisora(){
        this.emisoraActual += 0.5;

    }
    public void bajarEmisora(){
        this.emisoraActual -= 0.5;
    }
    public void cambiarModo(){
        if (this.modoActual.equals("FM")){
            this.modoActual = "AM";
        }
        else{
            this.modoActual = "FM";
        }
    }
    public boolean radioEncendido(){
        return radioEncendido;
    }
    public void setRadioEncendido(boolean estado){
        radioEncendido = estado;
    }

    public void guardarEmisora(double e){
        emisorasGuardadas.add(e);
    }
    public void setEmisoraActual(int p){
        this.emisoraActual = emisorasGuardadas.get(p);
    }

    // ----------------------------------------- MODO TELEFONO --------------------------------
    private void inicializarContactos(){
        contactos.add(new Contacto("Franz", 31715415));
        contactos.add(new Contacto("Fer", 58792752));
        contactos.add(new Contacto("Gus", 45801692));
    }
    public boolean telefonoConectado(){
        return this.telefonoConectado;
    }
    public void setTelefonoConectado(boolean estado){
        this.telefonoConectado = estado;
    }
    
    // --------------------------------------- MODO PRODUCTIVIDAD -----------------------------
    /** 
     * @return String El efecto de ejecutar la funcion de productividad
     */

    public abstract String getFuncionProductividad();
    // ----------------------------------------- MODO REPRODUCCION ----------------------------
    private void inicializarListaPop(){
        listaPop.add(new Cancion("Wake Me Up", "Avicii", "4:07", "Lista Pop"));
        listaPop.add(new Cancion("Cocoon", "Milky Chance", "4:15",  "Lista Pop"));
        listaPop.add(new Cancion("Old Me", "5SOS", "3:07", "Lista Pop"));
        listaPop.add(new Cancion("Counting Stars", "OneRepublic", "4:17", "Lista Pop"));
        listaPop.add(new Cancion("Saturday", "Twenty One Pilots", "2:52", "Lista Pop"));
    }
    private void inicializarListaRock(){
        listaRock.add(new Cancion("Golden Trunks","Arctic Monkeys","2:53","Lista Rock"));
        listaRock.add(new Cancion("Slomo", "Slowdive", "6:53", "Lista Rock"));
        listaRock.add(new Cancion("Black Star", "Radiohead", "4:07", "Lista Rock"));
        listaRock.add(new Cancion("Tighten Up", "The Black Keys", "3:31", "Lista Rock"));
        listaRock.add(new Cancion("I'm so afraid", "Fleetwood Mac", "4:23", "Lista Rock"));
    }
    private void inicializarListaRockAlternativo (){
        listaRockAlternativo.add(new Cancion("Time To Dance", "Panic! At The Disco", "3:22", "Lista Rock Alternativo"));
        listaRockAlternativo.add(new Cancion("Losing Blood", "Weathers", "3:21", "Lista Rock Alternativo"));
        listaRockAlternativo.add(new Cancion("What You Know", "Two Door Cinema Club", "3:11", "Lista Rock Alternativo"));
        listaRockAlternativo.add(new Cancion("Reptilia", "The Strokes", "3:40", "Lista Rock Alternativo"));
        listaRockAlternativo.add(new Cancion("Bleak December", "Set It Off", "3:07", "Lista Rock Alternativo"));
    }
    
    /** 
     * @param numeroDeLista El numero de lista que desea el usuario colocar
     */
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
        cancionActual = listaActual.get(0);
    }
    public void adelantarCancion(){
        cancionActual = listaActual.get(++posicionCancionActual % 5);
    }
    public void regresarCancion(){
        
        if(--posicionCancionActual == -1){
            posicionCancionActual = 4;
        }
        cancionActual = listaActual.get(posicionCancionActual % 5);
    }
    
    /** 
     * @return Cancion La cancion que se esta reproduciendo actualmente
     */
    public Cancion getCancionActual(){
        return this.cancionActual;
    }
    
    /** 
     * @return ArrayList<Cancion> La lista de canciones que hay
     */
    public ArrayList<Cancion> getPlaylistActual(){
        return this.listaActual;
    }
    // --------------------------------------- MODO TELEFONO ----------------------------------
    public String llamarContacto(Contacto c){
        String llamada = "";

        return llamada;
    }
    public abstract String getFuncionalidadTelefonoEspecifica();
    //------------------------------------------ SETTERS Y GETTERS -----------------------------
    public boolean getEncendido(){
        return this.encendido;
    }
    public void setEncendido(boolean estado){
        this.encendido = estado;
    }
    
    public String getModoActual(){
        return this.modoActual;
    }
    public double getEmisoraActual(){
        return this.emisoraActual;
    }
    public boolean getEstaEnLlamada(){
        return this.estaEnLlamada;
    }
    public boolean getTelefonoConectado(){
        return this.telefonoConectado;
    }
    public ArrayList<Double> getEmisorasGuardadas(){
        return this.emisorasGuardadas;
    }
    public ArrayList<String[]> getContactos(){
        ArrayList<String[]> contactData = new ArrayList<String[]>();
        
        for (Contacto contacto : contactos) {
            String[] contactInfo = {contacto.getNombre(), String.valueOf(contacto.getNumero())};
            contactData.add(contactInfo);
        }
        return contactData;
    }

}
