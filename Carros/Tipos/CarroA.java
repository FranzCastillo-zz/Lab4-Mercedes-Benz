package Carros.Tipos;

import Carros.Carro;

public class CarroA extends Carro {
    public CarroA(){
        super();
    }

    @Override
    public String modoProductividad() {
        return "*mostrando tarjeta de presentacion*";
    }

    @Override
    public String modoTelefonoEspecifico() {
        // TODO Auto-generated method stub
        return null;
    }

    public String getFuncionProductividad() {
        return "Ver tarjeta de presentacion.";
    }
    
}
