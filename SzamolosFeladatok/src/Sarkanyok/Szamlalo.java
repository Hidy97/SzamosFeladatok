
package Sarkanyok;

public class Szamlalo {
    public static void main(String[] args) {
        System.out.println("Sárkányfejek megszámolása");
        int szam1 = 7;
        int szam2 = 11;
        int osszesen = 145;
        
        for (int x = 1; x < 20; x++) {
            for (int y = 1; y < 13; y++) {
                if (szam1 * x + szam2*y == osszesen) {
                    System.out.println("7fejű: " + x);
                    System.out.println("11fejű: " + y);
                    System.out.println("-----------");
                }
            }
        }
    }
}
