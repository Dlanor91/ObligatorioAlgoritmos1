
package trabajarconobligatorio;
import java.util.Date;

public interface IListaContactos {
    
    boolean esVacia();    
    void AgregarInicioLista(int num, String dato);
    void AgregarFinal(int num,String dato);
    void EliminarInicio();
    void EliminarFin();
    void MostrarLista(); 
    int CantidadDeElementos();
    void vaciar();
    void borrarElemento(int num);
    
    //Diccionario
    String ImprimirTextoIncorrecto(NodoDiccionario TodasPalabras);
    
    //Mensajes
    NodoContactos BuscarContactoDestino(int num);     
    NodoContactos AgregarMensaje(int numContOrigen,int numContDestino, Date fecha);
    NodoContactos BorrarMensaje(int numContDestino, int numMensaje);    
    
    //Lineas
    NodoContactos borrarTodo(int numContDestino, int numMensaje);
    NodoContactos insertarLinea(int numContDestino, int numMensaje);
    NodoContactos insertarLineaEnPosicion(int numContDestino, int numMensaje, int posicionLinea);
    NodoContactos borrarLineaPosicion(int numContDestino, int numMensaje, int posicionLinea);

    //Palabras
    NodoContactos insertarPalabraEnLinea(int numContDestino, int numMensaje, int posicionLinea, int posicionPalabra, String palabraAIngresar, int cantMaximaPalabras);
    NodoContactos insertarPalabraYDesplazar(int numContDestino, int numMensaje, int posicionLinea, int posicionPalabra, String palabraAIngresar, int cantMaximaPalabras);
    NodoContactos borrarPalabra(int numContDestino, int numMensaje, int posicionLinea, int posicionPalabra);
    NodoContactos borrarOcurrenciasPalabraEnLinea(int numContDestino, int numMensaje, int posicionLinea, String palabraABorrar);
    NodoContactos borrarOcurrenciasPalabraEnTexto(int numContDestino, int numMensaje, String palabraABorrar);
    

}
