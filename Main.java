import Carros.Cancion;

public class Main{
    public static void main(String[] args) {
        Vista v = new Vista();
        /*
        MercedesBenz mb = new MercedesBenz();
        mb.ejecutar();
        */

        Cancion cancion = new Cancion("Golden Trunks","Arctic Monkeys","2:53","Rock");
        v.pantallaEnModoReproducción(cancion);

    }
}