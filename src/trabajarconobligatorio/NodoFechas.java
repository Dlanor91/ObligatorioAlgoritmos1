
package trabajarconobligatorio;

import java.util.Date;

public class NodoFechas {
    Date fecha;
    int cantMensajes; 
    NodoFechas siguiente;
    

    /*Creo el consrtuctor con un siguiente null*/

    
    public NodoFechas(Date fecha, int cantMensajes) {
        this.fecha = fecha;
        this.cantMensajes = cantMensajes;
        this.siguiente = null;
    }

    /*Creamos Get and Setter*/    

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantMensajes() {
        return cantMensajes;
    }

    public void setCantMensajes(int cantMensajes) {
        this.cantMensajes = cantMensajes;
    }

    public NodoFechas getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoFechas siguiente) {
        this.siguiente = siguiente;
    }
    
}
