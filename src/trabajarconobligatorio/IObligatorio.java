
package trabajarconobligatorio;
import java.util.Date;
/**
 *
 * @author Rafael
 */
public interface IObligatorio {
Retorno crearSistemaMensajes(int MAX_CANT_PALABRAS_X_LINEA);
Retorno destruirSistemaMensajes();
Retorno agregarContacto(int numContacto, String nomContacto);
Retorno eliminarContacto(int numContacto);
Retorno agregarMensaje(int numContactoOrigen, int numContactoDestino, Date fecha);
Retorno eliminarMensaje(int numContactoOrigen, int numMensaje);
Retorno imprimirTexto(int numContactoOrigen, int numMensaje);
Retorno insertarLinea(int numContactoOrigen, int numMensaje);
Retorno insertarLineaEnPosicion(int numContactoOrigen, int numMensaje, int posicionLinea);
Retorno borrarLinea(int numContactoOrigen, int numMensaje, int posicionLinea);
Retorno borrarTodo(int numContactoOrigen, int numMensaje);
Retorno borrarOcurrenciasPalabraEnTexto(int numContactoOrigen, int numMensaje, String palabraABorrar);
Retorno insertarPalabraEnLinea(int numContactoOrigen, int numMensaje, int posicionLinea, int posicionPalabra, String palabraAIngresar);
Retorno insertarPalabraYDesplazar(int numContactoOrigen, int numMensaje, int posicionLinea, int posicionPalabra, String palabraAIngresar);
Retorno borrarPalabra(int numContactoOrigen, int numMensaje, int posicionLinea, int posicionPalabra);
Retorno borrarOcurrenciasPalabraEnLinea(int numContactoOrigen, int numMensaje, int posicionLinea , String palabraABorrar);
Retorno imprimirLinea(int numContactoOrigen, int numMensaje, int posicionLinea);
Retorno ingresarPalabraDiccionario(String palabraAIngresar);
Retorno borrarPalabraDiccionario(String palabraABorrar);
Retorno imprimirDiccionario();
Retorno ImprimirTextoIncorrecto();
Retorno cantidadDeMensajes(int numContactoOrigen);

Retorno imprimirContactos();
Retorno imprimircontactoMaxCantMensajes();
        
Retorno mostrarContactos();

}
