class Rectangle {
    int length,width;
    Rectangle() {
        length = 15;
        width = 10;
    }
    int rectArea() {
        return length*width;
    }
}

class RectangleArea {
    public static void main(String[] args) {
        // Object created using default constructor
        Rectangle rect = new Rectangle();

        int area = rect.rectArea();
        System.out.println("Area= " + area);
    }
}
