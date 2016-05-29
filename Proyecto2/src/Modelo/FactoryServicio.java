/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import DTOs.DTOServicioAmortizacion;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author way14
 */
public class FactoryServicio {
    
    public FactoryServicio(){}
    
    public ServicioAmortizacion createServicioAmortizacion(DTOServicioAmortizacion servicio) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        
         return (ServicioAmortizacion) Class.forName("Modelo."+servicio.getTipo()).getConstructor(DTOServicioAmortizacion.class).newInstance(servicio);
    }
    
}
