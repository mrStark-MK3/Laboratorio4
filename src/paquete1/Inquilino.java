package paquete1;

public class Inquilino extends Persona {
    
    //Atributos
    private Apartamento apt;
    private boolean estado;

    //Constructor
    public Inquilino(Apartamento apt, boolean estado, String nombre) {
        super(nombre);
        this.apt = apt;
        this.estado = estado;
    }
    
    //Funciones
    public void FirmarContrato() {
        //Revisar apartamentos disponibles y preguntarle al usuario cual quiere
    }
    
    public void CortarContrato() {
        
    }
    
    public void SolicitarLimpieza() {
        
    }
    
    public void AceptarLimpieza() {
        
    }
    
    //Mutadores
    public Apartamento getApt() {
        return apt;
    }

    public void setApt(Apartamento apt) {
        this.apt = apt;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
