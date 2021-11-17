import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

import Carros.Carro;
import Carros.Contacto;
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
        prnt("\nMODO: PRODUCTIVIDAD\n");
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
        prnt("2. Avanzar emisora");
        prnt("3. Retroceder emisora");
        prnt("4. Guardar emisora actual");
        prnt("5. Cargar Emisora");
        prnt("6. Apagar Radio");
        prnt("7. Salir del Modo radio");
        separador();
        while(true){
            prnt("Ingrese la accion que desea realizar:");
            try{
                int opcion = scan.nextInt();
                scan.nextLine();
                if(opcion > 0 && opcion <= 7){
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
    public int seleccionarPlaylist(){
        separador();
        prnt("Que playlist desea colocar?");
        prnt("1. Playlist de Pop");
        prnt("2. Playlist de Rock");
        prnt("3. Playlist de Rock Alternativo");
        separador();
        while(true){
            prnt("Ingrese la playlist que desea colocar:");
            try{
                int opcion = scan.nextInt();
                scan.nextLine();
                if(opcion > 0 && opcion <= 3){
                    return opcion - 1;
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
    public void pantallaRadioApagado(){
        separador();
        prnt("\t\t\tRADIO APAGADO");
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

    /**
     * Despliega la pantalla del modo radio
     * @param c parametro de tipo Carro
     */
    public void pantallaEnModoRadio(Carro c){
        separador();
        prnt("MODO: RADIO \n");
        prnt("\t\tBANDA: " + c.getModoActual());
        prnt("\t\tEMISORA: " + c.getEmisoraActual());
        separador();
    }

    /**
     * Despliega la pantalla del modo telefono
     * @param c parametro de tipo Carro
     */
    public void pantallaEnModoTelefono(Carro c){
        boolean telefono = c.getTelefonoConectado();
        boolean llamada = c.getEstaEnLlamada();
        separador();
        prnt("MODO: TELEFONO \n");
        if (telefono == false){
            prnt("\t\tTELEFONO: DESCONECTADO");
        }
        else{
            prnt("\t\tTELEFONO: CONECTADO");
        }
        if (llamada == false){
            prnt("\t\tLLAMADA: NO HAY LLAMADAS SALIENTES");
        }
        else{
            prnt("\t\tLLAMADA: EN LLAMADA");
        }
        separador();
    }

    /**
     * Despliega la pantalla cuando el carro esta apagado
     */
    public void pantallaCarroApagado(){
        separador();
        prnt("\t\t\tCARRO APAGADO");
        separador();
    }

    /**
     * Pide la emisora a guardar
     * @param eg parametro de tipo ArrayList<Double>
     */
    public int pedirEmisora(ArrayList<Double> eg){
        while(true){
            try{
                for (int i = 0; i < eg.size(); i++)
                {
                    prnt(i+1 + ") " + eg.get(i));
                }
                prnt("Que emisora desea cargar? (ingrese solamente el numero)");
                int opcion = scan.nextInt();
                scan.nextLine();
                return opcion-1;
            }
            catch(Exception e){ //SI INGRESA ALGO QUE NO ES NUMERO
                scan.next();
                opcionInvalida();
            }
        }
    }

    /**
     * Despliega un mensaje en pantalla
     */
    public void emisorasLlenas(){
        separador();
        prnt("Se ha alcanzado el limite de emisoras guardadas");
        separador();
    }

    /**
     *Sirve para preguntarle al usuario el contatco que quiere llamar
     * @return devuelve un numero entero
     */
    public int askContactIndex(){
        prnt("Ingrese el numero de contacto: ");
        int contacto = 0;
        try{
            contacto = scan.nextInt();
            scan.nextLine();

            contacto--;

        }catch(InputMismatchException e){
            scan.nextLine();
            opcionInvalida();
        }

        return contacto;
    }

    /**
     * Despliega la llamada a un contacto
     * @param carro Parametro de tipo carro de donde se obtiene la lista de contactos
     * @param indice Parametro de tipo entero que permite ingresar a un dato especifico de los contactos
     */
    public void llamandoContacto(Carro carro,int indice){
        try{
        prnt("Llamando a " + carro.getContactos().get(indice)[0] + "... \n" );
        }catch(IndexOutOfBoundsException e){    
            opcionInvalida();
            llamandoContacto(carro,askContactIndex());
        }
    }

    /**
     * Despliega los contactos en la pantalla
     * @param carro El parametro es de tipo Carro y nos sirve para 
     */
    public void showContacts(Carro carro){
        separador();
        for(int i = 0; i < carro.getContactos().size() ; i++){
            prnt(   "\n" + (i + 1) + ". Nombre: " + carro.getContactos().get(i)[0] + 
                    "\n Numero: " + carro.getContactos().get(i)[1] + "\n");            
        }
        separador();
    }

    public void llamadaFinalizada(){
        prnt("Se ha finalizado la llamada \n");
    }

}

