class ConstructorOverloading {

    ConstructorOverloading(int x,int y) {
        int result = x + y;
        System.out.println("Addition of two integers = " + result);
    }

    ConstructorOverloading(int x,int y,int z) {
        int result = x+y+z;
        System.out.println("Addition of three integers = " + result );
    }

    ConstructorOverloading(double x,double y) {
        double result = x + y;
        System.out.println("Addition of two doubles = " + result );
    }

    public static void main(String[] args) {

        ConstructorOverloading obj1 = new ConstructorOverloading(444,555);
        ConstructorOverloading obj2 = new ConstructorOverloading(333,444,555);
        ConstructorOverloading obj3 = new ConstructorOverloading(10.15,20.22);
    }
}
