package paquete1;

import java.util.ArrayList;
import java.util.Scanner;

public class Limpiador extends Persona {
    
    //Atributos
    private boolean estadoContrato;//True: Si | False: No
    private ArrayList<Inquilino> inquilinos = new ArrayList();
    private ArrayList<Apartamento> listaSolicitudes = new ArrayList();
    
    //Construcor
    public Limpiador(boolean estadoContrato, String nombre) {
        super(nombre);
        this.estadoContrato = estadoContrato;
    }
    
    //Funciones
    public void OfrecerLimpieza(ArrayList<Inquilino> inquilinos) {
        
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i <= inquilinos.size()-1; i++) {
            System.out.println((i+1) + ". " + inquilinos.get(i).getNombre());
        }
        
        System.out.print("Ingresa el indice del inquilino a servir: ");
        int index = input.nextInt();
        if (index<0 || index>=inquilinos.size()) {
            System.out.println("*Indice fuera de rango, intentalo otra vez*");
            OfrecerLimpieza(inquilinos);
        } else {
            Limpiar(inquilinos.get(index).getApt());
            System.out.println("Limpieza solicitada al apartamento: " + inquilinos.get(index).getApt());
        }
        
    }
    
    public void LimpiarApartamentos() {
        
        if (!listaSolicitudes.isEmpty()) {
            for (int i = 0; i <= listaSolicitudes.size()-1; i++) {
                listaSolicitudes.get(i).setSuciedad(0);
                System.out.println("Apartamento: " + listaSolicitudes.get(i).toString() + " *Limpio* Suciedad: " + listaSolicitudes.get(i).getSuciedad());
            }
        } else {
            System.out.println("*Aun n hay solicitudes de limpieza*");
        }
        
    }
    
    public void Limpiar(Apartamento apt) {
        apt.setSuciedad(0);
    }
    
    //Mutadores
    public boolean isEstadoContrato() {
        return estadoContrato;
    }

    public void setEstadoContrato(boolean estadoContrato) {
        this.estadoContrato = estadoContrato;
    }

    public ArrayList<Inquilino> getInquilinos() {
        return inquilinos;
    }

    public void setInquilinos(ArrayList<Inquilino> inquilinos) {
        this.inquilinos = inquilinos;
    }

    public ArrayList<Apartamento> getListaSolicitudes() {
        return listaSolicitudes;
    }

    public void setListaSolicitudes(ArrayList<Apartamento> listaSolicitudes) {
        this.listaSolicitudes = listaSolicitudes;
    }

}
