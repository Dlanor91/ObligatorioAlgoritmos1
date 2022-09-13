
package trabajarconobligatorio;

import java.util.Date;

public class NodoLineas {
    int numContDestino;
    int numMensajes; 
    ListaPalabras LP;
    NodoLineas siguiente;

    /*Creo el consrtuctor con un siguiente null*/

    public NodoLineas(int numContDestino, int numMensajes) {
        this.numContDestino = numContDestino;
        this.numMensajes = numMensajes;
        this.LP = new ListaPalabras();
        this.siguiente = null;
    }

    /*Creamos Get and Setter*/

    public int getNumContDestino() {
        return numContDestino;
    }

    public void setNumContDestino(int numContDestino) {
        this.numContDestino = numContDestino;
    }


    public int getNumMensajes() {
        return numMensajes;
    }

    public void setNumMensajes(int numMensajes) {
        this.numMensajes = numMensajes;
    }  

    public NodoLineas getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLineas siguiente) {
        this.siguiente = siguiente;
    }

    public ListaPalabras getLP() {
        return LP;
    }

    public void setLP(ListaPalabras LP) {
        this.LP = LP;
    }
    
}
