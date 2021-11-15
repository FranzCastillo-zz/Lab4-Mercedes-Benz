package Carros.Tipos;

import Carros.Carro;

public class CarroS extends Carro{
    public CarroS(){
        super();
    }

    @Override
    // EN UN ACUERDO CON TOMAS EN LA MANERA DE PLANIFICAR ESTA FUNCION SE HA QUEDADO ACORDADO
    public String modoProductividad() {
        return "*planificando viaje* Oh no! Parece que no tienes senial GPS. Prueba de nuevo.";
    }

    @Override
    public String modoTelefonoEspecifico() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getFuncionProductividad() {
        return "Planificar Viaje";
    }
    public String getFuncionalidadTelefonoEspecifica() {
        return "Cambiar de bocinas a auriculares";
    }
}
