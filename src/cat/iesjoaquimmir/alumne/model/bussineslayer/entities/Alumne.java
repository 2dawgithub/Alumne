/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.alumne.model.bussineslayer.entities;

import java.util.ArrayList;

/**
 *
 * @author alumne
 */
public class Alumne {
    
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    private int edat;
    private String nom;
    private String primerCognom;
    private String segonCognom;
    private String dni;
    private Domicili domicili;
      
    private ArrayList<String> telefon;
    private ArrayList<Modul> moduls;
    
    public static final int VALOR_EDAT=99;
    public static final String VALOR_NOM="Anonymous";
    public static final String VALOR_DNI="00000000A";
    //</editor-fold>
    
    
    //<editor-fold defaultstate="collapsed" desc="Mètodes">
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    
    public Alumne(String nom, int edat, String dni, String primerCognom, String segonCognom, ArrayList<String> telefon, Domicili domicili, ArrayList<Modul> moduls){
        this.setNom(nom);
        this.setEdat(edat);
        this.setPrimerCognom(primerCognom);
        this.setSegonCognom(segonCognom);
        this.setDni(dni);
        this.setTelefon(telefon);
        this.setDomicili(domicili);
        this.setModuls(moduls);
    }
    
    
    public Alumne(String nom, String dni, String primerCognom, String segonCognom, ArrayList<String> telefon, Domicili domicili, ArrayList<Modul> moduls){
        this(nom, VALOR_EDAT, dni, primerCognom, segonCognom, telefon, domicili, moduls);
    }
    
    public Alumne(String nom, int edat, String primerCognom, String segonCognom, ArrayList<String> telefon, Domicili domicili, ArrayList<Modul> moduls){
        this(nom, edat, VALOR_DNI, primerCognom, segonCognom, telefon, domicili, moduls);
    }
        
    public Alumne(String dni, String primerCognom, String segonCognom, ArrayList<String> telefon, Domicili domicili, ArrayList<Modul> moduls){
        this(VALOR_EDAT, dni, primerCognom, segonCognom, telefon, domicili, moduls);
    }
    
    public Alumne(int edat, String dni, String primerCognom, String segonCognom, ArrayList<String> telefon, Domicili domicili, ArrayList<Modul> moduls){
        this(VALOR_NOM, edat, dni, primerCognom, segonCognom, telefon, domicili, moduls);
    }
    
    public Alumne( String primerCognom, String segonCognom, ArrayList<String> telefon, Domicili domicili, String nom, ArrayList<Modul> moduls){
        this(nom, VALOR_EDAT, VALOR_DNI, primerCognom, segonCognom, telefon, domicili, moduls);
    }
    
    public Alumne(String nom, String primerCognom, String segonCognom, ArrayList<String> telefon, ArrayList<Modul> moduls){
        this(nom, VALOR_EDAT, VALOR_DNI, primerCognom, segonCognom, telefon, 
                new Domicili(" ", "00000", 1, Domicili.PIS_VALUE, " ", " "), moduls);
                
    }
    
    
    
   
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="getters/setters">
    
    
    public int getEdat() {
        return edat;
    }

    
    public void setEdat(int edat) {
        if(edat <1){
                throw new IllegalArgumentException(
                    String.format("Valor %d no valid.", edat));
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

    
    /**
     * @return the primerCognom
     */
    public String getPrimerCognom() {
        return primerCognom;
    }

    /**
     * @param primerCognom the primerCognom to set
     */
    public void setPrimerCognom(String primerCognom) {
        if(primerCognom == null){
                throw new NullPointerException("Es obligatori indicar una " + "cadena de text");
        }
        this.primerCognom = primerCognom;
    }

    /**
     * @return the segonCognom
     */
    public String getSegonCognom() {
        return segonCognom;
    }

    /**
     * @param segonCognom the segonCognom to set
     */
    public void setSegonCognom(String segonCognom) {
        if(segonCognom == null){
                throw new NullPointerException("Es obligatori indicar una " + "cadena de text");
        }
        this.segonCognom = segonCognom;
    }

        /**
     * @return the telefon
     */
    public ArrayList<String> getTelefon() {
        return telefon;
    }

    /**
     * @param telefon the telefon to set
     */
    public void setTelefon(ArrayList<String> telefon) {
        if(telefon == null){
            throw new NullPointerException("Es obligatori indicar una cadena de text");
        }
        this.telefon = telefon;
    }
    
    /**
     * @return the domicili
     */
    public Domicili getDomicili() {
        return domicili;
    }

    /**
     * @param domicili the domicili to set
     */
    public void setDomicili(Domicili domicili) {
        if(domicili == null){
            throw new NullPointerException("Es obligatori indicar una " + "cadena de text");
        }
        this.domicili = domicili;
    }

    
    /**
     * @return the moduls
     */
    public ArrayList<Modul> getModuls() {
        return moduls;
    }

    /**
     * @param moduls the moduls to set
     */
    public void setModuls(ArrayList<Modul> moduls) {
        if(moduls == null){
            throw new NullPointerException("Es obligatori indicar un modul");
        }
        this.moduls = moduls;
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="operacions d'objecte">
    public String getSalutacio(){
        return String.format("Hola, sóc en/la %s amb identificació %s i tinc %d anys. \n", getNom(), getDni(), getEdat());
    }
    
    public String getNomComplert(){
        return String.format("%s %s, %s", getPrimerCognom(), getSegonCognom(), getNom() );
    }
    
    public boolean getMajorEdat(){
        if(getEdat() >= 18){
            return true;
        }else{
            return false;
        }
        
    }
    
    
    //</editor-fold>
    
    //</editor-fold>






    
    
    
    
}
