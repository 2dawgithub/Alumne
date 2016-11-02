/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.alumne.model.bussineslayer.entities;

/**
 *
 * @author alumne
 */
public class Alumne {
    
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    private int edat;
    private String nom;
    private String dni;
    
    
    public static final int VALOR_EDAT=99;
    public static final String VALOR_NOM="Anonymous";
    public static final String VALOR_DNI="00000000A";
    //</editor-fold>
    
    
    //<editor-fold defaultstate="collapsed" desc="Mètodes">
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    
    public Alumne(String nom, int edat, String dni){
        this.setNom(nom);
        this.setEdat(edat);
        this.setDni(dni);
    }
    
    
    public Alumne(String nom, String dni){
        this(nom, VALOR_EDAT, dni);
    }
    
    public Alumne(String nom, int edat){
        this(nom, edat, VALOR_DNI);
    }
    
    /*
    public Alumne(String nom){
        this(nom, VALOR_EDAT, VALOR_DNI);
    }
     o */
    
    public Alumne(String dni){
        this(VALOR_NOM, VALOR_EDAT, dni);
    }
    
    public Alumne(int edat, String dni){
        this(VALOR_NOM, edat, dni);
    }
    
    
    
   
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="getters/setters">
    
    
    public int getEdat() {
        return edat;
    }

    
    public void setEdat(int edat) {
        if(edat <1){
                throw new IllegalArgumentException(
                    String.format("Valor %f no valid.", edat));
            }
        this.edat = edat;
    }

    
    public String getNom() {
        return nom;
    }

    
    public void setNom(String nom) {
        if(nom == null){
                throw new NullPointerException("Es obligatori indicar una " + "cadena de text");
        }
        
        this.nom = nom;
    }

    
    public String getDni() {
        return dni;
    }

    
    public void setDni(String dni) {
        if(dni == null){
                throw new NullPointerException("Es obligatori indicar una " + "cadena de text");
        }
        if (!dni.matches("^[0-9]{8}[A-Za-z]$")){
                throw new IllegalArgumentException(String.format("El text %s no te format de dni", dni));
        }
        this.dni = dni;
    }

    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="operacions d'objecte">
    public String getSalutacio(){
        return String.format("Hola, sóc en/la %s amb identificació %s i tinc %d anys. \n", getNom(), getDni(), getEdat());
    }
    //</editor-fold>
    
    //</editor-fold>

    
    
    
    
}
