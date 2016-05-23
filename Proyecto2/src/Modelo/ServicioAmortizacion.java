package Modelo;

import DTOs.DTOServicioAmortizacion;
import java.util.ArrayList;
/**
 *
 * @author xXMAMBOXx
 */

public abstract class ServicioAmortizacion {
    
    protected double montoPrestamoV;
    protected int periodos;
    protected double interesAnual;
    protected double interesTotal;//ssss
    protected double cuotaCK;
    protected double amortizacionRealVK;
    protected double cuotaInteresSK;
    
    protected ArrayList<Double> intereses;
    protected ArrayList<Double> amortizaciones;
    protected ArrayList<Double> cuotas;
    protected ArrayList<Double> deudas;
    
    public ServicioAmortizacion(DTOServicioAmortizacion servicio){
        
        this.montoPrestamoV=servicio.getMontoPrestamo();
        this.periodos=servicio.getPeriodos();
        this.interesAnual=servicio.getInteres();
        
        this.cuotas=new ArrayList<Double>();
        this.amortizaciones=new ArrayList<Double>();
        this.intereses=new ArrayList<Double>();
        this.deudas=new ArrayList<Double>();
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
        this.cuotaCK=0;
        for(double i: this.cuotas){
            System.err.println("is"+i);
            this.cuotaCK+=i;
        }
    }
    
    protected void asignarAmortizacionTotal(){
        this.amortizacionRealVK=0;
         for(double i: this.amortizaciones){
            this.amortizacionRealVK+=i;
        }
    }
    
     protected void asignarInteresesTotal(){
        this.interesTotal=0;
        for(double i: this.intereses){
            this.interesTotal+=i;
        }
    }
    
    public void calcularIntereses(){
        
        for (int i=0;i+1<=this.periodos;i++){   
            this.intereses.add(this.calcularCuotaInteresN(i+1));
        }  
        this.asignarInteresesTotal();
    }
     
    public void calcularDeudas(){
        
        double deuda=this.montoPrestamoV;
        this.deudas.add(deuda);
        
        for(int i=0;i!=this.periodos;i++){
            deuda-=this.amortizaciones.get(i);
            this.deudas.add(deuda);
        }
    }
    
    
    public abstract double calcularCuotaInteresN(int periodo);
    
    public abstract void calcularAmortizaciones();
    
    public abstract void calcularCuotas();
    
    public ArrayList<Double> getDeudas(){
        return this.deudas;
    }
    
     public ArrayList<Double> getCuotas(){
        return this.cuotas;
    }   
    
    public ArrayList<Double> getAmortizaciones(){
        return this.amortizaciones;
    }
    
     public ArrayList<Double> getIntereses(){
        return this.intereses;
    } 
     
}
