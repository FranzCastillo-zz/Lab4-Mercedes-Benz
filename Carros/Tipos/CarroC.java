package Carros.Tipos;

import Carros.Carro;

public class CarroC extends Carro{
    public CarroC(){
        super();
    }
    @Override
    public String modoProductividad() {
        return "Mmm... Parece que habra un dia soleado.";
    }

    @Override
    public String modoTelefonoEspecifico() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public String getFuncionProductividad() {
        return "Ver pronostico del tiempo";
    }
    
}
