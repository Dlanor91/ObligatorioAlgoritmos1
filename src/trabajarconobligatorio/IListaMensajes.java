
package trabajarconobligatorio;
import java.util.Date;

public interface IListaMensajes {
    
    boolean esVacia();    
 
    void AgregarFinal(int numContOrigen,int numContDestino, Date fecha);
    void EliminarInicio();
    void vaciar();
    void BorrarMensaje(int numContDestino, int numMensaje);
    
    
    NodoMensajes AgregarLinea(NodoLineas aux, int contOrigen, int numMensaje);
    NodoMensajes borrarTodo(NodoLineas aux,int numContDestino, int numMensaje);
    NodoMensajes borrarOcurrenciasPalabraEnTexto(NodoLineas aux,int numContDestino, int numMensaje, String palabraABorrar);
    
    NodoMensajes AgregarLineaPosicion(int numContactoOrigen, int numMensaje, int posicionLinea);
    NodoMensajes BorrarLinea(int numContactoOrigen, int numMensaje, int posicionLinea);
    NodoMensajes AgregarPalabraLineaPosicion(int numContactoOrigen, int numMensaje, int posicionLinea, int posicionPalabra, String palabraAIngresar);
    NodoMensajes InsertarPalabraYDesplazar(int numContactoOrigen, int numMensaje, int posicionLinea, int posicionPalabra, String palabraAIngresar,int cantMaximaPalabras );
    NodoMensajes BuscarMensaje(int numContDestino, int numMensaje);
    
    NodoMensajes borrarPalabra(int numContDestino, int numMensaje, int posicionLinea, int posicionPalabra);
    NodoMensajes borrarOcurrenciasPalabraEnLinea(int numContDestino, int numMensaje, int posicionLinea, String palabraABorrar);
     
    String MostrarMensaje(int numContDestino, int numMensaje);
    String MostrarLinea(int numContDestino, int numMensaje, int posicionLinea);
      
 

}
