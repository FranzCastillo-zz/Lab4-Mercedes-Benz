package Carros.Tipos;

import Carros.Carro;

public class CarroS extends Carro{
    public CarroS(){
        super();
    }

    
    /** 
     * @return String El resultado de intentar planificar un viaje
     */
    @Override
    // EN UN ACUERDO CON TOMAS EN LA MANERA DE PLANIFICAR ESTA FUNCION SE HA QUEDADO ACORDADO
    public String modoProductividad() {
        return "*planificando viaje* Oh no! Parece que no tienes senial GPS. Prueba de nuevo.";
    }

    
    /** 
     * @return String El efecto de la funcion especifica de telefono
     */
    @Override
    public String modoTelefonoEspecifico() {
        // TODO Auto-generated method stub
        return null;
    }

    
    /** 
     * @return String El nombre de la funcion
     */
    @Override
    public String getFuncionProductividad() {
        return "Planificar Viaje";
    }
    
    /** 
     * @return String el nombre de la funcion
     */
    public String getFuncionalidadTelefonoEspecifica() {
        return "Cambiar de bocinas a auriculares";
    }
}
