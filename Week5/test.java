package Week5;

 class polymorphism {

    
        int id = 100;
    }
    


class CollegeStudent extends polymorphism{
    int id = 200; 

    void show(){
        System.out.println(id);
        System.out.println(super.id);
    }
}

public class test{
    public static void main(String[] args) {
        CollegeStudent cs = new CollegeStudent();
        cs.show();
    }
}
