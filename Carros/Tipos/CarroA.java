package Carros.Tipos;

import Carros.Carro;
import Carros.Contacto;

public class CarroA extends Carro {
    public CarroA(){
        super();
    }

    @Override
    public String modoProductividad() {
        String texto = "---------------------------------------------------\n";
        for (Contacto contacto : contactos) {
            texto += contacto.getTarjetaDePresentacion();
            texto += "---------------------------------------------------\n";
        }
        return texto;
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
