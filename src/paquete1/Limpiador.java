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
    public void OfrecerLimpieza() {
        //Mostrar lista de inquilinos y ofrecerle limpieza a uno o a todos
    }
    
    public void LimpiarApartamento() {
        //Lista de solicitudes y limpiar uno
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
