
package trabajarconobligatorio;

public class NodoDiccionario {
    String dato;
    NodoDiccionario siguiente;

    /*Creo el consrtuctor con un siguiente null*/
    public NodoDiccionario(String dato) {
        this.dato = dato;
        this.siguiente = null;
        
    }
    /*Creo los set y gets*/
    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoDiccionario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDiccionario siguiente) {
        this.siguiente = siguiente;
    } 
    
          
}
