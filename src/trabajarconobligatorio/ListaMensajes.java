
package trabajarconobligatorio;

import java.time.temporal.Temporal;
import java.util.Date;

public class ListaMensajes implements IListaMensajes{
    NodoMensajes primero;
    NodoMensajes ultimo;
    ListaLineas LL;
    int cantNodos;

    /*Constructor*/

    public ListaMensajes() {
        this.primero = primero;
        this.ultimo = ultimo;
        this.LL = new ListaLineas();
        this.cantNodos = 0;
    }

    public ListaLineas getLL() {
        return LL; 
    }

    /*Get y set*/
    public void setLL(ListaLineas LL) {
        this.LL = LL;
    }

    public NodoMensajes getPrimero() {
        return primero; 
    }

    public void setPrimero(NodoMensajes primero) {
        this.primero = primero;
    }

    public NodoMensajes getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoMensajes ultimo) {
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
    public void AgregarFinal(int numContOrigen,int numContDestino, Date fecha) {
        NodoMensajes nuevo = new NodoMensajes(numContOrigen,numContDestino,fecha);
        if(this.esVacia()){
            nuevo.conteoMensajes = 1;
            this.setPrimero(nuevo);
            this.setUltimo(nuevo);
        }else{
            NodoMensajes aux = this.getPrimero();
            int conteo= 0;
            while(aux.siguiente != null){                
                aux = aux.getSiguiente();
            }
            if(aux.numContactoDestino == numContDestino){
                 conteo = aux.getConteoMensajes() ;
            }
            conteo++;
            nuevo.conteoMensajes =conteo;
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
    public void BorrarMensaje(int numContDestino, int numMensaje) {
        NodoMensajes aux = this.getPrimero(); 
        NodoMensajes auxFinal= this.getUltimo();
        if(!this.esVacia()){
           if( aux.numContactoDestino ==  numContDestino && aux.conteoMensajes == numMensaje){
               this.EliminarInicio();
           }          
           else{
               NodoMensajes anterior = primero;
               boolean existe = false;
               while(aux != null && !existe){
                   if(aux.numContactoDestino ==  numContDestino && aux.conteoMensajes == numMensaje){ 
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
    }

    @Override
    public NodoMensajes BuscarMensaje(int numContDestino, int numMensaje){
        NodoMensajes aux = this.getPrimero();
        NodoMensajes elemento = null;
        while(aux != null){
            if(aux.numContactoDestino==numContDestino && aux.conteoMensajes == numMensaje){
                elemento = aux;
                return elemento;
            } 
        aux = aux.getSiguiente();                
        }    
       return elemento;  
    }

    @Override //3.2
    public NodoMensajes AgregarLinea(NodoLineas aux,int contOrigen, int numMensaje) {
        NodoMensajes busc = BuscarMensaje(contOrigen, numMensaje);
            busc.LL.AgregarFinal(aux, contOrigen, numMensaje);         
        return busc;
    }

    @Override //3.3
    public NodoMensajes AgregarLineaPosicion(int numContactoOrigen, int numMensaje, int posicionLinea) {
    NodoMensajes busc = BuscarMensaje(numContactoOrigen, numMensaje); 
        busc.LL.AgregarLineaPosicion(numContactoOrigen, numMensaje, posicionLinea);    
    return busc;
    }

    @Override //3.4
    public NodoMensajes BorrarLinea(int numContactoOrigen, int numMensaje, int posicionLinea) {
    NodoMensajes busc = BuscarMensaje(numContactoOrigen, numMensaje); 
        busc.LL.BorrarLinea(numContactoOrigen, numMensaje, posicionLinea);    
    return busc;
    }

     @Override //3.5
    public NodoMensajes borrarTodo(NodoLineas aux,int numContDestino, int numMensaje) {
        NodoMensajes mensaje = this.BuscarMensaje(numContDestino, numMensaje);
            mensaje.LL.borrarTodo(aux,numContDestino, numMensaje);
        return mensaje;
    }
    
    @Override //3.6
    public NodoMensajes borrarOcurrenciasPalabraEnTexto(NodoLineas aux, int numContDestino, int numMensaje, String palabraABorrar) {
        NodoMensajes mensaje = this.BuscarMensaje(numContDestino, numMensaje);
            mensaje.LL.borrarOcurrenciasPalabraEnTexto(aux, numContDestino, numMensaje, palabraABorrar);
        return mensaje;
    }
    
    @Override //3.7
    public NodoMensajes AgregarPalabraLineaPosicion(int numContactoOrigen, int numMensaje, int posicionLinea, int posicionPalabra, String palabraAIngresar) {
    NodoMensajes busc = BuscarMensaje(numContactoOrigen, numMensaje); 
        busc.LL.AgregarPalabraLineaPosicion(numContactoOrigen, numMensaje, posicionLinea, posicionPalabra, palabraAIngresar);    
    return busc;
    }

    @Override //3.8
    public NodoMensajes InsertarPalabraYDesplazar(int numContactoOrigen, int numMensaje, int posicionLinea, int posicionPalabra, String palabraAIngresar,int cantMaximaPalabras) {
    NodoMensajes busc = BuscarMensaje(numContactoOrigen, numMensaje); 
        busc.LL.InsertarPalabraYDesplazar(numContactoOrigen, numMensaje, posicionLinea, posicionPalabra, palabraAIngresar,cantMaximaPalabras);    
    return busc;
    }

     @Override
    public String MostrarMensaje(int numContDestino, int numMensaje) {
        NodoMensajes mensaje = this.BuscarMensaje(numContDestino, numMensaje);
        
        String MensajeMostrar="\n";
        if(mensaje!=null){   
            int conteoLineas = mensaje.LL.cantNodos;
            int conteo = 1;
            NodoLineas aux = mensaje.LL.primero; 
            if (conteoLineas != 0){
                while(aux!=null && conteo <= conteoLineas){
                    MensajeMostrar += mensaje.LL.MostrarLinea(numContDestino, numMensaje, conteo).toString();
                    conteo++;
                    aux = aux.getSiguiente();                
                }            
            }else{
                MensajeMostrar +="No existen lineas de texto para ese contacto y ese mensaje.";
            }
        }else{
                MensajeMostrar +="El mensaje no existe para ese contacto";
            }
        return MensajeMostrar;
    }
    
    @Override
    public String MostrarLinea(int numContDestino, int numMensaje, int posicionLinea) {
        NodoMensajes mensaje = this.BuscarMensaje(numContDestino, numMensaje);
        String linea = null;
        if(mensaje!=null){
            linea = mensaje.LL.MostrarLinea(numContDestino, numMensaje, posicionLinea).toString();
        }else{
            linea ="El mensaje no existe para ese contacto";
        }
        
        return linea;
    }

    @Override //3.9
    public NodoMensajes borrarPalabra(int numContDestino, int numMensaje, int posicionLinea, int posicionPalabra) {
        NodoMensajes mensaje = this.BuscarMensaje(numContDestino, numMensaje);
            
        if(mensaje != null){
            mensaje.LL.borrarPalabra(numContDestino, numMensaje, posicionLinea, posicionPalabra);
        }
            
        return mensaje;
    }

    @Override //3.10
    public NodoMensajes borrarOcurrenciasPalabraEnLinea(int numContDestino, int numMensaje, int posicionLinea, String palabraABorrar) {
        NodoMensajes mensaje = this.BuscarMensaje(numContDestino, numMensaje);
            
        if(mensaje != null){
            mensaje.LL.borrarOcurrenciasPalabraEnLinea(numContDestino, numMensaje, posicionLinea, palabraABorrar);
        }
            
        return mensaje;
    }     

}
