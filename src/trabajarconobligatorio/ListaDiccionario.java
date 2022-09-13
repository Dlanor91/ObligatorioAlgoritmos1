
package trabajarconobligatorio;

import java.time.temporal.Temporal;

public class ListaDiccionario implements IListaDiccionario{
    NodoDiccionario primero;
    NodoDiccionario ultimo;
    int cantNodos;

    /*Constructor*/
    public ListaDiccionario() {
        this.primero = null;
        this.ultimo = null;
        this.cantNodos = 0;
    }
   
    /*Get y set*/
    public NodoDiccionario getPrimero() {
        return primero;
    }

    public void setPrimero(NodoDiccionario primero) {
        this.primero = primero;
    }

    public int getCantNodos() {
        return cantNodos;
    }

    public void setCantNodos(int cantNodos) {
        this.cantNodos = cantNodos;
    }

    public NodoDiccionario getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoDiccionario ultimo) {
        this.ultimo = ultimo;
    }
    
    
    @Override
    public boolean esVacia() {
        return this.getPrimero() == null;
    }

    @Override
    public void EliminarInicio() {
        if(!this.esVacia()){
            if(this.primero == this.ultimo){
                this.primero = null;
                this.ultimo = null;
            }else{
                this.primero = this.primero.siguiente;                
            }            
        }
        this.cantNodos --;
    }

    @Override
    public void MostrarLista() {
        NodoDiccionario aux = this.getPrimero();
        while(aux !=null)
        {
           System.out.print(aux.getDato() + " - " );
           aux = aux.getSiguiente();
        }
    }

    @Override
    public int CantidadDeElementos() {        
        return this.getCantNodos();        
    }

    @Override
    public void AgregarInicioLista(String dato) {        
        NodoDiccionario nuevo = new NodoDiccionario(dato);       
        if(this.esVacia()){
            this.setPrimero(nuevo);
            this.setUltimo(nuevo);
        }else{
            nuevo.setSiguiente(primero);
            this.primero = nuevo;            
        }        
        this.cantNodos ++;       
    }

    @Override
    public void AgregarFinal(String dato) {
        NodoDiccionario nuevo = new NodoDiccionario(dato);
        if(this.esVacia()){
            this.setPrimero(nuevo);
        }else{
            NodoDiccionario aux = this.getPrimero();
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
    
    @Override 
    public void agregarOrd(String dato) {
        NodoDiccionario nuevo = new NodoDiccionario(dato);
        
        if(this.esVacia()){            
            this.AgregarInicioLista(dato);
        }
        else{  
            if(dato.compareToIgnoreCase(this.getPrimero().getDato()) < 0){
                this.AgregarInicioLista(dato);
            }
            else if( dato.compareToIgnoreCase(this.getUltimo().getDato()) > 0){
                this.AgregarFinal(dato);
            }else{
                NodoDiccionario aux = this.getPrimero();               
                
                if(dato != aux.getDato()){
                    while(aux.getSiguiente() != null && dato.compareToIgnoreCase(aux.siguiente.getDato()) >0){                   
                        aux = aux.getSiguiente();
                    }
                 
                   if(dato != aux.siguiente.getDato()){
                        nuevo.siguiente = aux.siguiente;
                        aux.siguiente = nuevo;
                        this.cantNodos++;
                    }
                
                }
            }   
        }
    }  
    
    @Override
    public void borrarElemento(String dato) {
        if(!this.esVacia()){          
           NodoDiccionario aux = this.getPrimero();           
           if( aux.getDato() == dato){
               this.EliminarInicio();
           }
           else{
               int conteo = 0;
               NodoDiccionario anterior = primero; //lo inicializo con mi primero nodo
               while(conteo<cantNodos && aux.getDato()!= dato){
                   anterior = aux;
                   aux = aux.siguiente; //paso al siguiente elemento  
                   conteo++;
               }
               if(aux.getDato()== dato){
                    anterior.siguiente = aux.siguiente;
                    cantNodos --;
               }
           }
             
        }          
    }

    @Override
    public NodoDiccionario BuscarPalabra(String palabraAIngresar) {
        NodoDiccionario aux = this.getPrimero();
        NodoDiccionario elemento = null;
        while(aux != null){
            if(aux.getDato()==palabraAIngresar){
                elemento = aux;
                return elemento;
            } 
        aux = aux.getSiguiente();                
        }    
       return elemento;
    }

}
