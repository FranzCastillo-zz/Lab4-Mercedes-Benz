package Carros.Tipos;

import Carros.Carro;

public class CarroS extends Carro{
    boolean bocinas;

    public CarroS(){
        super();
        this.bocinas = true;
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
     * @return String mensaje que le indica al usuario el estado del dispositivo de audio(bocinas)
     */
    @Override
    public String modoTelefonoEspecifico() {
        String message = "Se ha cambiado el dispositivo de audio a: ";
        
        if(this.bocinas){
            this.bocinas = false;
            message += "auriculares";
        }else{
            this.bocinas = true;
            message += "bocinas";
        }
        
        return message;
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
