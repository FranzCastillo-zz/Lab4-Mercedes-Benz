package Carros.Modos;

public interface ModoRadio {
    public abstract void cambiarModo();
    public abstract void bajarEmisora();
    public abstract void subirEmisora();
    public abstract boolean radioEncendido();
    public abstract void setRadioEncendido(boolean estado);
}
