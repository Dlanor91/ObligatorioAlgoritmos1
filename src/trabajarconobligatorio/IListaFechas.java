
package trabajarconobligatorio;
import java.util.Date;

public interface IListaFechas {
    
    boolean esVacia(); 
    void AgregarFinal(Date fecha, int cantMensajes); 
    void vaciar();

}
