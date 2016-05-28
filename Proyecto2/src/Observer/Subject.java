/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;
import java.util.ArrayList;
import java.util.List;
import DTOs.DTOCliente;
import DTOs.DTOServicioAmortizacion;


/**
 *
 * @author way14
 */
public class Subject {
    
    private List<IEscritor> observers = new ArrayList<IEscritor>();
    private DTOCliente cliente;
    private DTOServicioAmortizacion servicio;
    
    
    public DTOCliente getCliente(){
        
        return this.cliente;
    }
    
    
    public void setCliente(DTOCliente cliente){
        this.cliente = cliente;
    }
    
    public DTOServicioAmortizacion getServicio(){
        
        return this.servicio;
    }
    public void setServicio(DTOServicioAmortizacion servicio){
        this.servicio = servicio;
    }
    
    public void attach(IEscritor observer){
        
        observers.add(observer);
    }
    
    public void notifyObservers(){
    
        for(IEscritor observer : observers){
            
            observer.update();
        }
    }
    
    public void registrarMovimiento(DTOServicioAmortizacion servicio,DTOCliente cliente){
        setServicio(servicio);
        setCliente(cliente);
        notifyObservers();
    }
    
}//ubject ends
