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
import Observer.Subject;
import Integracion.ServicioBancario;
import Integracion.ServiceBCCR;
import Modelo.FactoryServicio;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;



//Singleton
public class Controlador implements IControlador{
    
        private static Controlador instance;
    private Controlador(){
        
        
        
    }
    
    public static Controlador getInstance(){
        if(instance == null){
            instance = new Controlador();
        }
        return instance;
    }
    
    
    @Override
    public void actualizarBitacora(DTOServicioAmortizacion dtoAmortizacion,DTOCliente cliente) {
        Subject subject = new Subject();
        IEscritor escritorCSV= new BitacoraCSV(subject);
        IEscritor escritorXML = new BitacoraXML(subject);
        
        subject.registrarMovimiento(dtoAmortizacion, cliente);
           
        
     
        
    }

    @Override
    public ServicioAmortizacion crearServicio(DTOServicioAmortizacion dtoAmortizacion) {
        FactoryServicio factory = new FactoryServicio();
        
        ServicioAmortizacion servicio = null;
            try {
                servicio = factory.createServicioAmortizacion(dtoAmortizacion);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchMethodException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvocationTargetException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        
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
    
    public String getCambio(){
        ServicioBancario bccr = new ServiceBCCR();
        return bccr.getTipoCambio();
        
        
    }
    
}
