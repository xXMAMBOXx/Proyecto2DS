/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integracion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class FechaSocket implements IServicioFecha {
     private String direccion = "localhost";
    private int puerto = 8666;

    private Socket socketChucky() throws IOException {
        Socket socketChucky = new Socket(this.direccion, this.puerto);
        return socketChucky;
    }
    
   @Override
    public String getFecha() {
        String tiempo = "";
        try {
            Socket chucky = this.socketChucky();
          
            BufferedReader buff = new BufferedReader(new InputStreamReader(chucky.getInputStream()));
            tiempo = buff.readLine();      
        } catch (Exception e) { 
            return "Error obteniendo el tiempo del cliente chucky";
        }
        return tiempo;
    }
    
}
