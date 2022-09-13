
package trabajarconobligatorio;

import java.time.temporal.Temporal;
import java.util.Date;

public class ListaPalabras implements IListaPalabras{
    NodoPalabra primero;
    NodoPalabra ultimo;
    int cantNodos;

    /*Constructor*/

    public ListaPalabras() {
        this.primero = primero;
        this.ultimo = ultimo;
        this.cantNodos = 0;
    }

    //Get y Set
    public NodoPalabra getPrimero() {
        return primero;
    }

    public void setPrimero(NodoPalabra primero) {
        this.primero = primero;
    }

    public NodoPalabra getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoPalabra ultimo) {
        this.ultimo = ultimo;
    }

    

    public int getCantNodos() {
        return cantNodos;
    }

    public void setCantNodos(int cantNodos) {
        this.cantNodos = cantNodos;
    }  

    @Override
    public boolean esVacia() {
        return this.getPrimero() == null;
    }
    
    @Override
    public void AgregarInicioLista(int numContactoOrigen, int numMensaje, int posicionLinea, int posicionPalabra, String palabraAIngresar) {
      NodoPalabra nuevo = new NodoPalabra(numContactoOrigen,numMensaje,posicionLinea,posicionPalabra,palabraAIngresar);
      
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
    public void borrarElemento(int posicionPalabra) {
        NodoPalabra aux = this.getPrimero();
        int conteo = 1;
        if(!this.esVacia()){
           if( posicionPalabra ==1){
               this.EliminarInicio();
           }          
           else{
               NodoPalabra anterior = primero;               
               while(aux != null && conteo < posicionPalabra){
                   conteo++;
                   anterior = aux;
                   aux = aux.siguiente;
               }
               if(aux == this.getUltimo())
               {
                   anterior.siguiente = aux.siguiente; 
                   this.setUltimo(anterior);
                   cantNodos --;
               }
               else{
                anterior.siguiente = aux.siguiente;
                cantNodos --;
               }
           }

        }
    }          

    @Override
    public void AgregarPalabraLineaPosicion(int numContactoOrigen, int numMensaje, int posicionLinea, int posicionPalabra, String palabraAIngresar) {
        NodoPalabra nuevo = new NodoPalabra(numContactoOrigen, numMensaje, posicionLinea, posicionPalabra, palabraAIngresar);
          
        if(this.esVacia()){
            this.setPrimero(nuevo);
            this.setUltimo(nuevo);
        }else{
            NodoPalabra aux = this.getPrimero();
            while(aux.siguiente != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            this.setUltimo(nuevo);
        }
        this.cantNodos++;        
    }
    
    @Override
    public int ConteoPalabra(int numContactoOrigen, int numMensaje) {        
        NodoPalabra aux = this.getPrimero();        
        int conteo = 0;
        while(aux != null){
            if(aux.numContactoOrigen==numContactoOrigen && aux.numMensajes==numMensaje){
                conteo++;                
            }        
        aux = aux.getSiguiente();
        }        
        return conteo;
    }

    @Override
    public void AgregarPalabraPosicionInicio(int numContactoOrigen, int numMensaje, int posicionLinea, int posicionPalabra, String palabraAIngresar) {
        NodoPalabra nuevo = new NodoPalabra(numContactoOrigen, numMensaje, posicionLinea, posicionPalabra, palabraAIngresar);
        
        boolean encontrado = false;
        
        int conteo = 1;
        
        if(this.esVacia()){
            this.setPrimero(nuevo);
            this.setUltimo(nuevo); //aqui siempre queda apuntando al ultimo valor
        }else{
            NodoPalabra aux = this.getPrimero();
            while(aux != null && !encontrado){
                if(posicionPalabra == 1 && !encontrado){
                    nuevo.setSiguiente(primero);
                    this.primero = nuevo;
                    encontrado = true;
                }                               
                aux = aux.getSiguiente();
            }
            nuevo = aux;
            
            
        }
        this.cantNodos++;   
    }
    
    @Override
    public void InsertarPalabraPosicion(int numContactoOrigen, int numMensaje, int posicionLinea, int posicionPalabra, String palabraAIngresar) {
        NodoPalabra nuevo = new NodoPalabra(numContactoOrigen, numMensaje, posicionLinea, posicionPalabra, palabraAIngresar);
                
        boolean ingresado = false;
        int conteo = 1;
        
            NodoPalabra aux = this.getPrimero();
            NodoPalabra anterior = this.primero;
            if(posicionPalabra == 1){
                AgregarInicioLista(numContactoOrigen, numMensaje, posicionLinea, posicionPalabra, palabraAIngresar);
            }else {
                while(aux != null && !ingresado){
                    if(conteo == posicionPalabra){
                        anterior.siguiente = nuevo;
                        nuevo.siguiente = aux;
                        ingresado = true;
                    }
                    conteo++;
                    anterior = aux;
                    aux = aux.getSiguiente();
                }
                this.cantNodos++;
            }       
         
    }

    @Override
    public NodoPalabra borrarPalabra(int numContDestino, int numMensaje, int posicionLinea, int posicionPalabra) {
        NodoPalabra aux = this.getPrimero();        
        NodoPalabra anterior = this.primero;
        boolean existe = false;
        int conteo = 0;
        
        if(aux!=null){
            if(posicionPalabra == 1){
                EliminarInicio();
            }else{
                while(aux != null  && !existe)
                {
                  conteo++;
                  if(conteo == posicionPalabra){ 
                       existe =true;
                   }else{
                        anterior = aux;
                        aux = aux.siguiente;
                   }
                }
                if(existe && aux == this.getUltimo())
                {
                   anterior.siguiente = aux.siguiente; 
                   this.setUltimo(anterior);
                   cantNodos --;
                }else if(existe) {
                    anterior.siguiente = aux.siguiente;
                    cantNodos --;
               }
            }
        }
        return aux;
    }

    @Override
    public NodoPalabra borrarOcurrenciasPalabraEnLinea(int numContDestino, int numMensaje, int posicionLinea, String palabraABorrar) {
        NodoPalabra aux = this.getPrimero();        
        NodoPalabra anterior = this.primero;
        
        if(aux!=null){
            while(aux!=null){
                if(primero.getPalabraAIngresar() == palabraABorrar){
                    EliminarInicio();
                }else if(aux.getPalabraAIngresar() == palabraABorrar){
                    anterior.siguiente = aux.siguiente;
                    cantNodos --;
                } 
                
                if(aux.getPalabraAIngresar() != palabraABorrar){
                    anterior = aux;
                }
                aux = aux.siguiente;
            }
         
        }
        
        return aux;
    }

    @Override
    public String MostrarTextoIncorrecto(int numContDestino, int numMensaje, int posicionLinea, NodoDiccionario palabraDiccionario) {
        String texto = "\n " + posicionLinea + ": ";
        NodoPalabra aux = this.getPrimero();
        String palabraAux = "";                             
        String palabraBuscada = "";
        
        while(aux != null){
            NodoDiccionario palabra = palabraDiccionario;
            boolean existe = false;
            palabraAux = aux.getPalabraAIngresar();
            while(palabra != null && !existe)
            {
                palabraBuscada = palabra.getDato();
                if(palabraAux == palabraBuscada){
                    existe = true;
                }else{
                    palabra= palabra.siguiente;                    
                }
            }
            if(!existe )
            {
                texto += palabraAux + " ";
            } 
            aux = aux.siguiente;
        }
        
        return texto;
    }

    @Override
    public boolean BuscarPalabra(String palabraBuscar) {
        boolean existe = false;
        NodoPalabra aux = this.getPrimero();
        NodoPalabra elemento = null;
        while(aux != null){
            if(aux.getPalabraAIngresar()==palabraBuscar){
                elemento = aux;
                existe = true;
                return existe;
            } 
        aux = aux.getSiguiente();                
        }    
       return existe;
    }
    
}
