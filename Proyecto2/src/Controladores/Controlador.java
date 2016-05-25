package Controladores;

import DTOs.DTOCliente;
import DTOs.DTOServicioAmortizacion;
import Modelo.Cliente;
import Modelo.ServicioAleman;
import Modelo.ServicioAmortizacion;

public class Controlador implements IControlador{
    
      // private FactoryCliente factoryCliente;
      // private FactoryServicio factoryAmortizacion; 
       //private ArrayList factoryIEscritor;
    

    @Override
    public void actualizarBitacora(DTOServicioAmortizacion dtoAmortizacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ServicioAmortizacion crearServicio(DTOServicioAmortizacion dtoAmortizacion) {
        ServicioAmortizacion servicio=new ServicioAleman(dtoAmortizacion);////FACTORY
        return servicio;
    }

    @Override
    public Cliente crearCliente(DTOCliente dtoCliente) {
        Cliente cliente=new Cliente(dtoCliente);////FACTORY
        return cliente;
    }

    @Override
    public void solicitarPrestamo(DTOServicioAmortizacion dtoAmortizacion, DTOCliente dtoCliente) {
        //Creando Servicio
        ServicioAmortizacion servicio= this.crearServicio(dtoAmortizacion);
        servicio.calcularAmortizaciones();
        servicio.calcularCuotas();
        servicio.calcularDeudas();
        servicio.calcularIntereses();
        //cálculo lógica de negocios
        dtoAmortizacion.setDeudas(servicio.getDeudas());
        dtoAmortizacion.setCuotas(servicio.getCuotas());
        dtoAmortizacion.setAmortizaciones(servicio.getAmortizaciones());
        dtoAmortizacion.setIntereses(servicio.getIntereses());
        dtoAmortizacion.setInteresTotal(servicio.getInteresSK());
        dtoAmortizacion.setAmortizacionVK(servicio.getAmortizacionCK());
        dtoAmortizacion.setCuotaCK(servicio.getCuotaCK());
        
        //Creando Cliente
        Cliente cliente=this.crearCliente(dtoCliente);
        //añadiendo el servicio amortizacion al cliente
        cliente.agregarServicio(servicio);
        
        
    }
    
}
