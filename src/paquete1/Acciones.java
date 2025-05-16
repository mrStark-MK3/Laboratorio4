package paquete1;

import java.util.ArrayList;
import java.util.Scanner;

public class Acciones {
    
    private Edificio edificio;
    private ArrayList <Inquilino> inquilinos = new ArrayList();
    private ArrayList <Limpiador> limpiadores = new ArrayList();

    public Acciones(Edificio edificio) {
        this.edificio = edificio;
    }
    
    public void MenuPrincipal() {
        
        
        Scanner input = new Scanner(System.in);
        
        int op;
        do {
            System.out.println("--MENU--");
            System.out.println("1.Ingresar como Casero");
            System.out.println("2.Ingresar como Inquilino");
            System.out.println("3.Ingresar como limpiador");
            System.out.println("4. Crear Inquilino");
            System.out.println("5. Crear Limpiador");
            System.out.println("6. Salir");
            System.out.print("Ingresa el numero de la opcion: ");
            op = input.nextInt();
            switch (op) {
                case 1:
                    MenuCasero();
                    break;
                case 2:
                    if (!inquilinos.isEmpty()) {
                        for (int i = 0; i <= inquilinos.size()-1; i++) {
                            System.out.println((i+1) + ". " + inquilinos.get(i).getNombre());
                        }
                        System.out.print("Ingresa el indice del inquilino: ");
                        int index = input.nextInt()-1;
                        if (index<0 ||index>=inquilinos.size()) {
                            System.out.println("indice fuera de rango");
                        } else {
                            MenuInquilino(inquilinos.get(index));
                        }
                    }
                    break;
                case 3:
                    if (!limpiadores.isEmpty()) {
                        for (int i = 0; i <= limpiadores.size()-1; i++) {
                            System.out.println((i+1) + ". " + limpiadores.get(i).getNombre());
                        }
                        System.out.print("Ingresa el indice del limpiador: ");
                        int index = input.nextInt()-1;
                        if (index<0 || index>=limpiadores.size()) {
                            System.out.println("Indice fuera de rango");
                        } else {
                            MenuLimpiador(limpiadores.get(index));
                        }
                    }
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
    
    public void MenuCasero() {
        
        Scanner input = new Scanner(System.in);
        
        int op;
        do {
            System.out.println("--MENU CASERO--");
            System.out.println("1. Desalojar apartamento");
            System.out.println("2. Despedir limpiadores");
            System.out.println("3. Ver notificaciones");
            System.out.println("4. Volver al menu principal");
            System.out.print("Ingresa el numero de la opcion: ");
            op = input.nextInt();
            switch (op) {
                case 1:
                    edificio.getDuenio().Desalojar(edificio);
                    break;
                case 2:
                    if (!edificio.getLmpds().isEmpty()) {
                        edificio.getDuenio().DespedirLimpiador(edificio);
                    } else {
                        System.out.println("*No hay limpiadores*");
                    }
                    break;
                case 3:
                    edificio.getDuenio().VerNotificaciones();
                    break;
                case 4:
                    System.out.println("Volviendo...");
                    break;
                default:
                    System.out.println("Opcion fuera de rango");
            }
        } while (op!=4);
        
    }
    
    public void MenuInquilino(Inquilino inquilino) {
        
        Scanner input = new Scanner(System.in);
        
        int op;
        do {
            System.out.println("-- MENU DE INQUILINO -- ");
            System.out.println("1. Firmar contrato");
            System.out.println("2. Cortar contrato");
            System.out.println("3. Solicitar limpieza");
            System.out.println("4. Aceptar Limpieza");
            System.out.println("5. Volver al menu principal");
            System.out.print("Ingresa el numero de la opcion: ");
            op = input.nextInt();
            switch (op) {
                case 1:
                    inquilino.FirmarContrato(edificio, inquilino);
                    break;
                case 2:
                    inquilino.CortarContrato(inquilino);
                    break;
                case 3:
                    inquilino.SolicitarLimpieza(edificio);
                    break;
                case 4:
                    inquilino.AceptarLimpieza(edificio);
                    break;
                case 5:
                    System.out.println("Volviendo...");
                    break;
                default:
                    System.out.println("Opcion fuera de rango");
            }
        } while (op!=5);
        
    }
    
    public void MenuLimpiador(Limpiador limpiador) {
        
        Scanner input = new Scanner(System.in);
        
        int op;
        do {
            System.out.println("--MENU DE LIMPIADOR--");
            System.out.println("1. Ofrecer limpieza");
            System.out.println("2. Limpiar apartamentos");
            System.out.println("3. Volver al menu principal");
            System.out.print("Ingresa el numero de la opcion: ");
            op = input.nextInt();
            switch (op) {
                case 1:
                    limpiador.OfrecerLimpieza(inquilinos);
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Volviendo...");
                    break;
                default:
                    System.out.println("Opcion fuera de rango");
            }
        } while (op!=3);
        
    }
    
}
