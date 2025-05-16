package paquete1;

import java.util.ArrayList;
import java.util.Scanner;

public class Inquilino extends Persona {
    
    //Atributos
    private Apartamento apt;
    private boolean estado;// True: Con contrato | False: Sin contrato

    //Constructor
    public Inquilino(boolean estado, String nombre) {
        super(nombre);
        this.estado = estado;
    }
    
    //Funciones
    public void FirmarContrato(Edificio edificio, Inquilino inquilino) {
        
        Scanner input = new Scanner(System.in);
        
        //Revisar apartamentos disponibles y preguntarle al usuario cual quiere
        ArrayList <Apartamento> disponibles = new ArrayList();
        for (int i = 0; i <= edificio.getApts().size()-1; i++) {
            if (edificio.getApts().get(i).getInqnos().size()<3) {
                disponibles.add(edificio.getApts().get(i));
            }
        }
        if (!disponibles.isEmpty()) {
            //Se muestran como apartamentos disponibles aquellos que tiene menos de inquilinos
            for (int i = 0; i <= disponibles.size()-1; i++) {
                System.out.println((i+1) + ". " + edificio.getApts().get(i).toString());
            }
            System.out.print("Ingresa el indice del apartamento que queres: ");
            int index = input.nextInt()-1;
            if (index<0 || index>=disponibles.size()) {
                System.out.println("Indice fuera de rango, intentalo otra vez");
                FirmarContrato(edificio, inquilino);
            } else {
                Apartamento elegido = disponibles.get(index);
                apt = elegido;
                estado = true;
                elegido.getInqnos().add(inquilino);
            }    
        } else {
            System.out.println("No hay Apartamentos disponibles");
        }
        
    }
    
    public void CortarContrato(Inquilino inquilino) {
        
        apt.getInqnos().remove(inquilino);
        apt = null;
        estado = false;
        
    }
    
    public void SolicitarLimpieza(Edificio edificio) {
        
        for (int i = 0; i <= edificio.getLmpds().size()-1; i++) {
            edificio.getLmpds().get(i).getListaSolicitudes().add(apt);
        }
        
    }
    
    public void AceptarLimpieza(Edificio edificio) {
        
        Scanner input = new Scanner(System.in);
        
        ArrayList<Limpiador> solicitudes = new ArrayList();
        
        for (int i = 0; i <= edificio.getLmpds().size()-1; i++) {
            if (edificio.getLmpds().get(i).getListaSolicitudes().contains(apt)) {
                solicitudes.add(edificio.getLmpds().get(i));
            }
        }
        
        if (!solicitudes.isEmpty()) {
            for (int i = 0; i <= solicitudes.size()-1; i++) {
                System.out.println((i+1) + ". " + solicitudes.get(i).getNombre());
            }
            
            System.out.print("Ingresa el indice del limpiador: ");
            int index = input.nextInt()-1;
            if (index<0 || index>=solicitudes.size()) {
                System.out.println("Indice fuera de rango, intentalo otra vez");
                AceptarLimpieza(edificio);
            } else {
                solicitudes.get(index).LimpiarApartamento(apt);
            }
            
        }
        
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
