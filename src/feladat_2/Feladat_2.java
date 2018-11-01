
package feladat_2;

import java.util.Scanner;

public class Feladat_2 {

    
    public static void main(String[] args) {
        
        
        int szélességét;
        int magasságát;
        int terület;
        double db;
        Scanner input = new Scanner(System.in);
        System.out.println("Kérem adja meg a medence szélességét,: ");
       
        szélességét= input.nextInt();
       
         System.out.println("Kérem adja meg a medence magasságát: ");
        
        magasságát= input.nextInt();
        terület=szélességét*magasságát;
        db=terület/0.04;
        
        System.out.println("Szükséges csempe mennyiség: "+db +"db"+ " "+"Terület"+ " "+terület+"m3");
    }
    
}
