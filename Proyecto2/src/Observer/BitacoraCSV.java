/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Observer;

import DTOs.DTOCliente;
import DTOs.DTOServicioAmortizacion;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileWriter;
/**
 *
 * @author xXMAMBOXx
 */
public class BitacoraCSV extends IEscritor {
    
    public BitacoraCSV(Subject subject){
        super("bitacoraCSV.csv");
        this.subject = subject;
        this.subject.attach(this);
    }
      
    @Override
     public void crearArchivo() {
         
         String outputFile = "src\\Data\\"+getNombreArchivo() ;
         File fichero = new File(outputFile);
         if(fichero.exists()){
             return;
         }
         try {
             CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
             
         } catch (Exception ex) {
             ex.toString();
         }
     }
    /*@Override
    public IEscritor <error>(Subject subject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    @Override
    public void escribirMovimiento(DTOServicioAmortizacion servicio, DTOCliente cliente) {
        try {
            String outputFile = "src\\Data\\"+getNombreArchivo() ;
            CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ','); 
            csvOutput.write(cliente.getNombre());
            csvOutput.write(cliente.getPrimerApellido());
            csvOutput.write(cliente.getSegundoApellido());
            csvOutput.write(servicio.getMontoPrestamo()+"");
            csvOutput.write(servicio.getPeriodos()+"");
            csvOutput.write(servicio.getInteres()+"");
            csvOutput.write(servicio.getTipo());
            csvOutput.write("Colones");
            csvOutput.endRecord();
            csvOutput.close();
   
        } catch (Exception ex) {
            ex.toString();
        }
    }

   
}
