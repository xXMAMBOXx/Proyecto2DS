package DTOs;


public class DTOCliente {
    
    
    protected String nombre;
    protected String primerApellido;
    protected String segundoApellido;
    
    
     public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public void setPrimerApellido(String primerApellido){
        this.primerApellido=primerApellido;
    }
    public String getPrimerApellido(){
        return this.primerApellido;
    }
    
    public void setSegundoApellido(String segundoApellido){
        this.segundoApellido=segundoApellido;
    }
    public String getSegundoApellido(){
        return this.segundoApellido;
    }
    
}
