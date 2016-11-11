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
public class Modul {
    //<editor-fold defaultstate="collapsed" desc="atributs">
    private String nom;
    private String descripcio;
    private String hores;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="mètodes">

        //<editor-fold defaultstate="collapsed" desc="constructor">
        public Modul(String nom, String descripcio, String hores){
            this.setNom(nom);
            this.setDescripcio(descripcio);
            this.setHores(hores);
        }
        
        public Modul(String nom, String hores){
            this(nom, null, hores);
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="getters/setters">
            /**
            * @return the nom
            */
           public String getNom() {
               return nom;
           }

           /**
            * @param nom the nom to set
            */
           public void setNom(String nom) {
               this.nom = nom;
           }

           /**
            * @return the descripcio
            */
           public String getDescripcio() {
               return descripcio;
           }

           /**
            * @param descripcio the descripcio to set
            */
           public void setDescripcio(String descripcio) {
               this.descripcio = descripcio;
           }

           /**
            * @return the hores
            */
           public String getHores() {
               return hores;
           }

           /**
            * @param hores the hores to set
            */
           public void setHores(String hores) {
               if(hores == null){
                throw new NullPointerException("Es obligatori indicar una cadena de text");
               }   
               this.hores = hores;
           }        
        //</editor-fold>
        
    //</editor-fold>

    
}
