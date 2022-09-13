
package trabajarconobligatorio;

public class NodoContactos {
    int numContacto;
    String nomContacto;
    NodoContactos siguiente;
    ListaMensajes LM;

    /*Creo el consrtuctor con un siguiente null*/

    public NodoContactos(int numContacto, String nomContacto) {
        this.numContacto = numContacto;
        this.nomContacto = nomContacto;
        this.siguiente = null;
        this.LM = new ListaMensajes();
    }

    /*Creamos Get and Setter*/
    public int getNumContacto() {
        return numContacto;
    }

    public void setNumContacto(int numContacto) {
        this.numContacto = numContacto;
    }

    public String getNomContacto() {
        return nomContacto;
    }

    public void setNomContacto(String nomContacto) {
        this.nomContacto = nomContacto;
    }

    public NodoContactos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoContactos siguiente) {
        this.siguiente = siguiente;
    } 

    public ListaMensajes getLM() {
        return LM;
    }

    public void setLM(ListaMensajes LM) {
        this.LM = LM;
    }
    
    
}
