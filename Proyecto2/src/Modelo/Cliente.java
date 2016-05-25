package Modelo;

import DTOs.DTOCliente;
import java.util.ArrayList;


public class Cliente {
    
    protected String nombre;
    protected String primerApellido;
    protected String segundoApellido;
    protected ArrayList<ServicioAmortizacion> servicios;
    
    public Cliente(DTOCliente cliente){
     
        this.nombre=cliente.getNombre();
        this.primerApellido=cliente.getPrimerApellido();
        this.segundoApellido=cliente.getSegundoApellido();
        this.servicios=new ArrayList();
        
    }
    
    public void agregarServicio(ServicioAmortizacion servicio){
        this.servicios.add(servicio);
    }
    
    
    
   
}
