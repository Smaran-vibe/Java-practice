package Week5;

import java.util.Scanner;
class Member{
    String name;

    Member (String name){
        this.name = name;
        System.out.println("Member added for this gym " + name);
    }

}

class PremiumMember extends Member{
    int ptsessions;

    PremiumMember (String name, int ptsessions){
        super(name);

        this.ptsessions = ptsessions;

        System.out.println("Added " + ptsessions + " pt sessions ");



    }
}

public class superconstructor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the member name: ");
        String name = sc.nextLine();

        System.out.println("Enter your Ptsessions: ");
        int pt = sc.nextInt();


        PremiumMember p = new PremiumMember(name , pt);

        

        sc.close();

        

        
    }
    
}