// Que. Write a simple java program to calculate area of rectangle with integer and float values 
// Its using Constructor Overloading

public class RectangleAreaConstructor {

    RectangleAreaConstructor(int length,int width) {
        int result = length*width;
        System.out.println("Area of rectangle = " + result);
    }

    RectangleAreaConstructor(double length,double width) {
        double result = length*width;
        System.out.println("Area of rectangle = " + result );
    }

    public static void main(String[] args) {

        RectangleAreaConstructor obj1 = new RectangleAreaConstructor(10,20);
        RectangleAreaConstructor obj2 = new RectangleAreaConstructor(10.15,20.22);
    }

}
