package paquete1;

import java.util.ArrayList;

public class Limpiador extends Persona {
    
    //Atributos
    private boolean contratado;//True: Si | False: No
    private ArrayList<Inquilino> iqnos = new ArrayList();
    private ArrayList<Apartamento> listaSolicitudes = new ArrayList();
    
    //Construcor
    public Limpiador(boolean contratado, String nombre) {
        super(nombre);
        this.contratado = contratado;
    }
    
    //Funciones
    public void OfrecerLimpieza(ArrayList<Inquilino> inquilinos) {
        
        for (int i = 0; i <= inquilinos.size()-1; i++) {
            System.out.println((i+1) + ". " + inquilinos.get(i).getNombre());
        }
        
        System.out.println("");
        
    }
    
    public void LimpiarApartamento(Apartamento apt) {
        //Lista de solicitudes y limpiar uno
        apt.setSuciedad(0);
        
    }
    
    //Mutadores
    public boolean isContratado() {
        return contratado;
    }

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }

    public ArrayList<Inquilino> getIqnos() {
        return iqnos;
    }

    public void setIqnos(ArrayList<Inquilino> iqnos) {
        this.iqnos = iqnos;
    }

    public ArrayList<Apartamento> getListaSolicitudes() {
        return listaSolicitudes;
    }

    public void setListaSolicitudes(ArrayList<Apartamento> listaSolicitudes) {
        this.listaSolicitudes = listaSolicitudes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
