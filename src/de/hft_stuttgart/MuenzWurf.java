
package de.hft_stuttgart;
/* Math.random() hat die Funktion, dass Java zufällig ein Wert generiert
 Münzwurf mit Wahrscheinlichkeit "Zahl" = 49%
                                 "Kopf" = 49%
                                 "Kante" = 2%
*/

public class MuenzWurf {

   
    public static void main(String[] args) {
        
        
        String [] ergebnis;
        ergebnis = new String [10]; //Array mit 10 Plätzen erstellt
        
        int i=0;
        while (i<10){ //Schleife die 10x durchläuft
            
            ergebnis [i] = wurfMuenz(); //Ergebnis wird in Array gespeichert
            System.out.print (ergebnis[i]+" "); //Array wird ausgegeben
        i++;
       
        }
        
       
    }
    public static String wurfMuenz() { //Methode
    
     int x = (int) (Math.random()*100); //Zufällige Zahl zwischen 0 und 1
     String fall = "";
    
     if ( x>0 && x <= 48){
         fall ="Zahl";
         
         
     }
     else if ( x>=49 && x<= 98) {
         fall = "Kopf";
         
     } 
     else {
         fall = "Kante";
         
     
     }
     
     return fall;
     
     
     
    }
    
}
