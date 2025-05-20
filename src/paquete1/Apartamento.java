package paquete1;

import java.util.ArrayList;

public class Apartamento {
    
    //Atributos
    private ArrayList<Inquilino> inqnos = new ArrayList();
    private int precio;
    private int suciedad;
    
    //Constructor
    public Apartamento(int precio, int suciedad) {
        this.precio = precio;
        this.suciedad = suciedad;
    }
    
    //Mutadores
    public ArrayList<Inquilino> getInqnos() {
        return inqnos;
    }

    public void setInqnos(ArrayList<Inquilino> inqnos) {
        this.inqnos = inqnos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getSuciedad() {
        return suciedad;
    }

    public void setSuciedad(int suciedad) {
        this.suciedad = suciedad;
    }

    //Funciones
    public String ListaInquilinos() {
        String lista = "Inquilinos: | ";
        for (int i = 0; i <= inqnos.size()-1; i++) {
            lista += inqnos.get(i).getNombre() + " | ";
        }
        
        return lista;
    }
    
    public void Ensuciar() {
        
        if (!inqnos.isEmpty()) {
            suciedad += 5;
        }
        
    }
    
    //ToString
    @Override
    public String toString() {
        return "Precio: L." + precio + " | " + ListaInquilinos();
    }
    
}
