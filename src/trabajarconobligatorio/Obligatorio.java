package trabajarconobligatorio;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Rafael
 */
public class Obligatorio implements IObligatorio {
ListaDiccionario LD;
ListaContactos LC;
ListaFechas LF;
int cantMaximaPalabras;

    public Obligatorio() {
        
    }

    public ListaDiccionario getLD() {
        return LD;
    }

    public void setLD(ListaDiccionario LD) {
        this.LD = LD;
    }  

    public ListaContactos getLC() {
        return LC;
    }

    public void setLC(ListaContactos LC) {
        this.LC = LC;
    }

    public ListaFechas getLF() {
        return LF;
    }

    public void setLF(ListaFechas LF) {
        this.LF = LF;
    }
    
    

    @Override //2.1
    public Retorno crearSistemaMensajes(int MAX_CANT_PALABRAS_X_LINEA) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        if(MAX_CANT_PALABRAS_X_LINEA >= 1){
            this.LD = new ListaDiccionario();
            this.LC = new ListaContactos(); 
            this.LF = new ListaFechas();
            this.cantMaximaPalabras = MAX_CANT_PALABRAS_X_LINEA;
        }
        return ret;
    }

    @Override  //2.2
    public Retorno destruirSistemaMensajes() {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        this.LC.vaciar();
        return ret;
    }

    @Override //2.3
    public Retorno agregarContacto(int numContacto, String nomContacto) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        NodoContactos contExistente = this.LC.BuscarContactoDestino(numContacto);
        
        if(contExistente == null){
            this.LC.AgregarFinal(numContacto, nomContacto);
        }
        else{
           ret = new Retorno(Retorno.Resultado.ERROR);
        }
        return ret;
    }

    @Override //2.4
    public Retorno eliminarContacto(int numContacto) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        NodoContactos contExistente = this.LC.BuscarContactoDestino(numContacto);
        
        if(contExistente !=null){
            this.LC.borrarElemento(numContacto);
        }else{
           ret = new Retorno(Retorno.Resultado.ERROR);
        }
        
        
        return ret;
    }

    @Override //2.5
    public Retorno agregarMensaje(int numContactoOrigen, int numContactoDestino, Date fecha) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        NodoContactos contOrig = this.LC.BuscarContactoDestino(numContactoOrigen);
        NodoContactos contDestino = this.LC.BuscarContactoDestino(numContactoDestino);
        
        if(contOrig != null && contDestino !=null){
           contDestino =  this.LC.AgregarMensaje(numContactoOrigen, numContactoDestino, fecha);
        }else if(contDestino == null){
            ret = new Retorno(Retorno.Resultado.ERROR);
        }        
        
        return ret;
    }

    @Override //2.6
    public Retorno eliminarMensaje(int numContactoOrigen, int numMensaje) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        NodoContactos contDestino = this.LC.BuscarContactoDestino(numContactoOrigen);        
        
        if(contDestino != null ){
            NodoMensajes mensaje = contDestino.LM.BuscarMensaje(numContactoOrigen, numMensaje);
            if(mensaje!= null){
                contDestino = this.LC.BorrarMensaje(numContactoOrigen, numMensaje);
            }else {
                ret = new Retorno(Retorno.Resultado.ERROR);
            }
        }else {
            ret = new Retorno(Retorno.Resultado.ERROR);
        } 
        
        return ret;
    }

    @Override //3.1
    public Retorno imprimirTexto(int numContactoOrigen, int numMensaje) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        NodoContactos contDestino = this.LC.BuscarContactoDestino(numContactoOrigen);
        
        if(contDestino != null){
            NodoMensajes mensaje = contDestino.LM.BuscarMensaje(numContactoOrigen, numMensaje);
            if(mensaje!= null){
                ret.valorString = contDestino.LM.MostrarMensaje(numContactoOrigen, numMensaje).toString();
            }else{
                ret = new Retorno(Retorno.Resultado.ERROR);
            }
        }else{
            ret = new Retorno(Retorno.Resultado.ERROR);
        }
        return ret;
    }

    @Override //3.2
    public Retorno insertarLinea(int numContactoOrigen, int numMensaje) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        NodoContactos contDestino = this.LC.BuscarContactoDestino(numContactoOrigen);
        
        if(contDestino != null){
            NodoMensajes mensaje = contDestino.LM.BuscarMensaje(numContactoOrigen, numMensaje);
            if(mensaje!= null){
                contDestino = this.LC.insertarLinea(numContactoOrigen, numMensaje);
            }else{
                ret = new Retorno(Retorno.Resultado.ERROR);
            }    
        }else{
            ret = new Retorno(Retorno.Resultado.ERROR);
        }
        return ret;
    }

    @Override //3.3
    public Retorno insertarLineaEnPosicion(int numContactoOrigen, int numMensaje, int posicionLinea) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        NodoContactos contDestino = this.LC.BuscarContactoDestino(numContactoOrigen);
        
        if(contDestino != null){
           NodoMensajes mensaje = contDestino.LM.BuscarMensaje(numContactoOrigen, numMensaje);
            if(mensaje!= null){ 
                int totalLineas = mensaje.LL.cantNodos;            
                totalLineas++;           
            
                if(posicionLinea >=1  && posicionLinea<=totalLineas){
                    contDestino = this.LC.insertarLineaEnPosicion(numContactoOrigen, numMensaje, posicionLinea);
                }else{
                    ret = new Retorno(Retorno.Resultado.ERROR);
                }
            }else{
                ret = new Retorno(Retorno.Resultado.ERROR);
            }     
        } else{
            ret = new Retorno(Retorno.Resultado.ERROR);
        }
        return ret;
    }

    @Override //3.4
    public Retorno borrarLinea(int numContactoOrigen, int numMensaje, int posicionLinea) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        NodoContactos contDestino = this.LC.BuscarContactoDestino(numContactoOrigen);
        
        if(contDestino != null){
            NodoMensajes mensaje = contDestino.LM.BuscarMensaje(numContactoOrigen, numMensaje);
            if(mensaje!= null){ 
                int totalLineas = mensaje.LL.cantNodos;
            
                if(posicionLinea >=1  && posicionLinea<=totalLineas){
                    contDestino = this.LC.borrarLineaPosicion(numContactoOrigen, numMensaje, posicionLinea);
                }else{
                        ret = new Retorno(Retorno.Resultado.ERROR);
                    }
            }else{
                ret = new Retorno(Retorno.Resultado.ERROR);
            }     
        } else{
            ret = new Retorno(Retorno.Resultado.ERROR);
        }        
        
        return ret;
    }

    @Override //3.5
    public Retorno borrarTodo(int numContactoOrigen, int numMensaje) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        
        NodoContactos contDestino = this.LC.BuscarContactoDestino(numContactoOrigen);
        
        if(contDestino != null){
            NodoMensajes mensaje = contDestino.LM.BuscarMensaje(numContactoOrigen, numMensaje);
            if(mensaje!= null){ 
                contDestino = this.LC.borrarTodo(numContactoOrigen, numMensaje);
            }else{
                ret = new Retorno(Retorno.Resultado.ERROR);
            }     
        } else{
            ret = new Retorno(Retorno.Resultado.ERROR);
        }      
        
        return ret;
    }

    @Override //3.6
    public Retorno borrarOcurrenciasPalabraEnTexto(int numContactoOrigen, int numMensaje, String palabraABorrar) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        
        NodoContactos contDestino = this.LC.BuscarContactoDestino(numContactoOrigen);
        
        if(contDestino != null){
            NodoMensajes mensaje = contDestino.LM.BuscarMensaje(numContactoOrigen, numMensaje);
            if(mensaje!= null){ 
                boolean existePalabra = mensaje.LL.existePalabraLinea(palabraABorrar);
                if(existePalabra){
                    contDestino = this.LC.borrarOcurrenciasPalabraEnTexto(numContactoOrigen, numMensaje, palabraABorrar);
                }else{
                    ret = new Retorno(Retorno.Resultado.ERROR);
                }    
            }else{
                ret = new Retorno(Retorno.Resultado.ERROR);
            }     
        } else{
            ret = new Retorno(Retorno.Resultado.ERROR);
        }  
        
        return ret;
    }

    @Override //3.7
    public Retorno insertarPalabraEnLinea(int numContactoOrigen, int numMensaje, int posicionLinea, int posicionPalabra, String palabraAIngresar) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);        
        NodoContactos contDestino = this.LC.BuscarContactoDestino(numContactoOrigen);
        
        if(contDestino != null){
            NodoMensajes mensaje = contDestino.LM.BuscarMensaje(numContactoOrigen, numMensaje);
            if(mensaje!= null){
                NodoLineas lineaBuscada = mensaje.LL.BuscElemento(numContactoOrigen, numMensaje,posicionLinea);
                if(lineaBuscada != null){
                    
                    if(posicionPalabra>=1 && posicionPalabra<=cantMaximaPalabras){
                        contDestino = this.LC.insertarPalabraEnLinea(numContactoOrigen, numMensaje, posicionLinea, posicionPalabra, palabraAIngresar,cantMaximaPalabras);
                    }else{
                        ret = new Retorno(Retorno.Resultado.ERROR);
                    }
                }else{
                    ret = new Retorno(Retorno.Resultado.ERROR);
                } 
            }else{
                ret = new Retorno(Retorno.Resultado.ERROR);
            }     
        } else{
            ret = new Retorno(Retorno.Resultado.ERROR);
        }  
        
        return ret;
    }

    @Override //3.8
    public Retorno insertarPalabraYDesplazar(int numContactoOrigen, int numMensaje, int posicionLinea, int posicionPalabra, String palabraAIngresar) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
         NodoContactos contDestino = this.LC.BuscarContactoDestino(numContactoOrigen);
        
        if(contDestino != null){
            NodoMensajes mensaje = contDestino.LM.BuscarMensaje(numContactoOrigen, numMensaje);
            if(mensaje!= null){
                NodoLineas lineaBuscada = mensaje.LL.BuscElemento(numContactoOrigen, numMensaje,posicionLinea);
                if(lineaBuscada != null){
                    if(lineaBuscada.LP.getCantNodos()>0){
                        int cantPalabras = lineaBuscada.LP.getCantNodos();
                    
                        if(posicionPalabra>=1 && posicionPalabra<=cantMaximaPalabras && posicionPalabra<=cantPalabras){
                            contDestino = this.LC.insertarPalabraYDesplazar(numContactoOrigen, numMensaje, posicionLinea, posicionPalabra, palabraAIngresar,cantMaximaPalabras);
                        }else{
                            ret = new Retorno(Retorno.Resultado.ERROR);
                        }
                    }else{
                        ret = new Retorno(Retorno.Resultado.ERROR);
                    } 
                }else{
                    ret = new Retorno(Retorno.Resultado.ERROR);
                } 
            }else{
                ret = new Retorno(Retorno.Resultado.ERROR);
            }     
        } else{
            ret = new Retorno(Retorno.Resultado.ERROR);
        }  
        
        return ret;
    }

    @Override //3.9
    public Retorno borrarPalabra(int numContactoOrigen, int numMensaje, int posicionLinea, int posicionPalabra) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        NodoContactos contDestino = this.LC.BuscarContactoDestino(numContactoOrigen);
        
        if(contDestino != null){
            NodoMensajes mensaje = contDestino.LM.BuscarMensaje(numContactoOrigen, numMensaje);
            if(mensaje!= null){
                NodoLineas lineaBuscada = mensaje.LL.BuscElemento(numContactoOrigen, numMensaje,posicionLinea);
                if(lineaBuscada != null){
                    if(lineaBuscada.LP.getCantNodos()>0){
                        int cantPalabras = lineaBuscada.LP.getCantNodos();
                    
                        if(posicionPalabra>=1 && posicionPalabra<=cantMaximaPalabras && posicionPalabra<=cantPalabras){
                            contDestino = this.LC.borrarPalabra(numContactoOrigen, numMensaje, posicionLinea, posicionPalabra);
                        }else{
                            ret = new Retorno(Retorno.Resultado.ERROR);
                        }
                    }else{
                        ret = new Retorno(Retorno.Resultado.ERROR);
                    } 
                }else{
                    ret = new Retorno(Retorno.Resultado.ERROR);
                } 
            }else{
                ret = new Retorno(Retorno.Resultado.ERROR);
            }     
        } else{
            ret = new Retorno(Retorno.Resultado.ERROR);        
        }       
        
        return ret;
    }

    @Override //3.10
    public Retorno borrarOcurrenciasPalabraEnLinea(int numContactoOrigen, int numMensaje, int posicionLinea, String palabraABorrar) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        NodoContactos contDestino = this.LC.BuscarContactoDestino(numContactoOrigen);
        
        if(contDestino != null){
            NodoMensajes mensaje = contDestino.LM.BuscarMensaje(numContactoOrigen, numMensaje);
            if(mensaje!= null){
                NodoLineas lineaBuscada = mensaje.LL.BuscElemento(numContactoOrigen, numMensaje,posicionLinea);
                if(lineaBuscada != null){
                    if(lineaBuscada.LP.getCantNodos()>0){
                        boolean existe = lineaBuscada.LP.BuscarPalabra(palabraABorrar);
                        if(existe){
                            contDestino = this.LC.borrarOcurrenciasPalabraEnLinea(numContactoOrigen, numMensaje, posicionLinea, palabraABorrar);
                        }else{
                            ret = new Retorno(Retorno.Resultado.ERROR);
                        } 
                    }else{
                        ret = new Retorno(Retorno.Resultado.ERROR);
                    } 
                }else{
                    ret = new Retorno(Retorno.Resultado.ERROR);
                } 
            }else{
                ret = new Retorno(Retorno.Resultado.ERROR);
            } 
        }else{
            ret = new Retorno(Retorno.Resultado.ERROR);        
        }       
        return ret;
    }

    @Override //3.11
    public Retorno imprimirLinea(int numContactoOrigen, int numMensaje, int posicionLinea) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
         NodoContactos contDestino = this.LC.BuscarContactoDestino(numContactoOrigen);        
         
        if(contDestino != null){
             NodoMensajes mensaje = contDestino.LM.BuscarMensaje(numContactoOrigen, numMensaje);
            if(mensaje!= null){
                NodoLineas lineaBuscada = mensaje.LL.BuscElemento(numContactoOrigen, numMensaje,posicionLinea);
                if(lineaBuscada != null){
                    ret.valorString = contDestino.LM.MostrarLinea(numContactoOrigen, numMensaje, posicionLinea).toString();
                }else{
                    ret = new Retorno(Retorno.Resultado.ERROR);
                }  
            }else{
                ret = new Retorno(Retorno.Resultado.ERROR);
            }     
        } else{
            ret = new Retorno(Retorno.Resultado.ERROR);
        } 
        return ret;
    }

    @Override //3.12
    public Retorno ingresarPalabraDiccionario(String palabraAIngresar) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);  
        NodoDiccionario aux = this.LD.BuscarPalabra(palabraAIngresar);
        
        if(aux == null){
            this.getLD().agregarOrd(palabraAIngresar); 
        }else{
            ret = new Retorno(Retorno.Resultado.ERROR);
        }
        return ret;
    }

     @Override //3.13
    public Retorno borrarPalabraDiccionario(String palabraABorrar) {
        
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        NodoDiccionario aux = this.LD.BuscarPalabra(palabraABorrar);
        
        if(aux != null){
            this.LD.borrarElemento(palabraABorrar);
        }else{
            ret = new Retorno(Retorno.Resultado.ERROR);
        }
        return ret;
    }

    @Override //3.14
    public Retorno imprimirDiccionario() { 
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        this.getLD().MostrarLista();
        return ret;
    }

    @Override //3.15
    public Retorno ImprimirTextoIncorrecto() {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
         NodoDiccionario todasPalabras = this.LD.primero;
            ret.valorString = this.LC.ImprimirTextoIncorrecto(todasPalabras);
        return ret;
    }

    @Override //4.1
    public Retorno cantidadDeMensajes(int numContactoOrigen) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        NodoContactos contDestino = this.LC.BuscarContactoDestino(numContactoOrigen);
        if(contDestino !=null){
            LF.vaciar();
            if(contDestino.LM.getCantNodos()> 0){
                NodoMensajes aux = contDestino.LM.primero;
                Date fecha = contDestino.LM.primero.getFecha();
                int cantFecha = 0;
                while(aux != null)
                {
                    if(fecha == aux.getFecha()){
                     cantFecha++;
                    }
                    if(aux.siguiente!=null)
                    {
                        if(aux.siguiente.getFecha() != aux.getFecha()){
                            LF.AgregarFinal(fecha, cantFecha);
                            fecha = aux.siguiente.getFecha();
                            cantFecha = 0;
                        }
                    }
                    aux = aux.siguiente;
                }
                LF.AgregarFinal(fecha, cantFecha);
                int cantColumnas = LF.getCantNodos();
                
                
                String matriz[][]=new String[2][cantColumnas];                
                
                int filas= matriz.length;
                int columnas=matriz[0].length;
                for(int i = 0;i<filas;i++){
                    NodoFechas auxFechas = LF.primero;
                    for(int j=0;j<columnas;j++){
                        if(i==0){                            
                            SimpleDateFormat formato = new SimpleDateFormat("dd MMM");  
                            String FechaMatriz= formato.format(auxFechas.getFecha());                            
                            matriz[i][j] = FechaMatriz;
                        }else{
                            matriz[i][j] ="  "+ String.valueOf(auxFechas.getCantMensajes())+"  ";
                        }
                        auxFechas = auxFechas.siguiente;
                    }
                }
               
              ret.valorString = FuncionAuxiliar.mostrarmatriz(matriz);
           }else{
                ret.valorString = "No hay mensajes para mostrar la matriz";
            }
        }else{
            ret = new Retorno(Retorno.Resultado.ERROR);
        } 
        return ret;
    }
   
    @Override
    public Retorno mostrarContactos() {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        this.LC.MostrarLista();
        return ret;
    }

    @Override
    public Retorno imprimircontactoMaxCantMensajes() {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        String NombreMasMensajes = "";
        int conteoMensajes = 0;
        int NumeroContacto = 0;
        
        NodoContactos aux = this.LC.getPrimero();
        
        while( aux != null){
            
            if(aux.LM.getCantNodos() > conteoMensajes){
                NombreMasMensajes = aux.nomContacto;
                NumeroContacto = aux.numContacto;
                conteoMensajes = aux.LM.getCantNodos();
            }
            
            aux = aux.siguiente;   
        }
        
        ret.valorString = "\nNombre de Contacto: " + NombreMasMensajes + " y Numero de Contacto: " + NumeroContacto;
        
        
        return ret;
    }

    @Override
    public Retorno imprimirContactos() {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
            this.LC.MostrarLista();
        return ret;
    }
}
