package paquete1;

import java.util.ArrayList;
import java.util.Scanner;

public class Acciones {
    
    //Atributos
    private Edificio edificio;
    private ArrayList <Inquilino> inquilinos = new ArrayList();

    //Constructor
    public Acciones(Edificio edificio) {
        this.edificio = edificio;
    }
    
    //Funciones
    public void AgregarInquilino() {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del Inquilino: ");
        String nombre = input.next();
        
        inquilinos.add(new Inquilino(false, nombre));
        System.out.println("Inquilino creado");
        
    }
    
    public void AgregarLimpiador() {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del limpiador: ");
        String nombre = input.next();
        
        edificio.getLmpds().add(new Limpiador(true, nombre));
        
        System.out.println("Limpiador creado");
        
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
                    System.out.println("----------------------------------------");
                    MenuCasero();
                    System.out.println("----------------------------------------");
                    edificio.Ensuciar();
                    break;
                case 2:
                    if (!inquilinos.isEmpty()) {
                        System.out.println("----------------------------------------");
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
                        System.out.println("----------------------------------------");
                    } else {
                        System.out.println("*No hay inquilinos*");
                    }
                    edificio.Ensuciar();
                    break;
                case 3:
                    if (!edificio.getLmpds().isEmpty()) {
                        System.out.println("----------------------------------------");
                        for (int i = 0; i <= edificio.getLmpds().size()-1; i++) {
                            System.out.println((i+1) + ". " + edificio.getLmpds().get(i).getNombre());
                        }
                        System.out.print("Ingresa el indice del limpiador: ");
                        int index = input.nextInt()-1;
                        if (index<0 || index>=edificio.getLmpds().size()) {
                            System.out.println("Indice fuera de rango");
                        } else {
                            MenuLimpiador(edificio.getLmpds().get(index));
                        }
                        System.out.println("----------------------------------------");
                    } else {
                        System.out.println("No hay limpiadores");
                    }
                    edificio.Ensuciar();
                    break;
                case 4:
                    System.out.println("----------------------------------------");
                    AgregarInquilino();
                    System.out.println("----------------------------------------");
                    break;
                case 5:
                    System.out.println("----------------------------------------");
                    AgregarLimpiador();
                    System.out.println("----------------------------------------");
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion fuera de rango");
            }

        } while (op!=6);
        
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
                    System.out.println("----------------------------------------");
                    edificio.getDuenio().Desalojar(edificio);
                    System.out.println("----------------------------------------");
                    break;
                case 2:
                    if (!edificio.getLmpds().isEmpty()) {
                        System.out.println("----------------------------------------");
                        edificio.getDuenio().DespedirLimpiador(edificio);
                        System.out.println("----------------------------------------");
                    } else {
                        System.out.println("*No hay limpiadores*");
                    }
                    break;
                case 3:
                    System.out.println("----------------------------------------");
                    edificio.getDuenio().VerNotificaciones();
                    System.out.println("----------------------------------------");
                    break;
                case 4:
                    System.out.println("----------------------------------------");
                    System.out.println("Volviendo...");
                    System.out.println("----------------------------------------");
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
            System.out.println("-- MENU DE " + inquilino.getNombre().toUpperCase() + " --");
            System.out.println("1. Firmar contrato");
            System.out.println("2. Cortar contrato");
            System.out.println("3. Solicitar limpieza");
            System.out.println("4. Aceptar Limpieza");
            System.out.println("5. Volver al menu principal");
            System.out.print("Ingresa el numero de la opcion: ");
            op = input.nextInt();
            switch (op) {
                case 1:
                    System.out.println("----------------------------------------");
                    inquilino.FirmarContrato(edificio, inquilino);
                    System.out.println("----------------------------------------");
                    break;
                case 2:
                    System.out.println("----------------------------------------");
                    inquilino.CortarContrato(inquilino);
                    System.out.println("----------------------------------------");
                    break;
                case 3:
                    System.out.println("----------------------------------------");
                    inquilino.SolicitarLimpieza(edificio);
                    System.out.println("----------------------------------------");
                    break;
                case 4:
                    System.out.println("----------------------------------------");
                    inquilino.AceptarLimpieza(edificio);
                    System.out.println("----------------------------------------");
                    break;
                case 5:
                    System.out.println("----------------------------------------");
                    System.out.println("Volviendo...");
                    System.out.println("----------------------------------------");
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
            System.out.println("-- MENU DE " + limpiador.getNombre().toUpperCase() + " --");
            System.out.println("1. Ofrecer limpieza");
            System.out.println("2. Limpiar apartamentos");
            System.out.println("3. Volver al menu principal");
            System.out.print("Ingresa el numero de la opcion: ");
            op = input.nextInt();
            switch (op) {
                case 1:
                    System.out.println("----------------------------------------");
                    limpiador.OfrecerLimpieza(inquilinos);
                    System.out.println("----------------------------------------");
                    break;
                case 2:
                    System.out.println("----------------------------------------");
                    limpiador.LimpiarApartamentos();
                    System.out.println("----------------------------------------");
                    break;
                case 3:
                    System.out.println("----------------------------------------");
                    System.out.println("Volviendo...");
                    System.out.println("----------------------------------------");
                    break;
                default:
                    System.out.println("Opcion fuera de rango");
            }
        } while (op!=3);
    }
    
}
