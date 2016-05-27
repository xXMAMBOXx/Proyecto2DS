package Controladores;

import DTOs.DTOCliente;
import DTOs.DTOServicioAmortizacion;
import Integracion.FechaSocket;
import Integracion.IServicioFecha;
import Modelo.Cliente;
import Modelo.ServicioAleman;
import Modelo.ServicioAmortizacion;
import Observer.BitacoraCSV;
import Observer.BitacoraXML;
import Observer.IEscritor;

public class Controlador implements IControlador{
    
      // private FactoryCliente factoryCliente;
      // private FactoryServicio factoryAmortizacion; 
       //private ArrayList factoryIEscritor;
    

    @Override
    public void actualizarBitacora(DTOServicioAmortizacion dtoAmortizacion,DTOCliente cliente) {
        IEscritor escritor= new BitacoraCSV();// aqui va el subject?
        escritor.crearArchivo();
        escritor.escribirMovimiento(dtoAmortizacion, cliente);
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
        this.actualizarBitacora(dtoAmortizacion,dtoCliente);
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

    @Override
    public String getServicioFecha() {
        IServicioFecha service = new FechaSocket();
        return service.getFecha();
   }
    
}
