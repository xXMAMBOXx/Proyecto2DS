package Modelo;

import DTOs.DTOServicioAmortizacion;

public class ServicioAmericano extends ServicioAmortizacion {
    
    public ServicioAmericano(DTOServicioAmortizacion servicio){
        super(servicio);
        
    }
    
    @Override
    public void calcularCuotas(){
        for (int i=0;i<this.periodos;i++){      
            if(this.periodos==i+1){
                this.cuotas.add(this.montoPrestamoV+this.calcularInteresTotal());
            }
            else{
                  this.cuotas.add(this.calcularInteresTotal());
            }
        }   
        super.asignarCuotaTotal();
    }
    
     @Override 
     public void calcularAmortizaciones(){
    
         for (int i=0;i<=this.periodos;i++){        
            if(this.periodos==i){
                this.amortizaciones.add(this.montoPrestamoV);
            }
            else{
                 this.amortizaciones.add(0.0);
            }              
        }  
        super.asignarAmortizacionTotal();
    }
     
    @Override
    public double calcularCuotaInteresN(int periodo){
           return this.calcularInteresTotal(); 
    }
 
}

