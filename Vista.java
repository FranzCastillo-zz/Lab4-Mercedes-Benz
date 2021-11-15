import java.util.Scanner;
import Carros.Carro;

public class Vista {
    private Scanner scan;
    public Vista(){
        scan = new Scanner(System.in);
    }
    private void prnt(String texto){
        System.out.println(texto);
    }
    private void separador(){
        prnt("--------------------------------------------------------------------");
    }
    public void opcionInvalida(){
        prnt("Ha ingresado una opcion invalida. Pruebe de nuevo.");
    }
    public void inicio(){
        prnt("Bienvenido a Mercedes Benz!");
    }
    public int seleccionarCarro(){
        separador();
        prnt("Que carro desea probar?");
        prnt("1. Carro tipo C");
        prnt("2. Carro tipo A");
        prnt("3. Carro tipo S");
        prnt("4. SALIR");
        separador();
        while(true){
            prnt("Ingrese la seleccion de carro que desea:");
            try{
                int opcion = scan.nextInt();
                scan.nextLine();
                if(opcion > 0 && opcion <= 3){
                    return opcion;
                }else{
                    opcionInvalida();
                }
            }catch(Exception e){ //SI INGRESA ALGO QUE NO ES NUMERO
                scan.next();
                opcionInvalida();
            }       
        }
    }
    public boolean deseaEncender(){
        separador();
        prnt("Que procede?");
        prnt("1. Encender el carro");
        prnt("2. Regresar a seleccionar otro tipo de carro");
        separador();
        while(true){
            prnt("Ingrese la opcion que desea:");
            try{
                int opcion = scan.nextInt();
                scan.nextLine();
                switch(opcion){
                    case 1:
                        return true;
                    case 2:
                        return false;
                    default:
                        opcionInvalida();
                        break;
                }
            }catch(Exception e){ //SI INGRESA ALGO QUE NO ES NUMERO
                scan.next();
                opcionInvalida();
            }       
        }
    }
    public int seleccionarModo(){
        separador();
        prnt("En que modo del carro desea operar?");
        prnt("1. Modo Productividad");
        prnt("2. Modo Radio");
        prnt("3. Modo Reproduccion");
        prnt("4. Modo Telefono");
        prnt("5. Apagar Carro");
        separador();
        while(true){
            prnt("Ingrese la seleccion de modo que desea:");
            try{
                int opcion = scan.nextInt();
                scan.nextLine();
                return opcion;
            }
            catch(Exception e){ //SI INGRESA ALGO QUE NO ES NUMERO
                scan.next();
                opcionInvalida();
            }
        }
    }
}
