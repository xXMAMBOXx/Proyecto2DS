/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integracion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FechaSocket implements IServicioFecha {
     private String host = "localhost";
     private int port = 8666;

    private Socket socketChucky() throws IOException {
        Socket socketChucky = new Socket(this.host, this.port);
        return socketChucky;
    }
    
   @Override
    public String getFecha() {
        String fecha = "";
        try {
            Socket chucky = this.socketChucky();
          
            BufferedReader buff = new BufferedReader(new InputStreamReader(chucky.getInputStream()));
            fecha = buff.readLine();      
        } catch (Exception e) { 
            return "Error obteniendo fecha del cliente chucky )";
        }
        return fecha;
    }
    
}
