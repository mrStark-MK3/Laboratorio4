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
        
        //Lista de inquilinos con contrato
        ArrayList <Inquilino> inqCont = new ArrayList();
        for (int i = 0; i <= inquilinos.size()-1; i++) {//Llenar lista de inquilinos con contrato
            if (inquilinos.get(i).isEstado()) {
                inqCont.add(inquilinos.get(i));
            }
        }
        //Elejir el cliente a servir
        if (!inqCont.isEmpty()) {
            for (int i = 0; i <= inqCont.size()-1; i++) {
                System.out.println((i+1) + ". " + inqCont.get(i).getNombre());
            }
            System.out.print("Ingresa el indice del inquilino a servir: ");
            int index = input.nextInt()-1;
            //Validacion de indice
            if (index<0 || index>=inquilinos.size()) {
                System.out.println("*Indice fuera de rango, intentalo otra vez*");
                OfrecerLimpieza(inquilinos);
            } else {
                Limpiar(inqCont.get(index).getApt());
                System.out.println("Limpieza solicitada al apartamento: " + inqCont.get(index).getApt());
            }
        } else {
            System.out.println("*No hay clientes con contrato*");
        }
        
    }
    
    public void LimpiarApartamentos() {
        
        if (!listaSolicitudes.isEmpty()) {
            for (int i = 0; i <= listaSolicitudes.size()-1; i++) {
                listaSolicitudes.get(i).setSuciedad(0);
                System.out.println("Apartamento: " + listaSolicitudes.get(i).toString() + " *Limpio* Suciedad: " + listaSolicitudes.get(i).getSuciedad());
                listaSolicitudes.remove(i);
            }
        } else {
            System.out.println("*Aun no hay solicitudes de limpieza*");
        }
        
    }
    
    public void Limpiar(Apartamento apt) {
        apt.setSuciedad(0);
        System.out.println("*Apartamento " + apt.toString() + " limpio* (suciedad: " + apt.getSuciedad() + ")");
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