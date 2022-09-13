
package trabajarconobligatorio;

import java.util.Date;

public class NodoMensajes {
    int numContactoOrigen;
    int numContactoDestino;
    int conteoMensajes;
    Date fecha;
    ListaLineas LL;
    NodoMensajes siguiente;

    /*Creo el consrtuctor con un siguiente null*/

    public NodoMensajes(int numContactoOrigen, int numContactoDestino, Date fecha) {
        this.numContactoOrigen = numContactoOrigen;
        this.numContactoDestino = numContactoDestino;
        this.fecha = fecha;
        this.LL = new ListaLineas();
        this.conteoMensajes = 0;
        this.siguiente = null;
    }


   
    /*Creamos Get and Setter*/
     public int getConteoMensajes() {
        return conteoMensajes;
    }

    public void setConteoMensajes(int conteoMensajes) {
        this.conteoMensajes = conteoMensajes;
    }

    public int getNumContactoOrigen() {
        return numContactoOrigen;
    }

    public void setNumContactoOrigen(int numContactoOrigen) {
        this.numContactoOrigen = numContactoOrigen;
    }

    public int getNumContactoDestino() {
        return numContactoDestino;
    }

    public void setNumContactoDestino(int numContactoDestino) {
        this.numContactoDestino = numContactoDestino;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ListaLineas getLL() {
        return LL;
    }

    public void setLL(ListaLineas LL) {
        this.LL = LL;
    }
    
    public NodoMensajes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoMensajes siguiente) {
        this.siguiente = siguiente;
    }

    
}
