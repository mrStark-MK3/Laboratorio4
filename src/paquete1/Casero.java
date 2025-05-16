package paquete1;

import java.util.ArrayList;
import java.util.Scanner;

public class Casero extends Persona {
    
    //Atributos
    private ArrayList<Inquilino> estados = new ArrayList();//Si esta 100% sucio
    
    //Constructor
    public Casero(String nombre) {
        super(nombre);
    }
    
    //Funciones
    public void Desalojar(Edificio edificio) {
        
        Scanner input = new Scanner(System.in);
        
        if (!estados.isEmpty()) {
            for (int i = 0; i <= estados.size()-1; i++) {
                System.out.println((i+1) + ". " + estados.get(i).getApt().toString());
            }

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
            System.out.println("No se puede desalijar ningun apartamento");
        }
    }
    
    public void DespedirLimpiador() {
        
    }
    
    public void VerNotificaciones() {
        //Ve las notificaciones de los apartamento que estan 100% sucios
        
    }
    
}
