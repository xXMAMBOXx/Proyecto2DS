package Observer;

import DTOs.DTOCliente;
import DTOs.DTOServicioAmortizacion;


public interface IEscritor {
    
    
    //public IEscritor(Subject subject);
    public void crearArchivo();
    public void escribirMovimiento(DTOServicioAmortizacion servicio,DTOCliente cliente);
 
    
}
