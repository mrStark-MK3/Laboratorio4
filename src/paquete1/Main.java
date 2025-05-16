// Fila: 3 | Silla: 5
package paquete1;

import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
        
        Random rd = new Random();
        
        Acciones acs = new Acciones();
        
        Casero casero = new Casero("Pedri Gonzales el GOAT");
        
        Edificio edificio = new Edificio(casero.getNombre());
        
        for (int i = 0; i < 5; i++) {
            edificio.getApts().add(new Apartamento((rd.nextInt(50,151)), 0, 0));
        }
        
        acs.MenuPrincipal(edificio);
        
    }
    
}
