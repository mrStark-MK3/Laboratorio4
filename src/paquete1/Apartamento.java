package paquete1;

import java.util.ArrayList;

public class Apartamento {
    
    //Atributos
    private ArrayList<Inquilino> inqnos = new ArrayList();
    private int precio;
    private int suciedad;
    private int limpieza;
    
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

    public int getLimpieza() {
        return limpieza;
    }

    public void setLimpieza(int limpieza) {
        this.limpieza = limpieza;
    }
    
    
}
