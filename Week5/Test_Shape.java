package Week5;

class shapes {
void draw(){
System.out.println("Drawing a shape");

}
}
class square extends shapes{
void draw(){
    System.out.println("Drawing a square.");
    System.out.println("+-----------+\n" + //
                       "|           |\n" + //
                       "|           |\n" + //
                       "|           |\n" + //
                       "|           |\n" + //
                       "+-----------+");
    
}
}
class circle extends shapes{
    void draw(){
        System.out.println("Drawing a circle.");
        System.out.println("   ***   \n" + //
                           " *     * \n" + //
                           "*       *\n" + //
                           "*       *\n" + //
                           " *     * \n" + //
                           "   ***   ");
    }
}
    
    class triangle extends shapes{
        void draw(){
            System.out.println("Drawing a triangle.");
            System.out.println("   /\\   \n" + //
                               "  /  \\  \n" + //
                               " /    \\ \n" + //
                               "/      \\");
        }
        
        
    }



public class Test_Shape{
        public static void main(String[] args) {
            
            shapes s; 

           s = new shapes();
           s.draw();

            s = new square();
            s.draw();

            s = new circle();
            s.draw();

            s = new triangle();
            s.draw();
        }
}




