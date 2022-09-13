
package trabajarconobligatorio;

import java.util.Date;

public class NodoPalabra {
    int numContactoOrigen;
    int numMensajes; 
    int posicionLinea;    
    String palabraAIngresar;    
    NodoPalabra siguiente;

    /*Creo el consrtuctor con un siguiente null*/

    public NodoPalabra(int numContactoOrigen, int numMensajes, int posicionLinea, int posicionPalabra, String palabraAIngresar) {
        this.numContactoOrigen = numContactoOrigen;
        this.numMensajes = numMensajes;
        this.posicionLinea = posicionLinea;        
        this.palabraAIngresar = palabraAIngresar;
        this.siguiente = null;
    }

    /*Creamos Get and Setter*/

    public int getNumContactoOrigen() {
        return numContactoOrigen;
    }

    public void setNumContactoOrigen(int numContactoOrigen) {
        this.numContactoOrigen = numContactoOrigen;
    }

    public int getNumMensajes() {
        return numMensajes;
    }

    public void setNumMensajes(int numMensajes) {
        this.numMensajes = numMensajes;
    }

    public int getPosicionLinea() {
        return posicionLinea;
    }

    public void setPosicionLinea(int posicionLinea) {
        this.posicionLinea = posicionLinea;
    }

    public String getPalabraAIngresar() {
        return palabraAIngresar;
    }

    public void setPalabraAIngresar(String palabraAIngresar) {
        this.palabraAIngresar = palabraAIngresar;
    }

    public NodoPalabra getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPalabra siguiente) {
        this.siguiente = siguiente;
    }

    
}
