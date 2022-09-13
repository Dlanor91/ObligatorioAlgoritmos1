
package trabajarconobligatorio;
import java.util.Date;

public interface IListaLineas {
    
    boolean esVacia(); 
    //Recursividad
    boolean AgregarInicioLista(int numContOrigen,int numMensaje);
    boolean AgregarFinal(NodoLineas aux,int numContOrigen,int numMensaje);
    
    boolean borrarTodo(NodoLineas aux,int numContDestino, int numMensaje);
    boolean EliminarFin(int numContDestino, int numMensaje);
    
    boolean borrarOcurrenciasPalabraEnTexto(NodoLineas aux, int numContDestino, int numMensaje, String palabraABorrar);
    boolean existePalabraLinea(String palabraBuscar);
    
    void AgregarLineaPosicion(int numContactoOrigen, int numMensaje, int posicionLinea);    
    void BorrarLinea(int numContactoOrigen, int numMensaje, int posicionLinea);
    void EliminarInicio();
    
    NodoLineas BuscElemento(int numContactoOrigen, int numMensaje, int posicionLinea); 
    NodoLineas AgregarPalabraLineaPosicion(int numContactoOrigen, int numMensaje, int posicionLinea, int posicionPalabra, String palabraAIngresar);
    NodoLineas InsertarPalabraYDesplazar(int numContactoOrigen, int numMensaje, int posicionLinea, int posicionPalabra, String palabraAIngresar,int cantMaximaPalabras);
    
    NodoLineas borrarPalabra(int numContDestino, int numMensaje, int posicionLinea, int posicionPalabra);
    NodoLineas borrarOcurrenciasPalabraEnLinea(int numContDestino, int numMensaje, int posicionLinea, String palabraABorrar);
    
    String MostrarLinea(int numContDestino, int numMensaje, int posicionLinea);
    int ConteoPalabrasTotales(int numContactoOrigen, int numMensaje);
 

}
