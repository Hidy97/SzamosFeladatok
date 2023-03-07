
package kecskek;

public class Vasar {
    public static void main(String[] args) {
        System.out.println("Én elmentem a vásárba fél pénzzel...");
        double sertes = 3.5;
        double kecske = 1.33;
        double juh = 0.5;
        int osszesen = 100;
        double arany = 100;
        
        for (double z = 1; z < 101; z++) {
            for (double x = 1; x < 101; x++) {
                for (double y = 1; y < 101; y++) {
                    //if (sertes * z + kecske * x + juh * y == osszesen) {
                    double fizetettArany = z * sertes + x * kecske + y *juh;
                    if (z + x + y == osszesen && arany == fizetettArany) {
                        System.out.println("arany: " + (int)arany);
                        System.out.println("Sertés: " + z);
                        System.out.println("Kecske: " + x);
                        System.out.println("Juh: " + y);
                        System.out.println("-----------");
                    }
                }
            }
        }
    }
}
