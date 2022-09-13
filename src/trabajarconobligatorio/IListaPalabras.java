
package trabajarconobligatorio;
import java.util.Date;

public interface IListaPalabras {
    
    boolean esVacia();    
    void AgregarInicioLista(int numContactoOrigen, int numMensaje, int posicionLinea, int posicionPalabra, String palabraAIngresar);
 
    void AgregarPalabraLineaPosicion(int numContactoOrigen, int numMensaje, int posicionLinea, int posicionPalabra, String palabraAIngresar);
    void AgregarPalabraPosicionInicio(int numContactoOrigen, int numMensaje, int posicionLinea,int posicionPalabra, String palabraAIngresar);
    void InsertarPalabraPosicion (int numContactoOrigen, int numMensaje, int posicionLinea,int posicionPalabra, String palabraAIngresar);
    int ConteoPalabra(int numContactoOrigen, int numMensaje);
 
    void borrarElemento(int posicionPalabra);
    void EliminarInicio();
    NodoPalabra borrarPalabra(int numContDestino, int numMensaje, int posicionLinea, int posicionPalabra);
    NodoPalabra borrarOcurrenciasPalabraEnLinea(int numContDestino, int numMensaje, int posicionLinea, String palabraABorrar);
    
    boolean BuscarPalabra(String palabraAIngresar);
    
    String MostrarTextoIncorrecto(int numContDestino, int numMensaje, int posicionLinea, NodoDiccionario palabraDiccionario);

}
