package primsz;

import java.util.Random;

public class PrimSz {
    
    static Random rnd = new Random();
    final static int DB = 10;
    static int[] tomb = new int[DB];
    
    public static void main(String[] args) {
        // Tömb, menne random számok. Vizsgáljuk, hogy van-e prím.
        for (int i = 0; i < DB; i++) {
            int veletlen = rnd.nextInt(100) + 1;
            tomb[i] = veletlen;
        }
        
        System.out.println("A tömb elSystem.outemei:");
        for (int elem : tomb) {
            System.out.print(elem + " ");
        }
        System.out.println(); 
        
        if (vaneprim(tomb)) {
            System.out.println("A tömb tartalmaz prímszámot.");
        } else {
            System.out.println("A tömb nem tartalmaz prímszámot.");
        }
    }
    
    private static boolean vaneprim(int[] tomb) {
        for (int szam : tomb) {
            if (isPrime(szam)) {
                return true;

        }            }
        return false;
    }
    
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}