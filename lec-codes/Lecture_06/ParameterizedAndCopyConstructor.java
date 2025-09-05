class RectangleData {
    int length,width;

    // Parameterized Constructor
    RectangleData (int x,int y) {
        length = x;
        width = y;
    }

    // Copy Constructor
    RectangleData(RectangleData rect) {
        this.length = rect.length;
        this.width = rect.width;
    }

    int rectArea() {
        return length*width;
    }
}

class ParameterizedAndCopyConstructor {
    public static void main(String[] args) {

        // Creating an object using parameterized constructor
        RectangleData original = new RectangleData(5,10);

        // Creating a copy using copy using copy constructor
        RectangleData copy = new RectangleData(original);

        int area = copy.rectArea();
        System.out.println("Area = " + area );
    }
}

