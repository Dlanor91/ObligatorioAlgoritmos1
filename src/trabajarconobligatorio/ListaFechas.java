package trabajarconobligatorio;

import java.time.temporal.Temporal;
import java.util.Date;

public class ListaFechas implements IListaFechas{
    NodoFechas primero;
    NodoFechas ultimo;  
    
    int cantNodos;

    /*Constructor*/
    public ListaFechas() {
        this.primero = null;
        this.ultimo = null;        
        this.cantNodos = 0;        
    }
   
    /*Get y set*/

    public NodoFechas getPrimero() {
        return primero;
    }

    public void setPrimero(NodoFechas primero) {
        this.primero = primero;
    }

    public NodoFechas getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoFechas ultimo) {
        this.ultimo = ultimo;
    }

    public int getCantNodos() {
        return cantNodos;
    }

    public void setCantNodos(int cantNodos) {
        this.cantNodos = cantNodos;
    }
    

    //Metodos
    @Override
    public boolean esVacia() {
        return this.getPrimero() == null; //es lo mismo q un if en una linea
    }

    @Override
    public void AgregarFinal(Date fecha, int cantMensajes) {
        NodoFechas nuevo = new NodoFechas(fecha,cantMensajes);
        if(this.esVacia()){
            this.setPrimero(nuevo);
            this.setUltimo(nuevo);
        }else{
            NodoFechas aux = this.getPrimero();
            while(aux.siguiente != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            this.setUltimo(nuevo);
        }
        this.cantNodos++;
    }
    
    @Override
    public void vaciar() {
        this.setPrimero(null);   
        this.setUltimo(null);
        this.cantNodos = 0;
    }    

}
