package Observer;


import DTOs.DTOCliente;        
import DTOs.DTOServicioAmortizacion;         
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class BitacoraXML extends IEscritor {

    
    
    public BitacoraXML(Subject subject){
        super("bitacoraXML.xml");
        this.subject = subject;
        this.subject.attach(this);
        this.crearArchivo();
        
    }
    
    @Override
     public void crearArchivo() {
         String sFichero ="src\\Data\\"+getNombreArchivo() ;
         File fichero = new File(sFichero);
         if (fichero.exists()){
             return;
         }
         try{

            Element elemento = new Element ( "BitacoraXML" );
            XMLOutputter outputter = new XMLOutputter( Format.getPrettyFormat() );
            outputter.output ( new Document( elemento ), new FileOutputStream( "src\\Data\\"+getNombreArchivo() ) );
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
            SAXBuilder builder = new SAXBuilder();
            FileInputStream xmlFile = new FileInputStream ("src\\Data\\"+getNombreArchivo()  );
            Document document = (Document) builder.build( xmlFile );
            Element elemento=document.getRootElement();
             // Obtenemos el objeto Document   
            Element element=new Element ( "NuevosDatos" );
            element.setText( "------------------------------------------------" );
            elemento.addContent( element );
            
            
            Element elemento1=new Element ( "Nombre" );
            elemento1.setText( cliente.getNombre() );
            elemento.addContent( elemento1 );
            
            Element elemento2=new Element ( "PrimerApellido" );
            elemento2.setText( cliente.getPrimerApellido() );
            elemento.addContent( elemento2);
            
             Element elemento3=new Element ( "SegundoApellido" );
            elemento3.setText( cliente.getSegundoApellido() );
            elemento.addContent( elemento3);
         
            
            Element elemento5=new Element ( "MontoPrestamo" );
            elemento5.setText( servicio.getMontoPrestamo()+"" );
            elemento.addContent( elemento5);
            
            Element elemento6=new Element ( "Periodos" );
            elemento6.setText( servicio.getPeriodos()+"");
            elemento.addContent( elemento6);
            
             Element elemento7=new Element ( "Interes" );
            elemento7.setText((servicio.getInteres()*100.0)+"" );
            elemento.addContent( elemento7);
            
              Element elemento8=new Element ( "TipoSistema" );
            elemento8.setText( servicio.getTipo());
            elemento.addContent( elemento8);
            
            Element elemento9=new Element ( "TipoMoneda" );
            elemento9.setText( "Colon" );
            elemento.addContent( elemento9);
            
            XMLOutputter xmlOutput = new XMLOutputter();
            xmlOutput.setFormat(Format.getPrettyFormat());
            xmlOutput.output(document, new FileWriter("src\\Data\\"+getNombreArchivo() ));
   
        } catch (Exception ex) {
            ex.toString();
        }
    }
    
        

}
