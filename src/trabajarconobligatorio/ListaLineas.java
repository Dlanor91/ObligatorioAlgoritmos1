
package trabajarconobligatorio;

import java.time.temporal.Temporal;
import java.util.Date;

public class ListaLineas implements IListaLineas{
    NodoLineas primero;
    NodoLineas ultimo;
    ListaPalabras LP;
    int cantNodos;

    /*Constructor*/

    public ListaLineas() {
        this.primero = primero;
        this.ultimo = ultimo;
        LP = new ListaPalabras();
        this.cantNodos = 0;
    }

    /*Get y set*/
    public NodoLineas getPrimero() {
        return primero;
    }

    public void setPrimero(NodoLineas primero) {
        this.primero = primero;
    }

    public NodoLineas getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoLineas ultimo) {
        this.ultimo = ultimo;
    }

    public int getCantNodos() {
        return cantNodos;
    }

    public void setCantNodos(int cantNodos) {
        this.cantNodos = cantNodos;
    }

    public ListaPalabras getLP() {
        return LP;
    }

    public void setLP(ListaPalabras LP) {
        this.LP = LP;
    }
    
    
    

    @Override
    public boolean esVacia() {
        return this.getPrimero() == null;
    }
    
    @Override
    public boolean AgregarInicioLista(int numContOrigen,int numMensaje) {
      NodoLineas nuevo = new NodoLineas(numContOrigen,numMensaje);
      boolean agregar = false;
        if(this.esVacia()){
            this.setPrimero(nuevo);
            this.setUltimo(nuevo); //aqui siempre queda apuntando al ultimo valor
        }else{
            nuevo.setSiguiente(primero);
            this.primero = nuevo;            
        }        
        this.cantNodos ++;
        agregar = true;
        return agregar;              
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

    @Override // con recursividad debe devolver algo
    public boolean AgregarFinal(NodoLineas aux,int numContOrigen,int numMensaje) {      
        
        if(esVacia()){            
            AgregarInicioLista(numContOrigen, numMensaje);
            return true;
        }
        else{    
            if(aux.getSiguiente()==null) {
            NodoLineas nuevo = new NodoLineas (numContOrigen, numMensaje);
            aux.setSiguiente(nuevo);
            this.ultimo = nuevo;
            this.cantNodos++;
            return true;
        } else {
            return AgregarFinal(aux.getSiguiente() , numContOrigen, numMensaje);
        }        
    }
      
} 
    //Recursividad
    @Override
    public boolean borrarTodo(NodoLineas aux,int numContDestino, int numMensaje) {
        if(!esVacia()){           
          EliminarFin(numContDestino, numMensaje);           
          return borrarTodo(aux,numContDestino, numMensaje);
        }
            return true;    
    }

    @Override
    public boolean EliminarFin(int numContDestino, int numMensaje) {
        boolean eliminar = false;
        if(!this.esVacia()){
          if(this.primero == this.ultimo)  {
              this.primero =null;
              this.ultimo = null;
          }else{
              NodoLineas aux = this.primero;
              NodoLineas anterior = this.primero;
              while(aux!=this.ultimo){
                  anterior = aux;
                  aux = aux.getSiguiente();
              }
              anterior.siguiente = aux.siguiente; 
              this.setUltimo(anterior);
          }
          this.cantNodos --;
          return true;
        }
        
        return eliminar;
    }
    
    @Override
    public boolean borrarOcurrenciasPalabraEnTexto(NodoLineas aux, int numContDestino, int numMensaje, String palabraABorrar) {
       
        if(aux!=null){ 
            NodoPalabra aux2 = aux.LP.getPrimero();                    
            
            int conteo = 1;            
             while(aux2!=null){  
                 NodoPalabra anterior = aux.LP.primero;
                 if(aux.LP.primero.getPalabraAIngresar() == palabraABorrar && conteo ==1){
                     aux.LP.primero = aux.LP.primero.siguiente;
                     aux.LP.cantNodos--;
                 }else if(aux2.getPalabraAIngresar() == palabraABorrar){
                     anterior.siguiente = aux2.siguiente;
                     aux.LP.cantNodos--;
                 }
                 
                 if(aux2.getPalabraAIngresar() != palabraABorrar){
                     anterior = aux2;
                 }
                 aux2 = aux2.siguiente;
                
              }  
             
          aux = aux. siguiente;
          borrarOcurrenciasPalabraEnTexto(aux,numContDestino,numMensaje,palabraABorrar);
        }
        return true;
    }  
    
    @Override
    public void BorrarLinea(int numContactoOrigen, int numMensaje, int posicionLinea) {
        NodoLineas aux = this.getPrimero();
        
        if(!this.esVacia()){
           if( aux.numContDestino ==  numContactoOrigen && aux.numMensajes == numMensaje && posicionLinea ==1  ){
               this.EliminarInicio();
           }          
           else{
               NodoLineas anterior = primero;
               
               int conteo = 1;
               while(aux != null && conteo<posicionLinea){                   
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
    public void AgregarLineaPosicion(int numContactoOrigen, int numMensaje, int posicionLinea) {
        NodoLineas nuevo = new NodoLineas(numContactoOrigen, numMensaje);
        NodoLineas aux = this.getPrimero(); 
        NodoLineas buscarLinea = BuscElemento(numContactoOrigen, numMensaje, posicionLinea);
        NodoLineas anterior = this.primero;  
        boolean encontrado = false;
        
        int conteo = 0;
        if(aux == null){
            AgregarInicioLista(numContactoOrigen, numMensaje);
        }
        else if(buscarLinea == null){
            AgregarFinal(aux, numContactoOrigen, numMensaje);
        }
        else{
        
         while(aux != null && !encontrado){
            if(aux.numContDestino==numContactoOrigen && aux.numMensajes==numMensaje && posicionLinea == 1 && !encontrado){
               nuevo.setSiguiente(primero);
               this.primero = nuevo;
               encontrado = true;
            }
            if(aux.numContDestino==numContactoOrigen && aux.numMensajes==numMensaje && conteo<posicionLinea && !encontrado){
                conteo++;                
            }
            if(conteo==posicionLinea && !encontrado){
                nuevo.siguiente= aux;
                anterior.siguiente = nuevo; 
                encontrado = true;
            }

        anterior = aux;
        aux = aux.getSiguiente();
        }

        this.cantNodos++;
        }
        
    }    
    
    @Override
    public NodoLineas BuscElemento(int numContactoOrigen, int numMensaje, int posicionLinea) {
        NodoLineas aux = this.getPrimero();
        NodoLineas elemento = null;
        boolean encontrado = false;
        int conteo = 0;
        while(aux != null && !encontrado){
            if(aux.numContDestino==numContactoOrigen && aux.numMensajes==numMensaje && conteo<posicionLinea && !encontrado){
                conteo++;                
            }
            if(conteo==posicionLinea && !encontrado){
                elemento = aux;
                encontrado = true;
                return elemento;
            }
            
        aux = aux.getSiguiente();                
        }    
       return elemento;
    }

    @Override //3.7
    public NodoLineas AgregarPalabraLineaPosicion(int numContactoOrigen, int numMensaje, int posicionLinea, int posicionPalabra, String palabraAIngresar) {
        NodoLineas busc = BuscElemento(numContactoOrigen, numMensaje,posicionLinea);
            busc.LP.AgregarPalabraLineaPosicion(numContactoOrigen, numMensaje, posicionLinea, posicionPalabra, palabraAIngresar);
        return busc;
    }

    @Override //3.8
    public NodoLineas InsertarPalabraYDesplazar(int numContactoOrigen, int numMensaje, int posicionLinea, int posicionPalabra, String palabraAIngresar, int cantMaximaPalabras) {
        NodoLineas busc = BuscElemento(numContactoOrigen, numMensaje,posicionLinea);
        NodoLineas aux = this.getPrimero();
        
        int cantpalabrasNodo = busc.LP.getCantNodos();
        int TotalMaximopalabas = cantMaximaPalabras;
        NodoPalabra nuevo = new NodoPalabra(numContactoOrigen, numMensaje, posicionLinea, posicionPalabra,palabraAIngresar);
        
        boolean encontrado = false;
        boolean insertado = false;
        if(cantpalabrasNodo<cantMaximaPalabras){
           busc.LP.InsertarPalabraPosicion(numContactoOrigen, numMensaje, posicionLinea, posicionPalabra, palabraAIngresar);
        }else{
          while (aux != null){
            int conteo = 1;
            NodoPalabra aux2 = aux.LP.getPrimero(); 
            NodoLineas anterior =  this.primero;
            int cantPalabras =  aux.LP.getCantNodos();
                
                    
                while(aux2 != null && cantPalabras <= cantMaximaPalabras){
                    
                        if(aux2.posicionLinea == posicionLinea && posicionPalabra == 1 && !encontrado && !insertado){
                            nuevo.setSiguiente(aux.LP.primero);
                            aux.LP.primero= nuevo;
                            insertado = true;
                            encontrado = true;
                            aux.LP.cantNodos ++;
                            conteo = cantMaximaPalabras;
                            aux2 = aux2.getSiguiente();
                        } else if(aux2.posicionLinea == posicionLinea && conteo < posicionPalabra && !encontrado && !insertado){                            
                            conteo++;                            
                        }
            
                        if(aux2.posicionLinea == posicionLinea && conteo==posicionPalabra && !encontrado && !insertado){                                
                            
                                nuevo.siguiente= aux2.siguiente;
                                aux2.siguiente = nuevo;                                
                                encontrado = true;
                                insertado = true;
                                aux.LP.cantNodos ++;
                                aux2 = aux2.getSiguiente();
                                aux2 = aux2.getSiguiente();
                                if(conteo<cantMaximaPalabras){
                                    conteo++;
                                }
                        }
                        
                        if(encontrado && conteo <posicionPalabra)
                        {                            
                            conteo++;                                                     
                        }
                        
                        if(conteo == cantMaximaPalabras && encontrado){
                            
                            cantPalabras ++;
                            posicionLinea++;
                            posicionPalabra = 1;
                            String palabra = aux2.palabraAIngresar;
                            if(encontrado && insertado && cantPalabras > TotalMaximopalabas){
                                 
                                aux.LP.borrarElemento(cantPalabras);
                                aux.siguiente.LP.AgregarPalabraPosicionInicio(numContactoOrigen, numMensaje, posicionLinea, posicionPalabra, palabra);
                                cantMaximaPalabras = aux.siguiente.LP.cantNodos;                            
                                posicionPalabra = cantMaximaPalabras;
                            }
                            
                            cantPalabras = TotalMaximopalabas;
                            
                            
                        }
                        
                                      
                    aux2 = aux2.getSiguiente();
                    
                }
            aux = aux.getSiguiente();
            
          }
        }
        return busc;
    }

          
    @Override //3.9
    public NodoLineas borrarPalabra(int numContDestino, int numMensaje, int posicionLinea, int posicionPalabra) {
        NodoLineas busc = BuscElemento(numContDestino, numMensaje,posicionLinea);        
            if(busc != null){
                busc.LP.borrarPalabra(numContDestino, numMensaje, posicionLinea, posicionPalabra);                
            }
        return busc;
    }
    
    //3.10
    @Override
    public NodoLineas borrarOcurrenciasPalabraEnLinea(int numContDestino, int numMensaje, int posicionLinea, String palabraABorrar) {
         NodoLineas busc = BuscElemento(numContDestino, numMensaje,posicionLinea);        
            if(busc != null){
                busc.LP.borrarOcurrenciasPalabraEnLinea(numContDestino, numMensaje, posicionLinea, palabraABorrar);
            }
        return busc;
    }

    @Override
    public String MostrarLinea(int numContDestino, int numMensaje, int posicionLinea) {
        NodoLineas busc = BuscElemento(numContDestino, numMensaje,posicionLinea);
        
        String linea = "";
        if(busc != null){
            NodoPalabra aux = busc.LP.primero;
            linea = posicionLinea+": "; 
            while(aux!=null){
                linea += aux.getPalabraAIngresar()+" ";
                aux = aux.getSiguiente();
            }
            linea += "\n";
        }else{
            linea = "La linea no existe para ese mensaje y ese contacto.";
        }
        
        return linea;
    }

      public int ConteoPalabrasTotales(int numContactoOrigen, int numMensaje) {        
        NodoLineas aux = this.getPrimero();
        
        int conteo = 0;
        while(aux != null){
            NodoPalabra aux2 = aux.LP.getPrimero();
            while(aux2 !=null){
                if(aux.numContDestino==numContactoOrigen && aux.numMensajes==numMensaje){
                    conteo++;                
                }
                aux2 = aux2.getSiguiente();
            }
        aux = aux.getSiguiente();
        }        
        return conteo;
    }

    @Override
    public boolean existePalabraLinea(String palabraBuscar) {
        boolean existe = false;
        NodoLineas aux = this.getPrimero();
        
        while(aux != null && !existe ){
            
            existe = aux.LP.BuscarPalabra(palabraBuscar);
            
            aux = aux.siguiente;
        }
        
        return existe;
    }
    
}
