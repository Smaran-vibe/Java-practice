package Week5;

 class method {

    void role (){
        System.out.println("This method calls student.");
    }
}

class collegestudent extends method {
    void role(){
        super.role();
        System.out.println("Its good to know you bro.");

    }
}

public class test1 {
    public static void main(String[] args) {
       collegestudent c = new collegestudent();
       c.role(); 
    }
}
