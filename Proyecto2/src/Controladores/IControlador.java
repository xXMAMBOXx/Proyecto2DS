package Controladores;

import DTOs.DTOCliente;
import DTOs.DTOServicioAmortizacion;
import Modelo.Cliente;
import Modelo.ServicioAmortizacion;

public interface IControlador { 
    
    public void actualizarBitacora(DTOServicioAmortizacion dtoAmortizacion);
    public ServicioAmortizacion crearServicio(DTOServicioAmortizacion dtoAmortizacion);
    public Cliente crearCliente(DTOCliente dtoCliente);
    public void solicitarPrestamo(DTOServicioAmortizacion dtoAmortizacion,DTOCliente dtoCliente);
    
    
}
