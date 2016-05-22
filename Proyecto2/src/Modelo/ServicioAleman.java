/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import DTOs.DTOServicioAmortizacion;

/**
 *
 * @author xXMAMBOXx
 */
public class ServicioAleman extends ServicioAmortizacion {
    
    public ServicioAleman(DTOServicioAmortizacion servicio){
        super(servicio);
        
    }
    
     @Override
     public double calcularAmortizacionVk(){
        return this.montoPrestamoV/this.periodos;
    }
    
    @Override 
    public  double cuotaSk(double año){
        return (this.periodos-año+1)*(this.interesTotal/this.periodos);
    }
    
    
    private double calcularC1(){
        return this.calcularAmortizacionVk()+this.interesAnual*this.montoPrestamoV;
        
    }
    
     @Override
    public void calcularCuotas(){
        this.cuotas.add(this.calcularC1());
        System.err.println(this.calcularC1());
        for (int i=0;i<this.periodos-1;i++){
            System.err.println(this.cuotas.get(i)-this.interesAnual*this.calcularAmortizacionVk());          
            this.cuotas.add(this.cuotas.get(i)-(this.interesAnual*this.calcularAmortizacionVk()));
        }   
        super.asignarCuotaTotal();
    }
    
     @Override 
     public void calcularAmortizaciones(){
         for (int i=0;i<this.periodos;i++){
            System.err.println(this.calcularAmortizacionVk());          
            this.amortizaciones.add(this.calcularAmortizacionVk());
        }  
        super.asignarAmortizacionTotal();
    }
     
    @Override
    public double calcularCuotaInteresN(int periodo){
         return (this.periodos-periodo+1)*(this.interesTotal/this.periodos);   
    }
    
    @Override
    public void calcularIntereses(){
        
        for (int i=1;i<this.periodos;i++){
            System.err.println(this.calcularCuotaInteresN(i));          
            this.amortizaciones.add(this.calcularCuotaInteresN(i));
        }  
        super.asignarInteresesTotal();
  
    }
    
    @Override
    public void calcularDeudas(){
        double deuda=this.montoPrestamoV;
        this.deudas.add(deuda);
        for(int i=0;i!=this.periodos;i++){
            System.err.println(deuda); 
            deuda-=this.amortizaciones.get(i);
            this.deudas.add(deuda);
        }
    }
     
     
}
