/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SistAmortizacion;

import DTOs.DTOServicioAmortizacion;
import Modelo.ServicioAmortizacion;
import Modelo.ServicioAleman;
import Modelo.ServicioAmericano;
import Modelo.ServicioFrances;

/**
 *
 * @author xXMAMBOXx
 */
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DTOs.DTOServicioAmortizacion x=new DTOServicioAmortizacion(1000000,5, 0.15);
        
        ServicioAmortizacion serv;
        serv = new ServicioAmericano(x);
       // serv.calcularCuotas();
        
       // serv.calcularAmortizaciones();
        
        
        
        //serv.calcularCuotas();
       // serv.calcularCuotas();
        
       // serv.calcularDeudas();
        
        serv.verificarV();
        
    }
    
}
