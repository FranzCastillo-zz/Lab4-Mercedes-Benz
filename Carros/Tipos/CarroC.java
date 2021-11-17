package Carros.Tipos;

import Carros.Carro;
import java.util.Random;

public class CarroC extends Carro{    

    public CarroC(){
        super();  
    }
    
    /** 
     * @return String El pronostico del clima
     */
    @Override
    public String modoProductividad() {
        Random r = new Random();
        int numero = r.nextInt(100);
        if(numero >= 0 && numero <= 25){
            return "Mmm... Parece que habra un dia soleado.";
        }else if(numero > 25 && numero <= 50){
            return "Mmm... Parece que habra un dia lluviosos! Lleva sombrilla";
        }else if(numero > 50 && numero <= 75){
            return "Mmm... Lleva sueter! Esta haciendo mucho frio!";
        }else{
            return "Mejor clima no podria haber";
        }
    }

    
    /**
     * Devuelve un mensaje u otro dependiendo si el ususario esta en una llamada o no 
     */
    @Override
    public String modoTelefonoEspecifico() {
        String message = null;
        if(getEstaEnLlamada()){
            message = "Se ha puesto la llamada en espera";
        }else{
            message = "No hay ninguna llamada en curso, por lo tanto no se ha puesto en espera";
        }
        return message;
    }

    /** 
     * @return String El nombre de la funcion 
     */
    @Override
    public String getFuncionProductividad() {
        return "Ver pronostico del tiempo";
    }
    
    /** 
     * @return String El nombre de la funcion
     */
    public String getFuncionalidadTelefonoEspecifica() {
        return "Poner llamada en espera";
    }
    
}
