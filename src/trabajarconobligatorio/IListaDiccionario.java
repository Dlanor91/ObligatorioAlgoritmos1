
package trabajarconobligatorio;


public interface IListaDiccionario {
    
    boolean esVacia();
    void AgregarInicioLista(String dato);
    void AgregarFinal(String dato);
    void EliminarInicio();    
    void MostrarLista();
    int CantidadDeElementos();
    void vaciar();
    void borrarElemento(String dato); 
    void agregarOrd(String dato); 
    
    NodoDiccionario BuscarPalabra(String palabraAIngresar);


}
