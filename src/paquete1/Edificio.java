package paquete1;

import java.util.ArrayList;

public class Edificio {
    
    //Atributos
    private String disenio;
    private Apartamento [] apts = new Apartamento[10];
    private ArrayList<Limpiador> lmpds= new ArrayList(); 
    
    //Mutadores
    public String getDisenio() {
        return disenio;
    }

    public void setDisenio(String disenio) {
        this.disenio = disenio;
    }

    public Apartamento[] getApts() {
        return apts;
    }

    public void setApts(Apartamento[] apts) {
        this.apts = apts;
    }

    public ArrayList<Limpiador> getLmpds() {
        return lmpds;
    }

    public void setLmpds(ArrayList<Limpiador> lmpds) {
        this.lmpds = lmpds;
    }
    
    
}
