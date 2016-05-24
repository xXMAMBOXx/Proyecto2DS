package DTOs;

import java.util.ArrayList;

public class DTOServicioAmortizacion {
    
    private String nombre;
    private double montoPrestamo;
    private int periodos;
    private double interes;
    private double cuotaCK;
    private double amortizacionRealVK;
    private double interesTotalSK;
    
    private ArrayList<Double> intereses;
    private ArrayList<Double> amortizaciones;
    private ArrayList<Double> cuotas;
    private ArrayList<Double> deudas;
     
    public DTOServicioAmortizacion(){
        this.intereses= new ArrayList<Double>();
        this.amortizaciones= new ArrayList<Double>();
        this.cuotas= new ArrayList<Double>();
        this.deudas= new ArrayList<Double>();
    }
       
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setMontoPrestamo(double montoPrestamo){
        this.montoPrestamo=montoPrestamo;
    }
    public double getMontoPrestamo(){
        return this.montoPrestamo;
    }
      
    public void setPeriodos(int periodo){
        this.periodos=periodo;
    }
    public int getPeriodos(){
        return this.periodos;
    }
    
    public void setInteres(double interes){
        this.interes=interes;
    }
    public double getInteres(){
        return this.interes;
    }
    
    public void setInteresTotal(double interes){
        this.interesTotalSK=interes;
    }
    public double getInteresTotal(){
        return this.interesTotalSK;
    }
    
    public void setCuotaCK(double cuota){
        this.cuotaCK=cuota;
    }
    public double getCuotaCK(){
        return this.cuotaCK;
    }
    
    public void setAmortizacionVK(double amortizacion){
        this.amortizacionRealVK=amortizacion;
    }
    public double getAmortizacionVK(){
        return this.amortizacionRealVK;
    }
        
    public ArrayList<Double> getDeudas(){
        return this.deudas;
    }
    public void setDeudas(ArrayList<Double> deudas){
        this.deudas=deudas;
    }
    
    
    public void setCuotas(ArrayList<Double> cuotas){
        this.cuotas=cuotas;
    }
    public ArrayList<Double> getCuotas(){
        return this.cuotas;
    }   
    
    
    public void setAmortizaciones(ArrayList<Double> amortizaciones){
        this.amortizaciones=amortizaciones;
    }
    public ArrayList<Double> getAmortizaciones(){
        return this.amortizaciones;
    }
    
    public void setIntereses(ArrayList<Double> intereses){
        this.intereses=intereses;
    }
    public ArrayList<Double> getIntereses(){
        return this.intereses;
    }
    
}
