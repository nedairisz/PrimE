
package primsz;

import java.util.Random;


public class VanePrim {
    static Random rnd = new Random();
    int[] tomb = new int [10];
    
    public static void main(String[] args) {
       // Tömb, menne random számok. Vizsgáljuk, hogy van-e prím. 
       
       int[] tomb = new int [10];
       tomb[0]=22;
       tomb[1]=2;
       tomb[9]=100;
       tombkiir(tomb);
       
        System.out.println(); 

        if (vaneprim(tomb)) {
            System.out.println("A tömb tartalmaz prímszámot.");
        } else {
            System.out.println("A tömb nem tartalmaz prímszámot.");
        }

    }
    
    private static void tombkiir(int[] tomb){
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i]+" ");
        }
    }
    
    private static boolean vaneprim(int[] tomb) {
        for (int szam : tomb) {
            if (PrimE(szam)) {
                return true;
        }}
        return false;
    }
    
    private static boolean PrimE(int szam) {
        if (szam <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(szam); i++) {
            if (szam % i == 0) {
                return false;
            }
        }
        return true;
    }
}
