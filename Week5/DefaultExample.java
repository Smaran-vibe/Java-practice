package Week5;

class member {
    String name;
    String membershipType;

    // 1. THIS IS THE DEFAULT CONSTRUCTOR
    member() {
        this.name = "Unknown Guest";
        this.membershipType = "Trial";
        System.out.println("A blank guest profile has been created.");
    }

    member(String name) {
        super();
        this.name = name;
        this.membershipType = "Standard";
        System.out.println("Member profile created for: " + name);
    }
}

public class DefaultExample {
    public static void main(String[] args) {

        member guest = new member();

        member permanent = new member("Smaran");
    }
}
