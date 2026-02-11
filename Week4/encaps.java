package Week4;

import java.util.Scanner;

public class encaps {

    class vidhyarthi {
        private String naam;
        private int umer;

        public void setNaam(String n) {
            naam = n;
        }

        public void setUmer(int u) {
            if (u > 0) {
                umer = u;
            } else {
                System.out.println("Error: Umer cannot be negative.");
            }
        }

        public String getNaam() {
            return naam;
        }

        public int getUmer() {
            return umer;
        }
    }

    public static void main(String[] args) {
        encaps outer = new encaps();

        vidhyarthi v1 = outer.new vidhyarthi();

        v1.setNaam("Smaran");
        v1.setUmer(10);
        System.out.println("Naam: " + v1.getNaam());
        System.out.println("Umer: " + v1.getUmer());
        vidhyarthi v2 = outer.new vidhyarthi();

        v2.setNaam("Srijan");
        v2.setUmer(69);
        System.out.println("Naam: " + v2.getNaam());
        System.out.println("Umer: " + v2.getUmer());

        vidhyarthi v3 = outer.new vidhyarthi();

       
        v3.setNaam("Sharad Baniya");
        v3.setUmer(-5); // This will trigger your "Error: Umer cannot be negative" print

       
        System.out.println("Naam: " + v3.getNaam() + "\nUmer: " + v3.getUmer());
        
    }
}
