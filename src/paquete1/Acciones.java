package paquete1;

import java.util.Scanner;

public class Acciones {
    
    public void MenuPrincipal() {
        
        Scanner input = new Scanner(System.in);
        
        int op;
        do {
            System.out.println("--MENU--");
            System.out.println("Como quiere ingresar?");
            System.out.println("1. Como Casero");
            System.out.println("2. Como Inquilino");
            System.out.println("3. Como limpiador");
            System.out.println("4. Crear Inquilino");
            System.out.println("5. Crear Limpiador");
            System.out.println("6. Salir");
            System.out.print("Ingresa el numero de la opcion: ");
            op = input.nextInt();
            switch (op) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion fuera de rango");
            }
        } while (op!=4);
        
    }
    
}
