package Observer;


import DTOs.DTOCliente;        
import DTOs.DTOServicioAmortizacion;         
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.xml.sax.InputSource;

public class BitacoraXML implements IEscritor {
    private static String nombreArchivo="bitacoraXML.xml";
    
    public BitacoraXML(){
        
    }
    
     public void crearArchivo() {
        try{
            
            Element elemento = new Element ( "BitacoraXML" );
            Element elementoHijo=new Element ( "Nombre" );
            elementoHijo.setText( "marvin" );
            elemento.addContent( elementoHijo );

            
           /* elemento.setText( "contenidoEntreTag" );
            elemento.setAttribute ( "PrimerApellido", "contenidoAtributo" );
            elemento.setText( "contenidoEntreTag" );
            elemento.setAttribute ( "SegundoApellido", "contenidoAtributo" );
            elemento.setText( "contenidoEntreTag" );
            elemento.setAttribute ( "MontoPrestamo", "contenidoAtributo" );
            elemento.setText( "contenidoEntreTag" );
            elemento.setAttribute ( "Periodos", "contenidoAtributo" );
            elemento.setText( "contenidoEntreTag" );
            elemento.setAttribute ( "Interes", "contenidoAtributo" );
            elemento.setText( "contenidoEntreTag" );
            elemento.setAttribute ( "TipoSistema", "contenidoAtributo" );
            elemento.setText( "contenidoEntreTag" );
            elemento.setAttribute ( "TipoMoneda", "contenidoAtributo" );
            elemento.setText( "contenidoEntreTag" );*/
            XMLOutputter outputter = new XMLOutputter( Format.getPrettyFormat() );
            outputter.output ( new Document( elemento ), new FileOutputStream( "archivo.xml" ) );
        
            }catch (Exception e){
                e.getMessage();
            }
     }
    /*@Override
    public IEscritor <error>(Subject subject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    @Override
    public void escribirMovimiento(DTOServicioAmortizacion servicio, DTOCliente cliente) {
        try {
            this.crearArchivo();
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            // Procesamos el fichero XML y obtenemos nuestro objeto Document
            Document doc = (Document) documentBuilder.parse(new InputSource(new FileInputStream("archivo.xml")));
            
            
            
        } catch (Exception ex) {
            ex.toString();
        }
    }
        

}
