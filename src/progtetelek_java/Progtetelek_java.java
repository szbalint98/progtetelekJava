
package progtetelek_java;

import java.util.Scanner;


public class Progtetelek_java {
   static Scanner sc = new  Scanner(System.in);
    
    public static void main(String[] args) {
       
        int n =-1;
        int i=0;
       // Scanner sc= new Scanner("Kéremajdon meg egy számot: ");
      //  int szamom=N.nextInt();
        
        while (n<0){ 
            System.out.println("Szám: ");
            n=sc.nextInt();
        }
        int ossz=0;
        for (i = 0; i <= 5; i++) {
            ossz+=i;
        }
        System.out.println(ossz);
    
        int db=0;
        for (i = 10; i < 100; i++) {
            if (i%2==0) {
                db++;
            }
                
            }
        System.out.printf("Az első %d db szám összege: %d\n",n,ossz); 
        System.out.printf("Páros számok száma: %d\n",db);
        
        
        System.out.println("Kérem adjon meg egy számot:");
        int szam=sc.nextInt();
        int VEGE=100;
        db=0;
        int min=Integer.MAX_VALUE;
        while (szam!=VEGE) {
            if (szam<min) {
                min=szam;
            }
            szam++;
        
        }
        System.out.printf("%d számbóla legkisebb :%d\n",VEGE,min);
        
        
}}
