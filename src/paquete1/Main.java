// Fila: 3 | Silla: 5
package paquete1;

import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
        
        Random rd = new Random();
        
        Casero casero = new Casero("Pedri Gonzales el GOAT");
        
        Edificio edificio = new Edificio(casero);
        
        for (int i = 0; i < 5; i++) {
            edificio.getApts().add(new Apartamento((rd.nextInt(50,151)), 0, 0));
        }
        
        Acciones acs = new Acciones(edificio);
        acs.MenuPrincipal();
        
    }
    
}
