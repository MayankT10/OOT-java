class MethodOverloading {

    public int addition(int x,int y) {
         return x+y;
    }

    public int addition(int x,int y,int z) {
        return x+y+z;
    }

    public double addition(double x,double y) {
        return x+y;
    }

    public static void main(String[] args) {
        MethodOverloading number = new MethodOverloading();

        int result1 = number.addition(444,555);
        System.out.println("Addition of two integer: " + result1);

        int result2 = number.addition(333,444,555);
        System.out.println("Addition of three integer: " + result2);

        double result3 = number.addition(10.15,20.22);
        System.out.println("Addition of two doubles: " + result3);
    }

}
