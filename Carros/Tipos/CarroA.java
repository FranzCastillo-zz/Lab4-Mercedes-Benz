package Carros.Tipos;

import Carros.Carro;
import Carros.Contacto;

public class CarroA extends Carro {
    public CarroA(){
        super();
    }

    
    /** 
     * @return String Las tarjetas de contacto de todos los contactos
     */
    @Override
    public String modoProductividad() {
        String texto = "---------------------------------------------------\n";
        for (Contacto contacto : contactos) {
            texto += contacto.getTarjetaDePresentacion();
            texto += "---------------------------------------------------\n";
        }
        return texto;
    }

    
    /** 
     * @return String el resultado de la llamada al ultimo contacto
     */
    @Override
    public String modoTelefonoEspecifico() {
        // TODO Auto-generated method stub
        return null;
    }

    
    /** 
     * @return String El nombre de la funcion especifica
     */
    public String getFuncionProductividad() {
        return "Ver tarjeta de presentacion.";
    }

    
    /** 
     * @return String El nombre de la funcion especifica
     */
    public String getFuncionalidadTelefonoEspecifica() {
        return "Llamar ultimo contacto";
    }
    
}
