package Modelo;

import DTOs.DTOServicioAmortizacion;

public class ServicioFrances extends ServicioAmortizacion {
    
    public ServicioFrances(DTOServicioAmortizacion servicio){
        super(servicio);    
    }
    
    private double calcularCuota(){
         return (this.calcularInteresTotal() /(1 - 1/(Math.pow((1 + this.interesAnual),this.periodos + 1 - 1))));
    }
      
    private double calcularAmortizacionVk(int periodo){
        return  (this.calcularCuota()/(Math.pow((1 + this.interesAnual),this.periodos + 1 - periodo)));  
    }
    
    @Override
    public void calcularCuotas(){
        for (int i=0;i<this.periodos;i++){      
            this.cuotas.add(this.calcularCuota());
        }   
        super.asignarCuotaTotal();
    }
    
     @Override 
     public void calcularAmortizaciones(){
    
         for (int i=1;i<=this.periodos;i++){
           // System.err.println(this.calcularAmortizacionVk(i));          
            this.amortizaciones.add(this.calcularAmortizacionVk(i));
        }  
        super.asignarAmortizacionTotal();
    }
     
    @Override
    public double calcularCuotaInteresN(int periodo){
           return ((this.calcularCuota())*(1 - 1/Math.pow(1 + this.interesAnual,this.periodos + 1 - periodo))); 
    }
 
}
