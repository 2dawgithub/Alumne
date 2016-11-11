/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.alumne.views.console;

import cat.iesjoaquimmir.alumne.model.bussineslayer.entities.Alumne;
import cat.iesjoaquimmir.alumne.model.bussineslayer.entities.Domicili;
import cat.iesjoaquimmir.alumne.model.bussineslayer.entities.Modul;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n;
        Scanner teclat = new Scanner(System.in);

        
        do{
            System.out.printf("Crear alumne(nom, edat, dni): 1, Crear alumne(nom, dni): 2, Crear alumne(nom, edat): 3, Crear alumne(dni): 4, Crear alumne(edat, dni): 5 ");
            n = teclat.nextInt();
            
            switch (n) {
                case 1:
                    alumneNED();
                    break;
                case 2:
                    alumneND();
                    break;
                case 3:
                    alumneNE();
                    break;
                case 4:
                    alumneD();
                    break;
                case 5:
                    alumneED();
                    break;
                default:
                    break;
            }
            
        }while(n>0 && n<6);
        
        
        
        
        
        //Domicili domicili = new Domicili("Industria", 02100, 188, "2n 1a", "Badalona", "Barcelona");
        //Alumne alumne = new Alumne("Pedro", 21, "55655678J", "García", "Ramírez", domicili);
        //mostra el format cognom1 cognom2, nom
        //System.out.println(alumne.getNomComplert());
        //Industria 188, 2o 1a, 08025, Badalona (Barcelona)
        //System.out.println(domicili.getAdreca());
        //Pinta el mateix que la linia anterior
        //System.out.println(alumne.getDomicili().getAdreca());
        
        
        
        System.exit(0);
        System.gc();
    }
    
    public static void alumneNED(){
            
            String nom, dni, cognom1, cognom2, carrer, poblacio, provincia, codipostal, tel, nomModul, descripcioModul, horesModul;
            int edat, numero, numTel, i=0, numModuls;
            
            ArrayList<String> telefon = new ArrayList<>();

            
            ArrayList<Modul> moduls = new ArrayList<>();
            
            Scanner teclat = new Scanner(System.in);
        
            System.out.printf("Introdueix el nom: ");
            nom = teclat.next();
            
            System.out.printf("Introdueix el cognom1: ");
            cognom1 = teclat.next();
            
            System.out.printf("Introdueix el cognom2: ");
            cognom2 = teclat.next();
            
            System.out.printf("Introdueix la edat: ");
            edat = teclat.nextInt();
            
            System.out.printf("Introdueix el dni(00000000A): ");
            dni = teclat.next();
            
            System.out.printf("Introdueix el carrer: ");
            carrer = teclat.next();
            
            System.out.printf("Introdueix la poblacio: ");
            poblacio = teclat.next();
            
            System.out.printf("Introdueix el numero: ");
            numero = teclat.nextInt();
            
            System.out.printf("Introdueix el codipostal(00000): ");
            codipostal = teclat.next();
            
            System.out.printf("Introdueix la provincia: ");
            provincia = teclat.next();
            
            System.out.printf("Introdueix quantitat de telefons: ");
            numTel = teclat.nextInt();
            
            do{
                System.out.printf("Introdueix el telefon(000000000): ");
                tel = teclat.next();
                
                telefon.add(tel);
                i++;
            }while(i != numTel);
            
            System.out.printf("Introdueix quantitat de moduls: ");
            numModuls = teclat.nextInt();
            
            i=0;
            
            do{
                System.out.printf("Introdueix el nom del modul: ");
                nomModul = teclat.next();
                
                System.out.printf("Introdueix la descripció del modul: ");
                descripcioModul = teclat.next();
                
                System.out.printf("Introdueix les hores del modul: ");
                horesModul = teclat.next();
                
                Modul mod = new Modul(nomModul, descripcioModul, horesModul);
                
                moduls.add(mod);
                
                i++;
            }while(i != numModuls);
            
            
            Domicili domicili1 = new Domicili(carrer, codipostal, numero, poblacio, provincia);
            
            Alumne alumne1 = new Alumne(nom, edat, dni, cognom1, cognom2, telefon, domicili1, moduls);
            
            System.out.printf("\n");
            
            System.out.printf(alumne1.getSalutacio());
            
            System.out.printf("\n");
            
            
            for(int j=0; j<alumne1.getTelefon().size(); j++){
                System.out.printf("Telefon: %s\n", alumne1.getTelefon().get(j));
            }
            
            /*
            for(int j=0; j<telefon.size(); j++){
                System.out.printf("Telefon: %s\n", telefon.get(j));
            }
            */
            
            
            System.out.printf("\n");
            
            for(int j = 0; j < alumne1.getModuls().size(); j++) {
                System.out.printf("El modul %s te %s hores. \n La descripcio del modul: %s \n", alumne1.getModuls().get(j).getNom(), alumne1.getModuls().get(j).getHores(), alumne1.getModuls().get(j).getDescripcio() );
            }
            
            System.out.printf("\n");
            
            
        }
        
        public static void alumneND(){
            
            String nom, dni;
                        
            Scanner teclat = new Scanner(System.in);
        
            System.out.printf("Introdueix el nom: ");
            nom = teclat.next();
            
            System.out.printf("Introdueix el dni: ");
            dni = teclat.next();
            
            //Alumne alumne1 = new Alumne(nom, dni);
            
            //System.out.printf(alumne1.getSalutacio());
            
        }
        
        public static void alumneNE(){
            
            String nom;
            int edat;
            
            Scanner teclat = new Scanner(System.in);
        
            System.out.printf("Introdueix el nom: ");
            nom = teclat.next();
            
            System.out.printf("Introdueix la edat: ");
            edat = teclat.nextInt();
            
            //Alumne alumne1 = new Alumne(nom, edat);
            
            //System.out.printf(alumne1.getSalutacio());
            
        }
        
        public static void alumneD(){
            
            String dni;
            
            Scanner teclat = new Scanner(System.in);
            
            System.out.printf("Introdueix el dni: ");
            dni = teclat.next();
            
            //Alumne alumne1 = new Alumne(dni);
            
            //System.out.printf(alumne1.getSalutacio());
            
        }
        
        public static void alumneED(){
            
            String dni;
            int edat;
            
            Scanner teclat = new Scanner(System.in);
            
            System.out.printf("Introdueix la edat: ");
            edat = teclat.nextInt();
            
            System.out.printf("Introdueix el dni: ");
            dni = teclat.next();
            
            //Alumne alumne1 = new Alumne(edat, dni);
            
            //System.out.printf(alumne1.getSalutacio());
            
        }
    
}
