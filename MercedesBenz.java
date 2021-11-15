import Carros.*;
import Carros.Tipos.*;

public class MercedesBenz {
    private Carro carroActual;
    private Vista v;
    
    public MercedesBenz(){
        v = new Vista();
        carroActual = null;
    }

    public void ejecutar(){
        while(true){
            boolean regresarSeleccionCarro = false;
            int tipoCarro = v.seleccionarCarro();
            crearCarro(tipoCarro);
            while(!carroActual.getEncendido() && !regresarSeleccionCarro){
                if(v.deseaEncender()){ // EL CARRO SE ENCIENDE
                    carroActual.setEncendido(true);
                    while(carroActual.getEncendido()){
                        int opcion = v.seleccionarModo();
                        switch(opcion){
                            case 1: // MODO PRODUCTIVIDAD
                            break;
                            case 2: // MODO RADIO
                            break;
                            case 3: // MODO REPRODUCCION
                            break;
                            case 4: // MODO TELEFONO
                            break;
                            case 5: // APAGAR CARRO
                                carroActual.setEncendido(false);
                            break;
                        }
                    }
                }else{ // SI INGRESA QUE DESEA REGRESAR A LA SELECCION DE AUTOS TERMINA EL WHILE DE ESTE MENU
                    regresarSeleccionCarro = true; 
                }
            }
        }
    }
    private void crearCarro(int tipoCarro){
        switch(tipoCarro){
            case 1: //CARRO TIPO C
                carroActual = new CarroC();
            break;
            case 2: // TIPO A
                carroActual = new CarroA();
            break;
            case 3: // TIPO S
                carroActual = new CarroS();
            break;
            case 4: //SALIR
                System.exit(1); 
            break;
        }    
    }
}
