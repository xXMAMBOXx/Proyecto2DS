/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosExternos;


/**
 *
 * @author way14
 */

//trabajar con fechas
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;



//usar get y parsear XML
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;


public class ServiceBCCR {
    
    //obtener el tipo de cambio del web service del BCCR
    private String getTipoCambio(){
        Document doc = null;
        String fecha = getFechaActual();
        
        String uri = "http://indicadoreseconomicos.bccr.fi.cr/indicadoreseconomicos/WebServices/wsIndicadoresEconomicos.asmx/ObtenerIndicadoresEconomicos?tcIndicador=317&tcFechaInicio=19/05/2016&tcFechaFinal=" + fecha + "&tcNombre=epsi&tnSubNiveles=N";
        
        try{ 
    
                URL url = new URL(uri);
                HttpURLConnection connection =
                (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setRequestProperty("Accept", "application/xml");

                InputStream xml = connection.getInputStream();
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();
                doc = db.parse(xml);

               // System.out.println(doc.getElementsByTagName("NUM_VALOR").item(0).getTextContent());
               // return doc.getElementsByTagName("NUM_VALOR").item(0).getTextContent();
    
    }catch(Exception e){
        
                System.out.println("No se pudo obtener el dato \n" + e.toString());
                
                
                      
        
    }
        return doc.getElementsByTagName("NUM_VALOR").item(0).getTextContent();
              
    }
    
    
    //obtiene la fecha actual del sistema
    //hay que pasarlo al paquete de validaciones
    public String getFechaActual(){
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	  
	   Date date = new Date();
	   System.out.println(dateFormat.format(date));
           return dateFormat.format(date).toString();
        
    }
    
    
    
}//cierre clase Service
