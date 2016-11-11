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
public class Domicili {
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    private String carrer;
    private int numero;
    private String pis;
    private String codipostal;
    private String poblacio;
    private String provincia;
    
    public static final String PIS_VALUE=" ";
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Mètodes">
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Domicili(String carrer, String codipostal, int numero, String pis, String poblacio, String provincia){
        this.setCarrer(carrer);
        this.setCodipostal(codipostal);
        this.setNumero(numero);
        this.setPis(pis);
        this.setPoblacio(poblacio);
        this.setProvincia(provincia);
    }
    
    public Domicili(String carrer, String codipostal, int numero, String poblacio, String provincia){
        this(carrer, codipostal, numero, PIS_VALUE, poblacio, provincia);
    }
    //</editor-fold>
   
    //<editor-fold defaultstate="collapsed" desc="getters/setters">
        
        /**
         * @return the carrer
         */
        public String getCarrer() {
            return carrer;
        }

        /**
         * @param carrer the carrer to set
         */
        public void setCarrer(String carrer) {
            if (carrer == null){
                throw new NullPointerException("Es obligatori indicar una " + "cadena de text");
            }
            this.carrer = carrer;
        }

        /**
         * @return the numero
         */
        public int getNumero() {
            return numero;
        }

        /**
         * @param numero the numero to set
         */
        public void setNumero(int numero) {
            if(numero <0){
                throw new IllegalArgumentException(
                    String.format("Valor %d no valid.", numero));
            }
            this.numero = numero;
        }

        /**
         * @return the pis
         */
        public String getPis() {
            return pis;
        }

        /**
         * @param pis the pis to set
         */
        public void setPis(String pis) {
            if (pis == null){
                throw new NullPointerException("Es obligatori indicar una " + "cadena de text");
            }
            this.pis = pis;
        }

        /**
         * @return the codipostal
         */
        public String getCodipostal() {
            return codipostal;
        }

        /**
         * @param codipostal the codipostal to set
         */
        public void setCodipostal(String codipostal) {
            if(codipostal.length() !=5 ){
                throw new IllegalArgumentException(
                    String.format("Valor %s no valid.", codipostal));
            }
            this.codipostal = codipostal;
        }

        /**
         * @return the poblacio
         */
        public String getPoblacio() {
            return poblacio;
        }

        /**
         * @param poblacio the poblacio to set
         */
        public void setPoblacio(String poblacio) {
            if (poblacio == null){
                throw new NullPointerException("Es obligatori indicar una " + "cadena de text");
            }
            this.poblacio = poblacio;
        }

        /**
         * @return the provincia
         */
        public String getProvincia() {
            return provincia;
        }

        /**
         * @param provincia the provincia to set
         */
        public void setProvincia(String provincia) {
            if (provincia == null){
                throw new NullPointerException("Es obligatori indicar una " + "cadena de text");
            }
            this.provincia = provincia;
        }
        
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="operacions d'objecte">
        public String getAdreca(){
            return String.format("%s %d, %s, %d, %s(%s). \n", getCarrer(), getNumero(), getPis(), getCodipostal(), getPoblacio(), getProvincia() );
        }
    //</editor-fold>
    
    
    //</editor-fold>

    
    
    
}
