package Carros.Modos;

import Carros.Cancion;

public interface ModoReproduccion {
    public abstract void seleccionarLista(int numeroDeLista);
    public abstract void cambiarCancion();
    public abstract String escucharCancion(Cancion c);
}
