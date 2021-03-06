package Modelo;

import DTOs.DTOServicioAmortizacion;

public class ServicioAleman extends ServicioAmortizacion {
    
    public ServicioAleman(DTOServicioAmortizacion servicio){
        super(servicio);       
    }
    
     private double calcularAmortizacionVk(){
        return (this.montoPrestamoV/this.periodos);
    }
    
    private double calcularC1(){
        return (this.calcularAmortizacionVk()+this.interesAnual*this.montoPrestamoV);
    }
    
    @Override
    public void calcularCuotas(){
        this.cuotas.add(this.calcularC1());
        for (int i=0;i<this.periodos-1;i++){
            this.cuotas.add((this.cuotas.get(i)-(this.interesAnual*this.calcularAmortizacionVk())));
        }   
        super.asignarCuotaTotal();
    }
    
     @Override 
     public void calcularAmortizaciones(){
         for (int i=0;i<this.periodos;i++){ 
            this.amortizaciones.add(this.calcularAmortizacionVk());
        }  
        super.asignarAmortizacionTotal();
    }
     
    @Override
    public double calcularCuotaInteresN(int periodo){
         return ((this.periodos-periodo+1)*(this.calcularInteresTotal()/this.periodos));   
    } 
}
