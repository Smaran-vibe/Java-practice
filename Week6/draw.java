package Week6;

abstract class shap {
    abstract void draw();
}

class cir__cle extends shap {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rect__angle extends shap {
    void draw() {
        System.out.println("Drawing Rectangle");
    }

}

public class draw {
    public static void main(String[] args) {

        shap s1 = new cir__cle();
        shap s2 = new Rect__angle();

        s1.draw();
        s2.draw();
    }
}

