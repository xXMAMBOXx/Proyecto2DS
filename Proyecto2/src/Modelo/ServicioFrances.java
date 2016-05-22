

package Modelo;

import DTOs.DTOServicioAmortizacion;

/**
 *
 * @author xXMAMBOXx
 */
public class ServicioFrances extends ServicioAmortizacion {
    
    public ServicioFrances(DTOServicioAmortizacion servicio){
        super(servicio);
        
    }
    
     @Override
     public double calcularCuotaInteres(){
         return 3;
         
     }
     
     public double calcularAmortizacion(){
         return 3;
         
     }
    
}
