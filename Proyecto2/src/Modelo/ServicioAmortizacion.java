package Modelo;

import DTOs.DTOServicioAmortizacion;
import java.util.ArrayList;
/**
 *
 * @author xXMAMBOXx
 */

public abstract class ServicioAmortizacion {
    double montoPrestamoV;
    int periodos;
    double interesAnual;
    double interesTotal;//ssss
    double cuotaCK;
    double amortizacionRealVK;
    double cuotaInteresSK;
    ArrayList<Double> intereses;
    ArrayList<Double> amortizaciones;
    ArrayList<Double> cuotas;
    ArrayList<Double> deudas;
    
    public ServicioAmortizacion(DTOServicioAmortizacion servicio){
        
        this.montoPrestamoV=servicio.getMontoPrestamo();
        this.periodos=servicio.getPeriodos();
        this.interesAnual=servicio.getInteres();
        
        this.cuotas=new ArrayList<Double>();
        this.amortizaciones=new ArrayList<Double>();
        this.intereses=new ArrayList<Double>();
        this.deudas=new ArrayList<Double>();
    }
    
    
    public boolean verificarV(){
        double v=0;
        for(int k=1;k!=this.periodos;k++){
            //v+=(this.calcularAmortizacionVk()*(1/(1+this.interesAnual)));
            System.out.println(v);
        }
        return true;
    }
         
    public double getCuotaCK(){
        return this.cuotaCK;
    }
    
           
    public double getAmortizacionCK(){
        return this.amortizacionRealVK;
    }
    
     public double getInteresSK(){
        return this.interesTotal;
    }
    
    protected double calcularInteresTotal(){
        return this.montoPrestamoV*this.interesAnual;
    }
    
    protected void asignarCuotaTotal(){
        for(double i: this.cuotas){
            this.cuotaCK+=i;
        }
    }
    
    protected void asignarAmortizacionTotal(){
         for(double i: this.amortizaciones){
            this.amortizacionRealVK+=i;
        }
    }
    
     protected void asignarInteresesTotal(){
        for(double i: this.intereses){
            this.interesTotal+=i;
        }
    }
                
    
    public abstract double calcularCuotaInteresN(int periodo);
    
    public abstract void calcularAmortizaciones();
    
    public abstract void calcularCuotas();
    
      
    
    public void calcularIntereses(){
        
        for (int i=1;i<=this.periodos;i++){
            //System.err.println(this.calcularCuotaInteresN(i));          
            this.intereses.add(this.calcularCuotaInteresN(i));
        }  
        this.asignarInteresesTotal();
  
    }
    
 
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
