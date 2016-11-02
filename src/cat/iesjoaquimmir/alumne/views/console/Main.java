/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.alumne.views.console;

import cat.iesjoaquimmir.alumne.model.bussineslayer.entities.Alumne;
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
        
        
        
        System.exit(0);
        System.gc();
    }
    
    public static void alumneNED(){
            
            String nom, dni;
            int edat;
            
            Scanner teclat = new Scanner(System.in);
        
            System.out.printf("Introdueix el nom: ");
            nom = teclat.next();
            
            System.out.printf("Introdueix la edat: ");
            edat = teclat.nextInt();
            
            System.out.printf("Introdueix el dni: ");
            dni = teclat.next();
            
            Alumne alumne1 = new Alumne(nom, edat, dni);
            
            System.out.printf(alumne1.getSalutacio());
            
        }
        
        public static void alumneND(){
            
            String nom, dni;
                        
            Scanner teclat = new Scanner(System.in);
        
            System.out.printf("Introdueix el nom: ");
            nom = teclat.next();
            
            System.out.printf("Introdueix el dni: ");
            dni = teclat.next();
            
            Alumne alumne1 = new Alumne(nom, dni);
            
            System.out.printf(alumne1.getSalutacio());
            
        }
        
        public static void alumneNE(){
            
            String nom;
            int edat;
            
            Scanner teclat = new Scanner(System.in);
        
            System.out.printf("Introdueix el nom: ");
            nom = teclat.next();
            
            System.out.printf("Introdueix la edat: ");
            edat = teclat.nextInt();
            
            Alumne alumne1 = new Alumne(nom, edat);
            
            System.out.printf(alumne1.getSalutacio());
            
        }
        
        public static void alumneD(){
            
            String dni;
            
            Scanner teclat = new Scanner(System.in);
            
            System.out.printf("Introdueix el dni: ");
            dni = teclat.next();
            
            Alumne alumne1 = new Alumne(dni);
            
            System.out.printf(alumne1.getSalutacio());
            
        }
        
        public static void alumneED(){
            
            String dni;
            int edat;
            
            Scanner teclat = new Scanner(System.in);
            
            System.out.printf("Introdueix la edat: ");
            edat = teclat.nextInt();
            
            System.out.printf("Introdueix el dni: ");
            dni = teclat.next();
            
            Alumne alumne1 = new Alumne(edat, dni);
            
            System.out.printf(alumne1.getSalutacio());
            
        }
    
}
