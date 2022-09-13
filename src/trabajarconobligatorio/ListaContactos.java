
package trabajarconobligatorio;

import java.time.temporal.Temporal;
import java.util.Date;

public class ListaContactos implements IListaContactos{
    NodoContactos primero;
    NodoContactos ultimo;  
    ListaMensajes LM;
    int cantNodos;

    /*Constructor*/
    public ListaContactos() {
        this.primero = null;
        this.ultimo = null;        
        this.cantNodos = 0;
        LM = new ListaMensajes();
    }
   
    /*Get y set*/

    public NodoContactos getPrimero() {
        return primero;
    }

    public void setPrimero(NodoContactos primero) {
        this.primero = primero;
    }

    public NodoContactos getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoContactos ultimo) {
        this.ultimo = ultimo;
    }

    public int getCantNodos() {
        return cantNodos;
    }

    public void setCantNodos(int cantNodos) {
        this.cantNodos = cantNodos;
    }

    public ListaMensajes getLM() {
        return LM;
    }

    public void setLM(ListaMensajes LM) {
        this.LM = LM;
    }
    
    
  
    //Metodos
    @Override
    public boolean esVacia() {
        return this.getPrimero() == null; //es lo mismo q un if en una linea
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
        NodoContactos aux = this.getPrimero();
        while(aux !=null)
        {
           System.out.print(aux.numContacto + " - "  + aux.nomContacto + " - " );
           aux = aux.getSiguiente();
        }
    }

    @Override
    public int CantidadDeElementos() {        
        return this.getCantNodos();        
    }

    @Override
    public void AgregarInicioLista(int num, String dato) {        
        NodoContactos nuevo = new NodoContactos(num,dato);       
        if(this.esVacia()){
            this.setPrimero(nuevo);
            this.setUltimo(nuevo); //aqui siempre queda apuntando al ultimo valor
            this.cantNodos ++; 
        }else{
            int conteo = 0;
            boolean existe = false;
            NodoContactos aux = this.getPrimero();
            
            while(conteo<cantNodos && !existe){
                if(aux.numContacto == num){
                    existe = true;
                }
                conteo++;
                aux = aux.getSiguiente();
            }
            
            if(!existe){
                nuevo.setSiguiente(primero);
                this.primero = nuevo; 
                this.cantNodos ++; 
            }           
        }        
              
    }

    @Override
    public void AgregarFinal(int num, String dato) {
        NodoContactos nuevo = new NodoContactos(num,dato);
        if(this.esVacia()){
            this.setPrimero(nuevo);
            this.setUltimo(nuevo);
        }else{
            NodoContactos aux = this.getPrimero();
            while(aux.siguiente != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            this.setUltimo(nuevo);
        }
        this.cantNodos++;
    }
    

    @Override
    public void EliminarFin() {
        if(!this.esVacia()){
          if(this.primero == this.ultimo)  {
              this.primero =null;
              this.ultimo = null;
          }else{
              NodoContactos aux = this.primero;
              while(aux!=this.ultimo){
                  aux = aux.getSiguiente();
              }//aqui estoy en la penultima posicion porq no entra a la ultima
              aux.siguiente = null; 
              this.setUltimo(aux);
          }
          this.cantNodos --;
        }
    }

    @Override
    public void vaciar() {
        this.setPrimero(null);   
        this.setUltimo(null);
        this.cantNodos = 0;
    }
    
    @Override
    public NodoContactos BuscarContactoDestino(int num) {
       
        NodoContactos aux = this.getPrimero();
        NodoContactos elemento = null;
        while(aux != null){
            if(aux.numContacto==num){
                elemento = aux;
                return elemento;
            } 
        aux = aux.getSiguiente();                
        }    
       return elemento;      
    }   
    
    
    //Pre: el elemento a buscar existe en la lista
    @Override
    public void borrarElemento(int num) {
        NodoContactos aux = this.getPrimero(); 
        if(!this.esVacia()){
           if( aux.numContacto==  num){
               this.EliminarInicio();
           }            
           else{
               NodoContactos anterior = primero;
               
               while(aux != null && aux.numContacto!= num){
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

    //Mensajes
    @Override //2.5
    public NodoContactos AgregarMensaje(int numContOrigen, int numContDestino, Date fecha) {
        NodoContactos contDestino = BuscarContactoDestino(numContDestino);
            contDestino.LM.AgregarFinal(numContOrigen, numContDestino, fecha);
        return contDestino;
    }

    @Override //2.6
    public NodoContactos BorrarMensaje(int numContDestino, int numMensaje) {
        NodoContactos contDestino = BuscarContactoDestino(numContDestino);
        NodoMensajes mensaje = contDestino.LM.BuscarMensaje(numContDestino, numMensaje);
        
        if(mensaje != null){
            contDestino.LM.BorrarMensaje(numContDestino, numMensaje);
        }
        
        return contDestino;
    }

    //Lineas
    @Override //3.2
    public NodoContactos insertarLinea(int numContDestino, int numMensaje) {
        NodoContactos contDestino = BuscarContactoDestino(numContDestino);
        NodoMensajes mensaje = contDestino.LM.BuscarMensaje(numContDestino, numMensaje);        
        
        if(mensaje != null){
            NodoLineas aux = mensaje.LL.getPrimero();
            contDestino.LM.AgregarLinea(aux, numContDestino, numMensaje);
        }
        return contDestino;
    }

    @Override //3.3
    public NodoContactos insertarLineaEnPosicion(int numContDestino, int numMensaje, int posicionLinea) {
        NodoContactos contDestino = BuscarContactoDestino(numContDestino);   
        NodoMensajes mensaje = contDestino.LM.BuscarMensaje(numContDestino, numMensaje);
        
        if(mensaje != null){
            int totalLineas = mensaje.LL.cantNodos;            
                totalLineas++;           
            
            if(posicionLinea >=1  && posicionLinea<=totalLineas){
                contDestino.LM.AgregarLineaPosicion(numContDestino, numMensaje, posicionLinea);
            }
        }
        return contDestino;
    }

    @Override //3.4
    public NodoContactos borrarLineaPosicion(int numContDestino, int numMensaje, int posicionLinea) {
        NodoContactos contDestino = BuscarContactoDestino(numContDestino); 
        NodoMensajes mensaje = contDestino.LM.BuscarMensaje(numContDestino, numMensaje);
        
        if(mensaje != null){
            int totalLineas = mensaje.LL.cantNodos;
            if(posicionLinea >=1  && posicionLinea<=totalLineas){
                contDestino.LM.BorrarLinea(numContDestino, numMensaje, posicionLinea);
            }
        }
        return contDestino;
    }

    @Override //3.5
    public NodoContactos borrarTodo(int numContDestino, int numMensaje) {
        NodoContactos contDestino = BuscarContactoDestino(numContDestino); 
        NodoMensajes mensaje = contDestino.LM.BuscarMensaje(numContDestino, numMensaje);
        
        if(mensaje != null){   
            NodoLineas aux = mensaje.LL.getPrimero();
            if(aux != null){
                contDestino.LM.borrarTodo(aux,numContDestino, numMensaje);
            }
        }
        return contDestino;
    }
    
    @Override //3.6
    public NodoContactos borrarOcurrenciasPalabraEnTexto(int numContDestino, int numMensaje, String palabraABorrar) {
        NodoContactos contDestino = BuscarContactoDestino(numContDestino); 
        NodoMensajes mensaje = contDestino.LM.BuscarMensaje(numContDestino, numMensaje);
        
        if(mensaje != null){   
            NodoLineas aux = mensaje.LL.getPrimero();
            if(aux != null){
                contDestino.LM.borrarOcurrenciasPalabraEnTexto(aux, numContDestino, numMensaje, palabraABorrar);
            }
        }
        return contDestino;
    }
    
    @Override //3.7
    public NodoContactos insertarPalabraEnLinea(int numContDestino, int numMensaje, int posicionLinea, int posicionPalabra, String palabraAIngresar, int cantMaximaPalabras) {
        NodoContactos contDestino = BuscarContactoDestino(numContDestino);   
        NodoMensajes mensaje = contDestino.LM.BuscarMensaje(numContDestino, numMensaje);
        if(mensaje != null){
            int totalLineas = mensaje.LL.cantNodos;
            if(posicionLinea >=1  && posicionLinea<=totalLineas && posicionPalabra>=1 && posicionPalabra<=cantMaximaPalabras){
                contDestino.LM.AgregarPalabraLineaPosicion(numContDestino, numMensaje, posicionLinea, posicionPalabra, palabraAIngresar);
            }
        }
        return contDestino;
    }

    @Override //3.8
    public NodoContactos insertarPalabraYDesplazar(int numContDestino, int numMensaje, int posicionLinea, int posicionPalabra, String palabraAIngresar,int cantMaximaPalabras) {
        NodoContactos contDestino = BuscarContactoDestino(numContDestino); 
        NodoMensajes mensaje = contDestino.LM.BuscarMensaje(numContDestino, numMensaje);
        
        if(mensaje != null){
            ListaLineas lineaInsertar = mensaje.getLL();
            NodoLineas aux = mensaje.LL.getPrimero();
            
            int totalLineas = mensaje.LL.cantNodos;       
            int totalPalabras = lineaInsertar.ConteoPalabrasTotales(numContDestino, numMensaje);                       
                        
            if(totalLineas*cantMaximaPalabras == totalPalabras){
                contDestino.LM.AgregarLinea(aux,numContDestino,numMensaje);
            }
                
            if(posicionLinea >=1  && posicionLinea<=totalLineas && posicionPalabra>=1 && posicionPalabra<=cantMaximaPalabras){
                contDestino.LM.InsertarPalabraYDesplazar(numContDestino, numMensaje, posicionLinea, posicionPalabra, palabraAIngresar, cantMaximaPalabras);
          }
            
        }
        return contDestino;
    }    

    @Override //3.9
    public NodoContactos borrarPalabra(int numContDestino, int numMensaje, int posicionLinea, int posicionPalabra) {
        NodoContactos contDestino = BuscarContactoDestino(numContDestino); 
        NodoMensajes mensaje = contDestino.LM.BuscarMensaje(numContDestino, numMensaje);   
        if(mensaje != null){
            contDestino.LM.borrarPalabra(numContDestino, numMensaje, posicionLinea, posicionPalabra);
        }
        return contDestino;
    }

    @Override //3.10
    public NodoContactos borrarOcurrenciasPalabraEnLinea(int numContDestino, int numMensaje, int posicionLinea, String palabraABorrar) {
        NodoContactos contDestino = BuscarContactoDestino(numContDestino); 
        NodoMensajes mensaje = contDestino.LM.BuscarMensaje(numContDestino, numMensaje);   
        if(mensaje != null){
            contDestino.LM.borrarOcurrenciasPalabraEnLinea(numContDestino, numMensaje, posicionLinea, palabraABorrar);
        }
        return contDestino;
    }

    @Override //3.15
    public String ImprimirTextoIncorrecto(NodoDiccionario TodasPalabras) {        
         int conteoContactos = 0;       
        String mostrar = "";
        NodoContactos contDestino = BuscarContactoDestino(0);
        contDestino = contDestino.siguiente;
        while(contDestino != null){
            conteoContactos = contDestino.getNumContacto();
            mostrar += "\n" + contDestino.getNomContacto();
            
            if(contDestino.LM.cantNodos>0){
                int conteoMensajes = contDestino.LM.primero.conteoMensajes;
                NodoMensajes mensaje = contDestino.LM.BuscarMensaje(conteoContactos, conteoMensajes);
                
                while(mensaje != null){
                    conteoMensajes = mensaje.conteoMensajes;
                    mostrar += "\n" + mensaje.conteoMensajes;
                    contDestino.LM.BuscarMensaje(conteoContactos, conteoMensajes);
                    int conteoLinea = 1;    
                    NodoLineas linea = mensaje.LL.BuscElemento(conteoContactos, conteoMensajes, conteoLinea);
                   
                    while(linea != null){
                        
                        NodoDiccionario palabra = TodasPalabras;                        
                        String palabraDiccionario = palabra.getDato();
                        if(palabraDiccionario != null){                            
                           mostrar += linea.LP.MostrarTextoIncorrecto(conteoContactos, conteoMensajes, conteoLinea, palabra);
                        }
                        conteoLinea++;
                        linea = mensaje.LL.BuscElemento(conteoContactos, conteoMensajes, conteoLinea);
                    }
                
                //conteoMensajes++;
                //mensaje = contDestino.LM.BuscarMensaje(conteoContactos, conteoMensajes);
                mensaje = mensaje.siguiente;
              }
            } 
            
            contDestino = contDestino.siguiente;         
           
        }
        
        return mostrar;
    }

    

    

}
