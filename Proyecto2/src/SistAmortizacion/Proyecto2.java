/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SistAmortizacion;

import DTOs.DTOServicioAmortizacion;
import Modelo.ServicioAmortizacion;
import Modelo.ServicioAleman;

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
        serv = new ServicioAleman(x);
        //serv.calcularCuotas();
        //System.err.println("cuota total:    "+serv.getCuotaCK());
        //serv.calcularAmortizaciones();System.err.println("cuotaaa:    "+serv.getAmortizacionCK());
       //serv.calcularIntereses();
        //System.err.println(serv.getInteresSK());
        serv.calcularAmortizaciones();
        //serv.calcularCuotas();
        //serv.calcularDeudas();
        //serv.
        
        
        serv.calcularDeudas();
        
    }
    
}
