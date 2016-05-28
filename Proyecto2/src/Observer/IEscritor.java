/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import DTOs.DTOCliente;
import DTOs.DTOServicioAmortizacion;

/**
 *
 * @author way14
 */
public abstract class IEscritor {
    
    private String nombreArchivo;
    protected Subject subject;
    
    public IEscritor(String nombre){
        this.nombreArchivo = nombre;
    }
    public String getNombreArchivo(){
        return this.nombreArchivo;
    }
    
    public void update(){
        
        escribirMovimiento(subject.getServicio(),subject.getCliente());
        
    }
    public abstract void crearArchivo();
    
    
     public abstract void escribirMovimiento(DTOServicioAmortizacion servicio,DTOCliente cliente);
    
}
