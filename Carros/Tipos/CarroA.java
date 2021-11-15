package Carros.Tipos;

import Carros.Carro;
import Carros.Contacto;

public class CarroA extends Carro {
    public CarroA(){
        super();
    }

    @Override
    public String modoProductividad() {
        Contacto actual = this.contactos.get(getRandomNumber(0, contactos.size() - 1)); // OBTIENE UN CONTACTO AL AZAR DE LA LISTA DE CONTACTOS
        return actual.getTarjetaDePresentacion();
    }

    @Override
    public String modoTelefonoEspecifico() {
        // TODO Auto-generated method stub
        return null;
    }

    public String getFuncionProductividad() {
        return "Ver tarjeta de presentacion.";
    }

    public String getFuncionalidadTelefonoEspecifica() {
        return "Llamar ultimo contacto";
    }
    
}
