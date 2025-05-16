package paquete1;

import java.util.ArrayList;

public class Edificio {
    
    //Atributos
    private Casero duenio;
    private ArrayList<Apartamento> apts = new ArrayList();
    private ArrayList<Limpiador> lmpds= new ArrayList(); 
    
    //Constructor
    public Edificio(Casero duenio) {
        this.duenio = duenio;
    }
    
    //Mutadores
    public Casero getDuenio() {
        return duenio;
    }

    public void setDuenio(Casero duenio) {
        this.duenio = duenio;
    }

    public ArrayList<Apartamento> getApts() {
        return apts;
    }

    public void setApts(ArrayList<Apartamento> apts) {
        this.apts = apts;
    }

    public ArrayList<Limpiador> getLmpds() {
        return lmpds;
    }

    public void setLmpds(ArrayList<Limpiador> lmpds) {
        this.lmpds = lmpds;
    }
    
}
