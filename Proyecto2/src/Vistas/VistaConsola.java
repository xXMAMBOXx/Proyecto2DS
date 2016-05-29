package Vistas;

import Controladores.Controlador;
import Controladores.IControlador;
import DTOs.DTOCliente;
import DTOs.DTOServicioAmortizacion;
import java.util.ArrayList;
import Validaciones.ValidacionDatosEntrada;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class VistaConsola {
    public VistaConsola(){}
    
    public void getNombre(){
        
    }
    
    public void showMenu() throws IOException{
        
        while(true){
            //inicializar variables
            Controlador controller = Controlador.getInstance();
            ValidacionDatosEntrada validator = new ValidacionDatosEntrada();
            String nombre = "";
            String apellido1 = "";
            String apellido2 = "";
            String tipoSistema = "";
            String claseSistema = "";
            String monto = "";
            String dias = "";
            String anios = "";
            String interes="";
            String moneda = "";
            String opcion = "";
            
            InputStreamReader in= new InputStreamReader(System.in);

            BufferedReader input = new BufferedReader(in); 


            System.out.println("\t*------------- Sistema de Ammortización--------------*\n");
            System.out.println("\t \t \t \tMenú Principal\n");
            System.out.println(" \nDigite 'salir' para abandonar el Sistema en cualquier momento\n");
            
            //toma nombre
                  System.out.println("\n a) Por Favor Ingrese su primer nombre junto a su segundo nombre (opcional) , y presione la tecla Enter para continuar. \n");
                   nombre = input.readLine();
                    
                  if(nombre == "salir"){
                      break;
                  }
                  else{
                      if(!validator.validarLetras(nombre)){
                          System.out.println("\n Debe incluir únicamente letras!\n");
                          nombre=input.readLine();
                      }
                  }
                  
                  
                  //toma 1er apellido
                  System.out.println("\n b) Por Favor Ingrese su primer apellido , y presione la tecla Enter para continuar. \n");
                   apellido1 = input.readLine();
                    
                  if(apellido1 == "salir"){
                      break;
                  }
                  else{
                      if(!validator.validarLetras(apellido1)){
                          System.out.println("\n Debe incluir únicamente letras!\n");
                          apellido1=input.readLine();
                      }
                  }
                  
                  
                   //toma 2do apellido
                  System.out.println("\n c) Por Favor Ingrese su segundo apellido , y presione la tecla Enter para continuar. \n");
                   apellido2 = input.readLine();
                    
                  if(apellido2 == "salir"){
                      break;
                  }
                  else{
                      if(!validator.validarLetras(apellido2)){
                          System.out.println("\n Debe incluir únicamente letras!\n");
                          apellido2=input.readLine();
                      }
                  }
                  
                  
                   //toma monto
                  System.out.println("\n d) Por Favor Ingrese el monto deseado , y presione la tecla Enter para continuar. \n");
                   monto = input.readLine();
                    
                  if(monto == "salir"){
                      break;
                  }
                  else{
                      if(!validator.validarDouble(monto)){
                          System.out.println("\n Debe incluir únicamente números enteros , y el '.'para decimales!\n");
                          monto=input.readLine();
                      }
                  }
                  
                  
                  
                    //toma anios
                  System.out.println("\n e) Por Favor Ingrese los años deseados , y presione la tecla Enter para continuar. \n");
                   anios = input.readLine();
                    
                  if(anios == "salir"){
                      break;
                  }
                  else{
                      if(!validator.validarInt(anios)){
                          System.out.println("\n Debe incluir únicamente números enteros!\n");
                          anios=input.readLine();
                      }
                  }
                  
                  
                    //toma interes
                  System.out.println("\n f) Por Favor Ingrese el interes deseado , y presione la tecla Enter para continuar. \n");
                   interes = input.readLine();
                    
                  if(interes == "salir"){
                      break;
                  }
                  else{
                      if(!validator.validarDouble(interes)){
                          System.out.println("\n Debe incluir únicamente números enteros , y el '.'para decimales!\n");
                          interes=input.readLine();
                      }
                  }
                  
                    //toma sistema
                  System.out.println("\n g) \n 1- Aleman \n 2-Frances \n 3-Americano\n");
                  System.out.println("\n  Por Favor Ingrese el número correspondiente al sistema deseado, y presione la tecla Enter para continuar. \n");
                  opcion = input.readLine();
                    
                  if(opcion == "salir"){
                      break;
                  }
                  else{
                     int opcionP = Integer.parseInt(opcion);
                     System.out.println(opcionP);
                     
                     if(opcionP == 1){
                         
                         tipoSistema ="Aleman";
                             claseSistema = "ServicioAleman";
                         
                     } 
                     else{
                         if(opcionP == 2){
                             tipoSistema ="Frances";
                             claseSistema = "ServicioFrances";
                             
                         }
                         else{
                             
                             if(opcionP == 3){
                                 tipoSistema ="Americano";
                             claseSistema = "ServicioAmericano";
                                 
                             }
                             else{
                                 
                                 System.out.println("Ingrese una de las opciones validas, empiece nuevamente");
                             break;
                             
                             
                             }
                             
                         }
                     }
                     
                  }//cierre else
                  
                  
                  
                  //toma moneda
                  System.out.println("\n h) \n 1- Colones \n 2-Dólares\n");
                  System.out.println("\n  Por Favor Ingrese el número correspondiente a la moneda  deseada, y presione la tecla Enter para continuar. \n");
                  opcion = input.readLine();
                    
                  if(opcion == "salir"){
                      break;
                  }
                  else{
                     int opcionP = Integer.parseInt(opcion);
                     if(opcionP == 1){
                          moneda ="Colones";
                         
                     }
                     else{
                         if(opcionP == 2){
                             
                             moneda ="Dolares";
                             
                         }
                         else{
                             System.out.println("Ingrese una de las opciones validas, empiece nuevamente");
                             break;
                         }
                     }
                     
                  }//cierre else
                  
                  
                  //creacion de DTOS
                  
                  //cliente
                  DTOCliente cliente = new DTOCliente();
                  cliente.setNombre(nombre);
                  cliente.setPrimerApellido(apellido1);
                  cliente.setSegundoApellido(apellido2);
                  
                  
                  //servicio
                  
                  DTOServicioAmortizacion dtoAmortizacion = new DTOServicioAmortizacion();
                  dtoAmortizacion.setTipo(claseSistema);
                  dtoAmortizacion.setMontoPrestamo(Double.parseDouble(monto));
                  dtoAmortizacion.setPeriodos(Integer.parseInt(anios));
                  String cambioMostrar = controller.getCambio();
                  dtoAmortizacion.setInteres(Double.parseDouble(interes)/100.0);
                   double cambio = 1;
                  if(moneda == "Dolares"){
                      cambio = Double.parseDouble(controller.getCambio());
                      
                      
                  }
                  
                  dtoAmortizacion.setCambio(cambio);
                  
                  System.out.println("\n--- Datos del cliente y su operación bancaria ---\n");
                  System.out.println("\nFecha:"+controller.getServicioFecha());
                  
                  System.out.println("\n Nombre: "+nombre);
                  System.out.println("\nApellido 1:"+apellido1);
                  System.out.println("\nApellido 2:"+apellido2);
                  System.out.println("\nMonto:"+monto);
                  System.out.println("\nPeriodos:"+anios+" años");
                  System.out.println("\nInteres:"+interes);
                  System.out.println("\nSistema: Servicio "+tipoSistema);
                  System.out.println("\nMoneda:"+moneda);
                   System.out.println("\nTipo de Cambio:"+cambioMostrar);
                   
                   
                  //solicita el prestamo
                  controller.solicitarPrestamo(dtoAmortizacion, cliente);
                  showDatos(dtoAmortizacion,cambio, anios);
                      System.out.println("\n\nPresione Enter para volver al menú principal, o digitite salir para finalizar");
                  String choice = input.readLine();
                  if(choice=="salir"){
                      break;
                  }
                  
                  
                  
                  
                  
               
            
        } //while ends 
        
        
    }//end show menu
    
    private void showDatos(DTOServicioAmortizacion servicio, double cambio, String anios){
        
        System.out.println("\n \tPeriodo \t Deuda Inicial \t\tIntereses \t Amortización \t Cuota");
        
        for(int counter = 0;counter<Integer.parseInt(anios);counter++){
                      
                    System.out.println("\n\t   " +(counter+1)+"\t\t     "+arreglarMonto(servicio.getDeudas().get(counter)/cambio)+"           "+arreglarMonto(servicio.getIntereses().get(counter)/cambio)+"          "+arreglarMonto(servicio.getAmortizaciones().get(counter)/cambio)+"     "+arreglarMonto(servicio.getCuotas().get(counter)/cambio));
                    
                                          
                  }//for ends
        
         System.out.println("\n\t   Total:\t\t                "+arreglarMonto(servicio.getInteresTotal()/cambio)+"          "+arreglarMonto(servicio.getAmortizacionVK()/cambio)+"     "+arreglarMonto(servicio.getCuotaCK()/cambio));
        
         
       
    }
    
    
    
     private double arreglarMonto(double monto){
        double result=monto;
        //System.err.println(String.valueOf(monto).length());
        if(String.valueOf(monto).length()>10){
                result=Double.parseDouble(String.valueOf(monto).substring(0,10));
        }
        return result;
    }
   // public void main(String[] args) throws IOException{
        
     //   showMenu();
        
   // }
}


