package Carros.Tipos;

import Carros.Carro;

public class CarroS extends Carro{
    public CarroS(){
        super();
    }

    @Override
    public String modoProductividad() {
        return "*planificando viaje*";
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
