package ciklusok;

import java.util.Scanner;

public class Szamok {
    
    private static Scanner src = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Ismétléssel (i/n): ");
        String valasz = src.next();
        
        boolean ismetelt = valasz.equals("i");
        
        int ismDb = 0, ismNlk = 0;
        for (int k = 2; k <= 4; k++) {
            for (int j = 2; j <= 4; j++) {
                for (int i = 2; i <= 4; i++) {
                    if (ismetelt) {
                        System.out.println("" + k + j + i);
                        ismDb++;
                    } else if(k!= j && k!= i && i!=j){
                        System.out.println("" + k + j + i);
                        ismNlk++;
                    }
                }
            }
        }
        
        if(ismetelt){
            System.out.println("Ismétléssel: " + ismDb);
        }else{
            System.out.println("Ismétlés nélkül: " + ismNlk);
        }
        
    }
}
