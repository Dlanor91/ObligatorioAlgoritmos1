package trabajarconobligatorio;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author Rafael
 */
public class TRABAJARCONOBLIGATORIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        Obligatorio obl = new Obligatorio();
        Prueba p = new Prueba();
        //juegodeprueba1(obl, p); // juego de prueba ejemplo
        //juegodeprueba3(obl, p); //juego de prueba 3
        juegodepruebadefensa(obl, p); //juego de prueba del profesor
    }

    public static void juegodeprueba1(Obligatorio obl, Prueba p) {
        // escriba su juego de prueba aqui   
        
          p.ver(obl.crearSistemaMensajes(3).resultado, Retorno.Resultado.OK, "Se creara sistma para 3 palabras por linea: ");
          Date date = new Date();
          Date date2 = new Date(122,4,27);
          Date date3 = new Date(122,4,28);
            
        p.ver(obl.ingresarPalabraDiccionario("Camion").resultado, Retorno.Resultado.OK,"");
        //p.ver(obl.ingresarPalabraDiccionario("Embriague").resultado, Retorno.Resultado.OK,"Se ingreso la palabra Rueda: ");
        p.ver(obl.ingresarPalabraDiccionario("Arbol").resultado, Retorno.Resultado.ERROR,"Se ingreso la palabra Camion: ");
        //p.ver(obl.ingresarPalabraDiccionario("Rueda").resultado, Retorno.Resultado.OK,"Se ingreso la palabra Embriague: ");
        p.ver(obl.ingresarPalabraDiccionario("Camion").resultado, Retorno.Resultado.ERROR,"Se ingreso la palabra Camion: ");
        p.ver(obl.ingresarPalabraDiccionario("Espejo").resultado, Retorno.Resultado.OK,"Se ingreso la palabra Espejo: ");
        p.ver(obl.ingresarPalabraDiccionario("Quiero").resultado, Retorno.Resultado.OK,"Se ingreso la palabra Quiero: ");
        p.ver(obl.ingresarPalabraDiccionario("Mundo").resultado, Retorno.Resultado.OK,"Se ingreso la palabra Mundo: ");
        p.ver(obl.ingresarPalabraDiccionario("Vida").resultado, Retorno.Resultado.OK,"Se ingreso la palabra Vida: ");
        p.ver(obl.ingresarPalabraDiccionario("Naranja").resultado, Retorno.Resultado.OK,"Se ingreso la palabra Naranja: ");
        p.ver(obl.ingresarPalabraDiccionario("Palabra2").resultado, Retorno.Resultado.OK,"Se ingreso la palabra Palabra2: ");
        
//        p.ver(obl.ingresarPalabraDiccionario("Parabrisas").resultado, Retorno.Resultado.OK,"Se ingreso la palabra Parabrisas: ");
//        p.ver(obl.ingresarPalabraDiccionario("Parabrisas").resultado, Retorno.Resultado.OK,"Se ingreso la palabra Parabrisas: ");
//        p.ver(obl.ingresarPalabraDiccionario("Palanca").resultado, Retorno.Resultado.OK,"Se ingreso la palabra Parabrisas: ");
//        p.ver(obl.ingresarPalabraDiccionario("Letrero").resultado, Retorno.Resultado.OK,"Se ingreso la palabra Parabrisas: ");
//        p.ver(obl.ingresarPalabraDiccionario("Parabrisas").resultado, Retorno.Resultado.OK,"Se ingreso la palabra Parabrisas: ");
//        p.ver(obl.ingresarPalabraDiccionario("Letrero").resultado, Retorno.Resultado.OK,"Se ingreso la palabra Parabrisas: ");
//        p.ver(obl.ingresarPalabraDiccionario("Letrero").resultado, Retorno.Resultado.OK,"Se ingreso la palabra Parabrisas: ");
//        p.ver(obl.ingresarPalabraDiccionario("Letrero").resultado, Retorno.Resultado.OK,"Se ingreso la palabra Parabrisas: ");
//        p.ver(obl.ingresarPalabraDiccionario("Zumbido").resultado, Retorno.Resultado.OK,"Se ingreso la palabra Parabrisas: ");
//        p.ver(obl.ingresarPalabraDiccionario("Camion").resultado, Retorno.Resultado.ERROR,"Se ingreso la palabra Camion: ");
//        p.ver(obl.ingresarPalabraDiccionario("Camion").resultado, Retorno.Resultado.ERROR,"Se ingreso la palabra Camion: ");
//        p.ver(obl.ingresarPalabraDiccionario("Amor").resultado, Retorno.Resultado.ERROR,"Se ingreso la palabra Camion: ");
//        p.ver(obl.ingresarPalabraDiccionario("Zorro").resultado, Retorno.Resultado.ERROR,"Se ingreso la palabra Camion: ");
//        p.ver(obl.ingresarPalabraDiccionario("tango").resultado, Retorno.Resultado.ERROR,"Se ingreso la palabra Camion: ");    
        p.ver(obl.imprimirDiccionario().resultado, Retorno.Resultado.OK,"");
//        
//        p.ver(obl.borrarPalabraDiccionario("Parabrisas").resultado, Retorno.Resultado.OK,"Palabra Eliminada");
//        p.ver(obl.imprimirDiccionario().resultado, Retorno.Resultado.OK,"");
//        
//        p.ver(obl.borrarPalabraDiccionario("Camion").resultado, Retorno.Resultado.OK,"Palabra Eliminada");
//        p.ver(obl.imprimirDiccionario().resultado, Retorno.Resultado.OK,"");
        

//        
        p.ver(obl.agregarContacto(1, "Juan Bautista").resultado, Retorno.Resultado.OK, "se agrega contacto Juan Perez al sistema");
        p.ver(obl.agregarContacto(1, "Julian Gomez").resultado, Retorno.Resultado.ERROR, "El contacto origen ya existe");
        p.ver(obl.agregarContacto(2, "Rosinnela Bravo").resultado, Retorno.Resultado.OK, "se agrega contacto Juan Perez al sistema");
        p.ver(obl.agregarContacto(3, "Pedro Penela").resultado, Retorno.Resultado.OK, "se agrega contacto Juan Perez al sistema");
        p.ver(obl.agregarContacto(4, "Jose Perez").resultado, Retorno.Resultado.OK, "se agrega contacto Juan Perez al sistema");        
//        p.ver(obl.mostrarContactos().resultado, Retorno.Resultado.OK, "");
//        p.ver(obl.eliminarContacto(1).resultado, Retorno.Resultado.OK, "");
        p.ver(obl.agregarContacto(5, "Armando Perez").resultado, Retorno.Resultado.OK, "se agrega contacto Juan Perez al sistema");
        p.ver(obl.agregarContacto(6, "Javier Gonzalez").resultado, Retorno.Resultado.OK, "se agrega contacto Juan Perez al sistema");

//        p.ver(obl.mostrarContactos().resultado, Retorno.Resultado.OK, "");
//        p.ver(obl.eliminarContacto(3).resultado, Retorno.Resultado.OK, "");
//        p.ver(obl.agregarContacto(1, "//uan Perez").resultado, Retorno.Resultado.ERROR, "se intenta agregar contacto Juan Perez que ya existe");
        p.ver(obl.eliminarContacto(6).resultado, Retorno.Resultado.OK, "se elimina contacto Juan Perez del sistema");
        p.ver(obl.mostrarContactos().resultado, Retorno.Resultado.OK, "");
        //Primero se pasa el Cont Dest  y luego el numero de mensaje
        p.ver(obl.agregarMensaje(1, 2,date).resultado, Retorno.Resultado.OK, "");
        p.ver(obl.agregarMensaje(1, 2,date2).resultado, Retorno.Resultado.OK, "");
        p.ver(obl.agregarMensaje(1, 4,date).resultado, Retorno.Resultado.OK, "");
        p.ver(obl.agregarMensaje(1, 5,date).resultado, Retorno.Resultado.OK, "");
        p.ver(obl.agregarMensaje(1, 3,date).resultado, Retorno.Resultado.OK, "");        
        p.ver(obl.agregarMensaje(1, 4,date2).resultado, Retorno.Resultado.OK, "");
        p.ver(obl.agregarMensaje(1, 3,date2).resultado, Retorno.Resultado.OK, "");
        p.ver(obl.agregarMensaje(1, 2,date3).resultado, Retorno.Resultado.OK, "");        
//        p.ver(obl.destruirSistemaMensajes().resultado, Retorno.Resultado.OK, " sistema eliminado");
        p.ver(obl.eliminarMensaje(3,3).resultado, Retorno.Resultado.ERROR, "No existe el mensaje a eliminar para ese destino");       
//        p.ver(obl.eliminarMensaje(1,2).resultado, Retorno.Resultado.OK, "");
//        p.ver(obl.insertarLinea(2,1).resultado, Retorno.Resultado.OK, "");
//        p.ver(obl.insertarPalabraEnLinea(2,1,1,1,"Pais").resultado, Retorno.Resultado.OK, "");
//        p.ver(obl.insertarLinea(2,2).resultado, Retorno.Resultado.OK, "");
//        p.ver(obl.insertarPalabraEnLinea(2,2,1,1,"Literal").resultado, Retorno.Resultado.OK, "");
//        p.ver(obl.insertarLinea(2,3).resultado, Retorno.Resultado.OK, "");
//        p.ver(obl.insertarPalabraEnLinea(2,3,1,1,"Frio").resultado, Retorno.Resultado.OK, "");
        p.ver(obl.eliminarMensaje(2,2).resultado, Retorno.Resultado.OK, "");
        p.ver(obl.eliminarMensaje(5,1).resultado, Retorno.Resultado.OK, "");
//        p.ver(obl.eliminarMensaje(2,3).resultado, Retorno.Resultado.OK,"");
        
        p.ver(obl.insertarLinea(2,2).resultado, Retorno.Resultado.ERROR, "No puede insertar una linea en un mensaje que no existe"); 
        p.ver(obl.insertarLinea(2,1).resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarLinea(2,1).resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarLinea(2,3).resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarLinea(2,3).resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarLinea(2,3).resultado, Retorno.Resultado.OK, "");
        
        //p.ver(obl.insertarLinea(2,2).resultado, Retorno.Resultado.OK, ""); 
        p.ver(obl.insertarLinea(3,1).resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarLineaEnPosicion(2,2,1).resultado, Retorno.Resultado.ERROR, "No existe el mensaje, no se puede insertar la linea");
        p.ver(obl.insertarLineaEnPosicion(3,1,4).resultado, Retorno.Resultado.ERROR, "Existe el mensaje, pero no existen esa cantidad de lineas, no se puede insertar la linea.");
        p.ver(obl.insertarLineaEnPosicion(3,1,1).resultado, Retorno.Resultado.OK, "");
//        p.ver(obl.insertarLineaEnPosicion(2,1,2).resultado, Retorno.Resultado.OK, "");
        p.ver(obl.borrarLinea(3,1,3).resultado, Retorno.Resultado.ERROR, "Existe el mensaje, no existe la linea para borrar.");
        p.ver(obl.borrarLinea(3,3,1).resultado, Retorno.Resultado.ERROR, "No existe el mensaje, no se puede borrar la linea.");
        p.ver(obl.insertarPalabraEnLinea(2,3,1,1,"Mente").resultado, Retorno.Resultado.OK, "");
        //p.ver(obl.insertarPalabraEnLinea(2,3,2,1,"Positiva").resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarPalabraEnLinea(2,3,3,1,"Nublada").resultado, Retorno.Resultado.OK, "");
        p.ver(obl.borrarLinea(2,3,2).resultado, Retorno.Resultado.OK, "");
        p.ver(obl.borrarLinea(2,3,1).resultado, Retorno.Resultado.OK, "");
        p.ver(obl.borrarLinea(2,3,1).resultado, Retorno.Resultado.OK, "");         
        p.ver(obl.insertarPalabraEnLinea(2,1,1,1,"Vida").resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarPalabraEnLinea(2,1,4,1,"Manzana").resultado, Retorno.Resultado.ERROR, "Existe el mensaje, no existe la linea para insertar la palabra.");
        p.ver(obl.insertarPalabraEnLinea(2,1,1,4,"Corazon").resultado, Retorno.Resultado.ERROR, "Existe el mensaje, existe la linea para insertar la palabra, pero la cantidad maxima excede.");
        p.ver(obl.insertarPalabraEnLinea(2,1,1,2,"Hola").resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarPalabraEnLinea(2,1,1,3,"Mundo").resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarPalabraEnLinea(2,1,2,1,"Los").resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarPalabraEnLinea(2,1,2,2,"Quiero").resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarPalabraEnLinea(2,1,2,3,"Mucho").resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarPalabraYDesplazar(2,1,2,1,"Cambios").resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarPalabraYDesplazar(2,1,1,2,"Paraiso").resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarPalabraEnLinea(2,1,3,3,"Simples").resultado, Retorno.Resultado.OK, ""); 
        p.ver(obl.insertarPalabraYDesplazar(2,1,1,1,"Naranja").resultado, Retorno.Resultado.OK, "");
        
        p.ver(obl.imprimirLinea(2,1,2).resultado, Retorno.Resultado.OK, obl.imprimirLinea(2,1,2).valorString);
        p.ver(obl.imprimirLinea(8,1,2).resultado, Retorno.Resultado.OK, obl.imprimirLinea(8,1,2).valorString);
        p.ver(obl.imprimirLinea(2,7,2).resultado, Retorno.Resultado.OK, obl.imprimirLinea(2,7,2).valorString);
        p.ver(obl.imprimirLinea(2,1,7).resultado, Retorno.Resultado.OK, obl.imprimirLinea(2,1,7).valorString);
       
        p.ver(obl.insertarLinea(2,1).resultado, Retorno.Resultado.OK, "");
        //p.ver(obl.insertarLinea(4,1).resultado, Retorno.Resultado.OK, "");
        p.ver(obl.imprimirTexto(4,1).resultado, Retorno.Resultado.OK, obl.imprimirTexto(4,1).valorString);
        p.ver(obl.insertarLinea(2,3).resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarLinea(2,3).resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarLinea(2,3).resultado, Retorno.Resultado.OK, "");
        p.ver(obl.imprimirTexto(2,3).resultado, Retorno.Resultado.OK, obl.imprimirTexto(2,3).valorString);
        p.ver(obl.borrarTodo(2,3).resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarLinea(2,3).resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarLinea(2,3).resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarLinea(2,3).resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarLinea(2,3).resultado, Retorno.Resultado.OK, "");
        p.ver(obl.imprimirTexto(2,3).resultado, Retorno.Resultado.OK, obl.imprimirTexto(2,3).valorString);
//        p.ver(obl.insertarPalabraEnLinea(2,3,1,1,"Palabra3").resultado, Retorno.Resultado.OK, "");
//        p.ver(obl.insertarPalabraEnLinea(2,3,1,2,"Palabra2").resultado, Retorno.Resultado.OK, "");
//        p.ver(obl.insertarPalabraEnLinea(2,3,1,3,"Palabra3").resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarPalabraEnLinea(2,3,2,1,"Palabra1").resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarPalabraEnLinea(2,3,2,2,"Palabra3").resultado, Retorno.Resultado.OK, "");
//        p.ver(obl.insertarPalabraEnLinea(2,3,2,3,"Palabra3").resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarPalabraYDesplazar(2,3,2,2,"Palabra2").resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarPalabraYDesplazar(2,3,2,2,"Aqui").resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarPalabraEnLinea(2,3,4,1,"Palabra3").resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarPalabraEnLinea(2,3,4,2,"Palabra2").resultado, Retorno.Resultado.OK, "");
        p.ver(obl.insertarPalabraEnLinea(2,3,4,3,"Palabra1").resultado, Retorno.Resultado.OK, "");
        p.ver(obl.imprimirTexto(2,3).resultado, Retorno.Resultado.OK, obl.imprimirTexto(2,3).valorString);
        
//        p.ver(obl.borrarPalabra(2,3,1,2).resultado, Retorno.Resultado.ERROR,"No existen palabras en esa posicion");
//        p.ver(obl.borrarPalabra(2,3,2,2).resultado, Retorno.Resultado.OK,"");
//        p.ver(obl.insertarPalabraEnLinea(2,3,2,3,"Palabra3").resultado, Retorno.Resultado.OK, "");
//        p.ver(obl.borrarPalabra(2,3,2,1).resultado, Retorno.Resultado.OK,"");
//        p.ver(obl.borrarPalabra(2,3,3,1).resultado, Retorno.Resultado.OK,"");
//        p.ver(obl.imprimirTexto(2,3).resultado, Retorno.Resultado.OK, obl.imprimirTexto(2,3).valorString);
//        p.ver(obl.borrarOcurrenciasPalabraEnLinea(2, 3, 2, "Palabra3").resultado, Retorno.Resultado.OK, "");
        p.ver(obl.imprimirTexto(2,3).resultado, Retorno.Resultado.OK, obl.imprimirTexto(2,3).valorString);
        p.ver(obl.ImprimirTextoIncorrecto().resultado, Retorno.Resultado.OK,obl.ImprimirTextoIncorrecto().valorString);
//        p.ver(obl.borrarOcurrenciasPalabraEnTexto(2,3,"Palabra3").resultado, Retorno.Resultado.OK, "");
//        p.ver(obl.imprimirTexto(2,3).resultado, Retorno.Resultado.OK, obl.imprimirTexto(2,3).valorString);
//        p.ver(obl.destruirSistemaMensajes().resultado, Retorno.Resultado.OK, " sistema eliminado");
//
//        p.imprimirResultadosPrueba();
    }
    
    public static void juegodeprueba3(Obligatorio obl, Prueba p) throws ParseException {
   // escriba su juego de prueba aqui
        int MAX_CANT_PALABRAS_X_LINEA=obl.cantMaximaPalabras;
        
        p.ver(obl.crearSistemaMensajes(3).resultado, Retorno.Resultado.OK, "Se creara sistma para 3 palabras por linea");
        
        //Annadimos el contacto origen 0 para que funcione como nuestro contacto origen
        p.ver(obl.agregarContacto(0, "Armando Lopez").resultado, Retorno.Resultado.OK, "se agrega contacto Armando Lopez al sistema");
        
        p.ver(obl.agregarContacto(1, "Carlos Perez").resultado, Retorno.Resultado.OK, "se agrega contacto Carlos Perez al sistema");
        p.ver(obl.agregarContacto(1, "Carlos Perez").resultado, Retorno.Resultado.ERROR, "ERROR: se intenta agregar contacto Carlos Perez que ya existe");
        p.ver(obl.eliminarContacto(1).resultado, Retorno.Resultado.OK, "se elimina contacto Carlos Perez del sistema");
       
        p.ver(obl.agregarContacto(1, "Juan").resultado, Retorno.Resultado.OK, "se agrega contacto Juan al sistema");
        p.ver(obl.agregarContacto(2, "Pedro").resultado, Retorno.Resultado.OK, "se agrega contacto Pedro al sistema");
        p.ver(obl.agregarContacto(3, "Ana").resultado, Retorno.Resultado.OK, "se agrega contacto Ana al sistema");
        p.ver(obl.agregarContacto(4, "Maria").resultado, Retorno.Resultado.OK, "se agrega contacto Maria al sistema");
        
        //Eliminar Contacto que no existe
        p.ver(obl.eliminarContacto(7).resultado, Retorno.Resultado.ERROR, "ERROR: Se elimina un contacto que no existe");
        // ----------------------
        // Mostramos contactos
            obl.mostrarContactos();
        //-----------------------    
        
        // definimos una fecha        
        Date fecha=new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
  
       //-------------------------------
        fecha=formato.parse("23/03/2022");
       //--------------------------------
        // Agregamos 3 mensajes a contacto Pedro que Existe
        p.ver(obl.agregarMensaje(0,2, fecha).resultado, Retorno.Resultado.OK, "Se agrega primer mensaje para Pedro ");
        p.ver(obl.agregarMensaje(0,2, fecha).resultado, Retorno.Resultado.OK, "Se agrega segundo mensaje para Pedro ");
        p.ver(obl.agregarMensaje(0,2, fecha).resultado, Retorno.Resultado.OK, "Se agrega tercer  mensaje para Pedro ");
        
        // Agregamos 3 mensajes a contacto 8 que NO Existe
        p.ver(obl.agregarMensaje(0,8, fecha).resultado, Retorno.Resultado.ERROR, "ERROR: Se agrega mensaje a contacto inexistente ");
        
        //Eliminar Mensaje donde el contacto 9 no existe
        p.ver(obl.eliminarMensaje(9,1).resultado, Retorno.Resultado.ERROR, "ERROR: Se elimina mensaje a contacto inexistente ");
        //Eliminar Mensaje donde el mensaje no existe
        p.ver(obl.eliminarMensaje(2,9).resultado, Retorno.Resultado.ERROR, "ERROR: Se elimina mensaje inexistente a contacto existente");
        
        // Agregamos lineas al mensaje 2 de pedro
        p.ver(obl.insertarLineaEnPosicion(2, 2, 1).resultado, Retorno.Resultado.OK, "Se agrega linea 1 en blanco al mensaje 2 de Pedro");
        p.ver(obl.insertarLineaEnPosicion(2, 2, 2).resultado, Retorno.Resultado.OK, "Se agrega linea 2 en blanco al mensaje 2 de Pedro");
        p.ver(obl.insertarLineaEnPosicion(2, 2, 3).resultado, Retorno.Resultado.OK, "Se agrega linea 3 en blanco al mensaje 2 de Pedro");
        
        // Agregamos palabras al mensaje 2 de pedro en la linea 1
        p.ver(obl.insertarPalabraEnLinea(2, 2,1,1,"Hola").resultado, Retorno.Resultado.OK,"Se agrega palabra Hola linea 1 mensaje 2");
        p.ver(obl.insertarPalabraEnLinea(2, 2,1,2,"Pedro").resultado, Retorno.Resultado.OK,"Se agrega palabra Pedro linea 1 mensaje 2");
 
        p.ver(obl.insertarPalabraEnLinea(2, 2,2,1,"Te").resultado, Retorno.Resultado.OK,"Se agrega palabra Te linea 2 mensaje 2");
        p.ver(obl.insertarPalabraEnLinea(2, 2,2,2,"LLamo").resultado, Retorno.Resultado.OK,"Se agrega palabra Llamo linea 2 mensaje 2");
        p.ver(obl.insertarPalabraEnLinea(2, 2,2,3,"En").resultado, Retorno.Resultado.OK,"Se agrega palabra En linea 2 mensaje 2");
        p.ver(obl.insertarPalabraEnLinea(2, 2,3,1,"5min").resultado, Retorno.Resultado.OK,"Se agrega palabra 5min linea 3 mensaje 2");
      
        // Imprimimos mensaje 2 de pedro              
        p.ver(obl.imprimirTexto(2, 2).resultado, Retorno.Resultado.OK, "Se imprime mensaje 2 de Pedro\n " + obl.imprimirTexto(2, 2).valorString);
        
        p.ver(obl.insertarPalabraYDesplazar(2, 2,2,2,"puedo").resultado, Retorno.Resultado.OK,"Se agrega palabra puedo en linea 2 mensaje 2 posicion 2");
        // Imprimimos mensaje 2 de pedro       
        p.ver(obl.imprimirTexto(2, 2).resultado, Retorno.Resultado.OK, "Se imprime mensaje 2 de Pedro\n " + obl.imprimirTexto(2, 2).valorString);

        //Imprimir un texto de un contacto que no existe
        p.ver(obl.imprimirTexto(8, 2).resultado, Retorno.Resultado.ERROR,"ERROR: Se imprime mensaje 1 de contacto inexistente.");
        
        //Imprimir un texto de un mensaje que no existe
        p.ver(obl.imprimirTexto(2, 10).resultado, Retorno.Resultado.ERROR,"ERROR: Se imprime mensaje inexistente de Pedro");
        
        //Elimino linea 7 que no existe del mensaje 2
        p.ver(obl.borrarLinea(2,2,7).resultado, Retorno.Resultado.ERROR, "ERROR: Se elimina la linea inexistente del mensaje 2");
        //Elimino linea 1 del mensaje 8 que no existe
        p.ver(obl.borrarLinea(2,8,1).resultado, Retorno.Resultado.ERROR, "ERROR: Se elimina la linea 1 de mensaje inexistente"); 
        
        //Aqui existen todos los datos para eliminar la palabra
        p.ver(obl.borrarPalabra(2,2, 2,2).resultado, Retorno.Resultado.OK, "Se elimina palabra pos 2 de mensaje 2 linea 2 de pedro");
        //Se elimina una palabra que no existe en la posicion 3 del mensaje 2 de Pedro
        p.ver(obl.borrarPalabra(2,2, 2,3).resultado, Retorno.Resultado.ERROR, "ERROR: Se elimina palabra en una posicion inexistente de mensaje 2 linea 2 de pedro");
        // Imprimimos mensaje 2 de pedro        
        p.ver(obl.imprimirTexto(2, 2).resultado, Retorno.Resultado.OK, "Se imprime mensaje 2 de Pedro\n " + obl.imprimirTexto(2, 2).valorString);

       //Insertar Una nueva linea vacia en el mensaje 2
        p.ver(obl.insertarLinea(2, 2).resultado, Retorno.Resultado.OK,"Inserto una nueva linea");
        
        
        
        //-------------------------------        
        fecha=formato.parse("24/03/2022");
       //-------------------------------
       
        p.ver(obl.agregarMensaje(0,2, fecha).resultado, Retorno.Resultado.OK, "Se agrega  mensaje  4 para Pedro en  fecha 24/03/2022 ");
        p.ver(obl.agregarMensaje(0,2, fecha).resultado, Retorno.Resultado.OK, "Se agrega  mensaje 5 para Pedro en  fecha 24/03/2022 ");
        
       // Agregamos lineas al mensaje 1 de pedro
        p.ver(obl.insertarLineaEnPosicion(2, 1, 1).resultado, Retorno.Resultado.OK, "Se agrega linea 1 en blanco al mensaje 2 de Pedro");
        p.ver(obl.insertarLineaEnPosicion(2, 1, 2).resultado, Retorno.Resultado.OK, "Se agrega linea 2 en blanco al mensaje 2 de Pedro");
        p.ver(obl.insertarLineaEnPosicion(2, 1, 3).resultado, Retorno.Resultado.OK, "Se agrega linea 3 en blanco al mensaje 2 de Pedro");

        // Agregamos palabras al mensaje 1 de pedro en la linea 1
        p.ver(obl.insertarPalabraEnLinea(2, 1,1,1,"Voy").resultado, Retorno.Resultado.OK,"Se agrega palabra voy linea 1 mensaje 2");
        p.ver(obl.insertarPalabraEnLinea(2, 1,1,2,"llegando").resultado, Retorno.Resultado.OK,"Se agrega palabra llegando linea 1 mensaje 2");
         
        
        p.ver(obl.agregarMensaje(0,3, fecha).resultado, Retorno.Resultado.OK, "Se agrega  mensaje  4 para Ana en fecha 24/03/2022 ");
        p.ver(obl.agregarMensaje(0,3, fecha).resultado, Retorno.Resultado.OK, "Se agrega  mensaje 5 para Ana en fecha 24/03/2022");
       
       //-------------------------------        
        fecha=formato.parse("25/03/2022");
       //-------------------------------
       
        p.ver(obl.agregarMensaje(0,2, fecha).resultado, Retorno.Resultado.OK, "Se agrega  mensaje para Pedro en  fecha 25/03/2022 ");
        p.ver(obl.agregarMensaje(0,4, fecha).resultado, Retorno.Resultado.OK, "Se agrega  mensaje para Maria en  fecha 25/03/2022 ");
        p.ver(obl.insertarLineaEnPosicion(2, 3, 1).resultado, Retorno.Resultado.OK, "Se agrega linea 1 en blanco al mensaje 2 de Pedro");        
        p.ver(obl.insertarPalabraEnLinea(2, 3,1,1,"Estoy").resultado, Retorno.Resultado.OK,"Se agrega palabra Estoy linea 1 mensaje 2");
        p.ver(obl.insertarLineaEnPosicion(2, 3, 1).resultado, Retorno.Resultado.OK,"Inserto una nueva linea en el mensaje 3 posicion 1");
        p.ver(obl.insertarPalabraEnLinea(2, 3,1,1,"Estamos").resultado, Retorno.Resultado.OK,"Se agrega palabra estacionando linea 1 mensaje 2");
        p.ver(obl.insertarPalabraEnLinea(2, 3,1,2,"estacionando").resultado, Retorno.Resultado.OK,"Se agrega palabra estacionando linea 1 mensaje 2");
        p.ver(obl.insertarPalabraEnLinea(2, 3,1,3,"Estamos").resultado, Retorno.Resultado.OK,"Se agrega palabra estacionando linea 1 mensaje 2");

        //Insertar Linea en Posicion 3 linea 8
        p.ver(obl.insertarLineaEnPosicion(2, 3, 8).resultado, Retorno.Resultado.ERROR,"ERROR: Inserto una nueva linea en el mensaje 3 posicion 8");
       
        
        p.ver(obl.agregarMensaje(0,4, fecha).resultado, Retorno.Resultado.OK, "Se agrega  mensaje   para Maria en fecha 25/03/2022 ");
        p.ver(obl.agregarMensaje(0,4, fecha).resultado, Retorno.Resultado.OK, "Se agrega  mensaje  para Maria en fecha 25/03/2022");
        // Agregamos lineas al mensaje 2 de Pedro
        p.ver(obl.insertarLineaEnPosicion(2, 2, 1).resultado, Retorno.Resultado.OK, "Se agrega linea 1 en blanco al mensaje 2 de Pedro");
        p.ver(obl.insertarLineaEnPosicion(2, 2, 2).resultado, Retorno.Resultado.OK, "Se agrega linea 2 en blanco al mensaje 2 de Pedro");
        
        
        
        // Agregamos palabras al mensaje 2 de maria en la linea 1
        p.ver(obl.insertarPalabraEnLinea(2, 2,1,5,"Sera").resultado, Retorno.Resultado.ERROR,"ERROR: Se agrega palabra Sera linea 1 mensaje 2 en posicion inexistente");
        // Agregamos palabras al mensaje 2 de maria en la linea 1
        p.ver(obl.insertarPalabraEnLinea(8, 1,1,1,"Podrias").resultado, Retorno.Resultado.ERROR,"ERROR: Se agrega palabra Podrias linea 1 mensaje 1 en la  posicion 1 de contact inexistente");

        // Agregamos palabras al mensaje 10 de Pedro en la linea 1
        p.ver(obl.insertarPalabraEnLinea(2, 10,1,1,"Capaz").resultado, Retorno.Resultado.ERROR,"ERROR: Se agrega palabra Capaz linea 1 en mensaje inexistente");

        
        p.ver(obl.insertarPalabraEnLinea(2, 2,1,1,"Hola").resultado, Retorno.Resultado.OK,"Se agrega palabra Hola linea 1 mensaje 2");
        p.ver(obl.insertarPalabraEnLinea(2, 2,1,2,"Maria").resultado, Retorno.Resultado.OK,"Se agrega palabra Maria linea 1 mensaje 2");
        p.ver(obl.insertarLineaEnPosicion(4, 2, 1).resultado, Retorno.Resultado.OK, "Se agrega linea 1 en blanco al mensaje 2 de Maria");
        p.ver(obl.insertarLineaEnPosicion(4, 2, 2).resultado, Retorno.Resultado.OK, "Se agrega linea 2 en blanco al mensaje 2 de Maria");
        p.ver(obl.insertarPalabraEnLinea(4, 2,1,1,"Maria").resultado, Retorno.Resultado.OK,"Se agrega palabra Maria linea 1 mensaje 2 en la  posicion 1");
        p.ver(obl.insertarPalabraYDesplazar(4, 2, 1, 1, "llamo").resultado,Retorno.Resultado.OK,"Se agrega palabra llamo a mensaje 2 linea 1 de maria");
        
        p.ver(obl.insertarPalabraYDesplazar(4, 2, 1, 1, "Te").resultado,Retorno.Resultado.OK,"Se agrega palabra Te a mensaje 2 linea 1 de maria");
        p.ver(obl.insertarPalabraYDesplazar(4, 2, 1, 3, "ysalimos").resultado,Retorno.Resultado.OK,"Se agrega palabra Te a mensaje 2 linea 1 de maria");
        p.ver(obl.insertarPalabraEnLinea(4, 2,2,2,"ademas").resultado, Retorno.Resultado.OK,"Se agrega palabra Maria linea 1 mensaje 2 en la  posicion 1");
        p.ver(obl.insertarPalabraEnLinea(4, 2,2,3,"preciso").resultado, Retorno.Resultado.OK,"Se agrega palabra Maria linea 1 mensaje 2 en la  posicion 1");
        p.ver(obl.insertarPalabraYDesplazar(4, 2, 2, 3, "repelente").resultado,Retorno.Resultado.OK,"Se agrega palabra Te a mensaje 2 linea 1 de maria");

        p.ver(obl.insertarPalabraYDesplazar(4, 2, 2, 6, "vacio").resultado,Retorno.Resultado.ERROR,"ERROR: Se agrega palabra vacio a mensaje 2 linea 2 de Maria en posicion inexistente");
        
        p.ver(obl.insertarPalabraEnLinea(2, 2,2,1,"Te").resultado, Retorno.Resultado.OK,"Se agrega palabra Te linea 2 mensaje 2");
        p.ver(obl.insertarPalabraEnLinea(2, 2,2,2,"LLamo").resultado, Retorno.Resultado.OK,"Se agrega palabra Te linea 2 mensaje 2");
       
        p.ver(obl.cantidadDeMensajes(2).resultado,Retorno.Resultado.OK,"Mensajes de pedro: \n" + obl.cantidadDeMensajes(2).valorString);
                
        p.ver(obl.ingresarPalabraDiccionario("Hola").resultado,Retorno.Resultado.OK,"Se agrega palabra Hola al diccionario");
        p.ver(obl.ingresarPalabraDiccionario("Estacionando").resultado,Retorno.Resultado.OK,"Se agrega palabra Estacionando al diccionario");
        p.ver(obl.ingresarPalabraDiccionario("Llegando").resultado,Retorno.Resultado.OK,"Se agrega palabra Llegando al diccionario");
        p.ver(obl.ingresarPalabraDiccionario("Te").resultado,Retorno.Resultado.OK,"Se agrega palabra Te al diccionario");
        p.ver(obl.ingresarPalabraDiccionario("Estoy").resultado,Retorno.Resultado.OK,"Se agrega palabra Estoy al diccionario");
        
        //Ingresar Nuevamente la palabra Hola
        p.ver(obl.ingresarPalabraDiccionario("Hola").resultado,Retorno.Resultado.ERROR,"ERROR: La palabra Hola ya existe en el diccionario");
        
        //Borrar la palabra 10min
        p.ver(obl.borrarPalabraDiccionario("10min").resultado,Retorno.Resultado.ERROR,"ERROR: No exitse la palabra 10min en el diccionario");
        
        p.ver(obl.borrarPalabraDiccionario("Te").resultado,Retorno.Resultado.OK,"Se borra la palabra Te del diccionario");
        
        //Elimino la linea 6 del mensaje 2
        p.ver(obl.borrarLinea(2,2,6).resultado, Retorno.Resultado.OK, "Se elimina la linea 6 del mensaje 2");
       
        //Borrar todos los Mensajes de contacto 8 que no existe
        p.ver(obl.borrarTodo(8,1).resultado, Retorno.Resultado.ERROR, "ERROR: No se puede eliminar Mensajes de un contacto inexistente");
        
        //Eliminando la palabra Te del mensaje 2 de Pedro
        p.ver(obl.borrarOcurrenciasPalabraEnTexto(2,2,"Te").resultado, Retorno.Resultado.OK, "Se elimina la palabra Te del mensaje 2 linea 2 de Pedro");
        
        p.ver(obl.imprimirLinea(2,3,1).resultado, Retorno.Resultado.OK,"\n Imprimir mensaje 1 de Pedro linea 3 \n"+ obl.imprimirLinea(2,3,1).valorString);
        p.ver(obl.borrarOcurrenciasPalabraEnLinea(2, 3, 1, "Estamos").resultado, Retorno.Resultado.OK, "Se eliminantodas las ocurrencias de la palabra estamos");
        
        //Se elimina palabra vivir que no existe en el la linea
        p.ver(obl.borrarOcurrenciasPalabraEnLinea(2, 3, 1, "vivir").resultado, Retorno.Resultado.ERROR, "ERROR: Se eliminan todas las ocurrencias inexistentes de la palabra vivir en linea");

         //Eliminando la palabra Amo que no existe del mensaje 2 de Pedro
        p.ver(obl.borrarOcurrenciasPalabraEnTexto(2,2,"Amo").resultado, Retorno.Resultado.ERROR, "ERROR: Se elimina una palabra inexistente del mensaje 2 linea 2 de Pedro");
        
        //Imprimir linea 2 de mensaje 1 de Pedro
        p.ver(obl.imprimirLinea(2,1,1).resultado, Retorno.Resultado.OK,"\n Imprimir mensaje 1 de Pedro linea 1 \n"+ obl.imprimirLinea(2,1,1).valorString);
        
        p.ver(obl.imprimirLinea(2,1,4).resultado, Retorno.Resultado.ERROR,"ERROR: Imprimir mensaje 1 de Pedro linea inexistente");
        
        p.ver(obl.imprimirDiccionario().resultado, Retorno.Resultado.OK, "palabras del diccionario");
        
        p.ver(obl.ImprimirTextoIncorrecto().resultado, Retorno.Resultado.OK, "Palabras que no estan en el diccionario \n" + obl.ImprimirTextoIncorrecto().valorString);
       
       p.ver(obl.cantidadDeMensajes(1).resultado, Retorno.Resultado.OK, "\nMensajes de juan\n" + obl.cantidadDeMensajes(1).valorString); 
       p.ver(obl.cantidadDeMensajes(2).resultado, Retorno.Resultado.OK, "\nMensajes de Pedro\n" + obl.cantidadDeMensajes(2).valorString); 
       p.ver(obl.cantidadDeMensajes(3).resultado, Retorno.Resultado.OK, "\nMensajes de Ana\n" + obl.cantidadDeMensajes(3).valorString);
       p.ver(obl.cantidadDeMensajes(4).resultado, Retorno.Resultado.OK, "\nMensajes de Maria\n" + obl.cantidadDeMensajes(4).valorString);
       
       
        
       p.ver(obl.destruirSistemaMensajes().resultado, Retorno.Resultado.OK, " sistema eliminado");

       p.imprimirResultadosPrueba();
    }
    
    //defensa
     public static void juegodepruebadefensa(Obligatorio obl, Prueba p) throws ParseException {
        // escriba su juego de prueba aqui
        int MAX_CANT_PALABRAS_X_LINEA = 3;
        
        p.ver(obl.crearSistemaMensajes(MAX_CANT_PALABRAS_X_LINEA).resultado, Retorno.Resultado.OK, "Se creara sistma para 3 palabras por linea");
        p.ver(obl.agregarContacto(1, "Carlos").resultado, Retorno.Resultado.OK, "se agrega contacto Carlos  al sistema");
        p.ver(obl.agregarContacto(1, "Carlos").resultado, Retorno.Resultado.ERROR, "se intenta agregar contacto Carlos que ya existe");
        p.ver(obl.eliminarContacto(1).resultado, Retorno.Resultado.OK, "se elimina contacto Carlos  del sistema");
       
        p.ver(obl.agregarContacto(0, "Jose").resultado, Retorno.Resultado.OK, "se agrega contacto Jose al sistema");
        p.ver(obl.agregarContacto(1, "Juan").resultado, Retorno.Resultado.OK, "se agrega contacto Juan al sistema");
        p.ver(obl.agregarContacto(2, "Pedro").resultado, Retorno.Resultado.OK, "se agrega contacto Pedro al sistema");
        p.ver(obl.agregarContacto(3, "Ana").resultado, Retorno.Resultado.OK, "se agrega contacto Ana al sistema");
        p.ver(obl.agregarContacto(4, "Maria").resultado, Retorno.Resultado.OK, "se agrega contacto Maria al sistema");
        
        // ----------------------
        // Mostramos contactos - IMPLEMENTAR Y AGREGAR EN INRERFACE
            obl.LC.MostrarLista();
            
            
        //-----------------------    
        
        // definimos una fecha        
        Date fecha=new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        fecha=formato.parse("23/03/2022");

        System.out.println("MENSAJES DE LA FECHA 23/03/2022");
        
        // Agregamos 3 mensajes enviados por Ana a contacto Pedro que Existe
        p.ver(obl.agregarMensaje(1,2, fecha).resultado, Retorno.Resultado.OK, "Se agrega mensaje 1 enviado de Ana a pedro");
        p.ver(obl.agregarMensaje(1,2, fecha).resultado, Retorno.Resultado.OK, "Se agrega mensaje 2 enviado de Ana a pedro ");
        p.ver(obl.agregarMensaje(1,2, fecha).resultado, Retorno.Resultado.OK, "Se agrega mensaje 3 enviado de Ana a pedro");
 
        // Agregamos 3 mensajes enviados por juan a contacto Pedro que Existe        
        p.ver(obl.agregarMensaje(3,2, fecha).resultado, Retorno.Resultado.OK, "Se agrega mensaje 4 enviado de juan a pedro");
        p.ver(obl.agregarMensaje(3,2, fecha).resultado, Retorno.Resultado.OK, "Se agrega mensaje 5 enviado de juan a pedro ");
        p.ver(obl.agregarMensaje(3,2, fecha).resultado, Retorno.Resultado.OK, "Se agrega mensaje 6 enviado de juan a pedro");
  
        // Agregamos 3 mensajes enviados por juan a contacto Ana que Existe       
        p.ver(obl.agregarMensaje(2,3, fecha).resultado, Retorno.Resultado.OK, "Se agrega mensaje 1 enviado de juan a Ana");
        p.ver(obl.agregarMensaje(2,3, fecha).resultado, Retorno.Resultado.OK, "Se agrega mensaje 2 enviado de juan a Ana ");
        p.ver(obl.agregarMensaje(2,3, fecha).resultado, Retorno.Resultado.OK, "Se agrega mensaje 3 enviado de juan a Ana");       

        // Agregamos 1 mensajes enviado por juan a contacto 8 que NO Existe
        p.ver(obl.agregarMensaje(1,8, fecha).resultado, Retorno.Resultado.ERROR, "Se agrega mensaje de juan  a contacto inexistente ");
 
        // Se elimina mensaje 1 de pedro 
        //p.ver(obl.eliminarMensaje(2, 1).resultado, Retorno.Resultado.OK, "Se elimina el mensaje 1 al contacto 2");       
        // Se elimina mensaje con error
        p.ver(obl.eliminarMensaje(3, 5).resultado, Retorno.Resultado.ERROR, "Se elimina el mensaje 5 inexistente al contacto 3");
        p.ver(obl.eliminarMensaje(9, 1).resultado, Retorno.Resultado.ERROR, "Se elimina el mensaje 1 al contacto 9 inexistente");     
 
       // se agregan lineas con error
        p.ver(obl.insertarLinea(9, 1).resultado, Retorno.Resultado.ERROR, "Agrego una linea a contacto inexistente");
        p.ver(obl.insertarLinea(2, 9).resultado, Retorno.Resultado.ERROR, "Agrego una linea a mensaje inexistente");
        
        // Agregamos lineas al mensaje 2 de pedro        
        p.ver(obl.insertarLinea(2, 1).resultado, Retorno.Resultado.OK, "Agrego una linea al mensaje 1 del contacto 2");
        // Agregamos lineas al mensaje 2 de pedro en posicion indicada
        p.ver(obl.insertarLineaEnPosicion(2, 2, 1).resultado, Retorno.Resultado.OK, "Se agrega linea 1 en blanco al mensaje 2 de Pedro");
        p.ver(obl.insertarLineaEnPosicion(2, 2, 2).resultado, Retorno.Resultado.OK, "Se agrega linea 2 en blanco al mensaje 2 de Pedro");
        p.ver(obl.insertarLineaEnPosicion(2, 2, 3).resultado, Retorno.Resultado.OK, "Se agrega linea 3 en blanco al mensaje 2 de Pedro");
   
        // MOSTRAR LINEAS DEL MENSAJE DE PEDRO implementar en interface
        p.ver(obl.imprimirLinea(2,2 ,1 ).resultado, Retorno.Resultado.OK, "linea 1 mensaje 1 de pedro" + obl.imprimirLinea(2,2 ,1 ).valorString);
        p.ver(obl.imprimirLinea(2,2 ,2 ).resultado, Retorno.Resultado.OK, "linea 2 mensaje 2 de pedro " + obl.imprimirLinea(2,2 ,2 ).valorString);   
        p.ver(obl.imprimirLinea(2,2 ,3 ).resultado, Retorno.Resultado.OK, "linea 3 mensaje 3 de pedro" + obl.imprimirLinea(2,2 ,3 ).valorString);
        
        // Eliminamos lineas al mensaje 2 de Pedro
        p.ver(obl.borrarLinea(2, 2, 1).resultado, Retorno.Resultado.OK, "Se elimina la linea 1 del mensaje 2 de Pedro");
        p.ver(obl.borrarLinea(9, 2, 1).resultado, Retorno.Resultado.ERROR, "Se elimina la linea 1 del mensaje 2 de contacto inexistente");
        p.ver(obl.borrarLinea(2, 9, 1).resultado, Retorno.Resultado.ERROR, "Se elimina la linea 1 del mensaje inexistente de Pedro");
        p.ver(obl.borrarLinea(2, 2, 3).resultado, Retorno.Resultado.ERROR, "Se elimina una linea inexistente del mensaje 2 de Pedro");
        
        //Mostrar mensje 2 de pedro 
        p.ver(obl.imprimirTexto(2, 2).resultado,Retorno.Resultado.OK,"Se imprime texto mensaje 2 de pedro que esta vacio y tiene lineas " + obl.imprimirTexto(2, 2).valorString);
        
        // Eliminamos todas las lineas del mensaje 2 de Pedro
        p.ver(obl.borrarTodo(2, 2).resultado, Retorno.Resultado.OK, "Borramos todas las lineas del mensaje 2 de Pedro");
        p.ver(obl.borrarTodo(9, 2).resultado, Retorno.Resultado.ERROR, "Borramos todas las lineas del mensaje 2 de contacto inexistente");
        p.ver(obl.borrarTodo(2, 9).resultado, Retorno.Resultado.ERROR, "Borramos todas las lineas del mensaje inexistente de Pedro");
   
        // MOSTRAR LINEAS DEL MENSAJE DE PEDRO 
        p.ver(obl.imprimirLinea(2,1 ,1 ).resultado, Retorno.Resultado.OK, "linea 1 mensaje 1 de pedro despues de borrar todo\n " + obl.imprimirLinea(2,1 ,1 ).valorString);
        // no debe mostrar lineas del mensaje 2 de pedro
        
        // Agregamos palabras al mensaje 2 de pedro en la linea 1
        p.ver(obl.insertarPalabraEnLinea(2, 1, 1, 1, "Hola").resultado, Retorno.Resultado.OK, "Se agrega palabra Hola linea 1 mensaje 1 de Pedro");
        p.ver(obl.insertarPalabraEnLinea(2, 1, 1, 2, "Pedro").resultado, Retorno.Resultado.OK, "Se agrega palabra Pedro linea 1 mensaje 1 de Pedro");

        p.ver(obl.insertarPalabraEnLinea(9, 1, 1, 2, "err").resultado, Retorno.Resultado.ERROR, "Se agrega palabra err linea 1 mensaje 1 de contacto inexistente");
        p.ver(obl.insertarPalabraEnLinea(2, 9, 1, 2, "err").resultado, Retorno.Resultado.ERROR, "Se agrega palabra err linea 1 mensaje inexistente de Pedro");
        p.ver(obl.insertarPalabraEnLinea(2, 1, 9, 2, "err").resultado, Retorno.Resultado.ERROR, "Se agrega palabra err linea inexistente mensaje 1 de Pedro");
        p.ver(obl.insertarPalabraEnLinea(2, 1, 1, 9, "err").resultado, Retorno.Resultado.ERROR, "Se agrega palabra err linea 1 mensaje 1 de Pedro en posicion inexistente");

        p.ver(obl.insertarPalabraEnLinea(2, 1, 1, 3, "querido").resultado, Retorno.Resultado.OK, "Se agrega palabra querido linea 1 mensaje 1 de Pedro");
        p.ver(obl.insertarPalabraEnLinea(2, 1, 1, 4, "fueradelimite").resultado, Retorno.Resultado.ERROR, "Se agrega palabra fueradelimite en linea 1 mensaje 1 de Pedro se pasa limite de palabras");
        
        // Imprimimos mensaje 2 de pedro
        p.ver(obl.imprimirTexto(2, 1).resultado, Retorno.Resultado.OK, "Se imprime mensaje 1 de Pedro" + obl.imprimirTexto(2, 1).valorString);
        p.ver(obl.imprimirTexto(2, 2).resultado, Retorno.Resultado.OK, "Se imprime mensaje 2 de Pedro vacío" + obl.imprimirTexto(2, 2).valorString);
        
        // Borramos ocurrencia del mensaje 
        p.ver(obl.insertarLinea(2, 2).resultado, Retorno.Resultado.OK, "Agrego una linea al mensaje 1 del contacto 2");
        p.ver(obl.insertarPalabraEnLinea(2, 2, 1, 1, "Hola").resultado, Retorno.Resultado.OK, "Se agrega palabra Hola linea 1 mensaje 1 de Pedro");
        p.ver(obl.insertarPalabraEnLinea(2, 2, 1, 2, "Chau").resultado, Retorno.Resultado.OK, "Se agrega palabra Hola linea 1 mensaje 1 de Pedro");
        p.ver(obl.insertarPalabraEnLinea(2, 2, 1, 3, "Hola").resultado, Retorno.Resultado.OK, "Se agrega palabra Hola linea 1 mensaje 1 de Pedro");
        p.ver(obl.borrarOcurrenciasPalabraEnTexto(2, 2, "Hola").resultado, Retorno.Resultado.OK, "Se borran las ocurrencias de la palabra Hola en el mensaje 1 del contacto 2");
        p.ver(obl.imprimirTexto(2, 2).resultado, Retorno.Resultado.OK, "Se imprime mensaje 2 de Pedro" + obl.imprimirTexto(2, 2).valorString);
        
//         Insertar palabra y desplazar
        p.ver(obl.insertarPalabraYDesplazar(2, 2, 1 , 1, "Holis").resultado, Retorno.Resultado.OK,"Se agrega palabra puedo en linea 2 mensaje 2 posicion 2");
        p.ver(obl.insertarPalabraYDesplazar(2, 2, 1 , 2, "Que").resultado, Retorno.Resultado.OK,"Se agrega palabra puedo en linea 2 mensaje 2 posicion 2");
        p.ver(obl.insertarPalabraYDesplazar(2, 2, 1 , 3, "Tal").resultado, Retorno.Resultado.OK,"Se agrega palabra puedo en linea 2 mensaje 2 posicion 2");
        p.ver(obl.insertarPalabraYDesplazar(2, 2, 2 , 1, "X1").resultado, Retorno.Resultado.OK,"Se agrega palabra puedo en linea 2 mensaje 2 posicion 2");
        p.ver(obl.insertarPalabraYDesplazar(2, 2, 2 , 1, "X1").resultado, Retorno.Resultado.OK,"Se agrega palabra puedo en linea 2 mensaje 2 posicion 2");
        p.ver(obl.insertarPalabraYDesplazar(2, 2, 2 , 1, "X3").resultado, Retorno.Resultado.OK,"Se agrega palabra puedo en linea 2 mensaje 2 posicion 2");
        p.ver(obl.borrarOcurrenciasPalabraEnTexto(2, 2, "X1").resultado, Retorno.Resultado.OK, "Se borran las ocurrencias de la palabra Hola en el mensaje 1 del contacto 2");

        p.ver(obl.imprimirTexto(2, 2).resultado, Retorno.Resultado.OK, "Se imprime mensaje 2 de Pedro" + obl.imprimirTexto(2, 2).valorString);

        // Borrar palabra
        p.ver(obl.borrarPalabra(2, 2, 1, 2).resultado, Retorno.Resultado.OK, "Se elimina palabra pos 2 de mensaje 2 linea 2 de pedro");
        p.ver(obl.imprimirTexto(2, 2).resultado, Retorno.Resultado.OK, "Se imprime mensaje 2 de Pedro" + obl.imprimirTexto(2, 2).valorString);

        // Borrar ocurrencia en linea 
        p.ver(obl.insertarPalabraYDesplazar(2, 2, 2 , 2, "Holis").resultado, Retorno.Resultado.ERROR,"Se agrega palabra puedo en linea 2 mensaje 2 posicion 2");
        p.ver(obl.imprimirTexto(2, 2).resultado, Retorno.Resultado.OK, "Se imprime mensaje 2 de Pedro" + obl.imprimirTexto(2, 2).valorString);
        p.ver(obl.borrarOcurrenciasPalabraEnLinea(2, 2, 1, "Holis").resultado, Retorno.Resultado.OK, "borramos ocurrencia de holis en la linea 1 del mensaje 2 del contacto 2");
        p.ver(obl.imprimirTexto(2, 2).resultado, Retorno.Resultado.OK, "Se imprime mensaje 2 de Pedro" + obl.imprimirTexto(2, 2).valorString);
        
        // Imprimir linea
        p.ver(obl.imprimirLinea(2, 2, 2).resultado, Retorno.Resultado.OK, "Se imprime la linea 1 del mensaje 2 del contacto 2 \n" + obl.imprimirLinea(2, 2, 2).valorString);
        
        // agregar al diccionario
        p.ver(obl.ingresarPalabraDiccionario("Holis").resultado, Retorno.Resultado.OK, "Agregamos la palabra Holis al diccionario");
        p.ver(obl.ingresarPalabraDiccionario("Holis").resultado, Retorno.Resultado.ERROR, "Agregamos la palabra duplicada Holis al diccionario");
        
        // borrar del diccionario
        p.ver(obl.borrarPalabraDiccionario("Holis").resultado, Retorno.Resultado.OK, "Borramos la palabra Holis del diccionario");
        p.ver(obl.borrarPalabraDiccionario("Holis").resultado, Retorno.Resultado.ERROR, "Borramos la palabra Holis del diccionario x2");
        
        // imprimir diccionario
        p.ver(obl.ingresarPalabraDiccionario("Hola").resultado, Retorno.Resultado.OK, "Agregamos la palabra Holis al diccionario");
        p.ver(obl.ingresarPalabraDiccionario("querido").resultado, Retorno.Resultado.OK, "Agregamos la palabra Holis al diccionario");
        p.ver(obl.ingresarPalabraDiccionario("Tal").resultado, Retorno.Resultado.OK, "Agregamos la palabra Holis al diccionario");
        p.ver(obl.ingresarPalabraDiccionario("Chau").resultado, Retorno.Resultado.OK, "Agregamos la palabra Holis al diccionario");
        p.ver(obl.imprimirDiccionario().resultado, Retorno.Resultado.OK, "Imprimimos diccionario ");
        
        // Imprimir texto incorrecto 
        p.ver(obl.ImprimirTextoIncorrecto().resultado, Retorno.Resultado.OK, "Imprimimos texto incorrecto" + obl.ImprimirTextoIncorrecto().valorString);
        
        // Agregamos mas mensajes 
        fecha=formato.parse("24/03/2022");
        p.ver(obl.agregarMensaje(1,2, fecha).resultado, Retorno.Resultado.OK, "Se agrega  mensaje  4 para Pedro en  fecha 24/03/2022 ");
        p.ver(obl.agregarMensaje(1,2, fecha).resultado, Retorno.Resultado.OK, "Se agrega  mensaje 5 para Pedro en  fecha 24/03/2022 ");
         
        p.ver(obl.agregarMensaje(2,3, fecha).resultado, Retorno.Resultado.OK, "Se agrega  mensaje  4 para Ana en fecha 24/03/2022 ");
        p.ver(obl.agregarMensaje(2,3, fecha).resultado, Retorno.Resultado.OK, "Se agrega  mensaje 5 para Ana en fecha 24/03/2022");
           
        fecha=formato.parse("25/03/2022");
        
        p.ver(obl.agregarMensaje(1,2, fecha).resultado, Retorno.Resultado.OK, "Se agrega  mensaje para Pedro en  fecha 25/03/2022 ");
        p.ver(obl.agregarMensaje(1,4, fecha).resultado, Retorno.Resultado.OK, "Se agrega  mensaje para Maria en  fecha 25/03/2022 ");
         
        p.ver(obl.agregarMensaje(2,4, fecha).resultado, Retorno.Resultado.OK, "Se agrega  mensaje   para Maria en fecha 25/03/2022 ");
        p.ver(obl.agregarMensaje(2,4, fecha).resultado, Retorno.Resultado.OK, "Se agrega  mensaje  para Maria en fecha 25/03/2022");
        
        // Imprimir cantidad de mensajes 
        //p.ver(obl.cantidadDeMensajes(0).resultado, Retorno.Resultado.OK, "Imprimimos la cantidad de mensajes \n" + obl.cantidadDeMensajes(0).valorString);        
        p.ver(obl.cantidadDeMensajes(2).resultado, Retorno.Resultado.OK, "Imprimimos la cantidad de mensajes \n" + obl.cantidadDeMensajes(2).valorString);        

        //defensa
        p.ver(obl.imprimirContactos().resultado, Retorno.Resultado.OK, "Se imprimen todos los contactos");
        p.ver(obl.imprimircontactoMaxCantMensajes().resultado, Retorno.Resultado.OK, "Se imprime el contacto con mas mensajes " + obl.imprimircontactoMaxCantMensajes().valorString);
        obl.agregarMensaje(1, 3, fecha);
        obl.agregarMensaje(1, 3, fecha);
        obl.agregarMensaje(1, 3, fecha);
        obl.agregarMensaje(1, 3, fecha);
        
        System.out.println("CONTACTO CON MAXIMA CANTIDAD DE MENSAJES");
        p.ver(obl.imprimircontactoMaxCantMensajes().resultado, Retorno.Resultado.OK, " contacto con mas mensajes " + obl.imprimircontactoMaxCantMensajes().valorString);
        
        p.ver(obl.destruirSistemaMensajes().resultado, Retorno.Resultado.OK, " sistema eliminado");

        p.imprimirResultadosPrueba();
    }
}


