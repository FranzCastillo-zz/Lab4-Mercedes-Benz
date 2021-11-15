import java.util.Scanner;

import Carros.Carro;
import Carros.Cancion;


public class Vista {
    private Scanner scan;
    public Vista(){
        scan = new Scanner(System.in);
    }
    
    /** 
     * @param texto
     */
    // ------------------------------------- USO SOLO DE LA VISTA ---------------------------
    private void prnt(String texto){
        System.out.println(texto);
    }
    private void separador(){
        prnt("--------------------------------------------------------------------");
    }
    // ------------------------------------- SIN INTERACCION CON EL USUARIO
    public void opcionInvalida(){
        prnt("Ha ingresado una opcion invalida. Pruebe de nuevo.");
    }
    public void inicio(){
        prnt("Bienvenido a Mercedes Benz!");
    }
    
    /** 
     * @return boolean Si el usuario desea prender el carro (true) o no (false)
     */
    //----------------------------------------------- MENUS -------------------------------------------------
    public boolean deseaEncenderCarro(){
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
    
    /** 
     * @return int El numero de la opcion del menu
     */
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
                if(opcion > 0 && opcion <= 5){
                    return opcion;
                }else{
                    opcionInvalida();
                }
            }
            catch(Exception e){ //SI INGRESA ALGO QUE NO ES NUMERO
                scan.next();
                opcionInvalida();
            }
        }
    }
    
    /** 
     * @return int el tipo de carro que se creara
     */
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
                if(opcion > 0 && opcion <= 4){
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
    
    /** 
     * @param c el carro que se mostrara en modo productividad
     * @return int la opcion del menu
     */

    // ------------------------------------------ PRODUCTIVIDAD
    public int mostrarMenuProductividad(Carro c){
        separador();
        prnt("1. " + c.getFuncionProductividad());
        prnt("2. Salir");
        while(true){
            prnt("Ingrese la accion que desea realizar:");
            try{
                int opcion = scan.nextInt();
                scan.nextLine();
                if(opcion > 0 && opcion <= 2){
                    return opcion;
                }else{
                    opcionInvalida();
                }
            }
            catch(Exception e){ //SI INGRESA ALGO QUE NO ES NUMERO
                scan.next();
                opcionInvalida();
            }
        }
    }
    public void mostrarPantallaModoProductividad(Carro c){
        separador();
        prnt("\nMODO PRODUCTIVIDAD:\n");
        prnt("\t\t" + c.getFuncionProductividad() + "\n");
        separador();
    }
    /** 
     * @param funcion el texto resultante de ejecutar el modo reproduccion
     */
    public void mostrarModoProductividad(String funcion){
        separador();
        prnt(funcion);
        separador();
    }
    
    /** 
     * @return boolean si el usuario desea encender el radio (true) o no (false)
     */
    // --------------------------------------------- RADIO
    public boolean deseaEncenderRadio(){
        separador();
        prnt("Que procede?");
        prnt("1. Encender el radio");
        prnt("2. Regresar a seleccion de modos");
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
    
    /** 
     * @return int la opcion del menu
     */
    public int mostrarMenuRadio(){
        separador();
        prnt("1. Cambiar de FM a AM");
        prnt("2. Cambiar emisoras");
        prnt("3. Guardar emisora actual");
        prnt("4. Cargar Emisora");
        prnt("5. Apagar Radio");
        prnt("6. Salir del Modo radio");
        separador();
        while(true){
            prnt("Ingrese la accion que desea realizar:");
            try{
                int opcion = scan.nextInt();
                scan.nextLine();
                if(opcion > 0 && opcion <= 6){
                    return opcion;
                }else{
                    opcionInvalida();
                }
            }
            catch(Exception e){ //SI INGRESA ALGO QUE NO ES NUMERO
                scan.next();
                opcionInvalida();
            }
        }
    }
    // --------------------------------------------- REPRODUCCION
    /** 
     * @return int la opcion del menu
     */
    public int mostrarMenuReproduccion(){
        separador();
        prnt("Que accion desea realizar?");
        prnt("1. Seleccionar Lista de Reproduccion");
        prnt("2. Siguiente cancion");
        prnt("3. Regresar cancion");
        prnt("4. Escuchar Cancion");
        prnt("5. Salir modo reproduccion");
        separador();
        while(true){
            prnt("Ingrese la accion que desea realizar:");
            try{
                int opcion = scan.nextInt();
                scan.nextLine();
                if(opcion > 0 && opcion <= 4){
                    return opcion;
                }else{
                    opcionInvalida();
                }
            }
            catch(Exception e){ //SI INGRESA ALGO QUE NO ES NUMERO
                scan.next();
                opcionInvalida();
            }
        }
    }
    
    // ----------------------------------------------- TELEFONO
    /** 
     * @return boolean si el usuario desea conectar el telefono (true) o no (false)
     */
    public boolean deseaConectarTelefono(){
        separador();
        prnt("Que procede?");
        prnt("1. Conectar el telefono");
        prnt("2. Regresar a seleccion de modos");
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
    
    /** 
     * @param c el carro con el que se mostrara el menu
     * @return int la opcion del menu
     */
    public int mostrarMenuTelefono(Carro c){
        separador();
        prnt("Que accion desea realizar?");
        prnt("1. Desconectar telefono");
        prnt("2. Mostrar Contactos");
        prnt("3. Llamar a contacto");
        prnt("4. Finalizar llamada");
        prnt("5. " + c.getFuncionalidadTelefonoEspecifica());
        prnt("6. Salir del modo telefono");
        separador();
        while(true){
            prnt("Ingrese la accion que desea realizar:");
            try{
                int opcion = scan.nextInt();
                scan.nextLine();
                if(opcion > 0 && opcion <= 6){
                    return opcion;
                }else{
                    opcionInvalida();
                }
            }
            catch(Exception e){ //SI INGRESA ALGO QUE NO ES NUMERO
                scan.next();
                opcionInvalida();
            }
        }
    }

    /**
     * Despliega la radio apagada
     */
    public void pantallaRadioApagada(){
        separador();
        prnt("\n Radio Apagada \n");
        separador();
    }


    /**
     * Despliega en el radio los datos de la cancion 
     * @param cancion parametro de tipo Cancion
     */
    public void pantallaEnModoReproducción(Carro c){
        Cancion cancion = c.getCancionActual();
        separador();
        prnt("MODO: REPRODUCCION \n" +
                "\t\tPLAYLIST: " + cancion.getPlaylist() + "\n\n" +
                "\t\tEN REPRODUCCION: \n\n" +
                "\t\tCancion: " + cancion.getNombre() + "\n" +
                "\t\tArtista: " + cancion.getAutor() + "\n" +
                "\t\tDuracion: " + cancion.getDuracion() + " min\n");
        separador();
    }

    
    /** 
     * @param texto el texto resultante de reproducir la cancion
     */
    public void mostrarReproducirCancion(String texto){
        prnt(texto);
    }
}
