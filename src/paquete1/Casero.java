package paquete1;

import java.util.ArrayList;
import java.util.Scanner;

public class Casero extends Persona {
    
    //Atributos
    private ArrayList<Apartamento> estados = new ArrayList();//Si esta 100% sucio
    
    //Constructor
    public Casero(String nombre) {
        super(nombre);
    }
    
    //Funciones
    public void Desalojar(Edificio edificio) {
        
        Scanner input = new Scanner(System.in);
        
        if (!estados.isEmpty()) {
            
            VerNotificaciones();

            System.out.print("Ingresa el indice del apartamento a desalojar: ");
            int index = input.nextInt()-1;
            if (index<0 || index>=estados.size()) {
                System.out.println("Indice fuera de rango, intentalo otr vez");
                Desalojar(edificio);
            } else {
                edificio.getApts().get(index).getInqnos().clear();
                System.out.println("Apartamento desalojado");
                //Print de prueba
                System.out.println(edificio.getApts().get(index).toString());
            }    
        } else {
            System.out.println("No se puede desalojar ningun apartamento");
        }
    }
    
    public void DespedirLimpiador(Edificio edificio) {
        
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i <= edificio.getLmpds().size()-1; i++) {
            System.out.println((i+1) + ". " + edificio.getLmpds().get(i).getNombre());
        }
        System.out.print("Ingresa el indice del limpiador a eliminar: ");
        int index = input.nextInt()-1;
        if (index<0 || index>=edificio.getLmpds().size()) {
            System.out.println("Indice fuera de rango, intentalo otra vez");
            DespedirLimpiador(edificio);
        } else {
            edificio.getLmpds().get(index).setEstadoContrato(false);
            System.out.println(edificio.getLmpds().get(index).getNombre() + " ha sido despedidio.");
            edificio.getLmpds().remove(index);
        }
        
    }
    
    public void VerNotificaciones() {
        //Ve las notificaciones de los apartamento que estan 100% sucios
        
        if (!estados.isEmpty()) {
            for (int i = 0; i <= estados.size()-1; i++) {
                System.out.println((i+1) + ". " + estados.get(i).toString() + "Suciedad: " + estados.get(i).getSuciedad());
            }
        } else {
            System.out.println("*No hay notificaciones*");
        }
        
    }
    
    //Mutadores
    public ArrayList<Apartamento> getEstados() {
        return estados;
    }

    public void setEstados(ArrayList<Apartamento> estados) {
        this.estados = estados;
    }
    
    
}
