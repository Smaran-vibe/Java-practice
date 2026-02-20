package Week5;

class Rectangle {

    // fields to calculate area
    private int length;
    private int breadth;

    // method to initialize value of length
    public void setLength(int length) {
        this.length = length;
    }

    // method to initialize value of breadth
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    // method to calculate area
    public void calculateArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

class rect {
    public static void main(String[] args) {
        
        // initialize value of length and breadth
        Rectangle obj = new Rectangle();

        // initialize the value of length and breadth
        obj.setLength(12);
        obj.setBreadth(9);

        // calculate the area
        obj.calculateArea(); 
    }
}

