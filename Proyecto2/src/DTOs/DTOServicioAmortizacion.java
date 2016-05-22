package DTOs;


public class DTOServicioAmortizacion {
    protected double montoPrestamo;
    protected int periodos;
    protected double interes;
    protected double cuotaCK;
    protected double amortizacionRealVK;
    protected double cuotaInteresSK;
    
    public DTOServicioAmortizacion(double montoPrestamo,int periodos, double interes){
        this.montoPrestamo=montoPrestamo;
        this.periodos=periodos;
        this.interes=interes;
    }
    
    public void setMontoPrestamo(double montoPrestamo){
        this.montoPrestamo=montoPrestamo;
    }
    
    public void setPeriodos(int periodo){
        this.periodos=periodo;
    }
    
    public void setInteres(double interes){
        this.interes=interes;
    }
    
    
    
    
    
     public double getMontoPrestamo(){
        return this.montoPrestamo;
    }
    
    public int getPeriodos(){
        return this.periodos;
    }
    
    public double getInteres(){
        return this.interes;
    }
    
    
}
