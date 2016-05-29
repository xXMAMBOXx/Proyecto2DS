/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validaciones;

/**
 *
 * @author way14
 */
public class ValidacionDatosEntrada {
    
    public boolean validarLetras(String palabra){
        
        return palabra.matches("[a-zA-Z ]+$");
              
    }
    
    public boolean validarInt(String numero){
        
        return numero.matches("[1-9]+$");
    }
    
    public boolean validarDouble(String numero){
        boolean result;
                     try{
                         Double.parseDouble(numero);
                         result= true;
                     }
                     catch(Exception e){
                         result = false;
                     }
                     return result;
    }
    
}
